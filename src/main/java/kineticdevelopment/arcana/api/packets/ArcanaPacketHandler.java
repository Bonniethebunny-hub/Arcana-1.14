package kineticdevelopment.arcana.api.packets;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ArcanaPacketHandler {

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel SHOW_ASPECTS = NetworkRegistry.newSimpleChannel(
            new ResourceLocation("arcana", "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );
}
