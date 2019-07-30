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
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippedtainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippedtaintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.tainteddairleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.tainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoakleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaksapling;
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
            event.getRegistry().register(new silverwoodsapling(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new greatwoodsapling(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new dairsapling(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
            event.getRegistry().register(new taintedoaksapling(Block.Properties.create(Material.LEAVES).doesNotBlockMovement()));
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
            event.getRegistry().register(new tainteddairlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new strippedtainteddairlog(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.1F).harvestTool(ToolType.AXE)));
            event.getRegistry().register(new tainteddairleaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.5F).sound(SoundType.PLANT)));
            event.getRegistry().register(new taintedoakplanks());
            event.getRegistry().register(new tainteddairplanks());
            event.getRegistry().register(new taintedironore());
            event.getRegistry().register(new taintedgoldore());
            event.getRegistry().register(new taintedlapisore());
            event.getRegistry().register(new taintedredstoneore());
            event.getRegistry().register(new taintedemeraldore());
            event.getRegistry().register(new taintedamberore());
            event.getRegistry().register(new taintedcinnabarore());
            event.getRegistry().register(new taintedcoalore());
            event.getRegistry().register(new tainteddiamondore());
            event.getRegistry().register(new taintgoo());

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
            event.getRegistry().register(new air());
            event.getRegistry().register(new armor());
            event.getRegistry().register(new aura());
            event.getRegistry().register(new beast());
            event.getRegistry().register(new chaos());
            event.getRegistry().register(new crafting());
            event.getRegistry().register(new crystal());
            event.getRegistry().register(new darkness());
            event.getRegistry().register(new death());
            event.getRegistry().register(new earth());
            event.getRegistry().register(new eldrich());
            event.getRegistry().register(new ender());
            event.getRegistry().register(new envy());
            event.getRegistry().register(new exchange());
            event.getRegistry().register(new fabric());
            event.getRegistry().register(new fire());
            event.getRegistry().register(new flesh());
            event.getRegistry().register(new flight());
            event.getRegistry().register(new gluttony());
            event.getRegistry().register(new greed());
            event.getRegistry().register(new harvest());
            event.getRegistry().register(new human());
            event.getRegistry().register(new ice());
            event.getRegistry().register(new inprison());
            event.getRegistry().register(new journey());
            event.getRegistry().register(new life());
            event.getRegistry().register(new light());
            event.getRegistry().register(new lust());
            event.getRegistry().register(new machine());
            event.getRegistry().register(new mana());
            event.getRegistry().register(new metal());
            event.getRegistry().register(new mind());
            event.getRegistry().register(new mining());
            event.getRegistry().register(new movement());
            event.getRegistry().register(new nether());
            event.getRegistry().register(new order());
            event.getRegistry().register(new plant());
            event.getRegistry().register(new pride());
            event.getRegistry().register(new seeds());
            event.getRegistry().register(new senses());
            event.getRegistry().register(new slime());
            event.getRegistry().register(new sloth());
            event.getRegistry().register(new spirit());
            event.getRegistry().register(new strength());
            event.getRegistry().register(new taint());
            event.getRegistry().register(new tool());
            event.getRegistry().register(new tree());
            event.getRegistry().register(new undead());
            event.getRegistry().register(new vacuum());
            event.getRegistry().register(new venom());
            event.getRegistry().register(new water());
            event.getRegistry().register(new weapon());
            event.getRegistry().register(new wind());
            event.getRegistry().register(new wrath());

            // ARMOR
            event.getRegistry().register(new AspectGogglesHelmet("aspect_goggles", ArmorMaterial.ASPECT_GOGGLES_HELMET, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModTabGroups.MOD_ITEM_GROUP)));
        }
        
        //Potions
        @SubscribeEvent
        public static void onPotionRegistry(final RegistryEvent.Register<Effect> event) {
        	event.getRegistry().register(new Tainted(EffectType.HARMFUL, 10494192).setRegistryName("tainted"));
        	System.out.println("Potions Registered!");
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
