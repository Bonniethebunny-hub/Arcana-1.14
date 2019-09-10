package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.container.ArcaneWorkbenchContainer;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.kineticdevelopment.arcana.client.container.lootbags.CommonLootbagContainer;
import net.kineticdevelopment.arcana.common.armor.ArmorMaterial;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.kineticdevelopment.arcana.common.biomes.MagicalForestBiome;
import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.*;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.BlockInit;
import net.kineticdevelopment.arcana.common.init.EntityInit;
import net.kineticdevelopment.arcana.common.items.*;
import net.kineticdevelopment.arcana.common.items.elements.*;
import net.kineticdevelopment.arcana.common.biomes.TaintBiome;

import net.kineticdevelopment.arcana.utilities.structures.DairTreeFeature;
import net.kineticdevelopment.arcana.utilities.structures.GreatwoodFeature;
import net.kineticdevelopment.arcana.utilities.structures.SilverwoodFeature;
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


import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import java.lang.reflect.InvocationTargetException;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class RegistryHandler
{
    /**On Player Join Event Which Sends A Message To the Player In the Chat
    @SubscribeEvent
    public static void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getPlayer().world.isRemote) {
            event.getPlayer().sendMessage(new StringTextComponent(TextFormatting.RED + "Hello there " +
                TextFormatting.AQUA + event.getPlayer().getDisplayName().getString() + TextFormatting.RED + ", we hope you enjoy the Arcana Mod!"));
        }
    }
    **/


    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        // Register BLOCKS
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            // Created with Block.Properties.create(Material.LEAVES).doesNotBlockMovement()
            String[] saplings = {
                "silverwoodsapling",
                "greatwoodsapling",
                "dairsapling",
                    "willowsapling"
            };

            // Created with Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)
            String[] leaves = {
                "silverwoodleaves",
                "dairleaves",
                "greatwoodleaves",
                    "willowleaves"
            };

            // Created with Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)
            String[] logs = {
                "greatwoodlog",
                "silverwoodlog",
                "dairlog",
                "strippeddairlog",
                    "willowlog"
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
                    new taintedacaciaplanks(),
                    new taintedflower(),
                    new taintedgrass(),
                    new taintedportal(),
                    new magicalforestgrass(),
                    //new tainted_oak_stairs(BlockInit.TAINTEDOAKPLANKS),
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
            event.getRegistry().register(new MagicalForestBiome().setRegistryName("magicalforestbiome"));
        }


        // Register ITEMS & ModBlocks
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            @SuppressWarnings("unused")
            Item.Properties properties = new Item.Properties();

            // BLOCKS
            Block[] modBlocks = {
                    BlockInit.ARCANESTONE,
                    BlockInit.ARCANEWORKTABLE,
                    BlockInit.ARCANESTONEBRICK,
                    BlockInit.INFUSIONSTONE,
                    BlockInit.AMBERBLOCK,
                    BlockInit.AMBERBLOCKSWIRL,
                    BlockInit.AMBERBRICK,
                    BlockInit.SILVERWOODPLANKS,
                    BlockInit.GREATWOODPLANKS,
                    BlockInit.GREATWOODSAPLING,
                    BlockInit.TAINTEDCRUST,
                    BlockInit.TAINTEDROCK,
                    BlockInit.TAINTEDSOIL,
                    BlockInit.CINNABARORE,
                    BlockInit.THAUMIUMBLOCK,
                    BlockInit.GREATWOODLOG,
                    BlockInit.GREATWOODLEAVES,
                    BlockInit.SILVERWOODLOG,
                    BlockInit.SILVERWOODLEAVES,
                    BlockInit.SILVERWOODSAPLING,
                    BlockInit.DAIRLOG,
                    BlockInit.DAIRLEAVES,
                    BlockInit.DAIRSAPLING,
                    BlockInit.STRIPPEDDAIRLOG,
                    BlockInit.TAINTEDOAKLEAVES,
                    BlockInit.TAINTEDOAKSAPLING,
                    BlockInit.STRIPPEDTAINTEDOAKLOG,
                    BlockInit.TAINTEDOAKLOG,
                    BlockInit.TAINTEDOAKPLANKS,
                    BlockInit.TAINTEDDAIRPLANKS,
                    BlockInit.TAINTEDDAIRLOG,
                    BlockInit.STRIPPEDTAINTEDDAIRLOG,
                    BlockInit.TAINTEDDAIRLEAVES,
                    BlockInit.TAINTEDAMBERORE,
                    BlockInit.TAINTEDCOALORE,
                    BlockInit.TAINTEDCINNABARORE,
                    BlockInit.TAINTEDDIAMONDORE,
                    BlockInit.TAINTEDEMERALDORE,
                    BlockInit.TAINTEDGOLDORE,
                    BlockInit.TAINTEDIRONORE,
                    BlockInit.TAINTEDLAPISORE,
                    BlockInit.TAINTEDREDSTONEORE,
                    BlockInit.TAINTGOO,
                    BlockInit.TAINTSCRUBBER,
                    BlockInit.OBSIDIANTOTEMTOP,
                    BlockInit.TAINTEDSTONEBRICK,
                    BlockInit.TAINTEDSAND,
                    BlockInit.TAINTEDGRAVEL,
                    BlockInit.TAINTEDOBSIDIAN,
                    BlockInit.SEENOEVIL,
                    BlockInit.SPEAKNOEVIL,
                    BlockInit.HEARNOEVIL,
                    BlockInit.TAINTEDPLANKSSLAB,
                    BlockInit.TAINTEDBIRCHLOG,
                    BlockInit.TAINTEDBIRCHPLANKS,
                    BlockInit.TAINTEDBIRCHLEAVES,
                    BlockInit.STRIPPEDTAINTEDBIRCHLOG,
                    BlockInit.TAINTEDBIRCHSAPLING,
                    BlockInit.TAINTEDSPRUCELEAVES,
                    BlockInit.TAINTEDSPRUCESAPLING,
                    BlockInit.TAINTEDSPRUCEPLANKS,
                    BlockInit.TAINTEDSPRUCELOG,
                    BlockInit.STRIPPEDTAINTEDSPRUCELOG,
                    BlockInit.TAINTEDACACIASAPLING,
                    BlockInit.TAINTEDACACIAPLANKS,
                    BlockInit.TAINTEDACACIALEAVES,
                    BlockInit.TAINTEDACACIALOG,
                    BlockInit.STRIPPEDTAINTEDACACIALOG,
                    BlockInit.TAINTEDFLOWER,
                    BlockInit.TAINTEDGRASS,
                    BlockInit.TAINTEDPORTAL,
                    BlockInit.MAGICALGRASS,
                    BlockInit.WILLOWLOG,
                    BlockInit.WILLOWLEAVES,
                    BlockInit.WILLOWSAPLING,
                    //BlockInit.TAINTEDOAKSTAIRS,
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
                new eldritch(),
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
                new imprison(),
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
            EntityInit.registerEntitySpawnEggs(event);

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
                    EntityInit.ARCANA_TAINTED_PIG,
                    EntityInit.ARCANA_TAINTED_COW,
                    EntityInit.ARCANA_TAINTED_ZOMBIE,
                    EntityInit.ARCANA_TAINTED_CHICKEN,
                    EntityInit.ARCANA_TAINTED_CREEPER,
                    EntityInit.ARCANA_TAINTED_SPIDER,
                    EntityInit.ARCANA_TAINTED_SLIME,
                    EntityInit.ARCANA_WIZARD_VILLAGER,
                    EntityInit.KOALA
            );

            EntityInit.registerEntityWorldSpawns();
        }

        @SubscribeEvent
        public static void onEffectRegistry(final RegistryEvent.Register<Effect> event) {
            event.getRegistry().register(new Tainted(EffectType.HARMFUL, 10494192).setRegistryName("tainted"));
            System.out.println("Potions Registered!");
        }

        @SubscribeEvent
        public static void onFeatureRegistry(final RegistryEvent.Register<Feature<?>> event) {
            //Tree Registry
            Feature<?>[] trees = {
                    new DairTreeFeature(NoFeatureConfig::deserialize).setRegistryName("arcana:dairtree"),
                    new GreatwoodFeature(NoFeatureConfig::deserialize).setRegistryName("arcana:greatwoodtree"),
                    new SilverwoodFeature(NoFeatureConfig::deserialize).setRegistryName("silverwoodtree")
            };
            for (Feature<?> tree : trees
                 ) {
                event.getRegistry().register(tree);
            }
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

