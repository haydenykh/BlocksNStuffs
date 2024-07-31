package haydenykh.bns.common.block.advanced;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class GlazedTerracottaSlabBlock extends SlabBlock {
    public static final DirectionProperty FACING;
    public static final MapCodec<GlazedTerracottaSlabBlock> CODEC = createCodec(GlazedTerracottaSlabBlock::new);

    public MapCodec<GlazedTerracottaSlabBlock> getCodec() {
        return CODEC;
    }

    public GlazedTerracottaSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, TYPE, WATERLOGGED});
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);

        this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());

        if (blockState.isOf(this)) {
            return (BlockState) ((BlockState) blockState.with(TYPE, SlabType.DOUBLE)).with(WATERLOGGED, false);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            BlockState blockState2 = (BlockState) ((BlockState) this.getDefaultState().with(TYPE, SlabType.BOTTOM)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            Direction direction = ctx.getSide();
            return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double) blockPos.getY() > 0.5)) ? blockState2 : (BlockState) blockState2.with(TYPE, SlabType.TOP);
        }
    }

    static {
        FACING = Properties.HORIZONTAL_FACING;
    }
}
