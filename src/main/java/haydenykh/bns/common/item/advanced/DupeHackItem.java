package haydenykh.bns.common.item.advanced;

import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;

public class DupeHackItem extends Item {
    private Number field_43482;

    public DupeHackItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return (double) method_50171().intValue() / 100.0 < Math.random();
    }

    public Number method_50171() {
        return this.field_43482;
    }
}
