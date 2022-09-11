
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.ButterflyEntity;
import net.mcreator.monkeania.client.model.Modelbutterfly;

public class ButterflyRenderer extends MobRenderer<ButterflyEntity, Modelbutterfly<ButterflyEntity>> {
	public ButterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ButterflyEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/butterflytexture.png");
	}
}
