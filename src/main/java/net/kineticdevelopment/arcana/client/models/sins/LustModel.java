package net.kineticdevelopment.arcana.client.models.sins;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LustModel<T extends Entity> extends EntityModel<T> {
    public RendererModel Body;
    public RendererModel TunicFront;
    public RendererModel TunicBack;
    public RendererModel Belt;
    public RendererModel LeftShoulder;
    public RendererModel RightShoulder;
    public RendererModel Head;
    public RendererModel BeltBuckle;
    public RendererModel TunicBottomFront;
    public RendererModel TunicBottomBack;
    public RendererModel TunicBottomLeft;
    public RendererModel TunicBottomRight;
    public RendererModel LeftArm;
    public RendererModel LeftSleeve;
    public RendererModel RightArm;
    public RendererModel RightSleeve;
    public RendererModel Hair;
    public RendererModel HairFrontLeft;
    public RendererModel HairFrontRight;
    public RendererModel HairLeft;
    public RendererModel HairRight;
    public RendererModel HairBack;
    public RendererModel HornFrontRight;
    public RendererModel HornBackRight;
    public RendererModel HornFrontLeft;
    public RendererModel HornBackLeft;

    public LustModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LeftShoulder = new RendererModel(this, 0, 33);
        this.LeftShoulder.setRotationPoint(5.0F, 0.0F, -0.5F);
        this.LeftShoulder.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.RightShoulder = new RendererModel(this, 0, 33);
        this.RightShoulder.mirror = true;
        this.RightShoulder.setRotationPoint(-5.0F, 0.0F, -0.5F);
        this.RightShoulder.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.TunicBack = new RendererModel(this, 52, 17);
        this.TunicBack.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.TunicBack.addBox(-2.0F, 0.0F, -1.0F, 4, 9, 2, 0.0F);
        this.setRotateAngle(TunicBack, -0.12217304763960307F, 0.0F, 0.0F);
        this.Belt = new RendererModel(this, 36, 0);
        this.Belt.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Belt.addBox(-3.5F, -0.5F, -2.5F, 7, 1, 4, 0.0F);
        this.RightArm = new RendererModel(this, 24, 8);
        this.RightArm.mirror = true;
        this.RightArm.setRotationPoint(0.5F, 2.0F, 0.5F);
        this.RightArm.addBox(-1.5F, 0.0F, -1.5F, 2, 2, 2, 0.0F);
        this.Hair = new RendererModel(this, 0, 13);
        this.Hair.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair.addBox(-2.5F, -9.0F, -2.5F, 5, 7, 6, 0.0F);
        this.HairFrontRight = new RendererModel(this, 46, 41);
        this.HairFrontRight.mirror = true;
        this.HairFrontRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HairFrontRight.addBox(-2.0F, -8.5F, -3.6F, 3, 2, 2, 0.0F);
        this.setRotateAngle(HairFrontRight, 0.0F, 0.0F, -0.12217304763960307F);
        this.LeftArm = new RendererModel(this, 24, 8);
        this.LeftArm.setRotationPoint(0.5F, 2.0F, 0.5F);
        this.LeftArm.addBox(-1.5F, 0.0F, -1.5F, 2, 2, 2, 0.0F);
        this.TunicBottomLeft = new RendererModel(this, 39, 19);
        this.TunicBottomLeft.mirror = true;
        this.TunicBottomLeft.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.TunicBottomLeft.addBox(-1.5F, 0.0F, -2.0F, 2, 9, 3, 0.0F);
        this.setRotateAngle(TunicBottomLeft, 0.0F, 0.0F, -0.12217304763960307F);
        this.TunicBottomRight = new RendererModel(this, 39, 19);
        this.TunicBottomRight.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.TunicBottomRight.addBox(-0.5F, 0.0F, -2.0F, 2, 9, 3, 0.0F);
        this.setRotateAngle(TunicBottomRight, 0.0F, 0.0F, 0.12217304763960307F);
        this.TunicBottomFront = new RendererModel(this, 46, 28);
        this.TunicBottomFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TunicBottomFront.addBox(-3.0F, 0.0F, -2.0F, 6, 10, 3, 0.0F);
        this.setRotateAngle(TunicBottomFront, -0.12217304763960307F, 0.0F, 0.0F);
        this.HairFrontLeft = new RendererModel(this, 46, 41);
        this.HairFrontLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HairFrontLeft.addBox(-1.0F, -8.5F, -3.6F, 3, 2, 2, 0.0F);
        this.setRotateAngle(HairFrontLeft, 0.0F, 0.0F, 0.12217304763960307F);
        this.HairRight = new RendererModel(this, 31, 50);
        this.HairRight.mirror = true;
        this.HairRight.setRotationPoint(-3.0F, -8.0F, 0.0F);
        this.HairRight.addBox(0.0F, -0.5F, -3.5F, 1, 7, 7, 0.0F);
        this.setRotateAngle(HairRight, 0.0F, 0.0F, 0.17453292519943295F);
        this.BeltBuckle = new RendererModel(this, 54, 0);
        this.BeltBuckle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltBuckle.addBox(-2.0F, -1.5F, -3.0F, 4, 3, 1, 0.0F);
        this.LeftSleeve = new RendererModel(this, 0, 53);
        this.LeftSleeve.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LeftSleeve.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.HairBack = new RendererModel(this, 0, 26);
        this.HairBack.setRotationPoint(0.0F, -8.0F, 3.0F);
        this.HairBack.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 1, 0.0F);
        this.setRotateAngle(HairBack, 0.08726646259971647F, 0.0F, 0.0F);
        this.HornFrontLeft = new RendererModel(this, 0, 1);
        this.HornFrontLeft.setRotationPoint(3.0F, -9.0F, -3.0F);
        this.HornFrontLeft.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HornFrontLeft, 0.0F, 0.0F, 0.17453292519943295F);
        this.TunicBottomBack = new RendererModel(this, 32, 6);
        this.TunicBottomBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TunicBottomBack.addBox(-2.0F, -0.5F, -2.0F, 4, 10, 3, 0.0F);
        this.setRotateAngle(TunicBottomBack, 0.12217304763960307F, 0.0F, 0.0F);
        this.HornBackLeft = new RendererModel(this, 0, 1);
        this.HornBackLeft.setRotationPoint(3.0F, -9.0F, 1.0F);
        this.HornBackLeft.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HornBackLeft, 0.0F, 0.0F, 0.17453292519943295F);
        this.HornFrontRight = new RendererModel(this, 0, 1);
        this.HornFrontRight.setRotationPoint(-3.0F, -9.0F, -3.0F);
        this.HornFrontRight.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HornFrontRight, 0.0F, 0.0F, -0.17453292519943295F);
        this.HairLeft = new RendererModel(this, 31, 50);
        this.HairLeft.setRotationPoint(3.0F, -8.0F, 0.0F);
        this.HairLeft.addBox(-1.0F, -0.5F, -3.5F, 1, 7, 7, 0.0F);
        this.setRotateAngle(HairLeft, 0.0F, 0.0F, -0.17453292519943295F);
        this.Body = new RendererModel(this, 18, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-2.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F);
        this.TunicFront = new RendererModel(this, 46, 5);
        this.TunicFront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.TunicFront.addBox(-3.0F, 0.0F, -1.0F, 6, 9, 3, 0.0F);
        this.setRotateAngle(TunicFront, 0.12217304763960307F, 0.0F, 0.0F);
        this.Head = new RendererModel(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addBox(-3.0F, -8.0F, -3.0F, 6, 6, 6, 0.0F);
        this.RightSleeve = new RendererModel(this, 0, 53);
        this.RightSleeve.mirror = true;
        this.RightSleeve.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RightSleeve.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.HornBackRight = new RendererModel(this, 0, 1);
        this.HornBackRight.setRotationPoint(-3.0F, -9.0F, 1.0F);
        this.HornBackRight.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HornBackRight, 0.0F, 0.0F, -0.17453292519943295F);
        this.Body.addChild(this.LeftShoulder);
        this.Body.addChild(this.RightShoulder);
        this.Body.addChild(this.TunicBack);
        this.Body.addChild(this.Belt);
        this.RightShoulder.addChild(this.RightArm);
        this.Head.addChild(this.Hair);
        this.Head.addChild(this.HairFrontRight);
        this.LeftShoulder.addChild(this.LeftArm);
        this.Belt.addChild(this.TunicBottomLeft);
        this.Belt.addChild(this.TunicBottomRight);
        this.Belt.addChild(this.TunicBottomFront);
        this.Head.addChild(this.HairFrontLeft);
        this.Head.addChild(this.HairRight);
        this.Belt.addChild(this.BeltBuckle);
        this.LeftShoulder.addChild(this.LeftSleeve);
        this.Head.addChild(this.HairBack);
        this.Head.addChild(this.HornFrontLeft);
        this.Belt.addChild(this.TunicBottomBack);
        this.Head.addChild(this.HornBackLeft);
        this.Head.addChild(this.HornFrontRight);
        this.Head.addChild(this.HairLeft);
        this.Body.addChild(this.TunicFront);
        this.Body.addChild(this.Head);
        this.RightShoulder.addChild(this.RightSleeve);
        this.Head.addChild(this.HornBackRight);
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
        this.Body.render(scale);
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
