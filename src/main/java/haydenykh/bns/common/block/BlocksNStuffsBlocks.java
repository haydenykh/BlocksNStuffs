package haydenykh.bns.common.block;

import haydenykh.bns.common.block.advanced.GlazedTerracottaSlabBlock;
import haydenykh.bns.common.tag.BlocksNStuffsTags;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsBlocks {
    public static final Map<Block, Block> TERRACOTTA_BLOCKS_ARRAY = new HashMap();
    public static final Map<Block, Block> GLAZED_TERRACOTTA_BLOCKS_ARRAY = new HashMap();
    public static final Map<Block, Block> WOOL_BLOCKS_ARRAY = new HashMap();
    public static final List<Block> DEFAULT_TERRACOTTA_BLOCKS_ARRAY = new ArrayList();
    public static final List<Block> DEFAULT_GLAZED_TERRACOTTA_BLOCKS_ARRAY = new ArrayList();
    public static final List<Block> DEFAULT_WOOL_BLOCKS_ARRAY = new ArrayList();

    public static final Block BLACK_TERRACOTTA_SLAB;
    public static final Block BLUE_TERRACOTTA_SLAB;
    public static final Block BROWN_TERRACOTTA_SLAB;
    public static final Block CYAN_TERRACOTTA_SLAB;
    public static final Block GRAY_TERRACOTTA_SLAB;
    public static final Block GREEN_TERRACOTTA_SLAB;
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB;
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB;
    public static final Block LIME_TERRACOTTA_SLAB;
    public static final Block MAGENTA_TERRACOTTA_SLAB;
    public static final Block ORANGE_TERRACOTTA_SLAB;
    public static final Block PINK_TERRACOTTA_SLAB;
    public static final Block PURPLE_TERRACOTTA_SLAB;
    public static final Block RED_TERRACOTTA_SLAB;
    public static final Block TERRACOTTA_SLAB;
    public static final Block WHITE_TERRACOTTA_SLAB;
    public static final Block YELLOW_TERRACOTTA_SLAB;

    public static final Block BLACK_TERRACOTTA_STAIRS;
    public static final Block BLUE_TERRACOTTA_STAIRS;
    public static final Block BROWN_TERRACOTTA_STAIRS;
    public static final Block CYAN_TERRACOTTA_STAIRS;
    public static final Block GRAY_TERRACOTTA_STAIRS;
    public static final Block GREEN_TERRACOTTA_STAIRS;
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS;
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS;
    public static final Block LIME_TERRACOTTA_STAIRS;
    public static final Block MAGENTA_TERRACOTTA_STAIRS;
    public static final Block ORANGE_TERRACOTTA_STAIRS;
    public static final Block PINK_TERRACOTTA_STAIRS;
    public static final Block PURPLE_TERRACOTTA_STAIRS;
    public static final Block RED_TERRACOTTA_STAIRS;
    public static final Block TERRACOTTA_STAIRS;
    public static final Block WHITE_TERRACOTTA_STAIRS;
    public static final Block YELLOW_TERRACOTTA_STAIRS;

//    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB;
//    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB;
//    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB;
//    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB;
//    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB;
//    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB;
//    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB;
//    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB;
//    public static final Block LIME_GLAZED_TERRACOTTA_SLAB;
//    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB;
//    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB;
//    public static final Block PINK_GLAZED_TERRACOTTA_SLAB;
//    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB;
//    public static final Block RED_GLAZED_TERRACOTTA_SLAB;
//    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB;
//    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB;

//    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block RED_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS;
//    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS;

    public static final Block BLACK_WOOL_SLAB;
    public static final Block BLUE_WOOL_SLAB;
    public static final Block BROWN_WOOL_SLAB;
    public static final Block CYAN_WOOL_SLAB;
    public static final Block GRAY_WOOL_SLAB;
    public static final Block GREEN_WOOL_SLAB;
    public static final Block LIGHT_BLUE_WOOL_SLAB;
    public static final Block LIGHT_GRAY_WOOL_SLAB;
    public static final Block LIME_WOOL_SLAB;
    public static final Block MAGENTA_WOOL_SLAB;
    public static final Block ORANGE_WOOL_SLAB;
    public static final Block PINK_WOOL_SLAB;
    public static final Block PURPLE_WOOL_SLAB;
    public static final Block RED_WOOL_SLAB;
    public static final Block WHITE_WOOL_SLAB;
    public static final Block YELLOW_WOOL_SLAB;

    public static final Block BLACK_WOOL_STAIRS;
    public static final Block BLUE_WOOL_STAIRS;
    public static final Block BROWN_WOOL_STAIRS;
    public static final Block CYAN_WOOL_STAIRS;
    public static final Block GRAY_WOOL_STAIRS;
    public static final Block GREEN_WOOL_STAIRS;
    public static final Block LIGHT_BLUE_WOOL_STAIRS;
    public static final Block LIGHT_GRAY_WOOL_STAIRS;
    public static final Block LIME_WOOL_STAIRS;
    public static final Block MAGENTA_WOOL_STAIRS;
    public static final Block ORANGE_WOOL_STAIRS;
    public static final Block PINK_WOOL_STAIRS;
    public static final Block PURPLE_WOOL_STAIRS;
    public static final Block RED_WOOL_STAIRS;
    public static final Block WHITE_WOOL_STAIRS;
    public static final Block YELLOW_WOOL_STAIRS;

    private static <T extends Block> T register(String id, T block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ID, id), block);
    }

    private static void registerBlockItem(String id, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ID, id), new BlockItem(block, new Item.Settings()));
    }

    public static void init() {
        LOGGER.info("Initializing blocks for " + ID);
    }

    static {
        BLACK_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.BLACK_TERRACOTTA);
        BLUE_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.BLUE_TERRACOTTA);
        BROWN_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.BROWN_TERRACOTTA);
        CYAN_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.CYAN_TERRACOTTA);
        GRAY_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.GRAY_TERRACOTTA);
        GREEN_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.GREEN_TERRACOTTA);
        LIGHT_BLUE_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.LIGHT_BLUE_TERRACOTTA);
        LIGHT_GRAY_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.LIGHT_GRAY_TERRACOTTA);
        LIME_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.LIME_TERRACOTTA);
        MAGENTA_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.MAGENTA_TERRACOTTA);
        ORANGE_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.ORANGE_TERRACOTTA);
        PINK_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.PINK_TERRACOTTA);
        PURPLE_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.PURPLE_TERRACOTTA);
        RED_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.RED_TERRACOTTA);
        TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.TERRACOTTA);
        WHITE_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.WHITE_TERRACOTTA);
        YELLOW_TERRACOTTA_SLAB = registerTerracottaSlab(Blocks.YELLOW_TERRACOTTA);

        BLACK_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.BLACK_TERRACOTTA);
        BLUE_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.BLUE_TERRACOTTA);
        BROWN_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.BROWN_TERRACOTTA);
        CYAN_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.CYAN_TERRACOTTA);
        GRAY_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.GRAY_TERRACOTTA);
        GREEN_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.GREEN_TERRACOTTA);
        LIGHT_BLUE_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.LIGHT_BLUE_TERRACOTTA);
        LIGHT_GRAY_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.LIGHT_GRAY_TERRACOTTA);
        LIME_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.LIME_TERRACOTTA);
        MAGENTA_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.MAGENTA_TERRACOTTA);
        ORANGE_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.ORANGE_TERRACOTTA);
        PINK_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.PINK_TERRACOTTA);
        PURPLE_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.PURPLE_TERRACOTTA);
        RED_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.RED_TERRACOTTA);
        TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.TERRACOTTA);
        WHITE_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.WHITE_TERRACOTTA);
        YELLOW_TERRACOTTA_STAIRS = registerTerracottaStairs(Blocks.YELLOW_TERRACOTTA);

