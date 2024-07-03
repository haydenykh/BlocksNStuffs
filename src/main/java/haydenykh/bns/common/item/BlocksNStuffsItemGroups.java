package haydenykh.bns.common.item;

import haydenykh.bns.BlocksNStuffs;
import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsItemGroups {

    public static final ItemGroup BNS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ID, "bns"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(BlocksNStuffsItems.LA_BAGUETTE))
                    .displayName(Text.translatable("itemGroup.bns"))
                    .entries((context, entries) -> {
//                        entries.add(BlocksNStuffsBlocks.TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.RED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIME_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.PINK_TERRACOTTA_SLAB);

                        entries.add(BlocksNStuffsBlocks.INFO_UPDATE);
                        entries.add(BlocksNStuffsBlocks.STONECUTTER);

                        entries.add(BlocksNStuffsBlocks.ANT);
                        entries.add(BlocksNStuffsBlocks.ZONE);
                        entries.add(BlocksNStuffsItems.FOOTPRINT);
                        entries.add(BlocksNStuffsItems.FINE_ITEM);

                        entries.add(BlocksNStuffsBlocks.CHEESE);
                        entries.add(BlocksNStuffsBlocks.PICKAXE_BLOCK);
                        entries.add(BlocksNStuffsBlocks.PLACE_BLOCK);
                        entries.add(BlocksNStuffsItems.LA_BAGUETTE);
                        entries.add(BlocksNStuffsItems.LE_TRICOLORE);
                        entries.add(BlocksNStuffsItems.LONGER_STRING);
                        entries.add(BlocksNStuffsItems.M_BANNER_PATTERN);
                        entries.add(BlocksNStuffsBlocks.COPPER_SPLEAVES);

//                        entries.add(BlocksNStuffsItems.POISONOUS_POTATO_PLANT);
                    })
                    .build());

    public static void init() {
        LOGGER.info("Initializing item groups for " + BlocksNStuffs.ID);
    }

}
