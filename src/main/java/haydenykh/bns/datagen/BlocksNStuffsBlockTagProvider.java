package haydenykh.bns.datagen;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.tag.BlocksNStuffsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlocksNStuffsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIME_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.PINK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.RED_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIME_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.PINK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.RED_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_STAIRS);

//                .add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);

        // Terracotta Blocks
        getOrCreateTagBuilder(BlocksNStuffsTags.Blocks.TERRACOTTA_SLABS)
                .add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.LIME_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.PINK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.RED_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_SLAB);
        getOrCreateTagBuilder(BlocksNStuffsTags.Blocks.TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.LIME_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.PINK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.RED_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_STAIRS);

//        getOrCreateTagBuilder(ConventionalBlockTags.GLAZED_TERRACOTTAS);
//                .add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
//                .add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS)
//                .add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);

        // Wool Blocks
        getOrCreateTagBuilder(BlocksNStuffsTags.Blocks.WOOL_SLABS)
                .add(BlocksNStuffsBlocks.BLACK_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.BLUE_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.BROWN_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.CYAN_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.GRAY_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.GREEN_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.LIME_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.MAGENTA_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.ORANGE_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.PINK_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.PURPLE_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.RED_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.WHITE_WOOL_SLAB)
                .add(BlocksNStuffsBlocks.YELLOW_WOOL_SLAB);
        getOrCreateTagBuilder(BlocksNStuffsTags.Blocks.WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.BLACK_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.BROWN_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.CYAN_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.GREEN_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.LIME_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.MAGENTA_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.ORANGE_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.PINK_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.PURPLE_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.RED_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.WHITE_WOOL_STAIRS)
                .add(BlocksNStuffsBlocks.YELLOW_WOOL_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")));
    }
}
