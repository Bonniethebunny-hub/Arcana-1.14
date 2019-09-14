package net.kineticdevelopment.arcana.client.models.sins;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GreedModel<T extends Entity> extends EntityModel<T> {
    public RendererModel Body;
    public RendererModel Head;
    public RendererModel ChainMail;
    public RendererModel Buckle;
    public RendererModel Pelvis;
    public RendererModel LeftHand;
    public RendererModel RightHand;
    public RendererModel LeftLeg;
    public RendererModel RightLeg;
    public RendererModel BagLid;
    public RendererModel BagSublid;
    public RendererModel BagBag;
    public RendererModel BagBottom;
    public RendererModel TophatLid;
    public RendererModel Tophat;
    public RendererModel Monocle;
    public RendererModel LeftHornTop;
    public RendererModel LeftHornBot;
    public RendererModel RightHornTop;
    public RendererModel RightHornBot;

    public GreedModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BagLid = new RendererModel(this, 40, 15);
        this.BagLid.setRotationPoint(-3.5F, 6.0F, -11.5F);
        this.BagLid.addBox(0.0F, 0.0F, 0.0F, 6, 2, 6, 0.0F);
        this.BagBag = new RendererModel(this, 36, 50);
        this.BagBag.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BagBag.addBox(-0.5F, 3.0F, -0.5F, 7, 7, 7, 0.0F);
        this.Monocle = new RendererModel(this, 11, 0);
        this.Monocle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Monocle.addBox(0.0F, -4.0F, -4.5F, 4, 4, 1, 0.0F);
        this.RightHornBot = new RendererModel(this, 0, 24);
        this.RightHornBot.setRotationPoint(2.0F, -6.0F, 0.0F);
        this.RightHornBot.addBox(-5.5F, 3.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(RightHornBot, 0.0F, -0.4363323129985824F, 0.0F);
        this.LeftHand = new RendererModel(this, 32, 23);
        this.LeftHand.setRotationPoint(7.0F, 1.0F, 2.0F);
        this.LeftHand.addBox(-1.0F, 5.0F, -10.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(LeftHand, 0.3490658503988659F, 0.0F, 0.0F);
        this.TophatLid = new RendererModel(this, 0, 15);
        this.TophatLid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TophatLid.addBox(-4.0F, -7.5F, -4.0F, 8, 1, 8, 0.0F);
        this.Pelvis = new RendererModel(this, 0, 33);
        this.Pelvis.setRotationPoint(0.0F, 8.5F, -1.5F);
        this.Pelvis.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(Pelvis, -0.7853981633974483F, 0.0F, 0.0F);
        this.Tophat = new RendererModel(this, 0, 40);
        this.Tophat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tophat.addBox(-3.0F, -13.0F, -3.0F, 6, 6, 6, 0.0F);
        this.BagBottom = new RendererModel(this, 6, 24);
        this.BagBottom.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.BagBottom.addBox(0.0F, 0.0F, 0.0F, 6, 2, 6, 0.0F);
        this.BagSublid = new RendererModel(this, 44, 44);
        this.BagSublid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BagSublid.addBox(0.5F, 2.0F, 0.5F, 5, 1, 5, 0.0F);
        this.Body = new RendererModel(this, 0, 5);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -3.0F, 8, 4, 6, 0.0F);
        this.setRotateAngle(Body, 0.6108652381980153F, 0.0F, 0.0F);
        this.ChainMail = new RendererModel(this, 34, 7);
        this.ChainMail.setRotationPoint(-3.0F, 4.0F, -2.0F);
        this.ChainMail.addBox(0.0F, 0.0F, 0.0F, 6, 4, 4, 0.0F);
        this.RightHand = new RendererModel(this, 32, 23);
        this.RightHand.setRotationPoint(-7.0F, 1.0F, 2.0F);
        this.RightHand.addBox(-2.0F, 5.0F, -10.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(RightHand, 0.3490658503988659F, 0.0F, 0.0F);
        this.RightHornTop = new RendererModel(this, 0, 24);
        this.RightHornTop.setRotationPoint(2.0F, -6.0F, 0.0F);
        this.RightHornTop.addBox(-5.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(RightHornTop, 0.0F, -0.4363323129985824F, 0.0F);
        this.RightLeg = new RendererModel(this, 32, 23);
        this.RightLeg.mirror = true;
        this.RightLeg.setRotationPoint(-2.0F, 9.0F, -4.0F);
        this.RightLeg.addBox(-2.0F, 4.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(RightLeg, -1.5707963267948966F, 0.0F, 0.0F);
        this.LeftLeg = new RendererModel(this, 32, 23);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(2.0F, 9.0F, -4.0F);
        this.LeftLeg.addBox(-1.0F, 4.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(LeftLeg, -1.5707963267948966F, 0.0F, 0.0F);
        this.Head = new RendererModel(this, 0, 52);
        this.Head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addBox(-3.0F, -7.0F, -3.0F, 6, 6, 6, 0.0F);
        this.LeftHornBot = new RendererModel(this, 0, 24);
        this.LeftHornBot.setRotationPoint(2.0F, -6.0F, 0.0F);
        this.LeftHornBot.addBox(-0.5F, 3.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(LeftHornBot, 0.0F, 0.4363323129985824F, 0.0F);
        this.Buckle = new RendererModel(this, 0, 0);
        this.Buckle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Buckle.addBox(-2.0F, 2.0F, -3.5F, 4, 4, 1, 0.0F);
        this.LeftHornTop = new RendererModel(this, 0, 24);
        this.LeftHornTop.setRotationPoint(2.0F, -6.0F, 0.0F);
        this.LeftHornTop.addBox(-0.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(LeftHornTop, 0.0F, 0.4363323129985824F, 0.0F);
        this.RightHand.addChild(this.BagLid);
        this.BagLid.addChild(this.BagBag);
        this.Head.addChild(this.Monocle);
        this.Head.addChild(this.RightHornBot);
        this.Body.addChild(this.LeftHand);
        this.Head.addChild(this.TophatLid);
        this.Body.addChild(this.Pelvis);
        this.Head.addChild(this.Tophat);
        this.BagLid.addChild(this.BagBottom);
        this.BagLid.addChild(this.BagSublid);
        this.Body.addChild(this.ChainMail);
        this.Body.addChild(this.RightHand);
        this.Head.addChild(this.RightHornTop);
        this.Body.addChild(this.RightLeg);
        this.Body.addChild(this.LeftLeg);
        this.Head.addChild(this.LeftHornBot);
        this.Body.addChild(this.Buckle);
        this.Head.addChild(this.LeftHornTop);
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
