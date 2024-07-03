package haydenykh.bns.common.behavior;

import haydenykh.bns.common.block.BlocksNStuffsBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ItemActionResult;

import java.util.Map;

import static net.minecraft.block.cauldron.CauldronBehavior.*;

public interface BlocksNStuffsCauldronBehavior {
    CauldronBehavior.CauldronBehaviorMap EMPTY_COPPER_SINK_BEHAVIOR = createMap("empty_copper_sink");
    CauldronBehavior.CauldronBehaviorMap FILLED_COPPER_SINK_BEHAVIOR = createMap("filled_copper_sink");

    static CauldronBehavior.CauldronBehaviorMap createMap(String name) {
        Object2ObjectOpenHashMap<Item, CauldronBehavior> object2ObjectOpenHashMap = new Object2ObjectOpenHashMap<>();
        object2ObjectOpenHashMap.defaultReturnValue((state, world, pos, player, hand, stack) -> ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION);
        CauldronBehavior.CauldronBehaviorMap cauldronBehaviorMap = new CauldronBehavior.CauldronBehaviorMap(name, object2ObjectOpenHashMap);
        BEHAVIOR_MAPS.put(name, cauldronBehaviorMap);
        return cauldronBehaviorMap;
    }

    static void registerBehavior() {
        Map<Item, CauldronBehavior> emptyCopperSinkMap = EMPTY_COPPER_SINK_BEHAVIOR.map();
        Map<Item, CauldronBehavior> filledCopperSinkMap = FILLED_COPPER_SINK_BEHAVIOR.map();

//        emptyCopperSinkMap.put(
//                Items.WATER_BUCKET,
//                (CauldronBehavior)(state, world, pos, player, hand, stack) -> fillCauldron(
//                        world, pos, player, hand, stack, BlocksNStuffsBlocks.FILLED_COPPER_SINK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY // error found here
//                )
//        );
//        filledCopperSinkMap.put(
//                Items.BUCKET,
//                (CauldronBehavior)(state, world, pos, player, hand, stack) -> emptyCauldron(
//                        state, world, pos, player, hand, stack, new ItemStack(Items.WATER_BUCKET), var0x -> true, SoundEvents.ITEM_BUCKET_FILL // error found here
//                )
//        );
    }
}
