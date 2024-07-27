package haydenykh.bns.common.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsStatusEffects {
    private static FeatureSet enabledFeatures;

    private static StatusEffect register(String id, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(ID, id), effect);
    }

    public static void init() {
        LOGGER.info("Initializing status effects for " + ID);

        create(enabledFeatures);
    }

    public static BrewingRecipeRegistry create(FeatureSet enabledFeatures) {
        BrewingRecipeRegistry.Builder builder = new BrewingRecipeRegistry.Builder(enabledFeatures);
        registerPotionRecipes(builder);
        return builder.build();
    }

    public static void registerPotionRecipes(BrewingRecipeRegistry.Builder builder) {
    }

    static {
    }
}
