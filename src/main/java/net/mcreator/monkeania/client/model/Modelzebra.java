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
public class Modelzebra<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monkeania", "modelzebra"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightLeg;
	public final ModelPart RightLeg2;
	public final ModelPart LeftLeg;
	public final ModelPart LeftLeg2;

	public Modelzebra(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightLeg = root.getChild("RightLeg");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftLeg2 = root.getChild("LeftLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.918F, -22.934F, -10.098F, 9.0F, 11.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.082F, -23.114F, -10.098F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.574F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, -1.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(45, 0).addBox(-2.246F, -27.36F, 7.59F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.246F, -23.36F, 4.59F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.574F, 0.164F, 0.164F, 0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.918F, -19.524F, -22.95F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-0.164F, -19.524F, -22.95F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.574F, 0.164F, 0.164F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.164F, -12.754F, -25.704F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.574F, 0.164F, 0.164F, -0.6545F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 34).addBox(-0.262F, 0.0F, -1.426F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 12.0F, -5.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(0, 44).addBox(0.738F, 0.0F, -2.82F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, 12.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(32, 34).addBox(-2.836F, 0.0F, -1.82F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 12.0F, 11.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(20, 34).addBox(-2.836F, 0.0F, -1.426F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 12.0F, -5.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
