package kineticdevelopment.arcana.common.utils.eventbus;

import kineticdevelopment.arcana.api.registry.ArcanaBlocks;
import kineticdevelopment.arcana.api.registry.ArcanaItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetaHandler {
	
	@SubscribeEvent
	public static void onWorldLoad(PlayerLoggedInEvent event) {
		PlayerEntity player = event.getPlayer();
		
		if(!player.inventory.hasItemStack(new ItemStack(ArcanaItems.thaumonomicon))) {
			player.addItemStackToInventory(new ItemStack(ArcanaItems.thaumonomicon));
		}
		if(!player.inventory.hasItemStack(new ItemStack(ArcanaBlocks.tainted_altar.asItem()))) {
			player.addItemStackToInventory(new ItemStack(ArcanaBlocks.tainted_altar.asItem()));
		}
	}
}
