package kineticdevelopment.common.items;

import java.util.List;

import javax.annotation.Nullable;

import kineticdevelopment.api.aspects.Aspect.AspectType;
import kineticdevelopment.api.aspects.AspectNotFoundException;
import kineticdevelopment.api.aspects.BlockHasNoAspectsException;
import kineticdevelopment.common.utils.aspectpool.AspectPoolHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
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
        		AspectPoolHandler.addBlockAspectsToPlayer(context.getWorld().getBlockState(context.getPos()).getBlock(), context.getPlayer(), context.getWorld());
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

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (!worldIn.isRemote) {
			//NetworkHooks.openGui((ServerPlayerEntity) playerIn, new GuiThaumonomicon());
		}

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Currently being used for testing with aspect collection"));
	}
}
