// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspiderleggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spiderleggings"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelspiderleggings(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-7.0F, -2.0F, -3.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r1 = LeftLeg
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(48, 16).addBox(-11.0F, 7.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r2 = LeftLeg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(26, 57).addBox(-5.0F, 5.0F, -1.0F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition cube_r3 = LeftLeg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(21, 48).addBox(-5.0F, -7.0F, -13.0F, 2.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LeftLeg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(48, 26).addBox(-5.0F, -2.0F, -9.0F, 2.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 52).addBox(-5.0F, -9.3512F, 7.4746F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(8, 42).addBox(-5.0F, -3.3512F, 3.4746F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -2.0F, -1.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, -2.0F));

		PartDefinition cube_r7 = RightLeg
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(44, 40).addBox(-1.0F, -3.3512F, 3.4746F, 2.0F, 2.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r8 = RightLeg
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(10, 54).addBox(-1.0F, -9.3512F, 7.4746F, 2.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r9 = RightLeg
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(56, 39).addBox(6.0F, -8.0F, -1.0F, 7.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.4399F));

		PartDefinition cube_r10 = RightLeg
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(52, 35).addBox(2.0F, -2.0F, -1.0F, 8.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r11 = RightLeg
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(50, 50).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = RightLeg
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(32, 50).addBox(-1.0F, -7.0F, -13.0F, 2.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 1.4399F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}