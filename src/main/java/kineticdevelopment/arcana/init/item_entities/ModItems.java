/**
 * All items should be listed here.
 */

package kineticdevelopment.arcana.init.item_entities;


import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.common.items.Thaumonomicon;
import kineticdevelopment.arcana.common.utils.creativetab.ArcanaItemGroup;
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
        ArcanaItems.thaumonomicon = registerItem(new Thaumonomicon(new Item.Properties().maxStackSize(1).group(ArcanaItemGroup.instance)), "thaumonomicon");
        ArcanaItems.quicksilver = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "quicksilver");
        ArcanaItems.amber = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "amber");
        ArcanaItems.dead_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)), "dead_stick");
        ArcanaItems.trypophobius_stick = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"trypophobius_stick");
        ArcanaItems.tainted_melon_slice = registerItem(new Item(new Item.Properties().maxStackSize(64).group(ArcanaItemGroup.instance)),"tainted_melon_slice");
    }

    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
