package haydenykh.bns.common.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;

public class BlocksNStuffsTags {
    public static class Blocks {
        public static final TagKey<Block> TERRACOTTA_BLOCKS = register("terracotta_blocks");

        private static TagKey<Block> register(String id) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ID, id));
        }
    }

    public static class Items {
        private static TagKey<Item> register(String id) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ID, id));
        }
    }
}
