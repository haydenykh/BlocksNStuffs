package haydenykh.bns.common.item;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.tag.BlocksNStuffsBannerPatternTags;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsItems {
    public static final Item BLACK_TERRACOTTA_SLAB;
    public static final Item BLUE_TERRACOTTA_SLAB;
    public static final Item BROWN_TERRACOTTA_SLAB;
    public static final Item CYAN_TERRACOTTA_SLAB;
    public static final Item GRAY_TERRACOTTA_SLAB;
    public static final Item GREEN_TERRACOTTA_SLAB;
    public static final Item LIGHT_BLUE_TERRACOTTA_SLAB;
    public static final Item LIGHT_GRAY_TERRACOTTA_SLAB;
    public static final Item LIME_TERRACOTTA_SLAB;
    public static final Item MAGENTA_TERRACOTTA_SLAB;
    public static final Item ORANGE_TERRACOTTA_SLAB;
    public static final Item PINK_TERRACOTTA_SLAB;
    public static final Item PURPLE_TERRACOTTA_SLAB;
    public static final Item RED_TERRACOTTA_SLAB;
    public static final Item TERRACOTTA_SLAB;
    public static final Item WHITE_TERRACOTTA_SLAB;
    public static final Item YELLOW_TERRACOTTA_SLAB;

    public static final Item BLACK_TERRACOTTA_STAIRS;
    public static final Item BLUE_TERRACOTTA_STAIRS;
    public static final Item BROWN_TERRACOTTA_STAIRS;
    public static final Item CYAN_TERRACOTTA_STAIRS;
    public static final Item GRAY_TERRACOTTA_STAIRS;
    public static final Item GREEN_TERRACOTTA_STAIRS;
    public static final Item LIGHT_BLUE_TERRACOTTA_STAIRS;
    public static final Item LIGHT_GRAY_TERRACOTTA_STAIRS;
    public static final Item LIME_TERRACOTTA_STAIRS;
    public static final Item MAGENTA_TERRACOTTA_STAIRS;
    public static final Item ORANGE_TERRACOTTA_STAIRS;
    public static final Item PINK_TERRACOTTA_STAIRS;
    public static final Item PURPLE_TERRACOTTA_STAIRS;
    public static final Item RED_TERRACOTTA_STAIRS;
    public static final Item TERRACOTTA_STAIRS;
    public static final Item WHITE_TERRACOTTA_STAIRS;
    public static final Item YELLOW_TERRACOTTA_STAIRS;

    public static final Item PLACEHOLDER;

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
        BLACK_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BLACK_TERRACOTTA_SLAB);
        BLUE_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BLUE_TERRACOTTA_SLAB);
        BROWN_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BROWN_TERRACOTTA_SLAB);
        CYAN_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.CYAN_TERRACOTTA_SLAB);
        GRAY_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.GRAY_TERRACOTTA_SLAB);
        GREEN_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.GREEN_TERRACOTTA_SLAB);
        LIGHT_BLUE_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        LIGHT_GRAY_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        LIME_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIME_TERRACOTTA_SLAB);
        MAGENTA_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_SLAB);
        ORANGE_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_SLAB);
        PINK_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.PINK_TERRACOTTA_SLAB);
        PURPLE_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_SLAB);
        RED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.RED_TERRACOTTA_SLAB);
        TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.TERRACOTTA_SLAB);
        WHITE_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.WHITE_TERRACOTTA_SLAB);
        YELLOW_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_SLAB);

        BLACK_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BLACK_TERRACOTTA_STAIRS);
        BLUE_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BLUE_TERRACOTTA_STAIRS);
        BROWN_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BROWN_TERRACOTTA_STAIRS);
        CYAN_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.CYAN_TERRACOTTA_STAIRS);
        GRAY_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.GRAY_TERRACOTTA_STAIRS);
        GREEN_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.GREEN_TERRACOTTA_STAIRS);
        LIGHT_BLUE_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        LIGHT_GRAY_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        LIME_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIME_TERRACOTTA_STAIRS);
        MAGENTA_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_STAIRS);
        ORANGE_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_STAIRS);
        PINK_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.PINK_TERRACOTTA_STAIRS);
        PURPLE_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_STAIRS);
        RED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.RED_TERRACOTTA_STAIRS);
        TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.TERRACOTTA_STAIRS);
        WHITE_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.WHITE_TERRACOTTA_STAIRS);
        YELLOW_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_STAIRS);

        PLACEHOLDER = register("placeholder", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    }
}
