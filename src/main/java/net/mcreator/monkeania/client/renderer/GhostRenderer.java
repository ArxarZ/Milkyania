
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.GhostEntity;
import net.mcreator.monkeania.client.model.Modelghost;

public class GhostRenderer extends MobRenderer<GhostEntity, Modelghost<GhostEntity>> {
	public GhostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelghost(context.bakeLayer(Modelghost.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhostEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/ghost.png");
	}
}
