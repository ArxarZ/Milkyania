
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.WormEntity;
import net.mcreator.monkeania.client.model.Modelcustom_model;

public class WormRenderer extends MobRenderer<WormEntity, Modelcustom_model<WormEntity>> {
	public WormRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WormEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/wormtexturez.png");
	}
}
