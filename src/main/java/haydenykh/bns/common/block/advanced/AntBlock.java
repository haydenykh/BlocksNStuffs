package haydenykh.bns.common.block.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.tick.OrderedTick;

public class AntBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public AntBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockState blockState = world.getBlockState(pos.down());
        if (blockState.getBlock() == Blocks.WHITE_CONCRETE) {
            this.move(state, world, pos, Clockwiseness.CW);
        } else if (blockState.getBlock() == Blocks.BLACK_CONCRETE) {
            this.move(state, world, pos, Clockwiseness.CCW);
        }
    }

    private void move(BlockState state, ServerWorld world, BlockPos pos, Clockwiseness clockwiseness) {
        Direction facingDirection = state.get(FACING);
        Direction clockwisenessDirection = clockwiseness == Clockwiseness.CW ? facingDirection.rotateYClockwise() : facingDirection.rotateYCounterclockwise();
        BlockPos blockPos = pos.offset(clockwisenessDirection);
        if (world.canSetBlock(blockPos)) {
            switch (AntBlock$1.CLOCKWISENESS_LENGTH[clockwiseness.ordinal()]) {
                case 1:
                    world.setBlockState(pos.down(), Blocks.BLACK_CONCRETE.getDefaultState(), 19);
                    world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                    world.setBlockState(blockPos, state.with(FACING, clockwisenessDirection), 3);
                    break;
                case 2:
                    world.setBlockState(pos.down(), Blocks.WHITE_CONCRETE.getDefaultState(), 19);
                    world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                    world.setBlockState(blockPos, state.with(FACING, clockwisenessDirection), 3);
            }
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.getBlockTickScheduler().scheduleTick(OrderedTick.create(this, pos));
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    static enum Clockwiseness {
        CW,
        CCW;
    }
}
