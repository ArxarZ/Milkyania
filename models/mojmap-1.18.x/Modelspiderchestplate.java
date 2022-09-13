// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspiderchestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spiderchestplate"), "main");
	private final ModelPart Body;
	private final ModelPart right;
	private final ModelPart left;

	public Modelspiderchestplate(ModelPart root) {
		this.Body = root.getChild("Body");
		this.right = root.getChild("right");
		this.left = root.getChild("left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mainchestplate = Body.addOrReplaceChild("mainchestplate",
				CubeListBuilder.create().texOffs(18, 24)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 46)
						.addBox(1.0F, 0.0F, -5.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-1.0F, 0.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, 0.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 9)
						.addBox(-1.0F, 3.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 9)
						.addBox(0.0F, 3.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 9)
						.addBox(-1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 9)
						.addBox(0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 62)
						.addBox(-3.0F, 3.0F, -4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(2.0F, 3.0F, -4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 68)
						.addBox(2.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 67)
						.addBox(1.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 34)
						.addBox(0.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 32)
						.addBox(-3.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 25)
						.addBox(-1.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 27)
						.addBox(-2.0F, 11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-2.0F, 7.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 42)
						.addBox(-2.0F, 3.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 51)
						.addBox(-3.0F, 12.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 32)
						.addBox(-5.0F, 0.0F, -3.0F, 1.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(4.0F, 0.0F, -3.0F, 1.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 62)
						.addBox(-4.0F, 0.0F, -5.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 65)
						.addBox(-2.0F, 4.0F, -3.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 32)
						.addBox(-6.0F, 13.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 25)
						.addBox(5.0F, 13.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 7)
						.addBox(-4.0F, 13.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 6)
						.addBox(-3.0F, 7.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 61)
						.addBox(-3.0F, 4.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 38)
						.addBox(2.0F, 7.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(2.0F, 4.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 4)
						.addBox(-5.0F, 6.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 60)
						.addBox(2.0F, 6.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-7.0F, 5.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 53)
						.addBox(-7.0F, 7.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 51)
						.addBox(4.0F, 7.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 57)
						.addBox(4.0F, 5.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 51)
						.addBox(-10.0F, 4.0F, 6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 35)
						.addBox(-10.0F, 8.0F, 6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 5)
						.addBox(6.0F, 8.0F, 6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 55)
						.addBox(6.0F, 4.0F, 6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 56)
						.addBox(-11.0F, 3.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 42)
						.addBox(-11.0F, 9.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 14)
						.addBox(9.0F, 9.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 51)
						.addBox(9.0F, 3.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 32)
						.addBox(-12.0F, 10.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(10.0F, 10.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 32)
						.addBox(-12.0F, 2.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 48)
						.addBox(10.0F, 2.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 12)
						.addBox(-12.0F, 2.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(59, 54)
						.addBox(-12.0F, 10.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 48)
						.addBox(11.0F, 10.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 5)
						.addBox(11.0F, 2.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-11.0F, 3.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 37)
						.addBox(-11.0F, 9.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 37)
						.addBox(10.0F, 9.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 39)
						.addBox(10.0F, 3.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 30)
						.addBox(-2.0F, 4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(-1.0F, 4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 39)
						.addBox(-3.0F, 7.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 21)
						.addBox(2.0F, 5.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 40)
						.addBox(-4.0F, 5.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(1.0F, 4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 19)
						.addBox(-2.0F, 7.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 48)
						.addBox(-2.0F, 6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(1.0F, 6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 62)
						.addBox(-13.0F, 1.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 44)
						.addBox(-13.0F, 11.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
						.addBox(10.0F, 11.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 55)
						.addBox(10.0F, 1.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 67)
						.addBox(10.0F, 1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 53)
						.addBox(10.0F, 11.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 28)
						.addBox(-11.0F, 11.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 14)
						.addBox(12.0F, 11.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 53)
						.addBox(12.0F, 1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(65, 66)
						.addBox(-13.0F, 1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 35)
						.addBox(-13.0F, 11.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 53)
						.addBox(-11.0F, 1.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 64)
						.addBox(-1.0F, 7.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 43)
						.addBox(-12.0F, 1.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(21, 43)
						.addBox(-12.0F, 11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(12, 37)
						.addBox(11.0F, 11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(43, 35)
						.addBox(11.0F, 1.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 7)
						.addBox(-3.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 37)
						.addBox(-3.0F, 1.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 24)
						.addBox(2.0F, 1.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(2.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 32)
						.addBox(-3.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 17)
						.addBox(2.0F, 2.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = mainchestplate.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(7, 30)
						.addBox(2.0F, 2.0F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 37)
						.addBox(-3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = mainchestplate.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 53)
						.addBox(-4.0F, 13.0F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-3.0F, 11.0F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r3 = mainchestplate.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(13, 48)
						.addBox(1.0F, 12.0F, -3.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 55)
						.addBox(0.0F, 11.0F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = mainchestplate.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 58).addBox(7.3051F, 0.0F, 13.5202F, 2.0F, 14.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r5 = mainchestplate
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(25, 51).addBox(-5.0F, 0.0F, -2.0F, 1.0F, 14.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r6 = mainchestplate.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(41, 67)
						.addBox(-2.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 67)
						.addBox(-3.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 67)
						.addBox(2.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(1.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 2)
						.addBox(0.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 38)
						.addBox(-1.0F, 7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r7 = mainchestplate
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(36, 9).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r8 = mainchestplate
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(18, 58).addBox(0.0F, 0.0F, -5.0F, 2.0F, 14.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r9 = mainchestplate
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(18, 17).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r10 = mainchestplate
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(31, 58).addBox(-3.0F, 0.0F, -5.0F, 2.0F, 14.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cagethingy = mainchestplate.addOrReplaceChild("cagethingy", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = cagethingy.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(67, 31).addBox(-4.0F, 3.0F, -6.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2799F, 0.2134F, -1.5561F));

		PartDefinition cube_r12 = cagethingy.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(67, 26).addBox(3.0F, 6.0F, -5.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0398F, 0.3906F, -0.0005F));

		PartDefinition cube_r13 = cagethingy.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(67, 34).addBox(1.0F, 4.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9973F, -0.005F, -2.9601F));

		PartDefinition cube_r14 = cagethingy.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(67, 14).addBox(1.0F, 2.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1147F, -0.2301F, 1.9296F));

		PartDefinition cube_r15 = cagethingy.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(67, 23).addBox(-2.0F, 2.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0357F, 0.0983F, -2.1803F));

		PartDefinition cube_r16 = cagethingy.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(67, 11).addBox(-3.0F, 5.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9386F, -0.0984F, -3.0745F));

		PartDefinition cube_r17 = cagethingy.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(24, 67).addBox(2.0F, 5.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0076F, -0.0539F, 2.9773F));

		PartDefinition cube_r18 = cagethingy.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(67, 19).addBox(5.0F, 5.0F, 3.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9884F, 0.5078F, 2.8951F));

		PartDefinition heartthing = mainchestplate.addOrReplaceChild("heartthing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r19 = heartthing
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(60, 14).addBox(1.0F, 5.0F, -3.0F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r20 = heartthing.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(59, 55).addBox(-4.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0187F, 0.3996F, -2.3191F));

		PartDefinition cube_r21 = heartthing.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(59, 57)
						.addBox(-1.0F, 4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 5)
						.addBox(-2.0F, 4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 7)
						.addBox(-2.0F, 5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3235F, -0.2395F, -0.1805F));

		PartDefinition cube_r22 = heartthing.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(55, 50)
						.addBox(2.0F, 2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 57)
						.addBox(2.0F, 3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 41)
						.addBox(2.0F, 3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0554F, -0.3963F, 0.9171F));

		PartDefinition cube_r23 = heartthing.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(60, 12)
						.addBox(-4.0F, 4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 68)
						.addBox(-3.0F, 5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3691F, -0.5436F, -0.2986F));

		PartDefinition right = partdefinition.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(36, 7)
						.addBox(-10.0F, -2.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 17)
						.addBox(-9.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 32)
						.addBox(-10.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = right.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(36, 21)
						.addBox(-6.0F, 1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 51)
						.addBox(-8.0F, 2.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
						.addBox(-10.0F, 2.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition left = partdefinition.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(34, 0)
						.addBox(5.0F, -2.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 5)
						.addBox(9.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = left
				.addOrReplaceChild("cube_r25",
						CubeListBuilder.create().texOffs(52, 25).addBox(6.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r26 = left
				.addOrReplaceChild("cube_r26",
						CubeListBuilder.create().texOffs(47, 48).addBox(3.0F, -7.0F, -3.0F, 1.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r27 = left
				.addOrReplaceChild("cube_r27",
						CubeListBuilder.create().texOffs(38, 28).addBox(2.0F, 1.0F, -3.0F, 4.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}