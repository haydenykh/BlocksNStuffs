package haydenykh.bns.common.tag;

import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BlocksNStuffsBannerPatternTags {
    private static TagKey<BannerPattern> of(String id) {
        return TagKey.of(RegistryKeys.BANNER_PATTERN, Identifier.ofVanilla(id));
    }
}
