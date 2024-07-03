package haydenykh.bns.common.block.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class BookBoxBlock extends Block {
    private static final char[] RANDOM_CHARACTERS = new char[]{' ', ',', '.', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public BookBoxBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Direction direction = state.get(FACING);
        int yPos = pos.getY();
        int edge;
        byte index;
        switch (BookBoxBlock$1.Directions[direction.ordinal()]) {
            case 1:
                edge = 15 - pos.getX() & 15;
                index = 0;
                break;
            case 2:
                edge = pos.getX() & 15;
                index = 2;
                break;
            case 3:
                edge = 15 - pos.getZ() & 15;
                index = 1;
                break;
            case 4:
            default:
                edge = pos.getZ() & 15;
                index = 3;
        }

        if (edge > 0 && edge < 15) {
            ChunkPos chunkPos = new ChunkPos(pos);
            String title = chunkPos.x + "/" + chunkPos.z + "/" + index + "/" + edge + "/" + yPos;
            Random randomX = new Random((long) chunkPos.x);
            Random randomZ = new Random((long) chunkPos.z);
            Random randomY = new Random((long) ((edge << 8) + (yPos << 4) + index));
            ItemStack item = new ItemStack(Items.WRITTEN_BOOK);
            NbtCompound tag = (NbtCompound) item.getComponents(); // error found here
            NbtList list = new NbtList();

            for (int i = 0; i < 16; ++i) {
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < 128; ++j) {
                    int nextInt = randomX.nextInt() + randomZ.nextInt() + -randomY.nextInt();
                    stringBuilder.append(RANDOM_CHARACTERS[Math.floorMod(nextInt, RANDOM_CHARACTERS.length)]);
                }

                list.add(NbtString.of(Text.Serialization.toJsonString(Text.literal(stringBuilder.toString()), world.getRegistryManager())));
            }

            tag.put("pages", list);
            tag.putString("author", Formatting.OBFUSCATED + "Universe itself");
            tag.putString("title", title);
            dropStack(world, pos.offset(hit.getSide()), item);
            return ItemActionResult.SUCCESS;
        } else {
            return ItemActionResult.FAIL;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        Direction direction = context.getPlayerLookDirection().getOpposite();
        return this.getDefaultState().with(FACING, direction);
    }
}
