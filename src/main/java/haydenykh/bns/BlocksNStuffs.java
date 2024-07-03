package haydenykh.bns;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import haydenykh.bns.common.entity.effect.BlocksNStuffsPotions;
import haydenykh.bns.common.entity.effect.BlocksNStuffsStatusEffects;
import haydenykh.bns.common.item.BlocksNStuffsItemGroups;
import haydenykh.bns.common.item.BlocksNStuffsItems;
import haydenykh.bns.common.world.gen.feature.BlocksNStuffsFeatures;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksNStuffs implements ModInitializer {
	public static final String ID = "bns";
//	public static final RuntimeResourcePack BNS_RESOURCES = RuntimeResourcePack.create("bns:resources", 48);
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		BlocksNStuffsItems.init();
		BlocksNStuffsBlocks.init();
		BlocksNStuffsItemGroups.init();
		BlocksNStuffsStatusEffects.init();
		BlocksNStuffsPotions.init();
		BlocksNStuffsFeatures.init();
	}
}