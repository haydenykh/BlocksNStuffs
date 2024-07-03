package haydenykh.bns.common.world.gen.feature;

import haydenykh.bns.common.world.gen.feature.advanced.LunarBaseFeature;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsFeatures {
//    public static final Feature<DefaultFeatureConfig> LUNAR_BASE = register("lunar_base", new LunarBaseFeature(DefaultFeatureConfig.CODEC));

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String id, F feature) {
        return Registry.register(Registries.FEATURE, id, (F)feature);
    }

    public static void init() {
        LOGGER.info("Initializing features for " + ID);
    }
}
