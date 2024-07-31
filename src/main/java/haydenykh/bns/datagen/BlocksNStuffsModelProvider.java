package haydenykh.bns.datagen;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.item.BlocksNStuffsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsModelProvider extends FabricModelProvider {
    public BlocksNStuffsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        // Texture Pools
        Map<Block, BlockStateModelGenerator.BlockTexturePool> terracottaTexturePools = new HashMap();
        Map<Block, BlockStateModelGenerator.BlockTexturePool> glazedTerracottaTexturePools = new HashMap();
        Map<Block, BlockStateModelGenerator.BlockTexturePool> woolTexturePools = new HashMap();

        // Terracotta Block Texture Pool
        for (Block block : BlocksNStuffsBlocks.DEFAULT_TERRACOTTA_BLOCKS_ARRAY) {
            terracottaTexturePools.put(block, generator.registerCubeAllModelTexturePool(block));
        }
//        // Glazed Terracotta Block Texture Pool
//        for (Block block : BlocksNStuffsBlocks.DEFAULT_GLAZED_TERRACOTTA_BLOCKS_ARRAY) {
//            glazedTerracottaTexturePools.put(block, generator.registerCubeAllModelTexturePool(block));
//        }
        // Wool Block Texture Pool
        for (Block block : BlocksNStuffsBlocks.DEFAULT_WOOL_BLOCKS_ARRAY) {
            woolTexturePools.put(block, generator.registerCubeAllModelTexturePool(block));
        }

        // Terracotta Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            BlockStateModelGenerator.BlockTexturePool texturePool = terracottaTexturePools.get(parentBlock);

            if (texturePool != null) {
                String blockId = Registries.BLOCK.getId(block).toString();

                if (blockId.endsWith("slab")) {
                    texturePool.slab(block);
                } else if (blockId.endsWith("stairs")) {
                    texturePool.stairs(block);
                }
            }
        }
//        // Glazed Terracotta Blocks
//        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.GLAZED_TERRACOTTA_BLOCKS_ARRAY.entrySet()) {
//            Block block = entry.getKey();
//            Block parentBlock = entry.getValue();
//
//            BlockStateModelGenerator.BlockTexturePool texturePool = glazedTerracottaTexturePools.get(parentBlock);
//
//            if (texturePool != null) {
//                String blockId = Registries.BLOCK.getId(block).toString();
//
//                if (blockId.endsWith("slab")) {
//                    texturePool.slab(block);
//                } else if (blockId.endsWith("stairs")) {
//                    texturePool.stairs(block);
//                }
//            }
//        }
        // Wool Blocks
        for (Map.Entry<Block, Block> entry : BlocksNStuffsBlocks.WOOL_BLOCKS_ARRAY.entrySet()) {
            Block block = entry.getKey();
            Block parentBlock = entry.getValue();

            BlockStateModelGenerator.BlockTexturePool texturePool = woolTexturePools.get(parentBlock);

            if (texturePool != null) {
                String blockId = Registries.BLOCK.getId(block).toString();

                if (blockId.endsWith("slab")) {
                    texturePool.slab(block);
                } else if (blockId.endsWith("stairs")) {
                    texturePool.stairs(block);
                }
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(BlocksNStuffsItems.PLACEHOLDER, Models.GENERATED);
    }
}
