package haydenykh.bns.datagen;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.item.BlocksNStuffsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsRecipeProvider extends FabricRecipeProvider {
    List<Item> dyeList = List.of(Items.BLACK_DYE, Items.BLUE_DYE, Items.BROWN_DYE, Items.CYAN_DYE, Items.GRAY_DYE, Items.GREEN_DYE, Items.LIGHT_BLUE_DYE, Items.LIGHT_GRAY_DYE, Items.LIME_DYE, Items.MAGENTA_DYE, Items.ORANGE_DYE, Items.PINK_DYE, Items.PURPLE_DYE, Items.RED_DYE, Items.YELLOW_DYE, Items.WHITE_DYE);
    List<Item> terracottaList = List.of(Items.BLACK_TERRACOTTA, Items.BLUE_TERRACOTTA, Items.BROWN_TERRACOTTA, Items.CYAN_TERRACOTTA, Items.GRAY_TERRACOTTA, Items.GREEN_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA, Items.LIGHT_GRAY_TERRACOTTA, Items.LIME_TERRACOTTA, Items.MAGENTA_TERRACOTTA, Items.ORANGE_TERRACOTTA, Items.PINK_TERRACOTTA, Items.PURPLE_TERRACOTTA, Items.RED_TERRACOTTA, Items.YELLOW_TERRACOTTA, Items.WHITE_TERRACOTTA);
    List<Item> terracottaSlabList = List.of(BlocksNStuffsItems.BLACK_TERRACOTTA_SLAB, BlocksNStuffsItems.BLUE_TERRACOTTA_SLAB, BlocksNStuffsItems.BROWN_TERRACOTTA_SLAB, BlocksNStuffsItems.CYAN_TERRACOTTA_SLAB, BlocksNStuffsItems.GRAY_TERRACOTTA_SLAB, BlocksNStuffsItems.GREEN_TERRACOTTA_SLAB, BlocksNStuffsItems.LIGHT_BLUE_TERRACOTTA_SLAB, BlocksNStuffsItems.LIGHT_GRAY_TERRACOTTA_SLAB, BlocksNStuffsItems.LIME_TERRACOTTA_SLAB, BlocksNStuffsItems.MAGENTA_TERRACOTTA_SLAB, BlocksNStuffsItems.ORANGE_TERRACOTTA_SLAB, BlocksNStuffsItems.PINK_TERRACOTTA_SLAB, BlocksNStuffsItems.PURPLE_TERRACOTTA_SLAB, BlocksNStuffsItems.RED_TERRACOTTA_SLAB, BlocksNStuffsItems.YELLOW_TERRACOTTA_SLAB, BlocksNStuffsItems.WHITE_TERRACOTTA_SLAB);
    List<Item> terracottaStairsList = List.of(BlocksNStuffsItems.BLACK_TERRACOTTA_STAIRS, BlocksNStuffsItems.BLUE_TERRACOTTA_STAIRS, BlocksNStuffsItems.BROWN_TERRACOTTA_STAIRS, BlocksNStuffsItems.CYAN_TERRACOTTA_STAIRS, BlocksNStuffsItems.GRAY_TERRACOTTA_STAIRS, BlocksNStuffsItems.GREEN_TERRACOTTA_STAIRS, BlocksNStuffsItems.LIGHT_BLUE_TERRACOTTA_STAIRS, BlocksNStuffsItems.LIGHT_GRAY_TERRACOTTA_STAIRS, BlocksNStuffsItems.LIME_TERRACOTTA_STAIRS, BlocksNStuffsItems.MAGENTA_TERRACOTTA_STAIRS, BlocksNStuffsItems.ORANGE_TERRACOTTA_STAIRS, BlocksNStuffsItems.PINK_TERRACOTTA_STAIRS, BlocksNStuffsItems.PURPLE_TERRACOTTA_STAIRS, BlocksNStuffsItems.RED_TERRACOTTA_STAIRS, BlocksNStuffsItems.YELLOW_TERRACOTTA_STAIRS, BlocksNStuffsItems.WHITE_TERRACOTTA_STAIRS);

    public BlocksNStuffsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Terracotta Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            String blockId = Registries.BLOCK.getId(block).toString().substring(4);
            String parentBlockId = Registries.BLOCK.getId(parentBlock).toString().substring(10);

            if (blockId.toString().endsWith("slab")) {
                RecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock);
                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock, 2);
//                offerReversibleSlabCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, block, RecipeCategory.BUILDING_BLOCKS, parentBlock, blockId + "_to_" + parentBlockId, "terracotta");
            } else if (blockId.toString().endsWith("stairs")) {
                RecipeProvider.createStairsRecipe(block, Ingredient.ofItems(parentBlock)).criterion("has_" + parentBlockId, conditionsFromItem(parentBlock)).offerTo(exporter);
                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock);
            }
        }
//        // Glazed Terracotta Blocks
//        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.GLAZED_TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
//            Block block = entry.getKey();
//            Block parentBlock = entry.getValue();
//
//            Identifier blockId = Registries.BLOCK.getId(block);
//
//            if (blockId.toString().endsWith("slab")) {
//                RecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock, 2);
//            } else if (blockId.toString().endsWith("stairs")) {
//                RecipeProvider.createStairsRecipe(block, Ingredient.ofItems(parentBlock)).criterion("has_" + blockId, conditionsFromItem(parentBlock)).offerTo(exporter);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock);
//            }
//        }
        // Wool Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.WOOL_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            String blockId = Registries.BLOCK.getId(block).toString().substring(4);
            String parentBlockId = Registries.BLOCK.getId(parentBlock).toString().substring(10);

            if (blockId.toString().endsWith("slab")) {
                RecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block, parentBlock);
//                offerReversibleSlabCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, block, RecipeCategory.BUILDING_BLOCKS, parentBlock, blockId + "_to_" + parentBlockId, "terracotta");
            } else if (blockId.toString().endsWith("stairs")) {
                RecipeProvider.createStairsRecipe(block, Ingredient.ofItems(parentBlock)).criterion("has_" + parentBlockId, conditionsFromItem(parentBlock)).offerTo(exporter);
            }
        }

        // Placeholder Item
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksNStuffsItems.PLACEHOLDER, 1)
                .pattern("CBR")
                .pattern("JSE")
                .pattern("MWD")
                .input('C', Blocks.COMMAND_BLOCK)
                .input('B', Blocks.CHAIN_COMMAND_BLOCK)
                .input('R', Blocks.REPEATING_COMMAND_BLOCK)
                .input('J', Blocks.JIGSAW)
                .input('S', Blocks.STRUCTURE_BLOCK)
                .input('E', Blocks.BEDROCK)
                .input('M', Items.COMMAND_BLOCK_MINECART)
                .input('W', Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS)
                .input('D', Blocks.DIRT)
                .criterion("has_waxed_weathered_cut_copper_stairs", conditionsFromItem(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS))
                .offerTo(exporter);

        offerDyeableRecipes(exporter, dyeList, terracottaList, "terracotta");
        offerDyeableRecipes(exporter, dyeList, terracottaSlabList, "terracotta_slab");
        offerDyeableRecipes(exporter, dyeList, terracottaStairsList, "terracotta_stairs");
    }

    public static void offerReversibleSlabCompactingRecipes(RecipeExporter exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup) {
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem).input('#', baseItem).pattern("#").pattern("#").group(compactingGroup).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(compactingId));
    }

    public static void offerReversibleSlabCompactingRecipes(RecipeExporter exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        offerReversibleSlabCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, getRecipeName(compactItem), (String) null);
    }
}
