package net.kineticdevelopment.arcana.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KoalaModel<T extends Entity> extends EntityModel<T> {
	private final RendererModel body;
	private final RendererModel arms;
	private final RendererModel heazd;
	private final RendererModel legs;

	public KoalaModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 17.5F, -0.5F);
		setRotationAngle(body, 0.6109F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 18, -2.5F, -5.5F, -0.5F, 5, 9, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 23, -1.0F, 2.5F, 2.0F, 2, 2, 2, 0.0F, false));

		arms = new RendererModel(this);
		arms.setRotationPoint(-3.0F, -2.5F, 0.5F);
		setRotationAngle(arms, -1.2217F, 0.0F, 0.0F);
		body.addChild(arms);
		arms.cubeList.add(new ModelBox(arms, 18, 29, -1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F, false));
		arms.cubeList.add(new ModelBox(arms, 18, 29, 5.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F, false));

		heazd = new RendererModel(this);
		heazd.setRotationPoint(0.0F, -9.125F, -0.375F);
		setRotationAngle(heazd, -0.5236F, 0.0F, 0.0F);
		body.addChild(heazd);
		heazd.cubeList.add(new ModelBox(heazd, 0, 0, -3.0F, -1.375F, -0.125F, 6, 5, 5, 0.0F, false));
		heazd.cubeList.add(new ModelBox(heazd, 0, 10, -1.0F, 0.125F, -0.625F, 2, 3, 1, 0.0F, false));
		heazd.cubeList.add(new ModelBox(heazd, 6, 10, -5.0F, -2.875F, 2.375F, 3, 3, 1, 0.0F, false));
		heazd.cubeList.add(new ModelBox(heazd, 6, 10, 2.0F, -2.875F, 2.375F, 3, 3, 1, 0.0F, true));

		legs = new RendererModel(this);
		legs.setRotationPoint(-2.5F, 3.0F, 1.5F);
		body.addChild(legs);
		legs.cubeList.add(new ModelBox(legs, 3, 33, -1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 3, 33, 5.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, true));
		legs.cubeList.add(new ModelBox(legs, 3, 40, -1.5F, 1.0F, -4.0F, 2, 1, 3, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 3, 40, 4.5F, 1.0F, -4.0F, 2, 1, 3, 0.0F, true));
	}
	
	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		body.render(scale);
	}
	
	public void setRotationAngle(RendererModel RendererModel, float x, float y, float z) {
		RendererModel.rotateAngleX = x;
		RendererModel.rotateAngleY = y;
		RendererModel.rotateAngleZ = z;
	}
}
