package net.kineticdevelopment.arcana.client.models.sins;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PrideModel<T extends Entity> extends EntityModel<T> {
    public RendererModel Body;
    public RendererModel Head;
    public RendererModel BodyBottom;
    public RendererModel ChainMail;
    public RendererModel ChainMailBottom;
    public RendererModel ArmorPlateTop;
    public RendererModel ArmorPlateBottom;
    public RendererModel LeftShoulderPad;
    public RendererModel RightShoulderPad;
    public RendererModel Cape;
    public RendererModel CapeBottom;
    public RendererModel CapeRight;
    public RendererModel CapeRight_1;
    public RendererModel CapeRightBottom;
    public RendererModel CapeRightBottom_1;
    public RendererModel FangLeft;
    public RendererModel FangRight;
    public RendererModel HornTopLeft;
    public RendererModel HornTopLeft_1;
    public RendererModel CrownBase;
    public RendererModel HornBottomLeft;
    public RendererModel HornBottomLeft_1;
    public RendererModel CrownSpikeFrontLeft;
    public RendererModel CrownSpikeFrontRight;
    public RendererModel CrownSpikeLeft;
    public RendererModel CrownSpikeRight;
    public RendererModel CrownSpikeRightBack;
    public RendererModel CrownSpikeLeftBack;

    public PrideModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.CapeRightBottom_1 = new RendererModel(this, 22, 53);
        this.CapeRightBottom_1.mirror = true;
        this.CapeRightBottom_1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.CapeRightBottom_1.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(CapeRightBottom_1, 0.17453292519943295F, 0.0F, 0.0F);
        this.Body = new RendererModel(this, 38, 12);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.5F, 8, 4, 5, 0.0F);
        this.HornTopLeft = new RendererModel(this, 30, 14);
        this.HornTopLeft.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.HornTopLeft.addBox(-2.0F, -8.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(HornTopLeft, -0.2617993877991494F, 0.3490658503988659F, 1.0471975511965976F);
        this.ArmorPlateTop = new RendererModel(this, 50, 0);
        this.ArmorPlateTop.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.ArmorPlateTop.addBox(-3.0F, 1.5F, -0.5F, 6, 6, 1, 0.0F);
        this.setRotateAngle(ArmorPlateTop, -0.17453292519943295F, 0.0F, 0.0F);
        this.HornTopLeft_1 = new RendererModel(this, 30, 14);
        this.HornTopLeft_1.mirror = true;
        this.HornTopLeft_1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.HornTopLeft_1.addBox(0.0F, -8.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(HornTopLeft_1, -0.2617993877991494F, -0.3490658503988659F, -1.0471975511965976F);
        this.ChainMailBottom = new RendererModel(this, 42, 27);
        this.ChainMailBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChainMailBottom.addBox(-2.0F, 8.0F, -1.25F, 4, 5, 3, 0.0F);
        this.ChainMail = new RendererModel(this, 42, 21);
        this.ChainMail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChainMail.addBox(-3.5F, 1.0F, -2.0F, 7, 10, 4, 0.0F);
        this.HornBottomLeft_1 = new RendererModel(this, 0, 0);
        this.HornBottomLeft_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HornBottomLeft_1.addBox(-1.0F, 3.0F, -2.0F, 2, 4, 1, 0.0F);
        this.Cape = new RendererModel(this, 0, 42);
        this.Cape.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.Cape.addBox(-4.5F, 0.0F, 0.0F, 9, 10, 1, 0.0F);
        this.setRotateAngle(Cape, 0.17453292519943295F, 0.0F, 0.0F);
        this.LeftShoulderPad = new RendererModel(this, 0, 35);
        this.LeftShoulderPad.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftShoulderPad.addBox(3.0F, 0.6F, -2.0F, 4, 3, 4, 0.0F);
        this.CrownSpikeLeft = new RendererModel(this, 18, 0);
        this.CrownSpikeLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeLeft.addBox(2.5F, -1.5F, -3.5F, 1, 1, 1, 0.0F);
        this.CapeRight = new RendererModel(this, 22, 42);
        this.CapeRight.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.CapeRight.addBox(-4.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(CapeRight, 0.0F, -1.0471975511965976F, 0.0F);
        this.CapeBottom = new RendererModel(this, 0, 53);
        this.CapeBottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.CapeBottom.addBox(-4.5F, 0.0F, 0.0F, 9, 10, 1, 0.0F);
        this.setRotateAngle(CapeBottom, 0.17453292519943295F, 0.0F, 0.0F);
        this.CrownBase = new RendererModel(this, 24, 0);
        this.CrownBase.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.CrownBase.addBox(-3.5F, -0.5F, -3.5F, 7, 2, 7, 0.0F);
        this.CrownSpikeFrontRight = new RendererModel(this, 18, 0);
        this.CrownSpikeFrontRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeFrontRight.addBox(-1.8F, -2.0F, -4.0F, 1, 2, 1, 0.0F);
        this.HornBottomLeft = new RendererModel(this, 0, 0);
        this.HornBottomLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HornBottomLeft.addBox(-1.0F, 3.0F, -2.0F, 2, 4, 1, 0.0F);
        this.FangLeft = new RendererModel(this, 18, 0);
        this.FangLeft.setRotationPoint(2.0F, -2.0F, -2.0F);
        this.FangLeft.addBox(-1.5F, 0.0F, -1.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(FangLeft, -0.04363323129985824F, 0.0F, 0.0F);
        this.Head = new RendererModel(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Head.addBox(-3.0F, -7.0F, -3.0F, 6, 6, 6, 0.0F);
        this.ArmorPlateBottom = new RendererModel(this, 54, 7);
        this.ArmorPlateBottom.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.ArmorPlateBottom.addBox(-2.0F, 1.0F, -1.0F, 4, 4, 1, 0.0F);
        this.setRotateAngle(ArmorPlateBottom, 0.17453292519943295F, 0.0F, 0.0F);
        this.CapeRightBottom = new RendererModel(this, 22, 53);
        this.CapeRightBottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.CapeRightBottom.addBox(-4.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(CapeRightBottom, 0.17453292519943295F, 0.0F, 0.0F);
        this.FangRight = new RendererModel(this, 18, 0);
        this.FangRight.setRotationPoint(-1.5F, -2.0F, -2.0F);
        this.FangRight.addBox(0.0F, 0.0F, -1.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(FangRight, -0.04363323129985824F, 0.0F, 0.0F);
        this.CrownSpikeFrontLeft = new RendererModel(this, 18, 0);
        this.CrownSpikeFrontLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeFrontLeft.addBox(0.8F, -2.0F, -4.0F, 1, 2, 1, 0.0F);
        this.CapeRight_1 = new RendererModel(this, 22, 42);
        this.CapeRight_1.mirror = true;
        this.CapeRight_1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.CapeRight_1.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(CapeRight_1, 0.0F, 1.0471975511965976F, 0.0F);
        this.CrownSpikeRightBack = new RendererModel(this, 18, 0);
        this.CrownSpikeRightBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeRightBack.addBox(-3.5F, -1.5F, 2.5F, 1, 1, 1, 0.0F);
        this.CrownSpikeRight = new RendererModel(this, 18, 0);
        this.CrownSpikeRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeRight.addBox(-3.5F, -1.5F, -3.5F, 1, 1, 1, 0.0F);
        this.BodyBottom = new RendererModel(this, 46, 35);
        this.BodyBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyBottom.addBox(-3.0F, 4.0F, -1.5F, 6, 8, 3, 0.0F);
        this.CrownSpikeLeftBack = new RendererModel(this, 18, 0);
        this.CrownSpikeLeftBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownSpikeLeftBack.addBox(2.5F, -1.5F, 2.5F, 1, 1, 1, 0.0F);
        this.RightShoulderPad = new RendererModel(this, 0, 35);
        this.RightShoulderPad.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightShoulderPad.addBox(-7.0F, 0.5F, -2.0F, 4, 3, 4, 0.0F);
        this.CapeRight_1.addChild(this.CapeRightBottom_1);
        this.Head.addChild(this.HornTopLeft);
        this.Body.addChild(this.ArmorPlateTop);
        this.Head.addChild(this.HornTopLeft_1);
        this.Body.addChild(this.ChainMailBottom);
        this.Body.addChild(this.ChainMail);
        this.HornTopLeft_1.addChild(this.HornBottomLeft_1);
        this.Body.addChild(this.Cape);
        this.Body.addChild(this.LeftShoulderPad);
        this.CrownBase.addChild(this.CrownSpikeLeft);
        this.Cape.addChild(this.CapeRight);
        this.Cape.addChild(this.CapeBottom);
        this.Head.addChild(this.CrownBase);
        this.CrownBase.addChild(this.CrownSpikeFrontRight);
        this.HornTopLeft.addChild(this.HornBottomLeft);
        this.Head.addChild(this.FangLeft);
        this.Body.addChild(this.ArmorPlateBottom);
        this.CapeRight.addChild(this.CapeRightBottom);
        this.Head.addChild(this.FangRight);
        this.CrownBase.addChild(this.CrownSpikeFrontLeft);
        this.Cape.addChild(this.CapeRight_1);
        this.CrownBase.addChild(this.CrownSpikeRightBack);
        this.CrownBase.addChild(this.CrownSpikeRight);
        this.Body.addChild(this.BodyBottom);
        this.CrownBase.addChild(this.CrownSpikeLeftBack);
        this.Body.addChild(this.RightShoulderPad);
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
