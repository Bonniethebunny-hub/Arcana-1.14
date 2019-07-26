package net.kineticnetwork.arcana;

import net.kineticnetwork.arcana.common.blocks.*;
import net.kineticnetwork.arcana.common.init.ModBlocks;
import net.kineticnetwork.arcana.common.creativetab.ModTabGroups;
import net.kineticnetwork.arcana.common.items.thaumonomicon;
import net.kineticnetwork.arcana.client.ClientProxy;
import net.kineticnetwork.arcana.common.IProxy;
import net.kineticnetwork.arcana.common.ServerProxy;
import net.kineticnetwork.arcana.util.Constants;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MODID)
public class ArcanaMod
{
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public ArcanaMod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event)
        {
            event.getRegistry().register(new arcanestone());
            event.getRegistry().register(new arcanestonebrick());
            event.getRegistry().register(new infusionstone());
            event.getRegistry().register(new amberblock());
            event.getRegistry().register(new silverwoodplanks());
            event.getRegistry().register(new greatwoodplanks());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event)
        {
            Item.Properties properties = new Item.Properties();

            // BLOCKS
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("arcanestone"));
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONEBRICK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("arcanestonebrick"));
            event.getRegistry().register(new BlockItem(ModBlocks.INFUSIONSTONE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("infusionstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMBERBLOCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("amberblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODPLANKS, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("silverwoodplanks"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODPLANKS, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodplanks"));

            // ITEMS
            event.getRegistry().register(new thaumonomicon());
        }
    }
}
