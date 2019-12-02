package kineticdevelopment.arcana.common.utils.damagesource;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class SpellDamage extends EntityDamageSource {

    public SpellDamage(String damageTypeIn, @Nullable Entity damageSourceEntityIn) {
        super(damageTypeIn, damageSourceEntityIn);
    }


    @Override
    public ITextComponent getDeathMessage(LivingEntity entity) {
        ItemStack itemstack = this.damageSourceEntity instanceof LivingEntity ? ((LivingEntity)this.damageSourceEntity).getHeldItemMainhand() : ItemStack.EMPTY;
        String s = "death.attack." + this.damageType;
        String s1 = itemstack.getTag() == null ? "A spell" : itemstack.getTag().getCompound("spell").getString("name");
        return new TranslationTextComponent(s, entity.getDisplayName(), this.damageSourceEntity.getDisplayName(), s1);
    }
}
