package kineticdevelopment.arcana.common.utils;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SubItemPropertyGetter implements IItemPropertyGetter {
    @Override
    public float call(ItemStack is, @Nullable World w, @Nullable LivingEntity e) {
        return is.getDamage();
    }
}
