package haydenykh.bns.common.block.advanced;

import net.minecraft.util.math.Direction;

class BookBoxBlock$1 {
    static final int[] Directions = new int[Direction.values().length];
    static {
        try {
            Directions[Direction.NORTH.ordinal()] = 1;
        } catch (NoSuchFieldError error) {
        }
        try {
            Directions[Direction.SOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError error) {
        }
        try {
            Directions[Direction.EAST.ordinal()] = 3;
        } catch (NoSuchFieldError error) {
        }
        try {
            Directions[Direction.WEST.ordinal()] = 4;
        } catch (NoSuchFieldError error) {
        }
    }
}
