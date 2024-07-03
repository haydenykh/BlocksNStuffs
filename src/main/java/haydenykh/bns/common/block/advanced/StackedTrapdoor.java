package haydenykh.bns.common.block.advanced;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class StackedTrapdoor extends TrapdoorBlock {
    public static final IntProperty THICKNESS = IntProperty.of("thickness", 1, 5);
    public Block TRAPDOOR_BLOCK;
    public Hand hand;

    public StackedTrapdoor(BlockSetType type, AbstractBlock.Settings settings, Block trapdoorBlock) {
        super(type, settings);
        this.TRAPDOOR_BLOCK = trapdoorBlock;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, OPEN, HALF, POWERED, THICKNESS, WATERLOGGED});
    }

    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(this.TRAPDOOR_BLOCK);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(this.TRAPDOOR_BLOCK.asItem()) && (Integer) state.get(THICKNESS) < 5) {
            world.setBlockState(pos, (BlockState) state.with(THICKNESS, (Integer) state.get(THICKNESS) + 1), 2);
            world.playSound((PlayerEntity) null, pos, this.soundGroup.getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.2F);
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hit);
        }
    }

    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockState blockState = this.getDefaultState();
        FluidState fluidState = context.getWorld().getFluidState(context.getBlockPos());
        Direction direction = context.getSide();
        if (!context.canReplaceExisting() && direction.getAxis().isHorizontal()) {
            blockState = (BlockState) ((BlockState) blockState.with(FACING, direction)).with(HALF, context.getHitPos().y - (double) context.getBlockPos().getY() > 0.5 ? BlockHalf.TOP : BlockHalf.BOTTOM);
        } else {
            blockState = (BlockState) ((BlockState) blockState.with(FACING, context.getHorizontalPlayerFacing().getOpposite())).with(HALF, direction == Direction.UP ? BlockHalf.BOTTOM : BlockHalf.TOP);
        }

        if (context.getWorld().isReceivingRedstonePower(context.getBlockPos())) {
            blockState = (BlockState) ((BlockState) blockState.with(OPEN, true)).with(POWERED, true);
        }

        return (BlockState) blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        int thickness = (Integer) state.get(THICKNESS);
        if (!(Boolean) state.get(OPEN)) {
            return state.get(HALF) == BlockHalf.TOP ? Block.createCuboidShape(0.0, 16.0 + (double) thickness * -3.0, 0.0, 16.0, 16.0, 16.0) : Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, (double) thickness * 3.0, 16.0);
        } else {
            switch ((Direction) state.get(FACING)) {
                case NORTH:
                default:
                    return Block.createCuboidShape(0.0, 0.0, 16.0 + (double) thickness * -3.0, 16.0, 16.0, 16.0);
                case SOUTH:
                    return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, (double) thickness * 3.0);
                case WEST:
                    return Block.createCuboidShape(16.0 + (double) thickness * -3.0, 0.0, 0.0, 16.0, 16.0, 16.0);
                case EAST:
                    return Block.createCuboidShape(0.0, 0.0, 0.0, (double) thickness * 3.0, 16.0, 16.0);
            }
        }
    }
}
