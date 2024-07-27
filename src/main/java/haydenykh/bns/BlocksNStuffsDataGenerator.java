package haydenykh.bns;

import haydenykh.bns.common.world.gen.feature.BlocksNStuffsConfiguredFeatures;
import haydenykh.bns.common.world.gen.feature.BlocksNStuffsPlacedFeatures;
import haydenykh.bns.datagen.*;
import haydenykh.bns.datagen.lang.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BlocksNStuffsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlocksNStuffsBlockTagProvider::new);
		pack.addProvider(BlocksNStuffsItemTagProvider::new);
		pack.addProvider(BlocksNStuffsLootTableProvider::new);
		pack.addProvider(BlocksNStuffsModelProvider::new);
		pack.addProvider(BlocksNStuffsRecipeProvider::new);

		pack.addProvider(BlocksNStuffsAmericanEnglishLanguageProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BlocksNStuffsConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BlocksNStuffsPlacedFeatures::boostrap);
	}
}
