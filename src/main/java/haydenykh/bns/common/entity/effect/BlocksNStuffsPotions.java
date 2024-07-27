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
