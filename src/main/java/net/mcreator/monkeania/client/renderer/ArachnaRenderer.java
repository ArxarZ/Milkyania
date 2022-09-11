
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.ArachnaEntity;
import net.mcreator.monkeania.client.model.ModelArachna;

public class ArachnaRenderer extends MobRenderer<ArachnaEntity, ModelArachna<ArachnaEntity>> {
	public ArachnaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelArachna(context.bakeLayer(ModelArachna.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArachnaEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/arachnatexture.png");
	}
}
