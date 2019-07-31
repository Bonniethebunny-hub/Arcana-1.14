package net.kineticdevelopment.arcana.utilities.renderers.models;

import net.minecraft.client.renderer.entity.model.AbstractZombieModel;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TaintedZombieModel<T extends MonsterEntity> extends AbstractZombieModel<T> {
    public TaintedZombieModel() {
        this(0.0F, false);
    }

    public TaintedZombieModel(float modelSize, boolean p_i1168_2_) {
        super(modelSize, 0.0F, 64, p_i1168_2_ ? 32 : 64);
    }

    protected TaintedZombieModel(float p_i48914_1_, float p_i48914_2_, int p_i48914_3_, int p_i48914_4_) {
        super(p_i48914_1_, p_i48914_2_, p_i48914_3_, p_i48914_4_);
    }

    public boolean func_212850_a_(T p_212850_1_) {
        return p_212850_1_.isAggressive();
    }
}
