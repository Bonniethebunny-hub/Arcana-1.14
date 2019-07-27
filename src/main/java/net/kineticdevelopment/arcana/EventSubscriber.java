package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
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
            event.getRegistry().register(new greatwoodsapling());
            event.getRegistry().register(new taintedcrust());
            event.getRegistry().register(new taintedrock());
            event.getRegistry().register(new taintedsoil());
            event.getRegistry().register(new cinnabarore());
            event.getRegistry().register(new thaumiumblock());

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
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODSAPLING, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodsapling"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDCRUST, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedcrust"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDROCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedrock"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDSOIL, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedsoil"));
            event.getRegistry().register(new BlockItem(ModBlocks.CINNABARORE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("cinnabarore"));
            event.getRegistry().register(new BlockItem(ModBlocks.THAUMIUMBLOCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("thaumiumblock"));
            // ITEMS
            event.getRegistry().register(new thaumonomicon());
            event.getRegistry().register(new thaumiumingot());
            event.getRegistry().register(new quicksilver());
            event.getRegistry().register(new wandcapcopper());
            event.getRegistry().register(new wandcapsilver());
            event.getRegistry().register(new wandcapvoid());
            event.getRegistry().register(new wandcapthaumium());
            event.getRegistry().register(new wandcapiron());
            event.getRegistry().register(new wandcapgold());

            //Aspects
            event.getRegistry().register(new aer());
            event.getRegistry().register(new aqua());
            event.getRegistry().register(new gelum());
            event.getRegistry().register(new ignis());
            event.getRegistry().register(new lux());
            event.getRegistry().register(new motus());
            event.getRegistry().register(new ordo());
            event.getRegistry().register(new perditio());
            event.getRegistry().register(new permutatio());
            event.getRegistry().register(new tempestas());
            event.getRegistry().register(new terra());
            event.getRegistry().register(new vacuos());
            event.getRegistry().register(new venenum());

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
            event.getPlayer().sendMessage(new StringTextComponent(TextFormatting.RED + "Hello there " +
                    TextFormatting.AQUA + event.getPlayer().getDisplayName().getString() + TextFormatting.RED + ", we hope you enjoy the Arcana Mod!"));
        }
    }
}
