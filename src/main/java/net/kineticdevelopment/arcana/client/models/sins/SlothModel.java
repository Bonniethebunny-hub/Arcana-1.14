package net.kineticdevelopment.arcana.client.models.sins;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SlothModel<T extends Entity> extends EntityModel<T> {
    public RendererModel Body;
    public RendererModel Head;
    public RendererModel ChainMail;
    public RendererModel Buckle;
    public RendererModel SpineArmor;
    public RendererModel LeftShoulder;
    public RendererModel RightShoulder;
    public RendererModel ChainMailBottom;
    public RendererModel LeftArm;
    public RendererModel LeftHand;
    public RendererModel LeftHandDecorations;
    public RendererModel LeftFinger1;
    public RendererModel LeftFinger2;
    public RendererModel RightArm;
    public RendererModel RightHand;
    public RendererModel RightHandDecorations;
    public RendererModel RightFinger1;
    public RendererModel RightFinger2;
    public RendererModel Nose;
    public RendererModel RightCheek;
    public RendererModel LeftCheek;
    public RendererModel LeftHorn;
    public RendererModel RightHorn;
    public RendererModel LeftHorner;
    public RendererModel LeftHornest;
    public RendererModel RightHorner;
    public RendererModel RightHornest;

    public SlothModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightCheek = new RendererModel(this, 18, 0);
        this.RightCheek.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightCheek.addBox(2.0F, -2.5F, -3.5F, 2, 2, 1, 0.0F);
        this.Nose = new RendererModel(this, 0, 0);
        this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose.addBox(-1.0F, -2.5F, -3.5F, 2, 3, 1, 0.0F);
        this.LeftHorner = new RendererModel(this, 16, 12);
        this.LeftHorner.mirror = true;
        this.LeftHorner.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftHorner.addBox(3.5F, -1.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(LeftHorner, 0.0F, 0.0F, 0.6981317007977318F);
        this.RightHornest = new RendererModel(this, 0, 0);
        this.RightHornest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightHornest.addBox(-4.0F, 3.5F, -0.5F, 1, 1, 1, 0.0F);
        this.RightShoulder = new RendererModel(this, 10, 58);
        this.RightShoulder.setRotationPoint(-5.5F, 1.5F, 0.5F);
        this.RightShoulder.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightShoulder, -0.08726646259971647F, 0.0F, 0.0F);
        this.LeftHand = new RendererModel(this, 10, 49);
        this.LeftHand.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LeftHand.addBox(-1.5F, 0.0F, -1.0F, 3, 6, 3, 0.0F);
        this.RightFinger2 = new RendererModel(this, 0, 18);
        this.RightFinger2.setRotationPoint(-1.5F, 6.0F, 1.0F);
        this.RightFinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Buckle = new RendererModel(this, 0, 22);
        this.Buckle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Buckle.addBox(-2.0F, 7.5F, -1.0F, 4, 4, 1, 0.0F);
        this.LeftFinger1 = new RendererModel(this, 0, 18);
        this.LeftFinger1.setRotationPoint(0.5F, 6.0F, 1.0F);
        this.LeftFinger1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.LeftHorn = new RendererModel(this, 0, 12);
        this.LeftHorn.mirror = true;
        this.LeftHorn.setRotationPoint(2.0F, -7.0F, 0.0F);
        this.LeftHorn.addBox(-1.0F, -1.0F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(LeftHorn, 0.0F, 0.0F, -0.6981317007977318F);
        this.ChainMail = new RendererModel(this, 46, 55);
        this.ChainMail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChainMail.addBox(-3.0F, 6.0F, -0.5F, 6, 6, 3, 0.0F);
        this.RightHandDecorations = new RendererModel(this, 10, 45);
        this.RightHandDecorations.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightHandDecorations.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F);
        this.ChainMailBottom = new RendererModel(this, 46, 56);
        this.ChainMailBottom.setRotationPoint(-2.0F, 11.0F, 0.0F);
        this.ChainMailBottom.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.RightFinger1 = new RendererModel(this, 0, 18);
        this.RightFinger1.setRotationPoint(0.5F, 6.0F, 1.0F);
        this.RightFinger1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.RightHorner = new RendererModel(this, 16, 12);
        this.RightHorner.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightHorner.addBox(-4.5F, -1.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(RightHorner, 0.0F, 0.0F, -0.6981317007977318F);
        this.SpineArmor = new RendererModel(this, 0, 28);
        this.SpineArmor.setRotationPoint(-1.5F, 8.0F, 2.6F);
        this.SpineArmor.addBox(0.0F, -0.5F, -0.5F, 3, 3, 1, 0.0F);
        this.RightHorn = new RendererModel(this, 0, 12);
        this.RightHorn.setRotationPoint(-2.0F, -7.0F, 0.0F);
        this.RightHorn.addBox(-4.0F, -1.0F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(RightHorn, 0.0F, 0.0F, 0.6981317007977318F);
        this.LeftFinger2 = new RendererModel(this, 0, 18);
        this.LeftFinger2.setRotationPoint(-1.5F, 6.0F, 1.0F);
        this.LeftFinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.RightHand = new RendererModel(this, 10, 49);
        this.RightHand.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.RightHand.addBox(-1.5F, 0.0F, -1.0F, 3, 6, 3, 0.0F);
        this.LeftHornest = new RendererModel(this, 0, 0);
        this.LeftHornest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftHornest.addBox(3.0F, 3.5F, -0.5F, 1, 1, 1, 0.0F);
        this.LeftCheek = new RendererModel(this, 18, 0);
        this.LeftCheek.mirror = true;
        this.LeftCheek.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftCheek.addBox(-4.0F, -2.5F, -3.5F, 2, 2, 1, 0.0F);
        this.LeftShoulder = new RendererModel(this, 10, 58);
        this.LeftShoulder.setRotationPoint(5.5F, 1.5F, 0.5F);
        this.LeftShoulder.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LeftShoulder, -0.08726646259971647F, 0.0F, 0.0F);
        this.Body = new RendererModel(this, 22, 53);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -1.0F, 8, 7, 4, 0.0F);
        this.setRotateAngle(Body, 0.08726646259971647F, 0.0F, 0.0F);
        this.RightArm = new RendererModel(this, 6, 55);
        this.RightArm.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.LeftArm = new RendererModel(this, 6, 55);
        this.LeftArm.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.Head = new RendererModel(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-3.0F, -7.5F, -3.0F, 6, 6, 6, 0.0F);
        this.LeftHandDecorations = new RendererModel(this, 10, 45);
        this.LeftHandDecorations.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftHandDecorations.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F);
        this.Head.addChild(this.RightCheek);
        this.Head.addChild(this.Nose);
        this.LeftHorn.addChild(this.LeftHorner);
        this.RightHorner.addChild(this.RightHornest);
        this.Body.addChild(this.RightShoulder);
        this.LeftArm.addChild(this.LeftHand);
        this.RightHand.addChild(this.RightFinger2);
        this.Body.addChild(this.Buckle);
        this.LeftHand.addChild(this.LeftFinger1);
        this.Head.addChild(this.LeftHorn);
        this.Body.addChild(this.ChainMail);
        this.RightHand.addChild(this.RightHandDecorations);
        this.ChainMail.addChild(this.ChainMailBottom);
        this.RightHand.addChild(this.RightFinger1);
        this.RightHorn.addChild(this.RightHorner);
        this.Body.addChild(this.SpineArmor);
        this.Head.addChild(this.RightHorn);
        this.LeftHand.addChild(this.LeftFinger2);
        this.RightArm.addChild(this.RightHand);
        this.LeftHorner.addChild(this.LeftHornest);
        this.Head.addChild(this.LeftCheek);
        this.Body.addChild(this.LeftShoulder);
        this.RightShoulder.addChild(this.RightArm);
        this.LeftShoulder.addChild(this.LeftArm);
        this.LeftHand.addChild(this.LeftHandDecorations);
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
        this.Body.render(scale);
        this.Head.render(scale);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