//        BLACK_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.BLACK_GLAZED_TERRACOTTA);
//        BLUE_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.BLUE_GLAZED_TERRACOTTA);
//        BROWN_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.BROWN_GLAZED_TERRACOTTA);
//        CYAN_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.CYAN_GLAZED_TERRACOTTA);
//        GRAY_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.GRAY_GLAZED_TERRACOTTA);
//        GREEN_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.GREEN_GLAZED_TERRACOTTA);
//        LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
//        LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
//        LIME_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.LIME_GLAZED_TERRACOTTA);
//        MAGENTA_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.MAGENTA_GLAZED_TERRACOTTA);
//        ORANGE_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.ORANGE_GLAZED_TERRACOTTA);
//        PINK_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.PINK_GLAZED_TERRACOTTA);
//        PURPLE_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.PURPLE_GLAZED_TERRACOTTA);
//        RED_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.RED_GLAZED_TERRACOTTA);
//        WHITE_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.WHITE_GLAZED_TERRACOTTA);
//        YELLOW_GLAZED_TERRACOTTA_SLAB = registerWoolSlab(Blocks.YELLOW_GLAZED_TERRACOTTA);
//
//        BLACK_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.BLACK_GLAZED_TERRACOTTA);
//        BLUE_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.BLUE_GLAZED_TERRACOTTA);
//        BROWN_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.BROWN_GLAZED_TERRACOTTA);
//        CYAN_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.CYAN_GLAZED_TERRACOTTA);
//        GRAY_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.GRAY_GLAZED_TERRACOTTA);
//        GREEN_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.GREEN_GLAZED_TERRACOTTA);
//        LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
//        LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
//        LIME_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.LIME_GLAZED_TERRACOTTA);
//        MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.MAGENTA_GLAZED_TERRACOTTA);
//        ORANGE_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.ORANGE_GLAZED_TERRACOTTA);
//        PINK_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.PINK_GLAZED_TERRACOTTA);
//        PURPLE_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.PURPLE_GLAZED_TERRACOTTA);
//        RED_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.RED_GLAZED_TERRACOTTA);
//        WHITE_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.WHITE_GLAZED_TERRACOTTA);
//        YELLOW_GLAZED_TERRACOTTA_STAIRS = registerWoolStairs(Blocks.YELLOW_GLAZED_TERRACOTTA);

        BLACK_WOOL_SLAB = registerWoolSlab(Blocks.BLACK_WOOL);
        BLUE_WOOL_SLAB = registerWoolSlab(Blocks.BLUE_WOOL);
        BROWN_WOOL_SLAB = registerWoolSlab(Blocks.BROWN_WOOL);
        CYAN_WOOL_SLAB = registerWoolSlab(Blocks.CYAN_WOOL);
        GRAY_WOOL_SLAB = registerWoolSlab(Blocks.GRAY_WOOL);
        GREEN_WOOL_SLAB = registerWoolSlab(Blocks.GREEN_WOOL);
        LIGHT_BLUE_WOOL_SLAB = registerWoolSlab(Blocks.LIGHT_BLUE_WOOL);
        LIGHT_GRAY_WOOL_SLAB = registerWoolSlab(Blocks.LIGHT_GRAY_WOOL);
        LIME_WOOL_SLAB = registerWoolSlab(Blocks.LIME_WOOL);
        MAGENTA_WOOL_SLAB = registerWoolSlab(Blocks.MAGENTA_WOOL);
        ORANGE_WOOL_SLAB = registerWoolSlab(Blocks.ORANGE_WOOL);
        PINK_WOOL_SLAB = registerWoolSlab(Blocks.PINK_WOOL);
        PURPLE_WOOL_SLAB = registerWoolSlab(Blocks.PURPLE_WOOL);
        RED_WOOL_SLAB = registerWoolSlab(Blocks.RED_WOOL);
        WHITE_WOOL_SLAB = registerWoolSlab(Blocks.WHITE_WOOL);
        YELLOW_WOOL_SLAB = registerWoolSlab(Blocks.YELLOW_WOOL);

        BLACK_WOOL_STAIRS = registerWoolStairs(Blocks.BLACK_WOOL);
        BLUE_WOOL_STAIRS = registerWoolStairs(Blocks.BLUE_WOOL);
        BROWN_WOOL_STAIRS = registerWoolStairs(Blocks.BROWN_WOOL);
        CYAN_WOOL_STAIRS = registerWoolStairs(Blocks.CYAN_WOOL);
        GRAY_WOOL_STAIRS = registerWoolStairs(Blocks.GRAY_WOOL);
        GREEN_WOOL_STAIRS = registerWoolStairs(Blocks.GREEN_WOOL);
        LIGHT_BLUE_WOOL_STAIRS = registerWoolStairs(Blocks.LIGHT_BLUE_WOOL);
        LIGHT_GRAY_WOOL_STAIRS = registerWoolStairs(Blocks.LIGHT_GRAY_WOOL);
        LIME_WOOL_STAIRS = registerWoolStairs(Blocks.LIME_WOOL);
        MAGENTA_WOOL_STAIRS = registerWoolStairs(Blocks.MAGENTA_WOOL);
        ORANGE_WOOL_STAIRS = registerWoolStairs(Blocks.ORANGE_WOOL);
        PINK_WOOL_STAIRS = registerWoolStairs(Blocks.PINK_WOOL);
        PURPLE_WOOL_STAIRS = registerWoolStairs(Blocks.PURPLE_WOOL);
        RED_WOOL_STAIRS = registerWoolStairs(Blocks.RED_WOOL);
        WHITE_WOOL_STAIRS = registerWoolStairs(Blocks.WHITE_WOOL);
        YELLOW_WOOL_STAIRS = registerWoolStairs(Blocks.YELLOW_WOOL);

        registerFlammableBlocks();

        DEFAULT_TERRACOTTA_BLOCKS_ARRAY.addAll(Arrays.asList(Blocks.BLACK_TERRACOTTA, Blocks.BLUE_TERRACOTTA, Blocks.BROWN_TERRACOTTA, Blocks.CYAN_TERRACOTTA, Blocks.GRAY_TERRACOTTA, Blocks.GREEN_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA, Blocks.LIME_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA, Blocks.ORANGE_TERRACOTTA, Blocks.PINK_TERRACOTTA, Blocks.PURPLE_TERRACOTTA, Blocks.RED_TERRACOTTA, Blocks.TERRACOTTA, Blocks.WHITE_TERRACOTTA, Blocks.YELLOW_TERRACOTTA));
