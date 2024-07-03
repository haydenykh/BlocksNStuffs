package haydenykh.bns.common.util.components;

import com.mojang.serialization.Codec;
import haydenykh.bns.common.util.serialization.ExtendedCodecs;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.function.UnaryOperator;

public class ExtendedDataComponentTypes extends DataComponentTypes {
    public static final ComponentType<Integer> CLICKS = register("clicks", builder -> builder.codec(Codec.INT).packetCodec(PacketCodecs.INTEGER));
    public static final ComponentType<Integer> UNDERCOVER_ID = register("undercover_id", builder -> builder.codec(Codec.INT).packetCodec(PacketCodecs.INTEGER));
    public static final ComponentType<Int2IntMap> CONTACTS_MESSAGES = register("contacts_messages", builder -> builder.codec(ExtendedCodecs.method_58804()).packetCodec(PacketCodecs.codec(ExtendedCodecs.method_58804())));
    public static final ComponentType<IntIntPair> SECRET_MESSAGE = register("secret_message", builder -> builder.codec(ExtendedCodecs.method_58811()).packetCodec(PacketCodecs.codec(ExtendedCodecs.method_58811())));
    public static final ComponentType<Integer> VIEWS = register("views", builder -> builder.codec(Codec.INT).packetCodec(PacketCodecs.INTEGER));
    public static final ComponentType<Boolean> HOVERED = register("hovered", builder -> builder.codec(Codec.BOOL).packetCodec(PacketCodecs.BOOL));

    private static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, id, builderOperator.apply(ComponentType.builder()).build());
    }
}
