package haydenykh.bns.common.entity.player.inventory;

import com.google.common.collect.Lists;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ExtendedInventory extends Inventory {
    default List<ItemStack> getMatchingStacks(Predicate<ItemStack> stackPredicate) {
        ArrayList arrayList = Lists.newArrayList();
        this.forEachStack(stack -> {
            if (stackPredicate.test(stack)) {
                arrayList.add(stack);
            }
        });
        return arrayList;
    }

    default void forEachStack(Consumer<ItemStack> stackConsumer) {
        for(int i = 0; i < this.size(); ++i) {
            ItemStack var3 = this.getStack(i);
            if (!var3.isEmpty()) {
                stackConsumer.accept(var3);
            }
        }
    }
}
