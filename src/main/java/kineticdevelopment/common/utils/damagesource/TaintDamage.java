package kineticdevelopment.common.utils.damagesource;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class TaintDamage extends DamageSource {
    public static DamageSource Taint = new DamageSource("Taint");

    public TaintDamage (String damageTypeIn) {
        super(damageTypeIn);
    }

    @Override
    public ITextComponent getDeathMessage(LivingEntity entity) {
        String s = "death.attack." + this.damageType;
        String s1 = s + ".player";
        return new TranslationTextComponent(s1, entity.getDisplayName());
    }
}
