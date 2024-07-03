package haydenykh.bns.common.item.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ExtendedArmorMaterials extends ArmorMaterials {
//    public static final RegistryEntry<ArmorMaterial> POTATO = register("potato", Util.make(new EnumMap(ArmorItem.Type.class), var0 -> {
//        var0.put(ArmorItem.Type.BOOTS, 0);
//        var0.put(ArmorItem.Type.LEGGINGS, 0);
//        var0.put(ArmorItem.Type.CHESTPLATE, 0);
//        var0.put(ArmorItem.Type.HELMET, 0);
//        var0.put(ArmorItem.Type.BODY, 0);
//    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> Ingredient.ofItems(BlocksNStuffsItems.POISONOUS_POTATO_PLANT));

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantability,
            RegistryEntry<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        List var7 = List.of(new ArmorMaterial.Layer(Identifier.of(id)));
        return register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, var7);
    }

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantability,
            RegistryEntry<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient,
            List<ArmorMaterial.Layer> layers
    ) {
        EnumMap var8 = new EnumMap(ArmorItem.Type.class);
        for(ArmorItem.Type var12 : ArmorItem.Type.values()) {
            var8.put(var12, (Integer)defense.get(var12));
        }
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL, Identifier.of(id), new ArmorMaterial(var8, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance)
        );
    }
}
