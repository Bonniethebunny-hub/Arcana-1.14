package kineticdevelopment.common.items;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import kineticdevelopment.api.aspects.Aspect.AspectType;
import kineticdevelopment.api.aspects.AspectNotFoundException;
import kineticdevelopment.common.utils.aspectpool.AspectPoolHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Thaumonomicon extends Item {

	public Thaumonomicon(Properties properties) {
		super(properties);
	}
	
	public ActionResultType onItemUse(ItemUseContext context) {

    	if(!context.getWorld().isRemote) {
    		
    		if(!context.isPlacerSneaking()) {
        		AspectType[] aspects = AspectPoolHandler.getBlockAspects(context.getWorld().getBlockState(context.getPos()).getBlock());

            	for(int i=0; i<aspects.length; i++) {
            		AspectPoolHandler.addAspectToPlayer(context.getPlayer(), context.getWorld(), aspects[i], 10);
            	}
        	}

        	else {
        		try {
					int number = AspectPoolHandler.getPlayerAspectAmount(context.getPlayer(), AspectType.ICE, context.getWorld());
					System.out.println(String.valueOf(number));
				} catch (AspectNotFoundException e) {
					e.printStackTrace();
				}
        	}
    	}
    	
        return ActionResultType.PASS;
    }
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Currently being used for testing with aspect collection"));
	}
}
