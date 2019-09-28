/**
 * All items should be listed here.
 */

package kineticdevelopment.init;


import kineticdevelopment.common.armour.ArmourMaterial;
import kineticdevelopment.common.armour.AspectGogglesHelmet;
import kineticdevelopment.common.utils.creativetab.ArcanaItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModArmour {
    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties();
        event.getRegistry().register(new AspectGogglesHelmet("aspect_goggles", ArmourMaterial.aspect_goggles_helm, EquipmentSlotType.HEAD, (new Item.Properties()).group(ArcanaItemGroup.instance)));
        System.out.println("Armour Registered!");
    }
}