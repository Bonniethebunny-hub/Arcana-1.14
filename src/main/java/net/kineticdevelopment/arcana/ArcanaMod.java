package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.ClientProxy;
import net.kineticdevelopment.arcana.client.container.ContainerThaumonomicon;
import net.kineticdevelopment.arcana.client.screen.ScreenThaumonomicon;
import net.kineticdevelopment.arcana.common.IProxy;
import net.kineticdevelopment.arcana.common.ServerProxy;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;

@Mod(Constants.MODID)
public class ArcanaMod {
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public ArcanaMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        Constants.LOGGER.info(Constants.MODID + event + " is now loaded!");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        ScreenManager.registerFactory(ObjectHolders.THAUMONOMICON_CONTAINER_TYPE, ScreenThaumonomicon::new);
    }

    @ObjectHolder(Constants.MODID)
    public static class ObjectHolders
    {
        public static final ContainerType<ContainerThaumonomicon> THAUMONOMICON_CONTAINER_TYPE = null;
    }

}
