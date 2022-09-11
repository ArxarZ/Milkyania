
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.AbyssiusEntity;
import net.mcreator.monkeania.client.model.Modelabyssius;

public class AbyssiusRenderer extends MobRenderer<AbyssiusEntity, Modelabyssius<AbyssiusEntity>> {
	public AbyssiusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelabyssius(context.bakeLayer(Modelabyssius.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AbyssiusEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/texturephasmos.png");
	}
}
