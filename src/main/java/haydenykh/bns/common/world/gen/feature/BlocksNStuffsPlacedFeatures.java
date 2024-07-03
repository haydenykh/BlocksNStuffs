package haydenykh.bns.common.world.gen.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

import static haydenykh.bns.BlocksNStuffs.ID;

public class BlocksNStuffsPlacedFeatures {
    public static final RegistryKey<PlacedFeature> LUNAR_BASE = registerKey("lunar_base");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, LUNAR_BASE, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksNStuffsConfiguredFeatures.LUNAR_BASE), RarityFilterPlacementModifier.of(1024), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ID, id));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifier) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifier)));
    }

    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifier) {
        register(context, key, configuration, List.of(modifier));
    }
}
