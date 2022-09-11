
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.OneLegSpiderEntity;
import net.mcreator.monkeania.client.model.Modelonelegspider;

public class OneLegSpiderRenderer extends MobRenderer<OneLegSpiderEntity, Modelonelegspider<OneLegSpiderEntity>> {
	public OneLegSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelonelegspider(context.bakeLayer(Modelonelegspider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OneLegSpiderEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/onelegspidertexture.png");
	}
}
