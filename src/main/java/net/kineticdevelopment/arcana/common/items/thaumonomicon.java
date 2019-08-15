package net.kineticdevelopment.arcana.common.items;

import net.kineticdevelopment.arcana.client.gui.GuiThaumonomicon;
import net.kineticdevelopment.arcana.common.creativetab.ModTabGroups;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;

public class thaumonomicon extends Item {
    public thaumonomicon() {
        super(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)
            .maxStackSize(1));

        setRegistryName("thaumonomicon");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            NetworkHooks.openGui((ServerPlayerEntity) playerIn, new GuiThaumonomicon());
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent(TextFormatting.RED + "OPEN ME NOW PEASANT!"));
    }
}