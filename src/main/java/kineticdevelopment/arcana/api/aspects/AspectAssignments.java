package kineticdevelopment.arcana.api.aspects;

import java.util.HashMap;

import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class AspectAssignments {
	@SuppressWarnings("serial")
	static HashMap<Block, AspectType[]> BlockAspects = new HashMap<Block, AspectType[]>() {{


		put(Blocks.ACACIA_BUTTON, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE, AspectType.ENERGY});
		put(Blocks.ACACIA_DOOR, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE});
		put(Blocks.ACACIA_FENCE, new AspectType[] {AspectType.TREE, AspectType.IMPRISON});
		put(Blocks.ACACIA_FENCE_GATE, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE});
		put(Blocks.ACACIA_LEAVES, new AspectType[] {AspectType.TREE, AspectType.PLANT});
		put(Blocks.ACACIA_DOOR, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE});
		put(Blocks.ACACIA_LOG, new AspectType[] {AspectType.TREE, AspectType.TREE});
		put(Blocks.ACACIA_PLANKS, new AspectType[] {AspectType.CRAFTING, AspectType.TREE});
		put(Blocks.ACACIA_DOOR, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE});
		put(Blocks.ACACIA_PRESSURE_PLATE, new AspectType[] {AspectType.MOVEMENT, AspectType.TREE, AspectType.ENERGY});
		put(Blocks.ACACIA_SAPLING, new AspectType[] {AspectType.PLANT, AspectType.TREE});
		put(Blocks.ACACIA_SIGN, new AspectType[] {AspectType.MIND, AspectType.TREE});
		put(Blocks.DIRT, new AspectType[] {Aspect.AspectType.EARTH});
		put(Blocks.ICE, new AspectType[] {Aspect.AspectType.ICE, Aspect.AspectType.WATER});
		
	}};
	
	@SuppressWarnings("serial")
	static HashMap<Class<? extends LivingEntity>, AspectType[]> MobAspects = new HashMap<Class<? extends LivingEntity>, AspectType[]>() {{
		put(ZombieEntity.class, new AspectType[] {AspectType.UNDEAD});
		
	}};
	
	@SuppressWarnings("serial")
	static HashMap<Item, AspectType[]> ItemAspects = new HashMap<Item, AspectType[]>() {{
		
		put(Items.DIRT, new AspectType[] {Aspect.AspectType.EARTH});
		put(Items.ICE, new AspectType[] {Aspect.AspectType.ICE, Aspect.AspectType.WATER});
		
	}};
}
