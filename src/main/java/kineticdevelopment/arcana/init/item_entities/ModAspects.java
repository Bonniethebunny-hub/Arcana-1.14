/**
 * Please only list aspects here.
 */

package kineticdevelopment.arcana.init.item_entities;


import kineticdevelopment.arcana.api.aspects.AspectItem;
import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaAspectsItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAspects {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> even)
    {
        ArcanaItems.aspect_overworld = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance )),  "aspect_overworld" );
        ArcanaItems.aspect_energy = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_energy");
        ArcanaItems.aspect_air = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_air");
        ArcanaItems.aspect_armour = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_armour");
        ArcanaItems.aspect_aura = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_aura");
        ArcanaItems.aspect_chaos = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_chaos");
        ArcanaItems.aspect_crafting = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_crafting");
        ArcanaItems.aspect_crystal = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_crystal");
        ArcanaItems.aspect_darkness = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_darkness");
        ArcanaItems.aspect_death = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_death");
        ArcanaItems.aspect_earth = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_earth");
        ArcanaItems.aspect_eldritch = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_eldritch");
        ArcanaItems.aspect_ender = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_ender");
        ArcanaItems.aspect_envy = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_envy");
        ArcanaItems.aspect_exchange = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_exchange");
        ArcanaItems.aspect_fabric = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_fabric");
        ArcanaItems.aspect_fire = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_fire");
        ArcanaItems.aspect_flesh = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_flesh");
        ArcanaItems.aspect_flight = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_flight");
        ArcanaItems.aspect_gluttony = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_gluttony");
        ArcanaItems.aspect_greed = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_greed");
        ArcanaItems.aspect_harvest = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_harvest");
        ArcanaItems.aspect_human = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_human");
        ArcanaItems.aspect_ice =  registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_ice");
        ArcanaItems.aspect_imprison = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_imprison");
        ArcanaItems.aspect_journey = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_journey");
        ArcanaItems.aspect_life = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_life");
        ArcanaItems.aspect_light = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_light");
        ArcanaItems.aspect_lust = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_lust");
        ArcanaItems.aspect_machine = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_machine");
        ArcanaItems.aspect_mana = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mana");
        ArcanaItems.aspect_metal = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_metal");
        ArcanaItems.aspect_mind = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mind");
        ArcanaItems.aspect_mining = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_mining");
        ArcanaItems.aspect_movement = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_movement");
        ArcanaItems.aspect_nether = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_nether");
        ArcanaItems.aspect_order = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_order");
        ArcanaItems.aspect_plant = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_plant");
        ArcanaItems.aspect_pride = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_pride");
        ArcanaItems.aspect_seeds = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_seeds");
        ArcanaItems.aspect_senses = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_senses");
        ArcanaItems.aspect_slime = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_slime");
        ArcanaItems.aspect_sloth = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_sloth");
        ArcanaItems.aspect_spirit = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_spirit");
        ArcanaItems.aspect_strength = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_strength");
        ArcanaItems.aspect_taint = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_taint");
        ArcanaItems.aspect_beast = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_beast");
        ArcanaItems.aspect_tool = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_tool");
        ArcanaItems.aspect_tree = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_tree");
        ArcanaItems.aspect_undead = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_undead");
        ArcanaItems.aspect_vacuum = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_vacuum");
        ArcanaItems.aspect_venom = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_venom");
        ArcanaItems.aspect_water = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_water");
        ArcanaItems.aspect_weapon = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_weapon");
        ArcanaItems.aspect_wind = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_wind");
        ArcanaItems.aspect_wrath = registerItem(new AspectItem(new Item.Properties().maxStackSize(64).group(ArcanaAspectsItemGroup.instance)), "aspect_wrath");







    }


    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
