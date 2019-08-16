package net.kineticdevelopment.arcana.utilities;

import java.util.HashMap;
import java.util.Map.Entry;

import net.kineticdevelopment.arcana.common.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

public class AspectCollectionHandler {
	@SuppressWarnings("serial")
	static HashMap<Block, Item[]> BlockAspects = new HashMap<Block, Item[]>() {{
		put(Blocks.DIRT, new Item[] {ItemInit.EARTH});
		put(Blocks.ICE, new Item[] {ItemInit.ICE, ItemInit.WATER});
	}};
	
	/**
	 * Returns an Item Array with all the Aspects of a block
	 * @param block
	 * @return Item[]
	 */
	public static Item[] getBlockAspects(Block block) {
		for (Entry<Block, Item[]> entry : BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
            	Item[] aspects = entry.getValue(); 
            	return aspects;
            }
        }
		return null;
	}
}
