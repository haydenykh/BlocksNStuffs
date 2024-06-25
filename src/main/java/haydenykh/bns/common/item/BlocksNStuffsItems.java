package haydenykh.bns.common.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsItems {
    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ID, id), item);
    }

    public static void init() {
        LOGGER.info("Initializing items for " + ID);
    }

    static {
    }
}
