package haydenykh.bns.common.block.advanced;

import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.tick.TickPriority;

public class PickaxeBlock extends WorldModifyingBlock {
    public PickaxeBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected TickPriority getTickPriority() {
        return TickPriority.EXTREMELY_HIGH;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos sourcePos = pos.offset(state.get(FACING));
        if (!world.getBlockState(sourcePos).isAir()) {
            world.breakBlock(sourcePos, true);
        }
    }
}
