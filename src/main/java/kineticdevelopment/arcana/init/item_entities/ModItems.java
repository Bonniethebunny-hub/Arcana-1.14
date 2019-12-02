/**
 * All items should be listed here.
 */

package kineticdevelopment.arcana.init.item_entities;


import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.common.items.ItemFocus;
import kineticdevelopment.arcana.common.items.wand.wands.ItemWand;
import kineticdevelopment.arcana.common.items.Thaumonomicon;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
import kineticdevelopment.arcana.init.ModMobEntities;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.arcana.core.Arcana.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        ArcanaItems.thaumonomicon = registerItem(new Thaumonomicon(new Item.Properties().maxStackSize(1).group(ArcanaItemGroup.instance)), "thaumonomicon");
        ArcanaItems.quicksilver = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "quicksilver");
        ArcanaItems.amber = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "amber");
        ArcanaItems.dead_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "dead_stick");
        ArcanaItems.trypophobius_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"trypophobius_stick");
        ArcanaItems.tainted_melon_slice = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"tainted_melon_slice");
        ArcanaItems.basicwand = registerItem(new ItemWand(new Item.Properties().maxStackSize(1).setNoRepair().group(ArcanaItemGroup.instance)), "basicwand");
        ArcanaItems.focus = registerItem(new ItemFocus(new Item.Properties().maxStackSize(1).setNoRepair().group(ArcanaItemGroup.instance)), "focus");


        //spawn eggs
        ModMobEntities.registerEntitySpawnEggs(event);
    }

    public static Item registerItem(Item item, String name) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }


}
