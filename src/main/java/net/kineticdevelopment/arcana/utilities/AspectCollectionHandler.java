package net.kineticdevelopment.arcana.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.kineticdevelopment.arcana.common.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

public class AspectCollectionHandler {
	@SuppressWarnings("serial")
	static HashMap<Block, Item> BlockAspects = new HashMap<Block, Item>() {{
		put(Blocks.DIRT, ItemInit.EARTH);
	}};
	
	public static ArrayList<Item> getBlockAspects(Block block) {
		ArrayList<Item> aspects = new ArrayList<Item>();
		for (Map.Entry<Block, Item> entry : BlockAspects.entrySet()) {
			for(int i=0; i < BlockAspects.size(); i++) {
				if (block.equals(entry.getKey().getBlock())) {
	            	aspects.add(entry.getValue().getItem());
	            }
			}
        }
		return aspects;
	}
}
