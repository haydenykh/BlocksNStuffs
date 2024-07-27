package haydenykh.bns.common.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BlocksNStuffsItemTags {
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(id));
    }
}
