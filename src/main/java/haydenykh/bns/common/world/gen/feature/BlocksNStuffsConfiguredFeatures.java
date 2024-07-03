package haydenykh.bns.common.world.gen.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

import static haydenykh.bns.BlocksNStuffs.ID;

public class BlocksNStuffsConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUNAR_BASE = registerKey("lunar_base");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, LUNAR_BASE, null, new DefaultFeatureConfig());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ID, id));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
