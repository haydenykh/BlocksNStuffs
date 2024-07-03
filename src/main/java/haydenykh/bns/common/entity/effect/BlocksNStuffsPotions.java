package haydenykh.bns.common.entity.effect;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsPotions {
//    public static final RegistryEntry<Potion> BIG = (RegistryEntry<Potion>) register("big", new Potion(new StatusEffectInstance(BlocksNStuffsStatusEffects.BIG, 3600)));
//    public static final RegistryEntry<Potion> LONG_BIG = (RegistryEntry<Potion>) register("long_big", new Potion("big", new StatusEffectInstance(BlocksNStuffsStatusEffects.BIG, 9600)));
//    public static final RegistryEntry<Potion> STRONG_BIG = (RegistryEntry<Potion>) register("strong_big", new Potion("big", new StatusEffectInstance(BlocksNStuffsStatusEffects.BIG, 1800, 1)));
//    public static final RegistryEntry<Potion> SMALL = (RegistryEntry<Potion>) register("small", new Potion(new StatusEffectInstance(BlocksNStuffsStatusEffects.SMALL, 3600)));
//    public static final RegistryEntry<Potion> LONG_SMALL = (RegistryEntry<Potion>) register("long_small", new Potion("small", new StatusEffectInstance(BlocksNStuffsStatusEffects.SMALL, 9600)));
//    public static final RegistryEntry<Potion> STRONG_SMALL = (RegistryEntry<Potion>) register("strong_small", new Potion("small", new StatusEffectInstance(BlocksNStuffsStatusEffects.SMALL, 1800, 1)));

    private static Potion register(String id, Potion potion) {
        return Registry.register(Registries.POTION, id, potion);
    }

    private static Potion register(RegistryKey<Potion> key, Potion potion) {
        return Registry.register(Registries.POTION, key, potion);
    }

    public static void init() {
        LOGGER.info("Initializing potions for " + ID);
    }
}
