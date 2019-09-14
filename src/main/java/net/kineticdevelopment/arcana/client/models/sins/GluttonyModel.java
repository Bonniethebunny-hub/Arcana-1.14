package net.kineticdevelopment.arcana.client.models.sins;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GluttonyModel<T extends Entity> extends EntityModel<T> {
    public RendererModel Body;
    public RendererModel LeftArm;
    public RendererModel ChainMail;
    public RendererModel BeltFront;
    public RendererModel BeltBack;
    public RendererModel BeltBuckle;
    public RendererModel Head;
    public RendererModel RightArm;
    public RendererModel HornRight;
    public RendererModel HornLeft;
    public RendererModel RightArmConneciton;
    public RendererModel RightHand;
    public RendererModel KnifeBlade;
    public RendererModel Knife;
    public RendererModel LeftArmConneciton;
    public RendererModel LeftHand;
    public RendererModel Fork;
    public RendererModel ForkBotSpike;
    public RendererModel ForkTopSpike;

    public GluttonyModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.HornRight = new RendererModel(this, 52, 0);
        this.HornRight.setRotationPoint(-4.0F, -7.0F, 0.0F);
        this.HornRight.addBox(-3.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(HornRight, 0.0F, 0.0F, 0.17453292519943295F);
        this.RightArmConneciton = new RendererModel(this, 0, 44);
        this.RightArmConneciton.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArmConneciton.addBox(-1.0F, 1.5F, -1.0F, 3, 3, 3, 0.0F);
        this.ChainMail = new RendererModel(this, 0, 39);
        this.ChainMail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChainMail.addBox(-5.0F, 9.0F, -4.0F, 10, 5, 8, 0.0F);
        this.BeltBack = new RendererModel(this, 32, 62);
        this.BeltBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltBack.addBox(-7.5F, 8.0F, 5.5F, 15, 1, 1, 0.0F);
        this.Head = new RendererModel(this, 0, 52);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -7.0F, -3.0F, 8, 6, 6, 0.0F);
        this.LeftHand = new RendererModel(this, 0, 22);
        this.LeftHand.mirror = true;
        this.LeftHand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftHand.addBox(-2.5F, 4.5F, -2.0F, 4, 5, 5, 0.0F);
        this.Fork = new RendererModel(this, 40, 50);
        this.Fork.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fork.addBox(-1.0F, 7.0F, -7.0F, 1, 1, 11, 0.0F);
        this.Body = new RendererModel(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-7.0F, 0.0F, -6.0F, 14, 10, 12, 0.0F);
        this.KnifeBlade = new RendererModel(this, 54, 56);
        this.KnifeBlade.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KnifeBlade.addBox(0.0F, 8.0F, -7.0F, 1, 1, 4, 0.0F);
        this.LeftArmConneciton = new RendererModel(this, 0, 44);
        this.LeftArmConneciton.mirror = true;
        this.LeftArmConneciton.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArmConneciton.addBox(-2.0F, 1.5F, -1.0F, 3, 3, 3, 0.0F);
        this.BeltBuckle = new RendererModel(this, 0, 0);
        this.BeltBuckle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltBuckle.addBox(-2.0F, 7.0F, -7.1F, 4, 3, 1, 0.0F);
        this.Knife = new RendererModel(this, 40, 50);
        this.Knife.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knife.addBox(0.0F, 7.0F, -7.0F, 1, 1, 11, 0.0F);
        this.BeltFront = new RendererModel(this, 32, 62);
        this.BeltFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltFront.addBox(-7.5F, 8.0F, -6.5F, 15, 1, 1, 0.0F);
        this.LeftArm = new RendererModel(this, 46, 4);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-2.5F, -1.5F, -2.0F, 4, 3, 5, 0.0F);
        this.HornLeft = new RendererModel(this, 52, 0);
        this.HornLeft.mirror = true;
        this.HornLeft.setRotationPoint(4.0F, -7.0F, 0.0F);
        this.HornLeft.addBox(-1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(HornLeft, 0.0F, 0.0F, -0.17453292519943295F);
        this.RightHand = new RendererModel(this, 0, 22);
        this.RightHand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightHand.addBox(-1.5F, 4.5F, -2.0F, 4, 5, 5, 0.0F);
        this.RightArm = new RendererModel(this, 46, 4);
        this.RightArm.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-1.5F, -1.5F, -2.0F, 4, 3, 5, 0.0F);
        this.ForkBotSpike = new RendererModel(this, 56, 52);
        this.ForkBotSpike.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForkBotSpike.addBox(-1.0F, 8.0F, -6.0F, 1, 1, 3, 0.0F);
        this.ForkTopSpike = new RendererModel(this, 56, 52);
        this.ForkTopSpike.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForkTopSpike.addBox(-1.0F, 6.0F, -6.0F, 1, 1, 3, 0.0F);
        this.Head.addChild(this.HornRight);
        this.RightArm.addChild(this.RightArmConneciton);
        this.Body.addChild(this.ChainMail);
        this.Body.addChild(this.BeltBack);
        this.Body.addChild(this.Head);
        this.LeftArm.addChild(this.LeftHand);
        this.LeftArm.addChild(this.Fork);
        this.RightArm.addChild(this.KnifeBlade);
        this.LeftArm.addChild(this.LeftArmConneciton);
        this.Body.addChild(this.BeltBuckle);
        this.RightArm.addChild(this.Knife);
        this.Body.addChild(this.BeltFront);
        this.Head.addChild(this.HornLeft);
        this.RightArm.addChild(this.RightHand);
        this.Body.addChild(this.RightArm);
        this.LeftArm.addChild(this.ForkBotSpike);
        this.Fork.addChild(this.ForkTopSpike);
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
        this.Body.render(scale);
        this.LeftArm.render(scale);
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
