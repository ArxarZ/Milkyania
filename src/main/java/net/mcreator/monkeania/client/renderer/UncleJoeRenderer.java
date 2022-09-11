
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.UncleJoeEntity;
import net.mcreator.monkeania.client.model.Modeluncle_joe;

public class UncleJoeRenderer extends MobRenderer<UncleJoeEntity, Modeluncle_joe<UncleJoeEntity>> {
	public UncleJoeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeluncle_joe(context.bakeLayer(Modeluncle_joe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UncleJoeEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/unclejoetexture.png");
	}
}
