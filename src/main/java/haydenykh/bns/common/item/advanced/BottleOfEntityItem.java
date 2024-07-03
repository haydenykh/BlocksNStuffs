package haydenykh.bns.common.item.advanced;

import net.minecraft.component.ComponentMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Optional;

public class BottleOfEntityItem extends Item {
    public static final String ENTITY_TAG_NBT_KEY = "entityTag";

    public BottleOfEntityItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity) {
        entity.emitGameEvent(GameEvent.DRINK);
        if (!world.isClient) {
            transformUser(stack, world, entity);
            return Items.GLASS_BOTTLE.getDefaultStack();
        } else {
            return stack;
        }
    }

    public static void transformUser(ItemStack stack, World world, LivingEntity entity) {
        NbtCompound tag = (NbtCompound) stack.getComponents();
        if (tag != null && tag.contains(ENTITY_TAG_NBT_KEY, 10)) {
            NbtCompound tag1 = tag.getCompound(ENTITY_TAG_NBT_KEY);
            EntityType type = world.getRegistryManager().get(RegistryKeys.ENTITY_TYPE).get(Identifier.of(tag1.getString("id")));
            if (type != null) {
//                entity.editTransformation((transformationType) -> { // error found here
//                    return transformationType.withEntity(entityType, Optional.ofNullable(nbtCompound2));
//                });
            }
        }
    }
}
