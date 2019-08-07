package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.container.ArcaneWorkbenchContainer;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.kineticdevelopment.arcana.client.container.lootbags.CommonLootbagContainer;
import net.kineticdevelopment.arcana.common.armor.ArmorMaterial;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.*;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.init.ModEntities;
import net.kineticdevelopment.arcana.common.items.*;
import net.kineticdevelopment.arcana.common.items.elements.*;
import net.kineticdevelopment.arcana.common.biomes.TaintBiome;

import net.minecraft.entity.EntityType;
import net.kineticdevelopment.arcana.common.items.lootbags.CommonLootbag;

import net.kineticdevelopment.arcana.utilities.Constants;
import net.kineticdevelopment.arcana.utilities.effects.Tainted;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.world.biome.Biome;


import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.lang.reflect.InvocationTargetException;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class RegistryHandler
{
    //On Player Join Event Which Sends A Message To the Player In the Chat
    @SubscribeEvent
    public static void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getPlayer().world.isRemote) {
            event.getPlayer().sendMessage(new StringTextComponent(TextFormatting.RED + "Hello there " +
                TextFormatting.AQUA + event.getPlayer().getDisplayName().getString() + TextFormatting.RED + ", we hope you enjoy the Arcana Mod!"));
        }
    }



    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        // Register BLOCKS
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            // Created with Block.Properties.create(Material.LEAVES).doesNotBlockMovement()
            String[] saplings = {
                "silverwoodsapling",
                "greatwoodsapling",
                "dairsapling"
            };

            // Created with Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)
            String[] leaves = {
                "silverwoodleaves",
                "dairleaves",
                "greatwoodleaves"
            };

            // Created with Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)
            String[] logs = {
                "greatwoodlog",
                "silverwoodlog",
                "dairlog",
                "strippeddairlog"
            };
            
        	// Created with Block.Properties.create(Material.LEAVES).doesNotBlockMovement()
            String[] taintedsaplings = {
                    "taintedoaksapling",
                    "taintedbirchsapling",
                    "taintedsprucesapling",
                    "taintedacaciasapling"
            };

            // Created with Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)
            String[] taintedleaves = {
                    "taintedoakleaves",
                    "tainteddairleaves",
                    "taintedbirchleaves",
                    "taintedspruceleaves",
                    "taintedacacialeaves"
            };

            // Created with Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)
            String[] taintedlogs = {
                    "taintedoaklog",
                    "strippedtaintedoaklog",
                    "tainteddairlog",
                    "strippedtainteddairlog",
                    "taintedbirchlog",
                    "strippedtaintedbirchlog",
                    "taintedsprucelog",
                    "strippedtaintedsprucelog",
                    "taintedacacialog",
                    "strippedtaintedacacialog"
            };

            // Created normally
            Block[] otherBlocks = {
                    new arcanestone(),
                    new arcaneworktable(),
                    new arcanestonebrick(),
                    new infusionstone(),
                    new amberblock(),
                    new amberbrick(),
                    new amberblockswirl(),
                    new silverwoodplanks(),
                    new greatwoodplanks(),
                    new taintedcrust(),
                    new taintedrock(),
                    new taintedsoil(),
                    new cinnabarore(),
                    new thaumiumblock(),
                    new taintedoakplanks(),
                    new tainteddairplanks(),
                    new taintedironore(),
                    new taintedgoldore(),
                    new taintedlapisore(),
                    new taintedredstoneore(),
                    new taintedemeraldore(),
                    new taintedamberore(),
                    new taintedcinnabarore(),
                    new taintedcoalore(),
                    new tainteddiamondore(),
                    new taintgoo(),
                    new TaintScrubber(),
                    new obsidiantotemtop(),
                    new taintedstonebrick(),
                    new taintedsand(),
                    new taintedgravel(),
                    new taintedobsidian(),
                    new seenoevil(),
                    new tainted_planks_slab(),
                    new hearnoevil(),
                    new speaknoevil(),
                    new taintedbirchplanks(),
                    new taintedspruceplanks(),
                    new taintedacaciaplanks()
            };

            for (String clsname : saplings) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.treeblocks." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }

            for (String clsname : leaves) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.treeblocks." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }

            for (String clsname : logs) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.treeblocks." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }
            
            //Tainted Tree Blocks
            for (String clsname : taintedsaplings) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }

            for (String clsname : taintedleaves) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }

            for (String clsname : taintedlogs) {
                try {
                    event.getRegistry().register((Block)
                        Class.forName("net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees." + clsname)
                            .getDeclaredConstructor(Block.Properties.class)
                            .newInstance(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    Constants.LOGGER.error("Issue with class: " + clsname);
                    e.printStackTrace();
                }
            }

            for (Block block : otherBlocks) {
                event.getRegistry().register(block);
            }

        }
        //biomes
        @SubscribeEvent
        public static void onBiomeRegistry(final RegistryEvent.Register<Biome> event) {
            event.getRegistry().register(new TaintBiome().setRegistryName("taintbiome"));
            System.out.println("Biomes are working, fat whoop!");



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
                    ModBlocks.TAINTEDOAKPLANKS,
                    ModBlocks.TAINTEDDAIRPLANKS,
                    ModBlocks.TAINTEDDAIRLOG,
                    ModBlocks.STRIPPEDTAINTEDDAIRLOG,
                    ModBlocks.TAINTEDDAIRLEAVES,
                    ModBlocks.TAINTEDAMBERORE,
                    ModBlocks.TAINTEDCOALORE,
                    ModBlocks.TAINTEDCINNABARORE,
                    ModBlocks.TAINTEDDIAMONDORE,
                    ModBlocks.TAINTEDEMERALDORE,
                    ModBlocks.TAINTEDGOLDORE,
                    ModBlocks.TAINTEDIRONORE,
                    ModBlocks.TAINTEDLAPISORE,
                    ModBlocks.TAINTEDREDSTONEORE,
                    ModBlocks.TAINTGOO,
                    ModBlocks.TAINTSCRUBBER,
                    ModBlocks.OBSIDIANTOTEMTOP,
                    ModBlocks.TAINTEDSTONEBRICK,
                    ModBlocks.TAINTEDSAND,
                    ModBlocks.TAINTEDGRAVEL,
                    ModBlocks.TAINTEDOBSIDIAN,
                    ModBlocks.SEENOEVIL,
                    ModBlocks.SPEAKNOEVIL,
                    ModBlocks.HEARNOEVIL,
                    ModBlocks.TAINTEDPLANKSSLAB,
                    ModBlocks.TAINTEDBIRCHLOG,
                    ModBlocks.TAINTEDBIRCHPLANKS,
                    ModBlocks.TAINTEDBIRCHLEAVES,
                    ModBlocks.STRIPPEDTAINTEDBIRCHLOG,
                    ModBlocks.TAINTEDBIRCHSAPLING,
                    ModBlocks.TAINTEDSPRUCELEAVES,
                    ModBlocks.TAINTEDSPRUCESAPLING,
                    ModBlocks.TAINTEDSPRUCEPLANKS,
                    ModBlocks.TAINTEDSPRUCELOG,
                    ModBlocks.STRIPPEDTAINTEDSPRUCELOG,
                    ModBlocks.TAINTEDACACIASAPLING,
                    ModBlocks.TAINTEDACACIAPLANKS,
                    ModBlocks.TAINTEDACACIALEAVES,
                    ModBlocks.TAINTEDACACIALOG,
                    ModBlocks.STRIPPEDTAINTEDACACIALOG,

            };

            for (Block block : modBlocks) {
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName(block.getRegistryName()));
            }

            // LOOT BAGS
            event.getRegistry().register(new CommonLootbag());

            // ITEMS
            event.getRegistry().register(new thaumonomicon());
            event.getRegistry().register(new bookoftainticon());
            event.getRegistry().register(new crimsonritesicon());
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
            Item[] aspects = {
                new air(),
                new armor(),
                new aura(),
                new beast(),
                new chaos(),
                new crafting(),
                new crystal(),
                new darkness(),
                new death(),
                new earth(),
                new eldrich(),
                new ender(),
                new envy(),
                new exchange(),
                new fabric(),
                new fire(),
                new flesh(),
                new flight(),
                new gluttony(),
                new greed(),
                new harvest(),
                new human(),
                new ice(),
                new inprison(),
                new journey(),
                new life(),
                new light(),
                new lust(),
                new machine(),
                new mana(),
                new metal(),
                new mind(),
                new mining(),
                new movement(),
                new nether(),
                new order(),
                new plant(),
                new pride(),
                new seeds(),
                new senses(),
                new slime(),
                new sloth(),
                new spirit(),
                new strength(),
                new taint(),
                new tool(),
                new tree(),
                new undead(),
                new vacuum(),
                new venom(),
                new water(),
                new weapon(),
                new wind(),
                new wrath()
            };

            for (Item aspect : aspects) {
                event.getRegistry().register(aspect);
            }

            //Entity Spawn Eggs
            ModEntities.registerEntitySpawnEggs(event);
          
            // ARMOR
            event.getRegistry().register(new AspectGogglesHelmet("aspect_goggles", ArmorMaterial.ASPECT_GOGGLES_HELMET, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModTabGroups.MOD_ITEM_GROUP)));

        }



        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
            event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
                return new ThaumonomiconContainer(windowId, inv);
            }).setRegistryName("arcana:thaumonomiconcontainer"));

            event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
                return new ArcaneWorkbenchContainer(windowId, inv);
            }).setRegistryName("arcana:arcaneworkbenchcontainer"));

            event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> {
                return new CommonLootbagContainer(windowId, inv);
            }).setRegistryName("arcana:commonlootbagcontainer"));
        }

        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
        {
            event.getRegistry().registerAll(
                    ModEntities.ARCANA_TAINTED_PIG,
                    ModEntities.ARCANA_TAINTED_COW,
                    ModEntities.ARCANA_TAINTED_ZOMBIE,
                    ModEntities.ARCANA_TAINTED_CHICKEN,
                    ModEntities.ARCANA_TAINTED_CREEPER,
                    ModEntities.ARCANA_TAINTED_SPIDER,
                    ModEntities.ARCANA_TAINTED_SLIME,
                    ModEntities.ARCANA_WIZARD_VILLAGER,
                    ModEntities.KOALA
            );

            ModEntities.registerEntityWorldSpawns();
        }
        
        @SubscribeEvent
        public static void onPotionRegistry(final RegistryEvent.Register<Effect> event) {
            event.getRegistry().register(new Tainted(EffectType.HARMFUL, 10494192).setRegistryName("tainted"));
            System.out.println("Potions Registered!");
        }

    }

    /**
     * Makes a resource location for the Arcana directory with the supplied path
     */
    public static ResourceLocation location(String path)
    {
        return new ResourceLocation(Constants.MODID, path);
    }
}

