package haydenykh.bns.datagen;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.util.BlocksNStuffsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
                .add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_STAIRS);;

        getOrCreateTagBuilder(BlocksNStuffsTags.Blocks.TERRACOTTA_BLOCKS)
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

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")));
    }
}
