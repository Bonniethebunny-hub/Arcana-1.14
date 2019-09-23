package kineticdevelopment.api.aspects;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Aspect extends Item {

	public Aspect(Properties properties) {
		super(properties);
	}
	
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		stack.setCount(0);
	}
}
