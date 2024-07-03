package haydenykh.bns.common.util.serialization;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIntImmutablePair;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import net.minecraft.util.dynamic.Codecs;

import java.util.stream.LongStream;

public class ExtendedCodecs extends Codecs {
    public static Codec<Int2IntMap> method_58804() {
        return Codec.LONG_STREAM.xmap(var0 -> {
            Int2IntOpenHashMap var1 = new Int2IntOpenHashMap();
            var0.forEach(var1x -> var1.put((int) var1x, (int) (var1x >> 32)));
            return var1;
        }, var0 -> {
            LongArrayList var1 = new LongArrayList();
            var0.forEach((var1x, var2) -> var1.add((long) var1x.intValue() | var2.longValue() << 32));
            return LongStream.of(var1.toArray(new long[0]));
        });
    }

    public static Codec<IntIntPair> method_58811() {
        return Codec.LONG.xmap(var0 -> new IntIntImmutablePair(var0.intValue(), (int) (var0 >> 32)), var0 -> (long) var0.firstInt() | (long) var0.secondInt() << 32);
    }
}
