package haydenykh.bns.common.item;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsItems {
    public static final Item CHEESE;

    private static Item register(Block block) {
        return register(new BlockItem(block, new Settings()));
    }

    private static Item register(BlockItem item) {
        return register(item.getBlock(), item);
    }

    private static Item register(Block block, Item item) {
        return register(Registries.BLOCK.getId(block), item);
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ID, id), item);
    }

    private static Item register(Identifier identifier, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, identifier, item);
    }

    public static void init() {
        LOGGER.info("Initializing items for " + ID);
    }

    static {
        CHEESE = register(BlocksNStuffsBlocks.CHEESE);
    }
}
