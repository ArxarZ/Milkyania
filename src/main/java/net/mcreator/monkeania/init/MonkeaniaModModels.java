
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monkeania.client.model.Modelzebra;
import net.mcreator.monkeania.client.model.Modeluncle_joe;
import net.mcreator.monkeania.client.model.Modeltrichina;
import net.mcreator.monkeania.client.model.Modelspiderchestplate;
import net.mcreator.monkeania.client.model.Modelskyder;
import net.mcreator.monkeania.client.model.Modelonelegspider;
import net.mcreator.monkeania.client.model.Modelfly;
import net.mcreator.monkeania.client.model.Modelcustom_model;
import net.mcreator.monkeania.client.model.Modelbutterfly;
import net.mcreator.monkeania.client.model.Modelburntslime;
import net.mcreator.monkeania.client.model.Modelantmodel;
import net.mcreator.monkeania.client.model.Modelabyssius;
import net.mcreator.monkeania.client.model.ModelWhiteWither;
import net.mcreator.monkeania.client.model.ModelCustomArmor_spider_helmet_new;
import net.mcreator.monkeania.client.model.ModelArachna;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MonkeaniaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltrichina.LAYER_LOCATION, Modeltrichina::createBodyLayer);
		event.registerLayerDefinition(ModelWhiteWither.LAYER_LOCATION, ModelWhiteWither::createBodyLayer);
		event.registerLayerDefinition(ModelArachna.LAYER_LOCATION, ModelArachna::createBodyLayer);
		event.registerLayerDefinition(Modelzebra.LAYER_LOCATION, Modelzebra::createBodyLayer);
		event.registerLayerDefinition(Modelburntslime.LAYER_LOCATION, Modelburntslime::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelabyssius.LAYER_LOCATION, Modelabyssius::createBodyLayer);
		event.registerLayerDefinition(Modelonelegspider.LAYER_LOCATION, Modelonelegspider::createBodyLayer);
		event.registerLayerDefinition(Modelbutterfly.LAYER_LOCATION, Modelbutterfly::createBodyLayer);
		event.registerLayerDefinition(Modelspiderchestplate.LAYER_LOCATION, Modelspiderchestplate::createBodyLayer);
		event.registerLayerDefinition(Modelfly.LAYER_LOCATION, Modelfly::createBodyLayer);
		event.registerLayerDefinition(Modeluncle_joe.LAYER_LOCATION, Modeluncle_joe::createBodyLayer);
		event.registerLayerDefinition(ModelCustomArmor_spider_helmet_new.LAYER_LOCATION, ModelCustomArmor_spider_helmet_new::createBodyLayer);
		event.registerLayerDefinition(Modelskyder.LAYER_LOCATION, Modelskyder::createBodyLayer);
		event.registerLayerDefinition(Modelantmodel.LAYER_LOCATION, Modelantmodel::createBodyLayer);
	}
}
