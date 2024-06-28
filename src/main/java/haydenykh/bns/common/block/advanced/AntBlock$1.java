package haydenykh.bns.common.block.advanced;

import haydenykh.bns.common.block.advanced.AntBlock.Clockwiseness;

public class AntBlock$1 {
    static final int[] CLOCKWISENESS_LENGTH = new int[Clockwiseness.values().length];

    static {
        try {
            CLOCKWISENESS_LENGTH[Clockwiseness.CW.ordinal()] = 1;
        } catch (NoSuchFieldError error) {

        }

        try {
            CLOCKWISENESS_LENGTH[Clockwiseness.CCW.ordinal()] = 2;
        } catch (NoSuchFieldError error) {

        }
    }
}
