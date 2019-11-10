/**
 * All code in this project is covered by the Creative Commons Attribution-NonCommercial-NoDerivs 4.0 Unported License.
 * Copyright Kinetic Development 2019
 */

package kineticdevelopment.arcana.core;


import kineticdevelopment.arcana.api.packets.ArcanaPacketHandler;
import kineticdevelopment.arcana.api.packets.ShowAspectsPacket;
import kineticdevelopment.arcana.api.spells.SpellEffectHandler;
import kineticdevelopment.arcana.client.render.ArcanaRenderRegistry;
import kineticdevelopment.arcana.common.world.OreGeneration;
import kineticdevelopment.arcana.init.ModKeyBindings;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(value = Arcana.MOD_ID)
public class Arcana {
    public static final String MOD_ID = "arcana";

    public static Arcana instance;
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Arcana() {
        instance = this;
        MinecraftForge.EVENT_BUS.addListener(this::serverStarting);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetupEvent);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetupEvent);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dedicatedServerSetupEvent);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerPackets);
    }

    private void dedicatedServerSetupEvent(FMLDedicatedServerSetupEvent event) {
        //Place anything that should only run when on a dedicated server
    }

    private void commonSetupEvent(final FMLCommonSetupEvent event) {
        OreGeneration.setupOreGeneration();
        LOGGER.info("Setup method registered.");
    }

    private void clientSetupEvent(final FMLClientSetupEvent event) {
    	ClientProxy.init();
    	ClientRegistry.registerKeyBinding(ModKeyBindings.SCANWITHGOGGLES);

        ArcanaRenderRegistry.registryEntityRenders();
    }

    public void registerPackets(final FMLClientSetupEvent event) {
        int id = 0;
        ArcanaPacketHandler.SHOW_ASPECTS.registerMessage(id++, ShowAspectsPacket.class, ShowAspectsPacket::encode, ShowAspectsPacket::decode, ShowAspectsPacket::handle);
    }

    private void loadComplete(final FMLLoadCompleteEvent event) {
        SpellEffectHandler.init();
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

}
