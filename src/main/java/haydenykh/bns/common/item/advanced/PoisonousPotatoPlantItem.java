package haydenykh.bns.common.item.advanced;

import haydenykh.bns.common.item.armor.ExtendedArmorItem;
import haydenykh.bns.common.util.components.ExtendedDataComponentTypes;
import haydenykh.bns.common.entity.player.inventory.ExtendedInventories;
import haydenykh.bns.common.entity.player.inventory.ExtendedInventory;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIntImmutablePair;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Nullables;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class PoisonousPotatoPlantItem extends ExtendedArmorItem {
    private static final Style RUMBLED_TEXT_STYLE = Style.EMPTY.withColor(Formatting.DARK_PURPLE).withItalic(true);
    private static final int CLICKS_BEFORE_REVEAL = 4;

    public PoisonousPotatoPlantItem(RegistryEntry<ArmorMaterial> material, ArmorItem.Type type, Item.Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        int clicks = stack.getOrDefault(ExtendedDataComponentTypes.CLICKS, Integer.valueOf(0));
        if (clicks >= CLICKS_BEFORE_REVEAL) {
            tooltip.add(Texts.setStyleIfAbsent(Text.translatable("item.bns.poisonous_potato_plant.rumbled.line1"), RUMBLED_TEXT_STYLE));
            tooltip.add(Texts.setStyleIfAbsent(Text.translatable("item.bns.poisonous_potato_plant.rumbled.line2", Text.translatable("item.bns.poisonous_potato_plant")), RUMBLED_TEXT_STYLE));
        }
    }

    @Override
    public void onViewInChest(ItemStack stack, World world, BlockPos pos, ExtendedInventory inventory) {
        List<ItemStack> stacks = inventory.getMatchingStacks(stackx -> stackx.contains(ExtendedDataComponentTypes.UNDERCOVER_ID));

        for (ItemStack stack1 : stacks) {
            if (stack1.get(ExtendedDataComponentTypes.UNDERCOVER_ID) == 0) {
                stack1.set(ExtendedDataComponentTypes.UNDERCOVER_ID, world.getRandom().nextInt());
            }
        }

        int id = stack.get(ExtendedDataComponentTypes.UNDERCOVER_ID);
        stacks.removeIf(stackx -> stackx.get(ExtendedDataComponentTypes.UNDERCOVER_ID) == id);
        if (!stacks.isEmpty()) {
            ItemStack stack1 = (ItemStack) stacks.get(world.getRandom().nextInt(stacks.size()));
            int id2 = stack1.get(ExtendedDataComponentTypes.UNDERCOVER_ID);
            Int2IntMap map1 = stack1.getOrDefault(ExtendedDataComponentTypes.CONTACTS_MESSAGES, new Int2IntOpenHashMap());
            Int2IntMap map2 = stack.getOrDefault(ExtendedDataComponentTypes.CONTACTS_MESSAGES, new Int2IntOpenHashMap());
            int var11 = map1.getOrDefault(id, -1);
            int var12 = map2.getOrDefault(id2, -1);
            if (var11 > var12) {
                map2.put(id2, var11);
                stack.set(ExtendedDataComponentTypes.CONTACTS_MESSAGES, map2);
            } else {
                int messageIndex = var12 + 1;
                Optional optional = getPaperSecretText(messageIndex, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 4.0, false));
                if (!optional.isEmpty()) {
                    map2.put(id2, messageIndex);
                    stack.set(ExtendedDataComponentTypes.CONTACTS_MESSAGES, map2);
                    List<ItemStack> stacks2 = inventory.getMatchingStacks(stackx -> stackx.isOf(Items.PAPER));
                    stacks2.removeIf(stackx -> {
                        if (!stackx.contains(ExtendedDataComponentTypes.SECRET_MESSAGE)) {
                            return true;
                        } else {
                            IntIntPair pair = stackx.get(ExtendedDataComponentTypes.SECRET_MESSAGE);
                            return pair.firstInt() != id && pair.firstInt() != id2;
                        }
                    });
                    ItemStack stack2;
                    if (stacks2.isEmpty()) {
                        stack2 = new ItemStack(Items.PAPER);
                        int var17 = ExtendedInventories.tryAddStack(inventory, stack2);
                        if (var17 < 0) {
                            return;
                        }
                    } else {
                        stack2 = (ItemStack) stacks2.get(world.getRandom().nextInt(stacks2.size()));
                    }

                    stack2.set(ExtendedDataComponentTypes.SECRET_MESSAGE, new IntIntImmutablePair(id2, messageIndex));
                    stack2.set(DataComponentTypes.CUSTOM_NAME, (MutableText) optional.get());
                }
            }
        }
    }

    private static Optional<MutableText> getPaperSecretText(int messageIndex, @Nullable PlayerEntity player) {
        MutableText var2 = Text.translatable(
                "item.minecraft.paper.secret." + messageIndex, Nullables.mapOrElse(player, PlayerEntity::getDisplayName, Text.translatable("the.player"))
        );
        return var2.getString().startsWith("item.minecraft.paper.secret.") ? Optional.empty() : Optional.of(var2);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack var4 = user.getStackInHand(hand);
        int var5 = var4.getOrDefault(ExtendedDataComponentTypes.CLICKS, Integer.valueOf(0));
        return var5 >= 4 ? super.use(world, user, hand) : TypedActionResult.pass(var4);
    }
}
