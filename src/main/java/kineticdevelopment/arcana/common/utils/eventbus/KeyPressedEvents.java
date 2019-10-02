package kineticdevelopment.arcana.common.utils.eventbus;

import org.lwjgl.glfw.GLFW;

import kineticdevelopment.arcana.api.registry.ArcanaArmour;
import kineticdevelopment.arcana.common.utils.aspectpool.AspectPoolHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KeyPressedEvents {
	
	@SubscribeEvent
	public static void onKeyPressed(KeyInputEvent event) {
		if(event.getKey() == GLFW.GLFW_KEY_R) {
			if(event.getAction() == GLFW.GLFW_RELEASE) {
				PlayerEntity player = Minecraft.getInstance().player;
				if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).isItemEqual(new ItemStack(ArcanaArmour.aspect_goggles))) {
					if(Minecraft.getInstance().objectMouseOver.getType().equals(Type.ENTITY)) {
						Entity entity = ((EntityRayTraceResult) Minecraft.getInstance().objectMouseOver).getEntity();
					}
					if(Minecraft.getInstance().objectMouseOver.getType().equals(Type.BLOCK)) {
						Block block = Minecraft.getInstance().world.getBlockState(((BlockRayTraceResult) Minecraft.getInstance().objectMouseOver).getPos()).getBlock();
						AspectPoolHandler.addBlockAspectsToPlayer(block, Minecraft.getInstance().player, Minecraft.getInstance().world, 1);
					}
				}
				else {
					player.sendStatusMessage(new StringTextComponent("You need to have a pair of Aspect Goggles to scan for aspects!"), true);
				}
			}
		}
	}
}
