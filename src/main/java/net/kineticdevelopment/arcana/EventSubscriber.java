package net.kineticdevelopment.arcana;

import net.kineticdevelopment.arcana.client.container.ArcaneWorkbenchContainer;
import net.kineticdevelopment.arcana.client.container.ThaumonomiconContainer;
import net.kineticdevelopment.arcana.client.container.lootbags.CommonLootbagContainer;
import net.kineticdevelopment.arcana.common.armor.ArmorMaterial;
import net.kineticdevelopment.arcana.common.armor.AspectGogglesHelmet;
import net.kineticdevelopment.arcana.common.blocks.amberblock;
import net.kineticdevelopment.arcana.common.blocks.amberblockswirl;
import net.kineticdevelopment.arcana.common.blocks.amberbrick;
import net.kineticdevelopment.arcana.common.blocks.arcanestone;
import net.kineticdevelopment.arcana.common.blocks.arcanestonebrick;
import net.kineticdevelopment.arcana.common.blocks.arcaneworktable;
import net.kineticdevelopment.arcana.common.blocks.cinnabarore;
import net.kineticdevelopment.arcana.common.blocks.greatwoodplanks;
import net.kineticdevelopment.arcana.common.blocks.infusionstone;
import net.kineticdevelopment.arcana.common.blocks.silverwoodplanks;
import net.kineticdevelopment.arcana.common.blocks.thaumiumblock;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedcrust;
import net.kineticdevelopment.arcana.common.blocks.tainted.tainteddairplanks;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedoakplanks;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedrock;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedsoil;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintgoo;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedamberore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedcinnabarore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedcoalore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.tainteddiamondore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedemeraldore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedgoldore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedironore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedlapisore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedredstoneore;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.common.init.ModBlocks;
import net.kineticdevelopment.arcana.common.items.basicwand;
import net.kineticdevelopment.arcana.common.items.quicksilver;
import net.kineticdevelopment.arcana.common.items.thaumiumingot;
import net.kineticdevelopment.arcana.common.items.thaumonomicon;
import net.kineticdevelopment.arcana.common.items.wandcapcopper;
import net.kineticdevelopment.arcana.common.items.wandcapgold;
import net.kineticdevelopment.arcana.common.items.wandcapiron;
import net.kineticdevelopment.arcana.common.items.wandcapsilver;
import net.kineticdevelopment.arcana.common.items.wandcapthaumium;
import net.kineticdevelopment.arcana.common.items.wandcapvoid;
import net.kineticdevelopment.arcana.common.items.elements.air;
import net.kineticdevelopment.arcana.common.items.elements.armor;
import net.kineticdevelopment.arcana.common.items.elements.aura;
import net.kineticdevelopment.arcana.common.items.elements.beast;
import net.kineticdevelopment.arcana.common.items.elements.chaos;
import net.kineticdevelopment.arcana.common.items.elements.crafting;
import net.kineticdevelopment.arcana.common.items.elements.crystal;
import net.kineticdevelopment.arcana.common.items.elements.darkness;
import net.kineticdevelopment.arcana.common.items.elements.death;
import net.kineticdevelopment.arcana.common.items.elements.earth;
import net.kineticdevelopment.arcana.common.items.elements.eldrich;
import net.kineticdevelopment.arcana.common.items.elements.ender;
import net.kineticdevelopment.arcana.common.items.elements.envy;
import net.kineticdevelopment.arcana.common.items.elements.exchange;
import net.kineticdevelopment.arcana.common.items.elements.fabric;
import net.kineticdevelopment.arcana.common.items.elements.fire;
import net.kineticdevelopment.arcana.common.items.elements.flesh;
import net.kineticdevelopment.arcana.common.items.elements.flight;
import net.kineticdevelopment.arcana.common.items.elements.gluttony;
import net.kineticdevelopment.arcana.common.items.elements.greed;
import net.kineticdevelopment.arcana.common.items.elements.harvest;
import net.kineticdevelopment.arcana.common.items.elements.human;
import net.kineticdevelopment.arcana.common.items.elements.ice;
import net.kineticdevelopment.arcana.common.items.elements.inprison;
import net.kineticdevelopment.arcana.common.items.elements.journey;
import net.kineticdevelopment.arcana.common.items.elements.life;
import net.kineticdevelopment.arcana.common.items.elements.light;
import net.kineticdevelopment.arcana.common.items.elements.lust;
import net.kineticdevelopment.arcana.common.items.elements.machine;
import net.kineticdevelopment.arcana.common.items.elements.mana;
import net.kineticdevelopment.arcana.common.items.elements.metal;
import net.kineticdevelopment.arcana.common.items.elements.mind;
import net.kineticdevelopment.arcana.common.items.elements.mining;
import net.kineticdevelopment.arcana.common.items.elements.movement;
import net.kineticdevelopment.arcana.common.items.elements.nether;
import net.kineticdevelopment.arcana.common.items.elements.order;
import net.kineticdevelopment.arcana.common.items.elements.plant;
import net.kineticdevelopment.arcana.common.items.elements.pride;
import net.kineticdevelopment.arcana.common.items.elements.seeds;
import net.kineticdevelopment.arcana.common.items.elements.senses;
import net.kineticdevelopment.arcana.common.items.elements.slime;
import net.kineticdevelopment.arcana.common.items.elements.sloth;
import net.kineticdevelopment.arcana.common.items.elements.spirit;
import net.kineticdevelopment.arcana.common.items.elements.strength;
import net.kineticdevelopment.arcana.common.items.elements.taint;
import net.kineticdevelopment.arcana.common.items.elements.tool;
import net.kineticdevelopment.arcana.common.items.elements.tree;
import net.kineticdevelopment.arcana.common.items.elements.undead;
import net.kineticdevelopment.arcana.common.items.elements.vacuum;
import net.kineticdevelopment.arcana.common.items.elements.venom;
import net.kineticdevelopment.arcana.common.items.elements.water;
import net.kineticdevelopment.arcana.common.items.elements.weapon;
import net.kineticdevelopment.arcana.common.items.elements.wind;
import net.kineticdevelopment.arcana.common.items.elements.wrath;
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
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.lang.reflect.InvocationTargetException;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public class EventSubscriber {
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
                    "taintedoaksapling"
            };

            // Created with Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)
            String[] leaves = {
                    "silverwoodleaves",
                    "dairleaves",
                    "taintedoakleaves",
                    "tainteddairleaves",
                    "greatwoodleaves"
            };

            // Created with Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)
            String[] logs = {
                    "greatwoodlog",
                    "silverwoodlog",
                    "dairlog",
                    "strippeddairlog",
                    "taintedoaklog",
                    "strippedtaintedoaklog",
                    "tainteddairlog",
                    "strippedtainteddairlog"
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
                    new taintgoo()
            };

            for (String clsname : saplings){
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

            for (String clsname : leaves){
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

            for (String clsname : logs){
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

            for (Block block : otherBlocks){
                event.getRegistry().register(block);
            }

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
                    ModBlocks.TAINTGOO
            };

            for (Block block : modBlocks){
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)).setRegistryName(block.getRegistryName()));
            }

            // LOOT BAGS
            event.getRegistry().register(new CommonLootbag());

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
            
            for (Item aspect : aspects){
                event.getRegistry().register(aspect);
            }

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

        //Potions
        @SubscribeEvent
        public static void onPotionRegistry(final RegistryEvent.Register<Effect> event) {
            event.getRegistry().register(new Tainted(EffectType.HARMFUL, 10494192).setRegistryName("tainted"));
            System.out.println("Potions Registered!");
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
