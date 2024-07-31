package haydenykh.bns.common.item;

import haydenykh.bns.BlocksNStuffs;
import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;
import static haydenykh.bns.BlocksNStuffs.LOGGER;

public class BlocksNStuffsItemGroups {

    public static final ItemGroup BNS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ID, "bns"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Blocks.LIME_WOOL))
                    .displayName(Text.translatable("itemGroup.bns"))
                    .entries((context, entries) -> {
                        entries.add(BlocksNStuffsBlocks.TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(BlocksNStuffsBlocks.PINK_TERRACOTTA_SLAB);

                        entries.add(BlocksNStuffsBlocks.TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(BlocksNStuffsBlocks.PINK_TERRACOTTA_STAIRS);

//                        entries.add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
//                        entries.add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
//
//                        entries.add(BlocksNStuffsBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
//                        entries.add(BlocksNStuffsBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);

                        entries.add(BlocksNStuffsBlocks.WHITE_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.GRAY_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.BLACK_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.BROWN_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.RED_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.ORANGE_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.YELLOW_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIME_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.GREEN_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.CYAN_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.BLUE_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.PURPLE_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(BlocksNStuffsBlocks.PINK_WOOL_SLAB);

                        entries.add(BlocksNStuffsBlocks.WHITE_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.GRAY_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BLACK_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BROWN_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.RED_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.ORANGE_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.YELLOW_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIME_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.GREEN_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.CYAN_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.BLUE_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.PURPLE_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.MAGENTA_WOOL_STAIRS);
                        entries.add(BlocksNStuffsBlocks.PINK_WOOL_STAIRS);
                    })
                    .build());

    public static void init() {
        LOGGER.info("Initializing item groups for " + BlocksNStuffs.ID);
    }

}
