package haydenykh.bns.common.entity.effect;

import haydenykh.bns.common.entity.effect.advanced.ExtendedStatusEffect;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsStatusEffects {
    private static FeatureSet enabledFeatures;
//    public static final RegistryEntry<StatusEffect> BIG;
//    public static final RegistryEntry<StatusEffect> SMALL;

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
//        builder.registerPotionRecipe(BlocksNStuffsPotions.BIG, Items.REDSTONE, BlocksNStuffsPotions.LONG_BIG);
//        builder.registerPotionRecipe(BlocksNStuffsPotions.BIG, Items.GLOWSTONE_DUST, BlocksNStuffsPotions.STRONG_BIG);
//        builder.registerPotionRecipe(Potions.AWKWARD, Items.RABBIT_HIDE, BlocksNStuffsPotions.SMALL);
//        builder.registerPotionRecipe(BlocksNStuffsPotions.SMALL, Items.REDSTONE, BlocksNStuffsPotions.LONG_SMALL);
//        builder.registerPotionRecipe(BlocksNStuffsPotions.SMALL, Items.GLOWSTONE_DUST, BlocksNStuffsPotions.STRONG_SMALL);
    }

    static {
//        BIG = (RegistryEntry<StatusEffect>) register("big", new ExtendedStatusEffect(StatusEffectCategory.NEUTRAL, 9687858).addAttributeModifier(EntityAttributes.GENERIC_SCALE, Identifier.of("295dc741-db10-49e8-9c39-e05f0145d312"), 1.0, Operation.ADD_MULTIPLIED_TOTAL)); // error found here
//        SMALL = (RegistryEntry<StatusEffect>) register("small", new ExtendedStatusEffect(StatusEffectCategory.NEUTRAL, 13841099).addAttributeModifier(EntityAttributes.GENERIC_SCALE, Identifier.of("22cfbc53-1031-4378-b826-8c5ef503dd5c"), -0.5, Operation.ADD_MULTIPLIED_TOTAL)); // error found here
    }
}
