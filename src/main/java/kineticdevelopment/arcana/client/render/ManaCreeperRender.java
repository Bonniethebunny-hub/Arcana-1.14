package kineticdevelopment.arcana.client.render;

import com.mojang.blaze3d.platform.GlStateManager;
import kineticdevelopment.arcana.client.models.ManaCreeperModel;
import kineticdevelopment.arcana.common.entities.ManaCreeper;
import kineticdevelopment.arcana.init.item_entities.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;
@OnlyIn(Dist.CLIENT)
public class ManaCreeperRender extends MobRenderer<ManaCreeper, ManaCreeperModel> {

    public ManaCreeperRender(EntityRendererManager manager) {
        super(manager, new ManaCreeperModel(), 02f);

    }

    @Override
    protected ResourceLocation getEntityTexture(ManaCreeper entity) {
        return ModItems.location("textures/entity/mana_creeper.png");
    }

    public static class RenderFactory implements IRenderFactory<ManaCreeper> {
        @Override
        public EntityRenderer<? super ManaCreeper> createRenderFor(EntityRendererManager manager) {
            return new ManaCreeperRender(manager);
        }
    }



}


