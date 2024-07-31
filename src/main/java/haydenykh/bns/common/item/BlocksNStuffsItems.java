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

//    public static final Item BLACK_GLAZED_TERRACOTTA_SLAB;
//    public static final Item BLUE_GLAZED_TERRACOTTA_SLAB;
//    public static final Item BROWN_GLAZED_TERRACOTTA_SLAB;
//    public static final Item CYAN_GLAZED_TERRACOTTA_SLAB;
//    public static final Item GRAY_GLAZED_TERRACOTTA_SLAB;
//    public static final Item GREEN_GLAZED_TERRACOTTA_SLAB;
//    public static final Item LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB;
//    public static final Item LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB;
//    public static final Item LIME_GLAZED_TERRACOTTA_SLAB;
//    public static final Item MAGENTA_GLAZED_TERRACOTTA_SLAB;
//    public static final Item ORANGE_GLAZED_TERRACOTTA_SLAB;
//    public static final Item PINK_GLAZED_TERRACOTTA_SLAB;
//    public static final Item PURPLE_GLAZED_TERRACOTTA_SLAB;
//    public static final Item RED_GLAZED_TERRACOTTA_SLAB;
//    public static final Item WHITE_GLAZED_TERRACOTTA_SLAB;
//    public static final Item YELLOW_GLAZED_TERRACOTTA_SLAB;

//    public static final Item BLACK_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item BLUE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item BROWN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item CYAN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item GRAY_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item GREEN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item LIME_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item MAGENTA_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item ORANGE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item PINK_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item PURPLE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item RED_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item WHITE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Item YELLOW_GLAZED_TERRACOTTA_STAIRS;

    public static final Item BLACK_WOOL_SLAB;
    public static final Item BLUE_WOOL_SLAB;
    public static final Item BROWN_WOOL_SLAB;
    public static final Item CYAN_WOOL_SLAB;
    public static final Item GRAY_WOOL_SLAB;
    public static final Item GREEN_WOOL_SLAB;
    public static final Item LIGHT_BLUE_WOOL_SLAB;
    public static final Item LIGHT_GRAY_WOOL_SLAB;
    public static final Item LIME_WOOL_SLAB;
    public static final Item MAGENTA_WOOL_SLAB;
    public static final Item ORANGE_WOOL_SLAB;
    public static final Item PINK_WOOL_SLAB;
    public static final Item PURPLE_WOOL_SLAB;
    public static final Item RED_WOOL_SLAB;
    public static final Item WHITE_WOOL_SLAB;
    public static final Item YELLOW_WOOL_SLAB;

    public static final Item BLACK_WOOL_STAIRS;
    public static final Item BLUE_WOOL_STAIRS;
    public static final Item BROWN_WOOL_STAIRS;
    public static final Item CYAN_WOOL_STAIRS;
    public static final Item GRAY_WOOL_STAIRS;
    public static final Item GREEN_WOOL_STAIRS;
    public static final Item LIGHT_BLUE_WOOL_STAIRS;
    public static final Item LIGHT_GRAY_WOOL_STAIRS;
    public static final Item LIME_WOOL_STAIRS;
    public static final Item MAGENTA_WOOL_STAIRS;
    public static final Item ORANGE_WOOL_STAIRS;
    public static final Item PINK_WOOL_STAIRS;
    public static final Item PURPLE_WOOL_STAIRS;
    public static final Item RED_WOOL_STAIRS;
    public static final Item WHITE_WOOL_STAIRS;
    public static final Item YELLOW_WOOL_STAIRS;

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

