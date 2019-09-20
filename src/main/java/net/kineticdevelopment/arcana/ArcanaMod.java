package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.ClientProxy;

import net.kineticdevelopment.arcana.client.renders.ModRenderRegistry;

import net.kineticdevelopment.arcana.common.IProxy;
import net.kineticdevelopment.arcana.common.ServerProxy;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

//yeet

@Mod(Constants.MODID)
public class ArcanaMod {
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public ArcanaMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
    }

    private void setup(final FMLCommonSetupEvent event) {
        Constants.LOGGER.info(Constants.MODID + event + " is now loaded!");
        proxy.init();
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        ModRenderRegistry.registryEntityRenders();

        Constants.LOGGER.info("clientRegistries method registered.");
    }
}