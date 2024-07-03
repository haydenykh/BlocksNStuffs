package haydenykh.bns.common.item;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.tag.BlocksNStuffsBannerPatternTags;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BannerPattern;
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
    public static final Item FOOTPRINT; // Java Edition Snapshot 20w14∞ (20w14infinite)
    public static final Item FINE_ITEM; // Java Edition Snapshot 20w14∞ (20w14infinite)

    public static final Item CHEESE; // Java Edition Snapshot 23w13a_or_b
    //    public static final Item BIT; // Java Edition Snapshot 23w13a_or_b
    public static final Item LA_BAGUETTE; // Java Edition Snapshot 23w13a_or_b
    public static final Item LE_TRICOLORE; // Java Edition Snapshot 23w13a_or_b
    public static final Item LONGER_STRING; // Java Edition Snapshot 23w13a_or_b
    public static final Item M_BANNER_PATTERN; // Java Edition Snapshot 23w13a_or_b

//    public static final Item POISONOUS_POTATO_PLANT; // Java Edition Snapshot 24w14potato

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

    private static TagKey<BannerPattern> of(String id) {
        return TagKey.of(RegistryKeys.BANNER_PATTERN, Identifier.ofVanilla(id));
    }

    static {

        FOOTPRINT = register("footprint", new Item(new Settings()));
        FINE_ITEM = register("fine_item", new Item(new Settings()));

        CHEESE = register(BlocksNStuffsBlocks.CHEESE);
//        BIT = register("bit", new Item(new Settings()));
        LA_BAGUETTE = register("la_baguette", new SwordItem(ToolMaterials.WOOD, new Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 3, -2.4F))));
        LE_TRICOLORE = register("le_tricolore", new Item(new Settings()));
        LONGER_STRING = register("string2", new Item(new Settings()));
        M_BANNER_PATTERN = register("m_banner_pattern", new BannerPatternItem(BlocksNStuffsBannerPatternTags.M_PATTERN_ITEM, new Settings().maxCount(1).rarity(Rarity.EPIC)));

//        POISONOUS_POTATO_PLANT = register("poisonous_potato_plant", new PoisonousPotatoPlantItem(ExtendedArmorMaterials.POTATO, ArmorItem.Type.HELMET, new Item.Settings().food(FoodComponents.POISONOUS_POTATO).maxCount(1).rarity(Rarity.EPIC).component(ExtendedDataComponentTypes.VIEWS, 0).component(ExtendedDataComponentTypes.UNDERCOVER_ID, 0).component(ExtendedDataComponentTypes.HOVERED, false).component(ExtendedDataComponentTypes.CLICKS, 0)));
    }
}
