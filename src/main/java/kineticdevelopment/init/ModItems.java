/**
 * All items should be listed here.
 */

package kineticdevelopment.init;


import static kineticdevelopment.api.registry.ArcanaItems.amber;
import static kineticdevelopment.api.registry.ArcanaItems.dead_stick;
import static kineticdevelopment.api.registry.ArcanaItems.quicksilver;
import static kineticdevelopment.api.registry.ArcanaItems.tainted_melon_slice;
import static kineticdevelopment.api.registry.ArcanaItems.thaumonomicon;
import static kineticdevelopment.api.registry.ArcanaItems.trypophobius_stick;

import kineticdevelopment.common.items.Thaumonomicon;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> even)
    {
        thaumonomicon = registerItem(new Thaumonomicon(new Item.Properties().maxStackSize(1).group(ArcanaItemGroup.instance)), "thaumonomicon");
        quicksilver = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "quicksilver");
        amber = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "amber");
        dead_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "dead_stick");
        trypophobius_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"trypophobius_stick");
        tainted_melon_slice = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"tainted_melon_slice");
    }

    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
