package haydenykh.bns.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlocksNStuffsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public BlocksNStuffsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

    }
}
