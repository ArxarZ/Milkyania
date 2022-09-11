// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArachna<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "arachna"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart LeftLeg;
	private final ModelPart LeftLeg2;
	private final ModelPart LeftLeg5;
	private final ModelPart LeftLeg3;
	private final ModelPart RightLeg;
	private final ModelPart RightLeg4;
	private final ModelPart Back;
	private final ModelPart LeftLeg4;
	private final ModelPart LeftLeg6;

	public ModelArachna(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.LeftLeg5 = root.getChild("LeftLeg5");
		this.LeftLeg3 = root.getChild("LeftLeg3");
		this.RightLeg = root.getChild("RightLeg");
		this.RightLeg4 = root.getChild("RightLeg4");
		this.Back = root.getChild("Back");
		this.LeftLeg4 = root.getChild("LeftLeg4");
		this.LeftLeg6 = root.getChild("LeftLeg6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, -6.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(0, 29).addBox(-12.0F, -24.0F, -9.0F, 24.0F, 6.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -6.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -8.0F, -5.0F, 9.0F, 9.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.0F, -24.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 5.0F, -19.0F));

		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(74, 30).addBox(-12.0F, -15.0F, -16.5F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 19.0F, 7.0F, -1.5892F, -1.3801F, 0.8657F));

		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 3.0F, -14.0F, 0.0F, -1.5272F, 0.0F));

		PartDefinition LeftLeg_r2 = LeftLeg2.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(24, 66).addBox(-2.0F, 1.9047F, -7.679F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.409F, 1.5F, 5.3274F, -0.6545F, 0.0F, 0.0F));

		PartDefinition LeftLeg5 = partdefinition.addOrReplaceChild("LeftLeg5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 3.0F, -10.0F, -0.2636F, -0.5477F, 0.0865F));

		PartDefinition LeftLeg_r3 = LeftLeg5.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(50, 47).addBox(3.2816F, -3.2543F, 1.9737F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3437F, 1.3638F, -5.978F, -0.196F, -1.0585F, -0.5518F));

		PartDefinition LeftLeg3 = partdefinition.addOrReplaceChild("LeftLeg3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 4.0F, -5.0F, -0.0436F, -0.6545F, 0.0F));

		PartDefinition LeftLeg_r4 = LeftLeg3.addOrReplaceChild("LeftLeg_r4",
				CubeListBuilder.create().texOffs(12, 66).addBox(0.7816F, -5.2543F, 2.4737F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2058F, 0.6301F, -5.1669F, -0.196F, -1.0585F, -0.5518F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, 4.0F, -19.0F, 0.314F, -1.3169F, 1.0243F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(66, 0).addBox(-0.6398F, -1.111F, -1.1261F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2506F, -0.6891F, -0.3428F, -0.663F, -0.1802F, 0.2619F));

		PartDefinition RightLeg4 = partdefinition.addOrReplaceChild("RightLeg4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, 3.0F, -5.0F, 0.0F, 1.4399F, 0.0F));

		PartDefinition RightLeg_r2 = RightLeg4.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(62, 47).addBox(-13.0F, -16.5F, 14.0F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2886F, 21.0F, 8.8541F, -2.5454F, -0.5042F, -3.0412F));

		PartDefinition Back = partdefinition.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-10.5F, -26.0F, 0.0F, 15.0F, 11.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftLeg4 = partdefinition.addOrReplaceChild("LeftLeg4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.0F, 4.0F, -15.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition LeftLeg_r5 = LeftLeg4.addOrReplaceChild("LeftLeg_r5",
				CubeListBuilder.create().texOffs(24, 66).addBox(-2.0F, 1.9047F, -7.679F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.591F, 1.5F, 5.3274F, -0.6545F, 0.0F, 0.0F));

		PartDefinition LeftLeg6 = partdefinition.addOrReplaceChild("LeftLeg6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.0F, 4.0F, -9.0F, 0.0F, 1.6581F, 0.0F));

		PartDefinition LeftLeg_r6 = LeftLeg6.addOrReplaceChild("LeftLeg_r6",
				CubeListBuilder.create().texOffs(24, 66).addBox(-2.0F, 1.9047F, -7.679F, 3.0F, 27.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.591F, 1.5F, 5.3274F, -0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLeg6.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg5.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLeg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}