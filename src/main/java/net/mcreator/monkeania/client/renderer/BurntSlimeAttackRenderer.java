
package net.mcreator.monkeania.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeania.entity.BurntSlimeAttackEntity;
import net.mcreator.monkeania.client.model.Modelburntslime;

public class BurntSlimeAttackRenderer extends MobRenderer<BurntSlimeAttackEntity, Modelburntslime<BurntSlimeAttackEntity>> {
	public BurntSlimeAttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelburntslime(context.bakeLayer(Modelburntslime.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(BurntSlimeAttackEntity entity) {
		return new ResourceLocation("monkeania:textures/entities/burntslimeenragedtexture.png");
	}
}
