package haydenykh.bns.common.block.advanced;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import haydenykh.bns.common.behavior.BlocksNStuffsCauldronBehavior;
import haydenykh.bns.common.tag.BlocksNStuffsItemTags;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Function;

public class CopperSinkBlock extends AbstractCauldronBlock {
    public static final MapCodec<CopperSinkBlock> CODEC = createCodec(CopperSinkBlock::new);

    public CopperSinkBlock(Settings settings) {
        super(settings, BlocksNStuffsCauldronBehavior.EMPTY_COPPER_SINK_BEHAVIOR);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
            if (entity.getY() < (double) pos.getY() + 0.375
                    && entity.getBoundingBox().maxY > (double) pos.getY() + 0.25
                    && entity instanceof ItemEntity var5
                    && var5.getStack().isIn(BlocksNStuffsItemTags.COPPER)) {
                var5.kill();
            }
    }

    public static <B extends Block> MapCodec<B> createCodec(Function<Settings, B> blockFromSettings) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group(createSettingsCodec()).apply(instance, blockFromSettings));
    }

    @Override
    protected MapCodec<? extends AbstractCauldronBlock> getCodec() {
        return CODEC;
    }

    @Override
    public boolean isFull(BlockState state) {
        return false;
    }
}
