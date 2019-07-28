package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippeddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippedtaintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoakleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaksapling;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.items.*;
import net.kineticdevelopment.arcana.common.items.elements.*;
import net.kineticdevelopment.arcana.common.structures.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class EventSubscriber {
    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        // Register BLOCKS
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new arcanestone());
            event.getRegistry().register(new arcaneworktable());
            event.getRegistry().register(new arcanestonebrick());
            event.getRegistry().register(new infusionstone());
            event.getRegistry().register(new amberblock());
            event.getRegistry().register(new amberbrick());
            event.getRegistry().register(new amberblockswirl());
            event.getRegistry().register(new silverwoodplanks());
            event.getRegistry().register(new greatwoodplanks());
            event.getRegistry().register(new silverwoodsapling(new SilverwoodTree(), Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new greatwoodsapling(new GreatwoodTree(), Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new dairsapling(new DairTree(), Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new taintedoaksapling(new TaintedOakTree(), Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new taintedcrust());
            event.getRegistry().register(new taintedrock());
            event.getRegistry().register(new taintedsoil());
            event.getRegistry().register(new cinnabarore());
            event.getRegistry().register(new thaumiumblock());
            event.getRegistry().register(new greatwoodlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new greatwoodleaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
            event.getRegistry().register(new silverwoodlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new silverwoodleaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
            event.getRegistry().register(new dairlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new dairleaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
            event.getRegistry().register(new strippeddairlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new taintedoakleaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
            event.getRegistry().register(new taintedoaklog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new strippedtaintedoaklog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new taintedoakplanks());
        }

        // Register ITEMS & ModBlocks
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            @SuppressWarnings("unused")
			Item.Properties properties = new Item.Properties();

            // BLOCKS
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("arcanestone"));
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANEWORKTABLE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("arcaneworktable"));
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANESTONEBRICK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("arcanestonebrick"));
            event.getRegistry().register(new BlockItem(ModBlocks.INFUSIONSTONE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("infusionstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMBERBLOCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("amberblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMBERBLOCKSWIRL, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("amberblockswirl"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMBERBRICK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("amberbrick"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODPLANKS, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("silverwoodplanks"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODPLANKS, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodplanks"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODSAPLING, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodsapling"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDCRUST, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedcrust"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDROCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedrock"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDSOIL, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedsoil"));
            event.getRegistry().register(new BlockItem(ModBlocks.CINNABARORE, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("cinnabarore"));
            event.getRegistry().register(new BlockItem(ModBlocks.THAUMIUMBLOCK, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("thaumiumblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodlog"));
            event.getRegistry().register(new BlockItem(ModBlocks.GREATWOODLEAVES, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("greatwoodleaves"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("silverwoodlog"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODLEAVES, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("silverwoodleaves"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERWOODSAPLING, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("silverwoodsapling"));
            event.getRegistry().register(new BlockItem(ModBlocks.DAIRLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("dairlog"));
            event.getRegistry().register(new BlockItem(ModBlocks.DAIRLEAVES, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("dairleaves"));
            event.getRegistry().register(new BlockItem(ModBlocks.DAIRSAPLING, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("dairsapling"));
            event.getRegistry().register(new BlockItem(ModBlocks.STRIPPEDDAIRLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("strippeddairlog"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDOAKLEAVES, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedoakleaves"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDOAKSAPLING, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedoaksapling"));
            event.getRegistry().register(new BlockItem(ModBlocks.STRIPPEDTAINTEDOAKLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("strippedtaintedoaklog"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDOAKLOG, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedoaklog"));
            event.getRegistry().register(new BlockItem(ModBlocks.TAINTEDOAKPLANKS, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName("taintedoakplanks"));
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
            event.getRegistry().register(new basicwand());

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
