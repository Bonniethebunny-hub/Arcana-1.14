/**
 * All items should be listed here.
 */

package kineticdevelopment.init;


import kineticdevelopment.api.items.ArcanaItems;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.api.items.ArcanaItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> even)
    {
        thaumonomicon = registerItem(new Item(new Item.Properties().maxStackSize(1).group(ArcanaItemGroup.instance)), "thaumonomicon");
        quicksilver = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "quicksilver");
        amber = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "amber");
        dead_tree_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "dead_tree_stick");
        trypophobius_tree_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"trypophobius_tree_stick");
    }

    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