//        DEFAULT_GLAZED_TERRACOTTA_BLOCKS_ARRAY.addAll(Arrays.asList(Blocks.BLACK_GLAZED_TERRACOTTA, Blocks.BLUE_GLAZED_TERRACOTTA, Blocks.BROWN_GLAZED_TERRACOTTA, Blocks.CYAN_GLAZED_TERRACOTTA, Blocks.GRAY_GLAZED_TERRACOTTA, Blocks.GREEN_GLAZED_TERRACOTTA, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Blocks.LIME_GLAZED_TERRACOTTA, Blocks.MAGENTA_GLAZED_TERRACOTTA, Blocks.ORANGE_GLAZED_TERRACOTTA, Blocks.PINK_GLAZED_TERRACOTTA, Blocks.PURPLE_GLAZED_TERRACOTTA, Blocks.RED_GLAZED_TERRACOTTA, Blocks.WHITE_GLAZED_TERRACOTTA, Blocks.YELLOW_GLAZED_TERRACOTTA));
        DEFAULT_WOOL_BLOCKS_ARRAY.addAll(Arrays.asList(Blocks.BLACK_WOOL, Blocks.BLUE_WOOL, Blocks.BROWN_WOOL, Blocks.CYAN_WOOL, Blocks.GRAY_WOOL, Blocks.GREEN_WOOL, Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.LIME_WOOL, Blocks.MAGENTA_WOOL, Blocks.ORANGE_WOOL, Blocks.PINK_WOOL, Blocks.PURPLE_WOOL, Blocks.RED_WOOL, Blocks.WHITE_WOOL, Blocks.YELLOW_WOOL));

        TERRACOTTA_BLOCKS_ARRAY.putAll(Map.ofEntries(Map.entry(BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA), Map.entry(BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA), Map.entry(BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA), Map.entry(CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA), Map.entry(GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA), Map.entry(GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA), Map.entry(LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA), Map.entry(LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA), Map.entry(LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA), Map.entry(MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA), Map.entry(ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA), Map.entry(PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA), Map.entry(PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA), Map.entry(RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA), Map.entry(TERRACOTTA_SLAB, Blocks.TERRACOTTA), Map.entry(WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA), Map.entry(YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA),
                Map.entry(BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA), Map.entry(BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA), Map.entry(BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA), Map.entry(CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA), Map.entry(GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA), Map.entry(GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA), Map.entry(LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA), Map.entry(LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA), Map.entry(LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA), Map.entry(MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA), Map.entry(ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA), Map.entry(PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA), Map.entry(PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA), Map.entry(RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA), Map.entry(TERRACOTTA_STAIRS, Blocks.TERRACOTTA), Map.entry(WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA), Map.entry(YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA)));
