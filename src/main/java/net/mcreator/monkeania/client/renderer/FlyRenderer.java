
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.FlyEntity;
import net.mcreator.monkeania.client.model.Modelfly;

public class FlyRenderer extends MobRenderer<FlyEntity, Modelfly<FlyEntity>> {
	public FlyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfly(context.bakeLayer(Modelfly.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/flytexture.png");
	}
}
