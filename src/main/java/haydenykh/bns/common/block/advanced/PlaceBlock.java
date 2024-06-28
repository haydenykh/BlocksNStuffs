package haydenykh.bns.common.block.advanced;

import haydenykh.bns.common.item.context.PlaceBlockItemPlacementContext;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.InventoryProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.tick.TickPriority;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PlaceBlock extends WorldModifyingBlock {
    private static final int[][] AVAILABLE_SLOTS_CACHE = new int[54][];

    public PlaceBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected TickPriority getTickPriority() {
        return TickPriority.EXTREMELY_LOW;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        Direction facingDirection = state.get(FACING);
        Direction oppositeDirection = facingDirection.getOpposite();
        BlockPos offset1 = pos.offset(oppositeDirection);
        BlockPos offset2 = pos.offset(facingDirection);
        placeBlock(
                world,
                offset1,
                oppositeDirection,
                stack -> {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        boolean bl;
                        Item: {
                            Item item = stack.getItem();
                            if (item instanceof BlockItem blockItem && blockItem.place(new PlaceBlockItemPlacementContext(world, Hand.MAIN_HAND, stack, new BlockHitResult(offset2.toCenterPos(), oppositeDirection, offset2, false))).isAccepted()) {
                                bl = true;
                                break Item;
                            }

                            bl = false;
                        }

                        boolean bl2 = bl;
                        if (!bl2) {
                            double itemHeight = (double) EntityType.ITEM.getHeight() / 2.0;
                            double x = (double) offset2.getX() + 0.5;
                            double y = (double) offset2.getY() + 0.5 - itemHeight;
                            double z = (double) offset2.getZ() + 0.5;
                            ItemEntity itemEntity = new ItemEntity(world, x, y, z, stack);
                            itemEntity.setToDefaultPickupDelay();
                            world.spawnEntity(itemEntity);
                        }

                        return true;
                    }
                }
        );
    }

    public static boolean insertItem(World world, BlockPos pos, Direction direction, ItemStack stack) {
        for (Inventory inventory : findInventories(world, pos)) {
            ItemStack transferStack = HopperBlockEntity.transfer(null, inventory, stack, direction);
            if (transferStack.isEmpty()) {
                return true;
            }
        }

        return false;
    }

    private static int[] getAvailableSlots(Inventory inventory, Direction side) {
        if (inventory instanceof SidedInventory sidedInventory) {
            return sidedInventory.getAvailableSlots(side);
        } else {
            int i = inventory.size();
            if (i < AVAILABLE_SLOTS_CACHE.length) {
                int[] is = AVAILABLE_SLOTS_CACHE[i];
                if (is != null) {
                    return is;
                } else {
                    int[] js = indexArray(i);
                    AVAILABLE_SLOTS_CACHE[i] = js;
                    return js;
                }
            } else {
                return indexArray(i);
            }
        }
    }

    private static int[] indexArray(int size) {
        int[] is = new int[size];
        int i = 0;

        while (i < is.length) {
            is[i] = i++;
        }

        return is;
    }

    public static boolean placeBlock(World world, BlockPos pos, Direction direction, Function<ItemStack, Boolean> stack) {
        for (Inventory inventory : findInventories(world, pos)) {
            boolean availableSlots = Arrays.stream(getAvailableSlots(inventory, direction)).anyMatch(predicate -> {
                ItemStack stack1 = inventory.removeStack(predicate, 1);
                if (!stack1.isEmpty()) {
                    boolean isStack = stack.apply(stack1.copy());
                    if (isStack) {
                        inventory.markDirty();
                    } else {
                        inventory.setStack(predicate, stack1);
                    }

                    return true;
                } else {
                    return false;
                }
            });

            if (availableSlots) {
                return true;
            }
        }

        ItemEntity itemEntity = findItemEntity(world, pos);
        if (itemEntity != null) {
            ItemStack stack1 = itemEntity.getStack();
            if (!stack1.isEmpty()) {
                boolean var10 = stack.apply(stack1.copyWithCount(1));
                if (var10) {
                    stack1.decrement(1);
                    if (stack1.getCount() <= 0) {
                        itemEntity.discard();
                    }
                }

                return true;
            }
        }

        return false;
    }

    public static List<Inventory> findInventories(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        if (block instanceof InventoryProvider) {
            SidedInventory sidedInventory = ((InventoryProvider) block).getInventory(state, world, pos);
            if (sidedInventory != null) {
                return List.of(sidedInventory);
            }
        } else if (state.hasBlockEntity()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof Inventory) {
                if (!(blockEntity instanceof ChestBlockEntity) || !(block instanceof ChestBlock)) {
                    return List.of((Inventory) blockEntity);
                }

                Inventory inventory = ChestBlock.getInventory((ChestBlock) block, state, world, pos, true);
                if (inventory != null) {
                    return List.of(inventory);
                }
            }
        }

        ArrayList arrayList = new ArrayList();

        for (Entity entity : world.getOtherEntities((Entity) null, createSearchBox(pos), EntityPredicates.VALID_INVENTORIES)) {
            if (entity instanceof Inventory inventory) {
                arrayList.add(inventory);
            }
        }

        return arrayList;
    }

    @Nullable
    public static ItemEntity findItemEntity(World world, BlockPos pos) {
        List list = world.getEntitiesByClass(ItemEntity.class, createSearchBox(pos), EntityPredicates.VALID_ENTITY);
        return list.size() < 1 ? null : (ItemEntity) list.get(0);
    }

    private static Box createSearchBox(BlockPos pos) {
        double number = 0.9999999;
        return Box.of(pos.toCenterPos(), number, number, number);
    }
}
