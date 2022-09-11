
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.ZebraEntity;
import net.mcreator.monkeania.client.model.Modelzebra;

public class ZebraRenderer extends MobRenderer<ZebraEntity, Modelzebra<ZebraEntity>> {
	public ZebraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebra(context.bakeLayer(Modelzebra.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZebraEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/zebratexture.png");
	}
}
