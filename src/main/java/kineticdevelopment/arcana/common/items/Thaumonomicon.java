package kineticdevelopment.arcana.common.items;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ReadBookScreen;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.world.World;

public class Thaumonomicon extends WrittenBookItem {

	public Thaumonomicon(Properties properties) {
		super(properties);
	}
	
	public static int func_220049_j(ItemStack p_220049_0_) {
	      CompoundNBT compoundnbt = p_220049_0_.getTag();
	      return compoundnbt != null ? compoundnbt.getList("pages", 8).size() : 0;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(!stack.hasTag()) {
			ListNBT nbt = new ListNBT();
			nbt.add(new StringNBT("{\"text\":\"Welcome to Arcana!\n\nThe mod at the moment is in its beta test phase and we'll be slowly updating it with more features and items soon. In this build, we'll mainly be testing the taint system.\n\nIn your inventory, you should find a Taint\"}"));
			nbt.add(new StringNBT("{\"text\":\"Altar. This is a just a dev block and will help you raise and lower the taint level. Shift right-click to lower the level and just right-click to raise. Every time you click, it will raise the level by two.\n\nTaint will not spread until level five, and we don't recommend you\"}"));
			nbt.add(new StringNBT("{\"text\":\"go over level fifty as in normal play, you won't normally go over this level. You can push the taint level as high as you like, but taint will keep getting faster and more aggressive.\n\nIf you find any bugs, issues, or have feedback please let us know via Discord or on our Curse page. More updates will be coming soon! We hope you have fun with the taint system :D\n\n-Arcana Dev team\"}"));
			nbt.add(new StringNBT("{\"text\":\"or on our Curse page\n\n More updates will be coming soon! We hope you have fun with the taint system :D\\n\\n-Arcana Dev team\n\nSidenote: Taint needs a tainted block to spread from.\"}"));
			stack.setTagInfo("author", new StringNBT("Sherman"));
			stack.setTagInfo("title", new StringNBT("Thaumonomicon"));
			stack.setTagInfo("pages", nbt);
		}
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Minecraft.getInstance().displayGuiScreen(new ReadBookScreen(new ReadBookScreen.WrittenBookInfo(itemstack)));
		playerIn.addStat(Stats.ITEM_USED.get(this));
		return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
	}

	public static boolean resolveContents(ItemStack stack, @Nullable CommandSource resolvingSource, @Nullable PlayerEntity resolvingPlayer) {
		CompoundNBT compoundnbt = stack.getTag();
		if (compoundnbt != null && !compoundnbt.getBoolean("resolved")) {
			compoundnbt.putBoolean("resolved", true);
			if (!validBookTagContents(compoundnbt)) {
				return false;
			} else {
				ListNBT listnbt = compoundnbt.getList("pages", 8);
				
				for(int i = 0; i < listnbt.size(); ++i) {
					String s = listnbt.getString(i);
	               
					ITextComponent itextcomponent;
					try {
						itextcomponent = ITextComponent.Serializer.fromJsonLenient(s);
						itextcomponent = TextComponentUtils.updateForEntity(resolvingSource, itextcomponent, resolvingPlayer, 0);
					} catch (Exception var9) {
						itextcomponent = new StringTextComponent(s);
					}
					
					listnbt.set(i, (INBT)(new StringNBT(ITextComponent.Serializer.toJson(itextcomponent))));
				}
				
				compoundnbt.put("pages", listnbt);
				return true;
		        }
		} else {
			return false;
		}
	}
}