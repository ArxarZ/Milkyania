
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.TrichinaEntity;
import net.mcreator.monkeania.client.model.Modeltrichina;

public class TrichinaRenderer extends MobRenderer<TrichinaEntity, Modeltrichina<TrichinaEntity>> {
	public TrichinaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltrichina(context.bakeLayer(Modeltrichina.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrichinaEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/trichinatexture.png");
	}
}
