
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.WhiteWitherEntity;
import net.mcreator.monkeania.client.model.ModelWhiteWither;

public class WhiteWitherRenderer extends MobRenderer<WhiteWitherEntity, ModelWhiteWither<WhiteWitherEntity>> {
	public WhiteWitherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWhiteWither(context.bakeLayer(ModelWhiteWither.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteWitherEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/whitewither.png");
	}
}
