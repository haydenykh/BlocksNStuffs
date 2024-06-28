//package haydenykh.bns.mixin;
//
//import haydenykh.bns.common.block.BlocksNStuffsBlocks;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.block.TrapdoorBlock;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Unique;
//
//@Mixin({TrapdoorBlock.class})
//public class TrapdoorBlockMixin {
//    @Unique
//    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
//        if (state.isOf(Blocks.OAK_TRAPDOOR)) {
//            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_OAK_TRAPDOOR.getStateWithProperties(state));
//        }
////        else if (state.isOf(Blocks.SPRUCE_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_SPRUCE_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.BIRCH_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_BIRCH_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.JUNGLE_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_JUNGLE_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.ACACIA_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_ACACIA_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.DARK_OAK_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_DARK_OAK_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.MANGROVE_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_MANGROVE_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.CHERRY_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_CHERRY_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.BAMBOO_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_BAMBOO_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.CRIMSON_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_CRIMSON_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WARPED_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WARPED_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.IRON_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_IRON_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WAXED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WAXED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.EXPOSED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_EXPOSED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WAXED_EXPOSED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WEATHERED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WEATHERED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WAXED_WEATHERED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.OXIDIZED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_OXIDIZED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        } else if (state.isOf(Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR)) {
////            world.setBlockState(pos, BlocksNStuffsBlocks.STACKED_WAXED_OXIDIZED_COPPER_TRAPDOOR.getStateWithProperties(state));
////        }
//    }
//}
