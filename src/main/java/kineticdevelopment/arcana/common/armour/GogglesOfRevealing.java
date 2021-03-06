package kineticdevelopment.arcana.common.armour;

import java.util.List;

import javax.annotation.Nullable;

import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GogglesOfRevealing extends ResearchGogglesHelmet {


    public GogglesOfRevealing(String name, IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(name, materialIn, slot, builder);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 0;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return false;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return Constants.MOD_ID + ":textures/item/aspect_goggles_layer_1.png";
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent(TextFormatting.RED + "For Finding Nodes and other Magical Items!"));
    }

    @Override
    public GogglesPriority getPriority() {
        return GogglesPriority.SHOW_NODE_AND_ASPECTS;
    }
}
