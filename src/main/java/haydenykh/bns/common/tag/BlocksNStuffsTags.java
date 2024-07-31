package haydenykh.bns.common.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static haydenykh.bns.BlocksNStuffs.ID;

public class BlocksNStuffsTags {
    public static class Blocks {
        public static final TagKey<Block> TERRACOTTA_SLABS;
        public static final TagKey<Block> TERRACOTTA_STAIRS;
        public static final TagKey<Block> WOOL_SLABS;
        public static final TagKey<Block> WOOL_STAIRS;

        private static TagKey<Block> register(String id) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ID, id));
        }

        static {
            TERRACOTTA_SLABS = register("terracotta_slabs");
            TERRACOTTA_STAIRS = register("terracotta_stairs");
            WOOL_SLABS = register("wool_slabs");
            WOOL_STAIRS = register("wool_stairs");
        }
    }

    public static class Items {
        public static final TagKey<Item> TERRACOTTA_SLABS;
        public static final TagKey<Item> TERRACOTTA_STAIRS;
        public static final TagKey<Item> WOOL_SLABS;
        public static final TagKey<Item> WOOL_STAIRS;

        private static TagKey<Item> register(String id) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ID, id));
        }

        static {
            TERRACOTTA_SLABS = register("terracotta_slabs");
            TERRACOTTA_STAIRS = register("terracotta_stairs");
            WOOL_SLABS = register("wool_slabs");
            WOOL_STAIRS = register("wool_stairs");
        }
    }
}
