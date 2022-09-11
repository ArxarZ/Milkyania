
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.BurntSlimeEntity;
import net.mcreator.monkeania.client.model.Modelburntslime;

public class BurntSlimeRenderer extends MobRenderer<BurntSlimeEntity, Modelburntslime<BurntSlimeEntity>> {
	public BurntSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelburntslime(context.bakeLayer(Modelburntslime.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(BurntSlimeEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/burntslime.png");
	}
}
