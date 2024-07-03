package haydenykh.bns.common.item.armor;

import haydenykh.bns.common.entity.player.inventory.ExtendedInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExtendedArmorItem extends ArmorItem {
    public ExtendedArmorItem(RegistryEntry<ArmorMaterial> material, ArmorItem.Type type, Settings settings) {
        super(material, type, settings);
    }

    public void onViewInChest(ItemStack stack, World world, BlockPos pos, Inventory inventory) {
    }

    public void onViewInChest(ItemStack stack, World world, BlockPos pos, ExtendedInventory inventory) {
    }
}
