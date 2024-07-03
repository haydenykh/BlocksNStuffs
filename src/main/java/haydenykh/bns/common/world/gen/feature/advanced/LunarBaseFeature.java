package haydenykh.bns.common.world.gen.feature.advanced;

import com.mojang.serialization.Codec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.DropperBlockEntity;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class LunarBaseFeature {
    public LunarBaseFeature(Codec<DefaultFeatureConfig> codec) {
//        super(codec); // error found here
    }

    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = structureWorldAccess.getTopPosition(Heightmap.Type.WORLD_SURFACE, context.getOrigin());
//        this.setBlockState(structureWorldAccess, blockPos, (BlockState) Blocks.IRON_TRAPDOOR.getDefaultState().with(TrapdoorBlock.HALF, BlockHalf.TOP)); // error found here
        BlockState blockState = (BlockState)Blocks.POLISHED_BASALT.getDefaultState().with(PillarBlock.AXIS, Direction.Axis.X);
//        BlockState blockState2 = (BlockState)Blocks.CHAIN.getDefaultState().with(PillarBlock.AXIS, Direction.Axis.X);
//        this.setBlockState(structureWorldAccess, blockPos.north().east(), blockState); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.north(), blockState2); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.north().west(), blockState); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.south().east(), blockState); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.south(), blockState2); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.south().west(), blockState); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up(), Blocks.DROPPER.getDefaultState()); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().up(), Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultState()); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().north(), Blocks.SMOOTH_QUARTZ_SLAB.getDefaultState()); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().south(), Blocks.SMOOTH_QUARTZ_SLAB.getDefaultState()); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().east(), (BlockState)Blocks.IRON_BARS.getDefaultState().with(PaneBlock.WEST, true)); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().west(), (BlockState)Blocks.IRON_BARS.getDefaultState().with(PaneBlock.EAST, true)); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().east().up(), Blocks.END_ROD.getDefaultState()); // error found here
//        this.setBlockState(structureWorldAccess, blockPos.up().west().up(), (BlockState)Blocks.LIGHTNING_ROD.getDefaultState().with(LightningRodBlock.FACING, Direction.DOWN)); // error found here
        BlockEntity var7 = structureWorldAccess.getBlockEntity(blockPos.up());
        if (var7 instanceof DropperBlockEntity dropperBlockEntity) { // error found here
//            dropperBlockEntity.method_50888(); // error found here
//            dropperBlockEntity.setCustomName(Text.translatable("block.bns.dropper.lunar")); // error found here
        }

        return true;
    }
}
