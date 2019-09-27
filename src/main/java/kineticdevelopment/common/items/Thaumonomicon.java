package kineticdevelopment.common.items;

import java.util.List;
import javax.annotation.Nullable;
import kineticdevelopment.api.aspects.Aspect.AspectType;
import kineticdevelopment.api.aspects.AspectNotFoundException;
import kineticdevelopment.client.gui.GuiThaumonomicon;
import kineticdevelopment.common.utils.aspectpool.AspectPoolHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

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
            		context.getPlayer().sendMessage(new StringTextComponent(TextFormatting.GREEN + "You have just learned the " + TextFormatting.RED +aspects[i] + TextFormatting.GREEN + " aspect type!"));
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

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (!worldIn.isRemote) {
			//NetworkHooks.openGui((ServerPlayerEntity) playerIn, new GuiThaumonomicon());
		}

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(TextFormatting.RED + "Currently being used for testing with aspect collection"));
	}
}
