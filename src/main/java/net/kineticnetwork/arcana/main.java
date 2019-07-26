package net.kineticnetwork.arcana;

import net.kineticnetwork.arcana.blocks.*;
import net.kineticnetwork.arcana.init.ModBlocks;
import net.kineticnetwork.arcana.items.thaumonomicon;
import net.kineticnetwork.arcana.setup.ClientProxy;
import net.kineticnetwork.arcana.setup.IProxy;
import net.kineticnetwork.arcana.setup.ModSetup;
import net.kineticnetwork.arcana.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("arcana")
public class main {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public main() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();


    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new arcanestone());
            event.getRegistry().register(new arcanestonebrick());
            event.getRegistry().register(new infusionstone());
            event.getRegistry().register(new amberblock());
            event.getRegistry().register(new silverwoodplanks());
            event.getRegistry().register(new greatwoodplanks());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties();
            //blocks
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONE, new Item.Properties()).setRegistryName("arcanestone"));
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONEBRICK, new Item.Properties()).setRegistryName("arcanestonebrick"));
            event.getRegistry().register(new BlockItem(ModBlocks.INFUSIONSTONE, new Item.Properties()).setRegistryName("infusionstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMBERBLOCK, new Item.Properties()).setRegistryName("amberblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODPLANKS, new Item.Properties()).setRegistryName("silverwoodplanks"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODPLANKS, new Item.Properties()).setRegistryName("greatwoodplanks"));
            //items
            event.getRegistry().register(new thaumonomicon());
        }

    }
}
