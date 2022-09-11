
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.AntEntity;
import net.mcreator.monkeania.client.model.Modelantmodel;

public class AntRenderer extends MobRenderer<AntEntity, Modelantmodel<AntEntity>> {
	public AntRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelantmodel(context.bakeLayer(Modelantmodel.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AntEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/ant_texture.png");
	}
}
