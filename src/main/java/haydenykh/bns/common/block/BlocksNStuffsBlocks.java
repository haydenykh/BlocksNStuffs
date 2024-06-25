package haydenykh.bns.common.block;

//import haydenykh.bns.common.block.advanced.StackedTrapdoor;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsBlocks {
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

//    public static final Block STACKED_OAK_TRAPDOOR;
//    public static final Block STACKED_SPRUCE_TRAPDOOR;
//    public static final Block STACKED_BIRCH_TRAPDOOR;
//    public static final Block STACKED_JUNGLE_TRAPDOOR;
//    public static final Block STACKED_ACACIA_TRAPDOOR;
//    public static final Block STACKED_DARK_OAK_TRAPDOOR;
//    public static final Block STACKED_MANGROVE_TRAPDOOR;
//    public static final Block STACKED_CHERRY_TRAPDOOR;
//    public static final Block STACKED_BAMBOO_TRAPDOOR;
//    public static final Block STACKED_CRIMSON_TRAPDOOR;
//    public static final Block STACKED_WARPED_TRAPDOOR;
//    public static final Block STACKED_IRON_TRAPDOOR;
//    public static final Block STACKED_COPPER_TRAPDOOR;
//    public static final Block STACKED_WAXED_COPPER_TRAPDOOR;
//    public static final Block STACKED_EXPOSED_COPPER_TRAPDOOR;
//    public static final Block STACKED_WAXED_EXPOSED_COPPER_TRAPDOOR;
//    public static final Block STACKED_WEATHERED_COPPER_TRAPDOOR;
//    public static final Block STACKED_WAXED_WEATHERED_COPPER_TRAPDOOR;
//    public static final Block STACKED_OXIDIZED_COPPER_TRAPDOOR;
//    public static final Block STACKED_WAXED_OXIDIZED_COPPER_TRAPDOOR;

    private static <T extends Block> T register(String id, T block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ID, id), new BlockItem(block, new Item.Settings()));
    }

    public static void init() {
        LOGGER.info("Initializing blocks for " + ID);
    }

    static {
//        STACKED_OAK_TRAPDOOR = register("stacked_oak_trapdoor", new StackedTrapdoor(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR), Blocks.OAK_TRAPDOOR));
//        STACKED_SPRUCE_TRAPDOOR = register("stacked_spruce_trapdoor", new StackedTrapdoor(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_TRAPDOOR), Blocks.SPRUCE_TRAPDOOR));
//        STACKED_BIRCH_TRAPDOOR = register("stacked_birch_trapdoor", new StackedTrapdoor(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_TRAPDOOR), Blocks.BIRCH_TRAPDOOR));
//        STACKED_JUNGLE_TRAPDOOR = register("stacked_jungle_trapdoor", new StackedTrapdoor(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_TRAPDOOR), Blocks.JUNGLE_TRAPDOOR));
//        STACKED_ACACIA_TRAPDOOR = register("stacked_acacia_trapdoor", new StackedTrapdoor(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_TRAPDOOR), Blocks.ACACIA_TRAPDOOR));
//        STACKED_DARK_OAK_TRAPDOOR = register("stacked_dark_oak_trapdoor", new StackedTrapdoor(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_TRAPDOOR), Blocks.DARK_OAK_TRAPDOOR));
//        STACKED_MANGROVE_TRAPDOOR = register("stacked_mangrove_trapdoor", new StackedTrapdoor(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR), Blocks.MANGROVE_TRAPDOOR));
//        STACKED_CHERRY_TRAPDOOR = register("stacked_cherry_trapdoor", new StackedTrapdoor(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_TRAPDOOR), Blocks.CHERRY_TRAPDOOR));
//        STACKED_BAMBOO_TRAPDOOR = register("stacked_bamboo_trapdoor", new StackedTrapdoor(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_TRAPDOOR), Blocks.BAMBOO_TRAPDOOR));
//        STACKED_CRIMSON_TRAPDOOR = register("stacked_crimson_trapdoor", new StackedTrapdoor(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR), Blocks.CRIMSON_TRAPDOOR));
//        STACKED_WARPED_TRAPDOOR = register("stacked_warped_trapdoor", new StackedTrapdoor(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_TRAPDOOR), Blocks.WARPED_TRAPDOOR));
//        STACKED_IRON_TRAPDOOR = register("stacked_iron_trapdoor", new StackedTrapdoor(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR), Blocks.IRON_TRAPDOOR));
//        STACKED_COPPER_TRAPDOOR = register("stacked_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_TRAPDOOR), Blocks.COPPER_TRAPDOOR));
//        STACKED_WAXED_COPPER_TRAPDOOR = register("stacked_waxed_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_TRAPDOOR), Blocks.WAXED_COPPER_TRAPDOOR));
//        STACKED_EXPOSED_COPPER_TRAPDOOR = register("stacked_exposed_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_TRAPDOOR), Blocks.EXPOSED_COPPER_TRAPDOOR));
//        STACKED_WAXED_EXPOSED_COPPER_TRAPDOOR = register("stacked_waxed_exposed_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR), Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR));
//        STACKED_WEATHERED_COPPER_TRAPDOOR = register("stacked_weathered_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_TRAPDOOR), Blocks.WEATHERED_COPPER_TRAPDOOR));
//        STACKED_WAXED_WEATHERED_COPPER_TRAPDOOR = register("stacked_waxed_weathered_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR), Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR));
//        STACKED_OXIDIZED_COPPER_TRAPDOOR = register("stacked_oxidized_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_TRAPDOOR), Blocks.OXIDIZED_COPPER_TRAPDOOR));
//        STACKED_WAXED_OXIDIZED_COPPER_TRAPDOOR = register("stacked_waxed_oxidized_copper_trapdoor", new StackedTrapdoor(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR), Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR));

        BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
        YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

}
