package haydenykh.bns.datagen;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsLootTableProvider extends FabricBlockLootTableProvider {
    public BlocksNStuffsLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : BlocksNStuffsBlocks.TERRACOTTA_BLOCKS_ARRAY.keySet()) {
            addDrop(block);
        }
    }
}
