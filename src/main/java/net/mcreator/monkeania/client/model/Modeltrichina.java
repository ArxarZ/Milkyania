package net.mcreator.monkeania.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltrichina<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monkeania", "modeltrichina"), "main");
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart Leftleg;
	public final ModelPart UpperArm;

	public Modeltrichina(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.Leftleg = root.getChild("Leftleg");
		this.UpperArm = root.getChild("UpperArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -19.0F, -4.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(8, 31)
						.addBox(-3.0F, -23.0F, -8.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 23)
						.addBox(-4.0F, -20.0F, 5.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-3.0F, 7.0F, 0.0F));
		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(-37.0F, -15.0F, -1.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -32.0F, -1.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 17.0F, 0.0F, 0.0F, 0.0F, -1.4399F));
		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), PartPose.offset(3.0F, 7.0F, 0.0F));
		PartDefinition cube_r3 = Leftleg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-27.3666F, -0.9487F, -1.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.7925F));
		PartDefinition cube_r4 = Leftleg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 29.0F, -1.0F, 28.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 17.0F, 0.0F, 0.0F, 0.0F, -1.6144F));
		PartDefinition UpperArm = partdefinition.addOrReplaceChild("UpperArm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r5 = UpperArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 19.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.8807F, 0.0226F, 0.0843F));
		PartDefinition cube_r6 = UpperArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(4, 21).addBox(2.0F, 21.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.88F, -0.0113F, -0.0421F));
		PartDefinition cube_r7 = UpperArm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(21, 21).addBox(-3.0F, 20.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 20.0F, -1.0F, 2.8798F, 0.0F, 0.0F));
		PartDefinition cube_r8 = UpperArm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(25, 21).addBox(-6.0F, 22.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 20.0F, -1.0F, 2.8819F, 0.0338F, 0.1265F));
		PartDefinition cube_r9 = UpperArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(8, 29).addBox(7.0F, 23.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.8883F, -0.067F, -0.2533F));
		PartDefinition cube_r10 = UpperArm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(16, 40).addBox(-9.0F, 24.0F, 41.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 20.0F, -1.0F, 2.8883F, 0.067F, 0.2533F));
		PartDefinition cube_r11 = UpperArm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 27.0F, 40.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.8798F, 0.0F, 0.0F));
		PartDefinition cube_r12 = UpperArm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(21, 16).addBox(-1.0F, 10.0F, 49.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.4435F, 0.0F, 0.0F));
		PartDefinition cube_r13 = UpperArm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(29, 16).addBox(-1.0F, -7.0F, 50.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 2.0508F, 0.0F, 0.0F));
		PartDefinition cube_r14 = UpperArm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(28, 35).addBox(-1.0F, -19.0F, 46.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r15 = UpperArm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(36, 35).addBox(-1.0F, -36.0F, 33.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 1.2654F, 0.0F, 0.0F));
		PartDefinition cube_r16 = UpperArm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(37, 16).addBox(-1.0F, -40.0F, 25.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r17 = UpperArm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(8, 40).addBox(-1.0F, -41.0F, 18.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r18 = UpperArm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -40.0F, 13.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -1.0F, 0.7418F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		UpperArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.UpperArm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.UpperArm.xRot = headPitch / (180F / (float) Math.PI);
	}
}
