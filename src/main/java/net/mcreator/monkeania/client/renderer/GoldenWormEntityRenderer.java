
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.GoldenWormEntityEntity;
import net.mcreator.monkeania.client.model.Modelcustom_model;

public class GoldenWormEntityRenderer extends MobRenderer<GoldenWormEntityEntity, Modelcustom_model<GoldenWormEntityEntity>> {
	public GoldenWormEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenWormEntityEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/goldenwormtexturez.png");
	}
}
