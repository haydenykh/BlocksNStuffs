package haydenykh.bns.common.block.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.Util;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Optional;

public class CheeseBlock extends Block {
    public static final int field_44222 = 8;
    private static final int field_44227 = 256;
    public static final int field_44223 = 255;
    private static final int field_44228 = 0;
    private static final int field_44229 = -1;
    // no idea what the int above means
    public static final IntProperty SLICES = IntProperty.of("slices", 1, 255);

    public static final VoxelShape[] CORNER_SHAPES = Util.make(new VoxelShape[8], shapes -> {
        shapes[0] = VoxelShapes.cuboid(0.0, 0.0, 0.0, 0.5, 0.5, 0.5);
        shapes[1] = VoxelShapes.cuboid(0.5, 0.0, 0.0, 1.0, 0.5, 0.5);
        shapes[2] = VoxelShapes.cuboid(0.0, 0.0, 0.5, 0.5, 0.5, 1.0);
        shapes[3] = VoxelShapes.cuboid(0.5, 0.0, 0.5, 1.0, 0.5, 1.0);
        shapes[4] = VoxelShapes.cuboid(0.0, 0.5, 0.0, 0.5, 1.0, 0.5);
        shapes[5] = VoxelShapes.cuboid(0.5, 0.5, 0.0, 1.0, 1.0, 0.5);
        shapes[6] = VoxelShapes.cuboid(0.0, 0.5, 0.5, 0.5, 1.0, 1.0);
        shapes[7] = VoxelShapes.cuboid(0.5, 0.5, 0.5, 1.0, 1.0, 1.0);
    });

    public static final VoxelShape[] SHAPES = Util.make(new VoxelShape[256], shapes -> {
        for(int i = 0; i < shapes.length; ++i) {
            VoxelShape shape = VoxelShapes.empty();
            for(int j = 0; j < 8; ++j) {
                if (hasCorner(i, j)) {
                    shape = VoxelShapes.union(shape, CORNER_SHAPES[j]);
                }
            }
            shapes[i] = shape.simplify();
        }
    });

    public CheeseBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(SLICES, Integer.valueOf(255)));
    }

    private static boolean hasCorner(int int0, int int1) {
        return (int0 & createFlag(int1)) != 0;
    }

    private static int createFlag(int int0) {
        return 1 << int0;
    }

    private static int removeCorner(int int0, int int1) {
        return int0 & ~createFlag(int1);
    }

    private static boolean isFull(BlockState state) {
        return state.get(SLICES) == 255;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getStackInHand(hand).isEmpty()) {
            return ItemActionResult.FAIL;
        } else {
            Vec3d vector = hit.getPos().subtract((double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
            int closestSlice = getClosestSlice(state, vector);
            if (closestSlice == -1) {
                return ItemActionResult.FAIL;
            } else {
                int removeCornerSlice = removeCorner(state.get(SLICES), closestSlice);
                if (removeCornerSlice != 0) {
                    world.setBlockState(pos, state.with(SLICES, Integer.valueOf(removeCornerSlice)));
                } else {
                    world.removeBlock(pos, false);
                    world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
                }

                if (!world.isClient) {
                    world.syncWorldEvent(2010, pos, closestSlice);
                    player.getHungerManager().add(1, 0.1F);
                    if (player.getAir() < player.getMaxAir()) {
                        player.setAir(player.getAir() + 10);
                    }

                    world.emitGameEvent(player, GameEvent.EAT, pos);
                }

                return ItemActionResult.SUCCESS;
            }
        }
    }

    private static int getClosestSlice(BlockState state, Vec3d vector) {
        int slices = state.get(SLICES);
        double maxValue = Double.MAX_VALUE;
        int minValue = -1;

        for (int i = 0; i < CORNER_SHAPES.length; ++i) {
            if (hasCorner(slices, i)) {
                VoxelShape shape = CORNER_SHAPES[i];
                Optional closestPoint = shape.getClosestPointTo(vector);
                if (closestPoint.isPresent()) {
                    double squaredDistance = ((Vec3d) closestPoint.get()).squaredDistanceTo(vector);
                    if (squaredDistance < maxValue) {
                        maxValue = squaredDistance;
                        minValue = i;
                    }
                }
            }
        }

        return minValue;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES[state.get(SLICES)];
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return isFull(state) ? 0.2F : 1.0F;
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(SLICES);
    }
}
