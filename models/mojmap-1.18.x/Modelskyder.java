// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelskyder<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "skyder"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightWing;
	private final ModelPart LeftWing;
	private final ModelPart Legs;

	public Modelskyder(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightWing = root.getChild("RightWing");
		this.LeftWing = root.getChild("LeftWing");
		this.Legs = root.getChild("Legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -7.0F, -7.0F, 8.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 20).addBox(
				-3.0F, -8.0F, 3.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -13.0F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(0, 20)
				.addBox(-3.0F, 0.0F, -5.5F, 6.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 19.0F, -0.5F));

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(18, 0)
				.addBox(-3.0F, 0.0F, -5.5F, 6.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 19.0F, -0.5F));

		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Legs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(21, 29)
						.addBox(6.0F, -10.0F, -6.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(6.0F, -10.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 33)
						.addBox(6.0F, -10.0F, 3.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r2 = Legs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 33)
						.addBox(-2.0F, -1.0F, 3.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.0F, -1.0F, -6.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 37)
						.addBox(-2.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftWing.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightWing.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}