package net.kineticdevelopment.arcana.client.models;


import net.kineticdevelopment.arcana.common.entities.WizardVillager;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WizardVillagerModel extends VillagerModel<WizardVillager>
{

    public WizardVillagerModel(float scale) {
        super(scale);
    }
}
