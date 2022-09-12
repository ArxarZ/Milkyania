package net.mcreator.monkeania.client.model;

import net.minecraft.world.entity.Entity;
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
public class ModelCustomArmor_spider_helmet_new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("monkeania", "model_custom_armor_spider_helmet_new"), "main");
	public final ModelPart armorHead;

	public ModelCustomArmor_spider_helmet_new(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(32, 13).addBox(-3.0F, -6.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 6)
						.addBox(2.0F, -6.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(2.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spiderbody = armorHead.addOrReplaceChild("spiderbody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -35.0F, -5.0F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 25)
						.addBox(-5.0F, -32.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-5.0F, -31.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(18, 13)
						.addBox(3.0F, -31.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-4.0F, -31.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -31.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 2)
						.addBox(-5.0F, -32.0F, -6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(4.0F, -32.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-5.0F, -31.0F, 5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(-4.0F, -32.0F, 5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-3.0F, -36.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition lefteye = armorHead.addOrReplaceChild("lefteye",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -10.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition righteye = armorHead.addOrReplaceChild("righteye",
				CubeListBuilder.create().texOffs(0, 15).addBox(1.0F, -10.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftlegs = armorHead.addOrReplaceChild("leftlegs",
				CubeListBuilder.create().texOffs(14, 28).addBox(-8.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(-9.0F, -7.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 25)
						.addBox(-7.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-8.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 30)
						.addBox(-9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-7.0F, -9.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-6.0F, -9.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
						.addBox(-7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 24)
						.addBox(-7.0F, -9.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 26)
						.addBox(-8.0F, -8.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 26)
						.addBox(-6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 8)
						.addBox(-6.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 6)
						.addBox(-7.0F, -9.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 28)
						.addBox(-8.0F, -8.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 30)
						.addBox(-8.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 22)
						.addBox(-7.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightlegs = armorHead.addOrReplaceChild("rightlegs",
				CubeListBuilder.create().texOffs(0, 26).addBox(4.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 3)
						.addBox(6.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 24)
						.addBox(7.0F, -8.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17)
						.addBox(7.0F, -7.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(6.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(4.0F, -9.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(6.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 22)
						.addBox(8.0F, -7.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(4.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(6.0F, -8.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(8.0F, -7.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(4.0F, -9.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 15)
						.addBox(5.0F, -9.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 13)
						.addBox(5.0F, -9.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.armorHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.armorHead.xRot = headPitch / (180F / (float) Math.PI);
	}
}
