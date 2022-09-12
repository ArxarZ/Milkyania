
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monkeania.client.renderer.ZebraRenderer;
import net.mcreator.monkeania.client.renderer.WormRenderer;
import net.mcreator.monkeania.client.renderer.UncleJoeRenderer;
import net.mcreator.monkeania.client.renderer.TrichinaRenderer;
import net.mcreator.monkeania.client.renderer.SkyderRenderer;
import net.mcreator.monkeania.client.renderer.OneLegSpiderRenderer;
import net.mcreator.monkeania.client.renderer.GoldenWormEntityRenderer;
import net.mcreator.monkeania.client.renderer.FlyRenderer;
import net.mcreator.monkeania.client.renderer.ButterflyRenderer;
import net.mcreator.monkeania.client.renderer.BurntSlimeRenderer;
import net.mcreator.monkeania.client.renderer.BurntSlimeAttackRenderer;
import net.mcreator.monkeania.client.renderer.ArachnaRenderer;
import net.mcreator.monkeania.client.renderer.AntRenderer;
import net.mcreator.monkeania.client.renderer.AbyssiusRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MonkeaniaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MonkeaniaModEntities.BURNT_SLIME.get(), BurntSlimeRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.BURNT_SLIME_ATTACK.get(), BurntSlimeAttackRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.WORM.get(), WormRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.GOLDEN_WORM_ENTITY.get(), GoldenWormEntityRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.ANT.get(), AntRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.BUTTERFLY.get(), ButterflyRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.UNCLE_JOE.get(), UncleJoeRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.ARACHNA.get(), ArachnaRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.ONE_LEG_SPIDER.get(), OneLegSpiderRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.SKYDER.get(), SkyderRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.FLY.get(), FlyRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.ABYSSIUS.get(), AbyssiusRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.ZEBRA.get(), ZebraRenderer::new);
		event.registerEntityRenderer(MonkeaniaModEntities.TRICHINA.get(), TrichinaRenderer::new);
	}
}
