
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.SkyderEntity;
import net.mcreator.monkeania.client.model.Modelskyder;

public class SkyderRenderer extends MobRenderer<SkyderEntity, Modelskyder<SkyderEntity>> {
	public SkyderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelskyder(context.bakeLayer(Modelskyder.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkyderEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/skydertexture.png");
	}
}
