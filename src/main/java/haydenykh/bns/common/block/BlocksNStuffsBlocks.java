package haydenykh.bns.common.block;

import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsBlocks {
    public static final Map<Block, Block> TERRACOTTA_BLOCKS_ARRAY = new HashMap<>();
    public static final List<Block> DEFAULT_TERRACOTTA_BLOCKS_ARRAY = new ArrayList<>();

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
        BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(Settings.create().mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));

        BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        TERRACOTTA_STAIRS = register("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), Settings.create().mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));

        DEFAULT_TERRACOTTA_BLOCKS_ARRAY.addAll(Arrays.asList(
                Blocks.BLACK_TERRACOTTA,
                Blocks.BLUE_TERRACOTTA,
                Blocks.BROWN_TERRACOTTA,
                Blocks.CYAN_TERRACOTTA,
                Blocks.GRAY_TERRACOTTA,
                Blocks.GREEN_TERRACOTTA,
                Blocks.LIGHT_BLUE_TERRACOTTA,
                Blocks.LIGHT_GRAY_TERRACOTTA,
                Blocks.LIME_TERRACOTTA,
                Blocks.MAGENTA_TERRACOTTA,
                Blocks.ORANGE_TERRACOTTA,
                Blocks.PINK_TERRACOTTA,
                Blocks.PURPLE_TERRACOTTA,
                Blocks.RED_TERRACOTTA,
                Blocks.TERRACOTTA,
                Blocks.WHITE_TERRACOTTA,
                Blocks.YELLOW_TERRACOTTA
        ));

        TERRACOTTA_BLOCKS_ARRAY.putAll(Map.ofEntries(
                Map.entry(BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA),
                Map.entry(BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA),
                Map.entry(BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA),
                Map.entry(CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA),
                Map.entry(GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA),
                Map.entry(GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA),
                Map.entry(LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA),
                Map.entry(LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA),
                Map.entry(LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA),
                Map.entry(MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA),
                Map.entry(ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA),
                Map.entry(PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA),
                Map.entry(PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA),
                Map.entry(RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA),
                Map.entry(TERRACOTTA_SLAB, Blocks.TERRACOTTA),
                Map.entry(WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA),
                Map.entry(YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA),

                Map.entry(BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA),
                Map.entry(BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA),
                Map.entry(BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA),
                Map.entry(CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA),
                Map.entry(GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA),
                Map.entry(GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA),
                Map.entry(LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA),
                Map.entry(LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA),
                Map.entry(LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA),
                Map.entry(MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA),
                Map.entry(ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA),
                Map.entry(PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA),
                Map.entry(PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA),
                Map.entry(RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA),
                Map.entry(TERRACOTTA_STAIRS, Blocks.TERRACOTTA),
                Map.entry(WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA),
                Map.entry(YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA)
        ));
    }
}
