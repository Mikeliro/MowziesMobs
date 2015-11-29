package com.bobmowzie.mowziesmobs.client.model.entity;

import com.bobmowzie.mowziesmobs.client.model.tools.AdvancedModelRenderer;
import com.bobmowzie.mowziesmobs.client.model.tools.MowzieModelBase;
import com.bobmowzie.mowziesmobs.client.model.tools.MowzieModelRenderer;
import com.bobmowzie.mowziesmobs.common.entity.EntityTribeLeader;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import thehippomaster.AnimationAPI.AnimationAPI;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

/**
 * Tribe Leader - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelTribeLeader extends MowzieModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer chest;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer leftThigh;
    public MowzieModelRenderer neckJoint;
    public AdvancedModelRenderer rightArmJoint;
    public AdvancedModelRenderer leftArmJoint;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer headJoint;
    public MowzieModelRenderer head;
    public MowzieModelRenderer maskBase;
    public MowzieModelRenderer maskFace;
    public MowzieModelRenderer headdress1;
    public MowzieModelRenderer headdress2;
    public MowzieModelRenderer headdress3;
    public MowzieModelRenderer headdress4;
    public MowzieModelRenderer headdress5;
    public MowzieModelRenderer headdress6;
    public MowzieModelRenderer headdress7;
    public MowzieModelRenderer rightEar;
    public MowzieModelRenderer leftEar;
    public AdvancedModelRenderer maskMouth;
    public AdvancedModelRenderer forehead;
    public MowzieModelRenderer nose;
    public MowzieModelRenderer upperLip;
    public AdvancedModelRenderer jaw;
    public MowzieModelRenderer teethTop;
    public AdvancedModelRenderer lowerLip;
    public AdvancedModelRenderer leftLip;
    public AdvancedModelRenderer rightLip;
    public AdvancedModelRenderer teethBottom;
    public MowzieModelRenderer rightEarring;
    public MowzieModelRenderer leftEarring;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer rightHand;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer leftLowerArm;
    public MowzieModelRenderer leftHand;
    public MowzieModelRenderer rightCalf;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer leftCalf;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer jiggleController;
    public MowzieModelRenderer jawScaler;
    public MowzieModelRenderer mouthScalerX;
    public MowzieModelRenderer mouthScalerY;

    private Animator animator;

    public ModelTribeLeader() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        animator = new Animator(this);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 24.0F, -3.0F);
        this.body.addBox(-12.5F, -16.0F, -11.0F, 25, 16, 22, 0.0F);
        this.teethTop = new MowzieModelRenderer(this, 0, 120);
        this.teethTop.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.teethTop.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.maskBase = new MowzieModelRenderer(this, 0, 0);
        this.maskBase.setRotationPoint(0.0F, -5.0F, -6.0F);
        this.maskBase.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.leftEar = new MowzieModelRenderer(this, 38, 109);
        this.leftEar.mirror = true;
        this.leftEar.setRotationPoint(6.0F, -2.0F, 0.0F);
        this.leftEar.addBox(0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
        this.setRotateAngle(leftEar, 0.0F, -0.5235987755982988F, 0.0F);
        this.rightEarring = new MowzieModelRenderer(this, 0, 84);
        this.rightEarring.mirror = true;
        this.rightEarring.setRotationPoint(-2.5F, 6.0F, 1.0F);
        this.rightEarring.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 0, 0.0F);
        this.headdress3 = new MowzieModelRenderer(this, 27, 76);
        this.headdress3.mirror = true;
        this.headdress3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress3.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress3, 0.5235987755982988F, (float) Math.PI, 1.3962634015954636F);
        this.leftLowerArm = new MowzieModelRenderer(this, 56, 38);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(3.5F, 14.0F, 0.0F);
        this.leftLowerArm.addBox(-5.0F, 0.0F, -2.5F, 5, 11, 5, 0.0F);
        this.setRotateAngle(leftLowerArm, 0.0F, 0.0F, 1.2217304763960306F);
        this.rightCalf = new MowzieModelRenderer(this, 72, 0);
        this.rightCalf.setRotationPoint(0.0F, 14.0F, -4.0F);
        this.rightCalf.addBox(-3.0F, 0.0F, 0.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(rightCalf, 1.1838568316277536F, 0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 38, 88);
        this.rightUpperArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightUpperArm.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7, 0.0F);
        this.setRotateAngle(rightUpperArm, -1.2217304763960306F, 1.0471975511965976F, 0.0F);
        this.lowerLip = new AdvancedModelRenderer(this, 50, 124);
        this.lowerLip.mirror = true;
        this.lowerLip.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.lowerLip.addBox(-6.0F, 0.0F, -2.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(lowerLip, 0.0F, 0.0F, 3.141592653589793F);
        this.rightFoot = new MowzieModelRenderer(this, 83, 27);
        this.rightFoot.setRotationPoint(0.0F, 11.0F, 5.0F);
        this.rightFoot.addBox(-4.0F, -2.0F, -10.0F, 8, 4, 11, 0.0F);
        this.setRotateAngle(rightFoot, -0.17453292519943295F, 0.0F, 0.0F);
        this.headdress2 = new MowzieModelRenderer(this, 27, 76);
        this.headdress2.mirror = true;
        this.headdress2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress2.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress2, 0.5235987755982988F, (float) Math.PI, 0.6981317007977318F);
        this.neckJoint = new MowzieModelRenderer(this, 0, 0);
        this.neckJoint.setRotationPoint(0.0F, -8.0F, 10.0F);
        this.neckJoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(neckJoint, 0.2617993877991494F, 0.0F, 0.0F);
        this.rightThigh = new AdvancedModelRenderer(this, 39, 66);
        this.rightThigh.setRotationPoint(-8.5F, -4.0F, 4.0F);
        this.rightThigh.addBox(-4.0F, 0.0F, -4.0F, 8, 14, 8, 0.0F);
        this.setRotateAngle(rightThigh, -1.3962634015954636F, 0.6108652381980153F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 0, 62);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-3.0F, -7.5F, -4.0F, 6, 10, 7, 0.0F);
        this.setRotateAngle(neck, 0.3490658503988659F, 0.0F, 0.0F);
        this.headdress4 = new MowzieModelRenderer(this, 27, 76);
        this.headdress4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress4.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress4, 0.5235987755982988F, (float) Math.PI, -0.6981317007977318F);
        this.forehead = new AdvancedModelRenderer(this, 0, 122);
        this.forehead.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.forehead.addBox(-6.0F, -0.0F, -2.0F, 12, 4, 2, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 38, 88);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftUpperArm.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7, 0.0F);
        this.setRotateAngle(leftUpperArm, -1.2217304763960306F, -1.0471975511965976F, 0.0F);
        this.teethBottom = new AdvancedModelRenderer(this, 0, 120);
        this.teethBottom.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.teethBottom.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(teethBottom, 3.141592653589793F, 0.0F, -3.141592653589793F);
        this.headdress5 = new MowzieModelRenderer(this, 27, 76);
        this.headdress5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress5.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress5, 0.5235987755982988F, (float) Math.PI, -1.3962634015954636F);
        this.leftFoot = new MowzieModelRenderer(this, 83, 27);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.0F, 11.0F, 5.0F);
        this.leftFoot.addBox(-4.0F, -2.0F, -10.0F, 8, 4, 11, 0.0F);
        this.setRotateAngle(leftFoot, -0.17453292519943295F, 0.0F, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 56, 38);
        this.rightLowerArm.setRotationPoint(-3.5F, 14.0F, 0.0F);
        this.rightLowerArm.addBox(0.0F, 0.0F, -2.5F, 5, 11, 5, 0.0F);
        this.setRotateAngle(rightLowerArm, 0.0F, 0.0F, -1.2217304763960306F);
        this.leftCalf = new MowzieModelRenderer(this, 72, 0);
        this.leftCalf.mirror = true;
        this.leftCalf.setRotationPoint(0.0F, 14.0F, -4.0F);
        this.leftCalf.addBox(-3.0F, 0.0F, 0.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(leftCalf, 1.1838568316277536F, 0.0F, 0.0F);
        this.rightHand = new MowzieModelRenderer(this, 0, 43);
        this.rightHand.setRotationPoint(2.5F, 11.0F, 0.0F);
        this.rightHand.addBox(-3.0F, 0.0F, -1.5F, 6, 8, 3, 0.0F);
        this.setRotateAngle(rightHand, 1.0471975511965976F, 0.6981317007977318F, 0.0F);
        this.headdress1 = new MowzieModelRenderer(this, 27, 76);
        this.headdress1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress1.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress1, 0.5235987755982988F, (float) Math.PI, 0.0F);
        this.leftThigh = new AdvancedModelRenderer(this, 39, 66);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(8.5F, -4.0F, 4.0F);
        this.leftThigh.addBox(-4.0F, 0.0F, -4.0F, 8, 14, 8, 0.0F);
        this.setRotateAngle(leftThigh, -1.3962634015954636F, -0.6108652381980153F, 0.0F);
        this.jaw = new AdvancedModelRenderer(this, 48, 109);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addBox(-6.0F, 0.0F, 0.0F, 12, 4, 7, 0.01F);
        this.leftLip = new AdvancedModelRenderer(this, 26, 120);
        this.leftLip.mirror = true;
        this.leftLip.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.leftLip.addBox(-2.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.maskMouth = new AdvancedModelRenderer(this, 0, 0);
        this.maskMouth.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.maskMouth.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.nose = new MowzieModelRenderer(this, 34, 117);
        this.nose.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.nose.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(nose, -0.5235987755982988F, 0.0F, 0.0F);
        this.rightArmJoint = new AdvancedModelRenderer(this, 0, 0);
        this.rightArmJoint.setRotationPoint(-6.0F, -6.0F, 9.0F);
        this.rightArmJoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(rightArmJoint, 0.2617993877991494F, 0.0F, 0.0F);
        this.leftArmJoint = new AdvancedModelRenderer(this, 0, 0);
        this.leftArmJoint.setRotationPoint(6.0F, -6.0F, 9.0F);
        this.leftArmJoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(leftArmJoint, 0.2617993877991494F, 0.0F, 0.0F);
        this.headdress7 = new MowzieModelRenderer(this, 27, 76);
        this.headdress7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress7.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress7, 0.5235987755982988F, (float) Math.PI, -2.0943951023931953F);
        this.rightLip = new AdvancedModelRenderer(this, 26, 120);
        this.rightLip.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.rightLip.addBox(0.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.upperLip = new MowzieModelRenderer(this, 50, 124);
        this.upperLip.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.upperLip.addBox(-6.0F, -2.0F, 0.0F, 12, 2, 2, 0.0F);
        this.leftHand = new MowzieModelRenderer(this, 0, 43);
        this.leftHand.mirror = true;
        this.leftHand.setRotationPoint(-2.5F, 11.0F, 0.0F);
        this.leftHand.addBox(-3.0F, 0.0F, -1.5F, 6, 8, 3, 0.0F);
        this.setRotateAngle(leftHand, 1.0471975511965976F, -0.6981317007977318F, 0.0F);
        this.rightEar = new MowzieModelRenderer(this, 38, 109);
        this.rightEar.setRotationPoint(-6.0F, -2.0F, 0.0F);
        this.rightEar.addBox(-3.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
        this.setRotateAngle(rightEar, 0.0F, 0.5235987755982988F, 0.0F);
        this.headJoint = new MowzieModelRenderer(this, 0, 0);
        this.headJoint.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.headJoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(headJoint, -0.3490658503988659F, 0.0F, 0.0F);
        this.headdress6 = new MowzieModelRenderer(this, 27, 76);
        this.headdress6.mirror = true;
        this.headdress6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headdress6.addBox(-3.0F, -18.0F, 0.0F, 6, 12, 0, 0.0F);
        this.setRotateAngle(headdress6, 0.5235987755982988F, (float) Math.PI, 2.0943951023931953F);
        this.chest = new AdvancedModelRenderer(this, 2, 38);
        this.chest.setRotationPoint(0.0F, -16.0F, -7.0F);
        this.chest.addBox(-9.5F, -8.0F, 0.0F, 19, 8, 16, 0.0F);
        this.setRotateAngle(chest, -0.2617993877991494F, 0.0F, 0.0F);
        this.leftEarring = new MowzieModelRenderer(this, 0, 84);
        this.leftEarring.mirror = true;
        this.leftEarring.setRotationPoint(2.5F, 6.0F, 1.0F);
        this.leftEarring.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 0, 0.0F);
        this.maskFace = new MowzieModelRenderer(this, 0, 97);
        this.maskFace.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.maskFace.addBox(-6.0F, -6.0F, 0.0F, 12, 15, 7, 0.0F);
        this.head = new MowzieModelRenderer(this, 0, 79);
        this.head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);
        jiggleController = new MowzieModelRenderer(this, 0, 0);
        jiggleController.setRotationPoint(0, 0, 0);
        jawScaler = new MowzieModelRenderer(this, 0, 0);
        jawScaler.setRotationPoint(1, 0, 0);
        mouthScalerX = new MowzieModelRenderer(this, 0, 0);
        mouthScalerX.setRotationPoint(1, 0, 0);
        mouthScalerY = new MowzieModelRenderer(this, 0, 0);
        mouthScalerY.setRotationPoint(1, 0, 0);
        this.upperLip.addChild(this.teethTop);
        this.head.addChild(this.maskBase);
        this.maskBase.addChild(this.leftEar);
        this.rightEar.addChild(this.rightEarring);
        this.maskBase.addChild(this.headdress3);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.rightThigh.addChild(this.rightCalf);
        this.rightArmJoint.addChild(this.rightUpperArm);
        this.jaw.addChild(this.lowerLip);
        this.rightCalf.addChild(this.rightFoot);
        this.maskBase.addChild(this.headdress2);
        this.chest.addChild(this.neckJoint);
        this.body.addChild(this.rightThigh);
        this.neckJoint.addChild(this.neck);
        this.maskBase.addChild(this.headdress4);
        this.maskFace.addChild(this.forehead);
        this.leftArmJoint.addChild(this.leftUpperArm);
        this.lowerLip.addChild(this.teethBottom);
        this.maskBase.addChild(this.headdress5);
        this.leftCalf.addChild(this.leftFoot);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftThigh.addChild(this.leftCalf);
        this.rightLowerArm.addChild(this.rightHand);
        this.maskBase.addChild(this.headdress1);
        this.body.addChild(this.leftThigh);
        this.maskMouth.addChild(this.jaw);
        this.jaw.addChild(this.leftLip);
        this.maskFace.addChild(this.maskMouth);
        this.maskFace.addChild(this.nose);
        this.chest.addChild(this.rightArmJoint);
        this.chest.addChild(this.leftArmJoint);
        this.maskBase.addChild(this.headdress7);
        this.jaw.addChild(this.rightLip);
        this.maskMouth.addChild(this.upperLip);
        this.leftLowerArm.addChild(this.leftHand);
        this.maskBase.addChild(this.rightEar);
        this.neck.addChild(this.headJoint);
        this.maskBase.addChild(this.headdress6);
        this.body.addChild(this.chest);
        this.leftEar.addChild(this.leftEarring);
        this.maskBase.addChild(this.maskFace);
        this.headJoint.addChild(this.head);
        
        parts = new MowzieModelRenderer[] {body, chest, rightThigh, leftThigh, neckJoint, rightArmJoint, leftArmJoint, neck, headJoint, head, maskBase, maskFace, headdress1, headdress2, headdress3, headdress4, headdress5, headdress6, headdress7, rightEar, leftEar, maskMouth, forehead, nose, upperLip, jaw, teethTop, lowerLip, leftLip, rightLip, teethBottom, rightEarring, leftEarring, rightUpperArm, rightLowerArm, rightHand, leftUpperArm, leftLowerArm, leftHand, rightCalf, rightFoot, leftCalf, leftFoot, jiggleController, jawScaler, mouthScalerX, mouthScalerY};
        setInitPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        setToInitPose();
        EntityTribeLeader tribeLeader = (EntityTribeLeader) entity;
        float liftLegs = tribeLeader.legsUp.getAnimationProgressSinSqrt();
        float frame = tribeLeader.frame + AnimationAPI.proxy.getPartialTick();

        faceTarget(neckJoint, 2, f3, f4);
        faceTarget(headJoint, 2, f3, f4);

        walk(body, 0.06f, 0.05f, true, 0, -0.05f, frame, 1f);
        walk(neck, 0.06f, 0.05f, false, 0.5f, -0.05f, frame, 1f);

        leftThigh.rotateAngleX -= 0.7 * liftLegs;
        rightThigh.rotateAngleX -= 0.7 * liftLegs;
        leftThigh.rotateAngleZ += 1.5 * liftLegs;
        rightThigh.rotateAngleZ -= 1.5 * liftLegs;
        leftThigh.rotateAngleY += 0.55 * liftLegs;
        rightThigh.rotateAngleY -= 0.55 * liftLegs;
        swing(rightThigh, 0.06f, 0.05f * liftLegs, false, 0, 0, frame, 1f);
        swing(leftThigh, 0.06f, 0.05f * liftLegs, true, 0, 0, frame, 1f);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityTribeLeader tribeleader = (EntityTribeLeader) entity;
        animator.update(tribeleader);

        if (f3 > 70) f3 = 70f;
        if (f3 < -70) f3 = -70f;
        setRotationAngles(f, f1, f2, f3, f4, f5, tribeleader);

        float eyebrows = tribeleader.angryEyebrow.getAnimationProgressSinSqrt();

        float frame = tribeleader.frame + AnimationAPI.proxy.getPartialTick();

        if (tribeleader.getAnimID() == 1) {
            animator.setAnim(1);
            animator.startPhase(6);
            animator.rotate(rightArmJoint, -0.7f, 0.5f, 0);
            animator.rotate(rightLowerArm, 0, 0.5f, 0.3f);
            animator.rotate(rightHand, -0.5f, -0.7f, 0);
            animator.endPhase();
            animator.setStationaryPhase(1);
            animator.startPhase(3);
            animator.rotate(rightArmJoint, 0.1f, -0.05f, 0);
            animator.rotate(rightLowerArm, 0, -0.1f, -0.05f);
            animator.endPhase();
            animator.startPhase(0);
            animator.move(jiggleController, 1, 0, 0);
            animator.endPhase();
            animator.resetPhase(10);
            animator.startPhase(6);
            animator.rotate(rightArmJoint, -0.7f, 0.5f, 0);
            animator.rotate(rightLowerArm, 0, 0.5f, 0.3f);
            animator.rotate(rightHand, -0.5f, -0.7f, 0);
            animator.endPhase();
            animator.setStationaryPhase(1);
            animator.startPhase(3);
            animator.rotate(rightArmJoint, 0.1f, -0.05f, 0);
            animator.rotate(rightLowerArm, 0, -0.1f, -0.05f);
            animator.endPhase();
            animator.startPhase(0);
            animator.move(jiggleController, 1, 0, 0);
            animator.endPhase();
            animator.resetPhase(10);
        }
        if (tribeleader.getAnimID() == 2) {
            if (tribeleader.whichDialogue == 1) {
                animator.setAnim(2);
                animator.startPhase(4);
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(4);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, 0.3f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);
                animator.move(jawScaler, -0.2f, 0, 0);
                animator.move(mouthScalerX, -0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(1);
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.resetPhase(2);
                animator.setStationaryPhase(8);
                animator.startPhase(2);
                animator.move(jawScaler, 0.05f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(6);
                animator.resetPhase(3);
                animator.setStationaryPhase(6);
                animator.startPhase(2);
                animator.move(jawScaler, 0.05f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);
                animator.move(jawScaler, -0.2f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(3);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, -0.2f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(3);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(6);
                animator.resetPhase(4);
            }
            if (tribeleader.whichDialogue == 2) {
                animator.setAnim(2);
                animator.startPhase(4);
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, 0.3f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.3f, 0, 0);
                animator.endPhase();
                animator.startPhase(3);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.startPhase(3);
                animator.move(jawScaler, 0.7f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(6);
                animator.resetPhase(4);
            }
            if (tribeleader.whichDialogue == 3) {
                animator.setAnim(2);
                animator.startPhase(4);
                animator.move(jawScaler, -0.5f, 0, 0);
                animator.move(mouthScalerX, 0, 0, 0);
                animator.endPhase();
                animator.startPhase(3);
                animator.move(jawScaler, 0.3f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(3);
                animator.move(jawScaler, -0.5f, 0, 0);
                animator.endPhase();
                animator.startPhase(3);
                animator.move(jawScaler, 0.3f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.resetPhase(2);
                animator.startPhase(3);
                animator.move(jawScaler, 0.6f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.resetPhase(2);
                animator.startPhase(3);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(3);
                animator.move(jawScaler, -0.2f, 0, 0);
                animator.move(mouthScalerX, -0.3f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(1);
                animator.startPhase(2);
                animator.move(jawScaler, 0.05f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.resetPhase(2);
                animator.startPhase(3);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.resetPhase(4);
            }
            if (tribeleader.whichDialogue == 4) {
                animator.setAnim(2);
                animator.startPhase(3);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);
                animator.move(jawScaler, -0.2f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);
                animator.move(jawScaler, 0.1f, 0, 0);
                animator.move(mouthScalerX, -0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.3f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(5);
                animator.startPhase(2);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.4f, 0, 0);
                animator.move(mouthScalerX, 0f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, -0.5f, 0, 0);
                animator.move(mouthScalerX, -0.3f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.6f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.resetPhase(4);
            }
            if (tribeleader.whichDialogue == 5) {
                animator.setAnim(2);
                animator.startPhase(2);//q
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);//e
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(1);
                animator.startPhase(2);//n
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);//da
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);//koo
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.startPhase(2);//too
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(6);
                animator.startPhase(2);
                animator.move(jawScaler, 0.1f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(1);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.3f, 0, 0);
                animator.move(mouthScalerX, -0.3f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, -0.5f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(8);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(10);
                animator.resetPhase(8);
            }
            if (tribeleader.whichDialogue == 6) {
                animator.setAnim(2);
                animator.startPhase(2);//q
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.4f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);//e
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(1);
                animator.startPhase(2);//n
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(2);//da
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(3);
                animator.startPhase(2);//koo
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.startPhase(2);//too
                animator.move(jawScaler, 0.2f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(4);
                animator.startPhase(5);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(10);
                animator.startPhase(2);
                animator.move(jawScaler, 0.1f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(1);
                animator.move(jawScaler, 0f, 0, 0);
                animator.move(mouthScalerX, -0.5f, 0, 0);
                animator.endPhase();
                animator.startPhase(2);
                animator.move(jawScaler, 0.3f, 0, 0);
                animator.move(mouthScalerX, -0.3f, 0, 0);
                animator.endPhase();
                animator.startPhase(1);
                animator.move(jawScaler, -0.5f, 0, 0);
                animator.move(mouthScalerX, 0.1f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(2);
                animator.startPhase(8);
                animator.move(jawScaler, 0.5f, 0, 0);
                animator.move(mouthScalerX, 0.2f, 0, 0);
                animator.endPhase();
                animator.setStationaryPhase(10);
                animator.resetPhase(8);
            }
        }
        if (tribeleader.getAnimID() == 3) {
            animator.setAnim(3);
            animator.startPhase(7);
            animator.rotate(rightArmJoint, -0.9f, 0.5f, 0);
            animator.rotate(rightLowerArm, 0, 0.5f, 0.3f);
            animator.rotate(rightHand, -0.5f, -0.7f, 0);
            animator.rotate(chest, 0, 0.4f, 0);
            animator.rotate(neck, 0, -0.4f, 0);
            animator.move(chest, -2, 0, 0);
            animator.move(neck, -2, 0, 0);
            animator.rotate(leftArmJoint, 0, -0.6f, 0);
            animator.rotate(leftLowerArm, 0, 0, 0.1f);
            animator.endPhase();
            animator.setStationaryPhase(4);
            animator.startPhase(4);
            animator.rotate(rightUpperArm, -0.1f, (float) (-0.5f + (f3 * Math.PI/180)), 0);
            animator.rotate(rightLowerArm, 0, 0f, 1.1f);
            animator.rotate(rightHand, -1f, -0.7f, 0);
            animator.rotate(chest, 0, -0.5f, 0);
            animator.rotate(neck, 0, 0.5f, 0);
            animator.move(chest, 3, 0, 0);
            animator.move(neck, 3, 0, 0);
            animator.rotate(leftUpperArm, 0, 0.4f, 0);
            animator.rotate(leftLowerArm, 0, 0, -0.2f);
            animator.endPhase();
            animator.setStationaryPhase(3);
            animator.resetPhase(8);
        }

            float jiggleSpeed = 2.5f;
            float jiggleScale = (float) (jiggleController.rotationPointX * 0.1 * Math.cos(jiggleSpeed * frame));
            float breathScale = (float)(0.05 + 0.02 * Math.cos(0.06 * frame));
            float scaler = 1 + jiggleScale + breathScale;
            body.setScaleX(scaler );
            chest.setScaleX(1 / scaler);
            rightThigh.setScaleX(1 / scaler);
            leftThigh.setScaleX(1 / scaler);

            body.setScaleY(scaler);
            chest.setScaleY(1 / scaler);
            rightThigh.setScaleY(1 / scaler);
            leftThigh.setScaleY(1 / scaler);

            body.setScaleZ(scaler);
            chest.setScaleZ(1 / scaler);
            rightThigh.setScaleZ(1 / scaler);
            leftThigh.setScaleZ(1 / scaler);
            chest.rotationPointY += jiggleController.rotationPointX * 1.5 * Math.cos(jiggleSpeed * frame);
            chest.rotationPointZ += jiggleController.rotationPointX * 0.7 * Math.cos(jiggleSpeed * frame);
            leftThigh.rotationPointX -= jiggleController.rotationPointX * 0.75 * Math.cos(jiggleSpeed * frame);
            rightThigh.rotationPointX += jiggleController.rotationPointX * 0.75 * Math.cos(jiggleSpeed * frame);
            leftThigh.rotationPointZ -= jiggleController.rotationPointX * 0.5 * Math.cos(jiggleSpeed * frame);
            rightThigh.rotationPointZ -= jiggleController.rotationPointX * 0.5 * Math.cos(jiggleSpeed * frame);
            leftThigh.rotationPointY += jiggleController.rotationPointX * 0.3 * Math.cos(jiggleSpeed * frame);
            rightThigh.rotationPointY += jiggleController.rotationPointX * 0.3 * Math.cos(jiggleSpeed * frame);
            body.rotationPointZ -= jiggleController.rotationPointX * 2 * Math.cos(jiggleSpeed * frame);
            chest.rotationPointZ += jiggleController.rotationPointX * 2 * Math.cos(jiggleSpeed * frame);
            leftThigh.rotationPointZ += jiggleController.rotationPointX * 2 * Math.cos(jiggleSpeed * frame);
            rightThigh.rotationPointZ += jiggleController.rotationPointX * 2 * Math.cos(jiggleSpeed * frame);

            float jawScale = jawScaler.rotationPointX;//(float) (1 + 1 * Math.pow(Math.sin(frame * 0.3), 2));
            float mouthScaleX = mouthScalerX.rotationPointX;//(float) (1 - 0.25 * Math.pow(Math.sin(frame * 0.17), 2));
            float mouthScaleY = mouthScalerY.rotationPointX;//(float) (1 - 0.25 * Math.pow(Math.sin(frame * 0.17), 2));
            float foreheadScale = (float) (1f + 0.25 * eyebrows);
            jaw.setScaleY(jawScale);
            lowerLip.setScaleY(1/jawScale);
            leftLip.setScaleY(1/jawScale * (jawScale * 4 - 2)/2);
            rightLip.setScaleY(1 / jawScale * (jawScale * 4 - 2) / 2);
            maskMouth.setScaleX(mouthScaleX);
            leftLip.setScaleX(1/mouthScaleX);
            rightLip.setScaleX(1/mouthScaleX);
            maskMouth.setScaleY(mouthScaleY);
            forehead.setScaleY(foreheadScale);
    }
}
