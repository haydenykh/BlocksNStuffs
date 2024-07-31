package haydenykh.bns.datagen.lang;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.item.BlocksNStuffsItemGroups;
import haydenykh.bns.common.item.BlocksNStuffsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsAmericanEnglishLanguageProvider extends FabricLanguageProvider {
    public BlocksNStuffsAmericanEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.bns", "Blocks N Stuffs");

        translationBuilder.add(BlocksNStuffsItems.PLACEHOLDER, "Placeholder");

        // Terracotta Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            String blockId = Registries.BLOCK.getId(block).toString();

            if (blockId.endsWith("slab")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Slab");
            }

            if (blockId.endsWith("stairs")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Stairs");
            }
        }
        // Glazed Terracotta Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.GLAZED_TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            String blockId = Registries.BLOCK.getId(block).toString();

            if (blockId.endsWith("slab")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Slab");
            }

            if (blockId.endsWith("stairs")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Stairs");
            }
        }
        // Wool Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.WOOL_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            String blockId = Registries.BLOCK.getId(block).toString();

            if (blockId.endsWith("slab")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Slab");
            }

            if (blockId.endsWith("stairs")) {
                translationBuilder.add(block, parentBlock.getName().getString() + " Stairs");
            }
        }
    }
}
