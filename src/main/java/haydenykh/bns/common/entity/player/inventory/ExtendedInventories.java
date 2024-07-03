package haydenykh.bns.common.entity.player.inventory;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

import java.util.Collections;

public class ExtendedInventories extends Inventories {
    public static int tryAddStack(Inventory inventory, ItemStack stack) {
        IntArrayList var2 = new IntArrayList();
        for(int var3 = 0; var3 < inventory.size(); ++var3) {
            ItemStack var4 = inventory.getStack(var3);
            if (var4.isEmpty()) {
                var2.add(var3);
            }
        }
        if (var2.isEmpty()) {
            return -1;
        } else {
            Collections.shuffle(var2);
            int var5 = var2.getInt(0);
            inventory.setStack(var5, stack);
            return var5;
        }
    }
}
