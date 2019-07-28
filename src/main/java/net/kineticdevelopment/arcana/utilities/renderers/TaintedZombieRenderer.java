package net.kineticdevelopment.arcana.utilities.renderers;

import net.kineticdevelopment.arcana.common.entities.TaintedZombie;
import net.kineticdevelopment.arcana.utilities.renderers.models.TaintedZombieModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TaintedZombieRenderer extends MobRenderer<TaintedZombie, TaintedZombieModel<TaintedZombie>> {
   private static final ResourceLocation MOB_TEXTURES = new ResourceLocation("arcana:textures/entity/taintedzombie.png");

   public TaintedZombieRenderer(EntityRendererManager renderManagerIn) {
      super(renderManagerIn, new TaintedZombieModel<>(), 0.5F);
   }

   protected ResourceLocation getEntityTexture(TaintedZombie entity) {
      return MOB_TEXTURES;
   }
}
