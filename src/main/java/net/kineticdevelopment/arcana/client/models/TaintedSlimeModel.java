package net.kineticdevelopment.arcana.client.models;

import net.kineticdevelopment.arcana.common.entities.TaintedSlime;
import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TaintedSlimeModel extends SlimeModel<TaintedSlime>
{

    public TaintedSlimeModel(int slimeBodyTexOffY) {
        super(slimeBodyTexOffY);
    }
}
