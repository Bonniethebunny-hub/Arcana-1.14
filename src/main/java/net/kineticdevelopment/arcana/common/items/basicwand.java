package net.kineticdevelopment.arcana.common.items;

import java.util.ArrayList;

import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.kineticdevelopment.arcana.utilities.AspectCollectionHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;

public class basicwand extends Item {
    public basicwand() {
        super(new Properties().group(ModTabGroups.MOD_ITEM_GROUP)
            .maxStackSize(1));

        setRegistryName("basicwand");
    }
    
    public ActionResultType onItemUse(ItemUseContext context) {
    	if(!context.getWorld().isRemote) {
    		ArrayList<Item> aspects = AspectCollectionHandler.getBlockAspects(context.getWorld().getBlockState(context.getPos()).getBlock());
    		for(int i=0; i < aspects.size(); i++) {
    			System.out.println(aspects.get(i));
    		}
    	}
        return ActionResultType.PASS;
     }
}
