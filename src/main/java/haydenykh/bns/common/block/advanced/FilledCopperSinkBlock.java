package haydenykh.bns.common.block.advanced;

import com.mojang.serialization.MapCodec;
import haydenykh.bns.common.behavior.BlocksNStuffsCauldronBehavior;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FilledCopperSinkBlock extends AbstractCauldronBlock {
    public static final MapCodec<FilledCopperSinkBlock> CODEC = createCodec(FilledCopperSinkBlock::new);

    public FilledCopperSinkBlock(Settings settings) {
        super(settings, BlocksNStuffsCauldronBehavior.EMPTY_COPPER_SINK_BEHAVIOR);
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override
    protected MapCodec<? extends AbstractCauldronBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.9375;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && entity.isOnFire() && this.isEntityTouchingFluid(state, pos, entity)) {
            entity.extinguish();
        }
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 3;
    }
}
