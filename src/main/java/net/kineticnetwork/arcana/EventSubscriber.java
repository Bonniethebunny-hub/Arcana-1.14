package net.kineticnetwork.arcana;

import net.kineticnetwork.arcana.common.blocks.*;
import net.kineticnetwork.arcana.common.creativetab.ModTabGroups;
import net.kineticnetwork.arcana.common.init.ModBlocks;
import net.kineticnetwork.arcana.common.items.thaumonomicon;
import net.kineticnetwork.arcana.utilities.Constants;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventSubscriber
{
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        /**
         * Register BLOCKS
         */
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

        /**
         * Register ITEMS & ModBlocks
         */
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

    /**
     * On Player Join Event Which Sends A Message To the Player In the Chat
     */
    @SubscribeEvent
    public static void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event)
    {
        if (!event.getPlayer().world.isRemote)
        {
            event.getPlayer().sendMessage(new StringTextComponent(TextFormatting.AQUA + "Hello there " +
                    TextFormatting.YELLOW + event.getPlayer().getDisplayName() + TextFormatting.RED + ", we hope you enjoy the Arcana Mod!"));
        }
    }
}
