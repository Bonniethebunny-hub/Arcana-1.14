package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.container.ArcaneWorkbenchContainer;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
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
import net.kineticdevelopment.arcana.common.init.ModEntities;
import net.kineticdevelopment.arcana.common.items.*;
import net.kineticdevelopment.arcana.common.items.elements.*;
import net.kineticdevelopment.arcana.common.structures.*;
import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.lang.reflect.Array;

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
            Block[] modBlocks = {
                    ModBlocks.ARCANESTONE,
                    ModBlocks.ARCANEWORKTABLE,
                    ModBlocks.ARCANESTONEBRICK,
                    ModBlocks.INFUSIONSTONE,
                    ModBlocks.AMBERBLOCK,
                    ModBlocks.AMBERBLOCKSWIRL,
                    ModBlocks.AMBERBRICK,
                    ModBlocks.SILVERWOODPLANKS,
                    ModBlocks.GREATWOODPLANKS,
                    ModBlocks.GREATWOODSAPLING,
                    ModBlocks.TAINTEDCRUST,
                    ModBlocks.TAINTEDROCK,
                    ModBlocks.TAINTEDSOIL,
                    ModBlocks.CINNABARORE,
                    ModBlocks.THAUMIUMBLOCK,
                    ModBlocks.GREATWOODLOG,
                    ModBlocks.GREATWOODLEAVES,
                    ModBlocks.SILVERWOODLOG,
                    ModBlocks.SILVERWOODLEAVES,
                    ModBlocks.SILVERWOODSAPLING,
                    ModBlocks.DAIRLOG,
                    ModBlocks.DAIRLEAVES,
                    ModBlocks.DAIRSAPLING,
                    ModBlocks.STRIPPEDDAIRLOG,
                    ModBlocks.TAINTEDOAKLEAVES,
                    ModBlocks.TAINTEDOAKSAPLING,
                    ModBlocks.STRIPPEDTAINTEDOAKLOG,
                    ModBlocks.TAINTEDOAKLOG,
                    ModBlocks.TAINTEDOAKPLANKS
            };

            for (Block block : modBlocks){
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName(block.getRegistryName()));
            }

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

            //Entity Spawn Eggs
            ModEntities.registerEntitySpawnEggs(event);

        }



        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
            event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
                return new ThaumonomiconContainer(windowId, inv);
            }).setRegistryName("arcana:thaumonomiconcontainer"));

            event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
                return new ArcaneWorkbenchContainer(windowId, inv);
            }).setRegistryName("arcana:arcaneworkbenchcontainer"));
        }

        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
        {
            event.getRegistry().registerAll(
                    ModEntities.ARCANA_TAINTED_PIG,
                    ModEntities.ARCANA_TAINTED_COW,
                    ModEntities.ARCANA_TAINTED_ZOMBIE
            );

            ModEntities.registerEntityWorldSpawns();
        }

    }


    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(Constants.MODID, name);
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
