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
public class Modelabyssius<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monkeania", "modelabyssius"), "main");
	public final ModelPart Body;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart head;

	public Modelabyssius(ModelPart root) {
		this.Body = root.getChild("Body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(43, 26).addBox(0.0F, -18.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 21)
						.addBox(-2.0F, -17.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 16)
						.addBox(0.0F, -16.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 14)
						.addBox(-2.0F, -15.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 12)
						.addBox(0.0F, -14.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 4)
						.addBox(-2.0F, -13.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 33)
						.addBox(0.0F, -12.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 31)
						.addBox(-2.0F, -11.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 29)
						.addBox(-2.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 10)
						.addBox(0.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 27)
						.addBox(-2.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 27)
						.addBox(-3.0F, -7.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(2.0F, -6.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 30)
						.addBox(2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 31)
						.addBox(0.0F, -6.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -22.0F, -2.0F, 8.0F,
								14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 29).addBox(-3.0F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 0).addBox(1.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
						.addBox(1.0F, -6.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(20, 14).addBox(0.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(0.0F, 9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = rightarm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(39, 12).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 34.0F, -1.0F, 3.1416F, 0.0F, 2.0508F));
		PartDefinition cube_r4 = rightarm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 30).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 34.0F, -1.0F, -3.1416F, 0.0F, 1.8762F));
		PartDefinition cube_r5 = rightarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 31).addBox(-0.1684F, -0.2151F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 1.3963F));
		PartDefinition cube_r6 = rightarm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(32, 36).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 34.0F, 1.0F, 0.0F, 0.0F, 1.2654F));
		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(36, 36).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 34.0F, 1.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition cube_r8 = rightarm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(36, 0).addBox(-0.9796F, -1.3736F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 18.0F, 1.0F, -3.1416F, 0.0F, 1.7453F));
		PartDefinition cube_r9 = rightarm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(40, 5).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 34.0F, -9.0F, -2.5551F, -0.3093F, 2.0003F));
		PartDefinition cube_r10 = rightarm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(40, 0).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 34.0F, -9.0F, -2.5169F, -0.2097F, 1.8519F));
		PartDefinition cube_r11 = rightarm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(31, 43).addBox(-0.5273F, -0.7384F, -0.7079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 17.0F, -2.0F, -2.4986F, -0.1321F, 1.7449F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, 9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 29)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r12 = leftarm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(39, 40).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 33.0F, 6.0F, 0.2783F, 0.1274F, 1.1523F));
		PartDefinition cube_r13 = leftarm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(40, 35).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 33.0F, 6.0F, 0.2956F, 0.0779F, 1.3206F));
		PartDefinition cube_r14 = leftarm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(40, 22).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 33.0F, 0.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r15 = leftarm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(40, 17).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 33.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r16 = leftarm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(43, 39).addBox(-0.5727F, -1.0057F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 17.0F, -2.0F, 0.0F, 0.0F, 1.4399F));
		PartDefinition cube_r17 = leftarm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(36, 21).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 34.0F, -1.0F, 3.1416F, 0.0F, 2.0508F));
		PartDefinition cube_r18 = leftarm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(36, 16).addBox(-13.0F, -15.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 34.0F, -1.0F, -3.1416F, 0.0F, 1.8762F));
		PartDefinition cube_r19 = leftarm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.1684F, -0.2151F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, 0.0F, -3.1416F, 0.0F, 1.7453F));
		PartDefinition cube_r20 = leftarm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(35, 43).addBox(-0.4995F, -1.5616F, -0.1459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 17.0F, 1.0F, 0.303F, 0.0393F, 1.4459F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -31.0F, -2.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(1.0F, -28.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18).addBox(-2.0F, -28.0F, 2.0F, 1.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightarm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