//        BLACK_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
//        BLUE_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
//        BROWN_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
//        CYAN_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
//        GRAY_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
//        GREEN_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
//        LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
//        LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
//        LIME_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
//        MAGENTA_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
//        ORANGE_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
//        PINK_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
//        PURPLE_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
//        RED_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_SLAB);
//        WHITE_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
//        YELLOW_GLAZED_TERRACOTTA_SLAB = register(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
//
//        BLACK_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
//        BLUE_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
//        BROWN_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
//        CYAN_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
//        GRAY_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
//        GREEN_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
//        LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
//        LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
//        LIME_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
//        MAGENTA_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
//        ORANGE_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
//        PINK_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
//        PURPLE_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
//        RED_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
//        WHITE_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
//        YELLOW_GLAZED_TERRACOTTA_STAIRS = register(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);

        BLACK_WOOL_SLAB = register(BlocksNStuffsBlocks.BLACK_WOOL_SLAB);
        BLUE_WOOL_SLAB = register(BlocksNStuffsBlocks.BLUE_WOOL_SLAB);
        BROWN_WOOL_SLAB = register(BlocksNStuffsBlocks.BROWN_WOOL_SLAB);
        CYAN_WOOL_SLAB = register(BlocksNStuffsBlocks.CYAN_WOOL_SLAB);
        GRAY_WOOL_SLAB = register(BlocksNStuffsBlocks.GRAY_WOOL_SLAB);
        GREEN_WOOL_SLAB = register(BlocksNStuffsBlocks.GREEN_WOOL_SLAB);
        LIGHT_BLUE_WOOL_SLAB = register(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_SLAB);
        LIGHT_GRAY_WOOL_SLAB = register(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_SLAB);
        LIME_WOOL_SLAB = register(BlocksNStuffsBlocks.LIME_WOOL_SLAB);
        MAGENTA_WOOL_SLAB = register(BlocksNStuffsBlocks.MAGENTA_WOOL_SLAB);
        ORANGE_WOOL_SLAB = register(BlocksNStuffsBlocks.ORANGE_WOOL_SLAB);
        PINK_WOOL_SLAB = register(BlocksNStuffsBlocks.PINK_WOOL_SLAB);
        PURPLE_WOOL_SLAB = register(BlocksNStuffsBlocks.PURPLE_WOOL_SLAB);
        RED_WOOL_SLAB = register(BlocksNStuffsBlocks.RED_WOOL_SLAB);
        WHITE_WOOL_SLAB = register(BlocksNStuffsBlocks.WHITE_WOOL_SLAB);
        YELLOW_WOOL_SLAB = register(BlocksNStuffsBlocks.YELLOW_WOOL_SLAB);

        BLACK_WOOL_STAIRS = register(BlocksNStuffsBlocks.BLACK_WOOL_STAIRS);
        BLUE_WOOL_STAIRS = register(BlocksNStuffsBlocks.BLUE_WOOL_STAIRS);
        BROWN_WOOL_STAIRS = register(BlocksNStuffsBlocks.BROWN_WOOL_STAIRS);
        CYAN_WOOL_STAIRS = register(BlocksNStuffsBlocks.CYAN_WOOL_STAIRS);
        GRAY_WOOL_STAIRS = register(BlocksNStuffsBlocks.GRAY_WOOL_STAIRS);
        GREEN_WOOL_STAIRS = register(BlocksNStuffsBlocks.GREEN_WOOL_STAIRS);
        LIGHT_BLUE_WOOL_STAIRS = register(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_STAIRS);
        LIGHT_GRAY_WOOL_STAIRS = register(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_STAIRS);
        LIME_WOOL_STAIRS = register(BlocksNStuffsBlocks.LIME_WOOL_STAIRS);
        MAGENTA_WOOL_STAIRS = register(BlocksNStuffsBlocks.MAGENTA_WOOL_STAIRS);
        ORANGE_WOOL_STAIRS = register(BlocksNStuffsBlocks.ORANGE_WOOL_STAIRS);
        PINK_WOOL_STAIRS = register(BlocksNStuffsBlocks.PINK_WOOL_STAIRS);
        PURPLE_WOOL_STAIRS = register(BlocksNStuffsBlocks.PURPLE_WOOL_STAIRS);
        RED_WOOL_STAIRS = register(BlocksNStuffsBlocks.RED_WOOL_STAIRS);
        WHITE_WOOL_STAIRS = register(BlocksNStuffsBlocks.WHITE_WOOL_STAIRS);
        YELLOW_WOOL_STAIRS = register(BlocksNStuffsBlocks.YELLOW_WOOL_STAIRS);

        PLACEHOLDER = register("placeholder", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof()));
    }
}
