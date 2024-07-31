package haydenykh.bns.datagen;

import haydenykh.bns.common.item.BlocksNStuffsItems;
import haydenykh.bns.common.tag.BlocksNStuffsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public BlocksNStuffsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Wool Blocks
        getOrCreateTagBuilder(BlocksNStuffsTags.Items.WOOL_SLABS)
                .add(BlocksNStuffsItems.BLACK_WOOL_SLAB)
                .add(BlocksNStuffsItems.BLUE_WOOL_SLAB)
                .add(BlocksNStuffsItems.BROWN_WOOL_SLAB)
                .add(BlocksNStuffsItems.CYAN_WOOL_SLAB)
                .add(BlocksNStuffsItems.GRAY_WOOL_SLAB)
                .add(BlocksNStuffsItems.GREEN_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIGHT_BLUE_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIGHT_GRAY_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIME_WOOL_SLAB)
                .add(BlocksNStuffsItems.MAGENTA_WOOL_SLAB)
                .add(BlocksNStuffsItems.ORANGE_WOOL_SLAB)
                .add(BlocksNStuffsItems.PINK_WOOL_SLAB)
                .add(BlocksNStuffsItems.PURPLE_WOOL_SLAB)
                .add(BlocksNStuffsItems.RED_WOOL_SLAB)
                .add(BlocksNStuffsItems.WHITE_WOOL_SLAB)
                .add(BlocksNStuffsItems.YELLOW_WOOL_SLAB);
        getOrCreateTagBuilder(BlocksNStuffsTags.Items.WOOL_STAIRS)
                .add(BlocksNStuffsItems.BLACK_WOOL_STAIRS)
                .add(BlocksNStuffsItems.BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.BROWN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.CYAN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsItems.GREEN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIME_WOOL_STAIRS)
                .add(BlocksNStuffsItems.MAGENTA_WOOL_STAIRS)
                .add(BlocksNStuffsItems.ORANGE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.PINK_WOOL_STAIRS)
                .add(BlocksNStuffsItems.PURPLE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.RED_WOOL_STAIRS)
                .add(BlocksNStuffsItems.WHITE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.YELLOW_WOOL_STAIRS);

        // Terracotta Blocks
        getOrCreateTagBuilder(BlocksNStuffsTags.Items.TERRACOTTA_SLABS)
                .add(BlocksNStuffsItems.BLACK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.BROWN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.CYAN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.GREEN_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.LIME_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.MAGENTA_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.ORANGE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.PINK_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.PURPLE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.RED_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.WHITE_TERRACOTTA_SLAB)
                .add(BlocksNStuffsItems.YELLOW_TERRACOTTA_SLAB);
        getOrCreateTagBuilder(BlocksNStuffsTags.Items.TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.BLACK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.BROWN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.CYAN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.GREEN_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.LIME_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.MAGENTA_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.ORANGE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.PINK_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.PURPLE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.RED_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.WHITE_TERRACOTTA_STAIRS)
                .add(BlocksNStuffsItems.YELLOW_TERRACOTTA_STAIRS);

        getOrCreateTagBuilder(ConventionalItemTags.SHEAR_TOOLS)
                .add(BlocksNStuffsItems.BLACK_WOOL_SLAB)
                .add(BlocksNStuffsItems.BLUE_WOOL_SLAB)
                .add(BlocksNStuffsItems.BROWN_WOOL_SLAB)
                .add(BlocksNStuffsItems.CYAN_WOOL_SLAB)
                .add(BlocksNStuffsItems.GRAY_WOOL_SLAB)
                .add(BlocksNStuffsItems.GREEN_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIGHT_BLUE_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIGHT_GRAY_WOOL_SLAB)
                .add(BlocksNStuffsItems.LIME_WOOL_SLAB)
                .add(BlocksNStuffsItems.MAGENTA_WOOL_SLAB)
                .add(BlocksNStuffsItems.ORANGE_WOOL_SLAB)
                .add(BlocksNStuffsItems.PINK_WOOL_SLAB)
                .add(BlocksNStuffsItems.PURPLE_WOOL_SLAB)
                .add(BlocksNStuffsItems.RED_WOOL_SLAB)
                .add(BlocksNStuffsItems.WHITE_WOOL_SLAB)
                .add(BlocksNStuffsItems.YELLOW_WOOL_SLAB)
                .add(BlocksNStuffsItems.BLACK_WOOL_STAIRS)
                .add(BlocksNStuffsItems.BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.BROWN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.CYAN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsItems.GREEN_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_BLUE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIGHT_GRAY_WOOL_STAIRS)
                .add(BlocksNStuffsItems.LIME_WOOL_STAIRS)
                .add(BlocksNStuffsItems.MAGENTA_WOOL_STAIRS)
                .add(BlocksNStuffsItems.ORANGE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.PINK_WOOL_STAIRS)
                .add(BlocksNStuffsItems.PURPLE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.RED_WOOL_STAIRS)
                .add(BlocksNStuffsItems.WHITE_WOOL_STAIRS)
                .add(BlocksNStuffsItems.YELLOW_WOOL_STAIRS);
    }
}
