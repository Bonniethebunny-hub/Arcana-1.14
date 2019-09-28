/**
 * All items should be listed here.
 */

package kineticdevelopment.init.item_entities;


import kineticdevelopment.common.items.Thaumonomicon;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static kineticdevelopment.api.registry.ArcanaItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModINodes {

    /**Nodes will be added as items, and then displayed as holograms. Will also allow players got get there hands on the nodes, so they
     * can add them to their world, if in creative.
     *
     **/
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> even)
    {

    }

    public static Item registerItem(Item item, String name) {

        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }


}
