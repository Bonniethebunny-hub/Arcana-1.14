/**
 * Please only list aspects here.
 */

package kineticdevelopment.init;


import kineticdevelopment.common.utils.creativetab.ArcanaAspectsItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.api.items.ArcanaItems.*;

import kineticdevelopment.api.aspects.Aspect;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAspects {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> even)
    {
        aspect_air = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_air");
        aspect_armour = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_armour");
        aspect_aura = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_aura");
        aspect_chaos = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_chaos");
        aspect_crafting = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_crafting");
        aspect_crystal = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_crystal");
        aspect_darkness = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_darkness");
        aspect_death = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_death");
        aspect_earth = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_earth");
        aspect_eldritch = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_eldritch");
        aspect_ender = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_ender");
        aspect_envy = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_envy");
        aspect_exchange = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_exchange");
        aspect_fabric = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_fabric");
        aspect_fire = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_fire");
        aspect_flesh = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_flesh");
        aspect_flight = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_flight");
        aspect_gluttony = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_gluttony");
        aspect_greed = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_greed");
        aspect_harvest = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_harvest");
        aspect_human = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_human");
        aspect_ice =  registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_ice");
        aspect_imprison = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_imprison");
        aspect_journey = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_journey");
        aspect_life = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_life");
        aspect_light = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_light");
        aspect_lust = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_lust");
        aspect_machine = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_machine");
        aspect_mana = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mana");
        aspect_metal = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_metal");
        aspect_mind = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mind");
        aspect_mining = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mining");
        aspect_movement = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_movement");
        aspect_nether = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_nether");
        aspect_order = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_order");
        aspect_plant = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_plant");
        aspect_pride = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_pride");
        aspect_seeds = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_seeds");
        aspect_senses = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_senses");
        aspect_slime = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_slime");
        aspect_sloth = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_sloth");
        aspect_spirit = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_spirit");
        aspect_strength = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_strength");
        aspect_taint = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_taint");
        aspect_beast = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_beast");
        aspect_tool = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_tool");
        aspect_tree = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_tree");
        aspect_undead = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_undead");
        aspect_vacuum = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_vacuum");
        aspect_venom = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_venom");
        aspect_water = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_water");
        aspect_weapon = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_weapon");
        aspect_wind = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_wind");
        aspect_wrath = registerItem(new Aspect(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_wrath");







    }


    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