//        GLAZED_TERRACOTTA_BLOCKS_ARRAY.putAll(Map.ofEntries(Map.entry(BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA),/*, Map.entry(BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA), Map.entry(BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA), Map.entry(CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA), Map.entry(GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA), Map.entry(GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA), Map.entry(LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), Map.entry(LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), Map.entry(LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA), Map.entry(MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA), Map.entry(ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA), Map.entry(PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA), Map.entry(PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA), Map.entry(RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA), Map.entry(TERRACOTTA_SLAB, Blocks.TERRACOTTA), Map.entry(WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA), Map.entry(YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA),*/
//                Map.entry(BLACK_GLAZED_TERRACOTTA_STAIRS, Blocks.BLACK_GLAZED_TERRACOTTA)));/*, Map.entry(BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.BLUE_GLAZED_TERRACOTTA), Map.entry(BROWN_GLAZED_TERRACOTTA_STAIRS, Blocks.BROWN_GLAZED_TERRACOTTA), Map.entry(CYAN_GLAZED_TERRACOTTA_STAIRS, Blocks.CYAN_GLAZED_TERRACOTTA), Map.entry(GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GRAY_GLAZED_TERRACOTTA), Map.entry(GREEN_GLAZED_TERRACOTTA_STAIRS, Blocks.GREEN_GLAZED_TERRACOTTA), Map.entry(LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), Map.entry(LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), Map.entry(LIME_GLAZED_TERRACOTTA_STAIRS, Blocks.LIME_GLAZED_TERRACOTTA), Map.entry(MAGENTA_GLAZED_TERRACOTTA_STAIRS, Blocks.MAGENTA_GLAZED_TERRACOTTA), Map.entry(ORANGE_GLAZED_TERRACOTTA_STAIRS, Blocks.ORANGE_GLAZED_TERRACOTTA), Map.entry(PINK_GLAZED_TERRACOTTA_STAIRS, Blocks.PINK_GLAZED_TERRACOTTA), Map.entry(PURPLE_GLAZED_TERRACOTTA_STAIRS, Blocks.PURPLE_GLAZED_TERRACOTTA), Map.entry(RED_GLAZED_TERRACOTTA_STAIRS, Blocks.RED_GLAZED_TERRACOTTA), Map.entry(WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.WHITE_GLAZED_TERRACOTTA), Map.entry(YELLOW_GLAZED_TERRACOTTA_STAIRS, Blocks.YELLOW_GLAZED_TERRACOTTA))); */
        WOOL_BLOCKS_ARRAY.putAll(Map.ofEntries(Map.entry(BLACK_WOOL_SLAB, Blocks.BLACK_WOOL), Map.entry(BLUE_WOOL_SLAB, Blocks.BLUE_WOOL), Map.entry(BROWN_WOOL_SLAB, Blocks.BROWN_WOOL), Map.entry(CYAN_WOOL_SLAB, Blocks.CYAN_WOOL), Map.entry(GRAY_WOOL_SLAB, Blocks.GRAY_WOOL), Map.entry(GREEN_WOOL_SLAB, Blocks.GREEN_WOOL), Map.entry(LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL), Map.entry(LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL), Map.entry(LIME_WOOL_SLAB, Blocks.LIME_WOOL), Map.entry(MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL), Map.entry(ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL), Map.entry(PINK_WOOL_SLAB, Blocks.PINK_WOOL), Map.entry(PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL), Map.entry(RED_WOOL_SLAB, Blocks.RED_WOOL), Map.entry(WHITE_WOOL_SLAB, Blocks.WHITE_WOOL), Map.entry(YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL),
                Map.entry(BLACK_WOOL_STAIRS, Blocks.BLACK_WOOL), Map.entry(BLUE_WOOL_STAIRS, Blocks.BLUE_WOOL), Map.entry(BROWN_WOOL_STAIRS, Blocks.BROWN_WOOL), Map.entry(CYAN_WOOL_STAIRS, Blocks.CYAN_WOOL), Map.entry(GRAY_WOOL_STAIRS, Blocks.GRAY_WOOL), Map.entry(GREEN_WOOL_STAIRS, Blocks.GREEN_WOOL), Map.entry(LIGHT_BLUE_WOOL_STAIRS, Blocks.LIGHT_BLUE_WOOL), Map.entry(LIGHT_GRAY_WOOL_STAIRS, Blocks.LIGHT_GRAY_WOOL), Map.entry(LIME_WOOL_STAIRS, Blocks.LIME_WOOL), Map.entry(MAGENTA_WOOL_STAIRS, Blocks.MAGENTA_WOOL), Map.entry(ORANGE_WOOL_STAIRS, Blocks.ORANGE_WOOL), Map.entry(PINK_WOOL_STAIRS, Blocks.PINK_WOOL), Map.entry(PURPLE_WOOL_STAIRS, Blocks.PURPLE_WOOL), Map.entry(RED_WOOL_STAIRS, Blocks.RED_WOOL), Map.entry(WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL), Map.entry(YELLOW_WOOL_STAIRS, Blocks.YELLOW_WOOL)));
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(BlocksNStuffsTags.Blocks.WOOL_SLABS, 30, 60);
        registry.add(BlocksNStuffsTags.Blocks.WOOL_STAIRS, 30, 60);
    }

    private static Block registerTerracottaSlab(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_slab", new SlabBlock(Settings.copy(parentBlock)));
    }

    private static Block registerTerracottaStairs(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_stairs", new StairsBlock(parentBlock.getDefaultState(), Settings.copy(parentBlock)));
    }

    private static Block registerWoolSlab(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_slab", new SlabBlock(Settings.copy(parentBlock)));
    }

    private static Block registerWoolStairs(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_stairs", new StairsBlock(parentBlock.getDefaultState(), Settings.copy(parentBlock)));
    }

    private static Block registerGlazedTerracottaSlab(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_slab", new GlazedTerracottaSlabBlock(Settings.copy(parentBlock)));
    }

    private static Block registerGlazedTerracottaStairs(Block parentBlock) {
        return register(Registries.BLOCK.getId(parentBlock).toString().substring(10) + "_stairs", new StairsBlock(parentBlock.getDefaultState(), Settings.copy(parentBlock)));
    }
}
