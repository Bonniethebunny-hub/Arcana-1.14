package net.kineticdevelopment.arcana;

import org.antlr.v4.runtime.tree.Trees;

import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.blocks.trees.GreatwoodTree;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.features.GreatwoodTreeFeature;
import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.items.*;
import net.kineticdevelopment.arcana.common.items.elements.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.gen.feature.BigTreeFeature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventSubscriber {
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        // Register BLOCKS
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new arcanestone());
            event.getRegistry().register(new arcanestonebrick());
            event.getRegistry().register(new infusionstone());
            event.getRegistry().register(new amberblock());
            event.getRegistry().register(new silverwoodplanks());
            event.getRegistry().register(new greatwoodplanks());
            event.getRegistry().register(new greatwoodsapling(new GreatwoodTree(), Block.Properties.create(Material.PLANTS)));
            event.getRegistry().register(new taintedcrust());
            event.getRegistry().register(new taintedrock());
            event.getRegistry().register(new taintedsoil());
            event.getRegistry().register(new cinnabarore());
            event.getRegistry().register(new thaumiumblock());

        }

        // Register ITEMS & ModBlocks
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
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
            event.getRegistry().register(new air());
            event.getRegistry().register(new water());
            event.getRegistry().register(new ice());
            event.getRegistry().register(new fire());
            event.getRegistry().register(new light());
            event.getRegistry().register(new movement());
            event.getRegistry().register(new order());
            event.getRegistry().register(new chaos());
            event.getRegistry().register(new exchange());
            event.getRegistry().register(new wind());
            event.getRegistry().register(new earth());
            event.getRegistry().register(new vacuum());
            event.getRegistry().register(new venom());

        }
    }

    //On Player Join Event Which Sends A Message To the Player In the Chat
    @SubscribeEvent
    public static void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getPlayer().world.isRemote) {
            event.getPlayer().sendMessage(new StringTextComponent(TextFormatting.RED + "Hello there " +
                    TextFormatting.AQUA + event.getPlayer().getDisplayName().getString() + TextFormatting.RED + ", we hope you enjoy the Arcana Mod!"));
        }
    }
}
