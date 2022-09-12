
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.monkeania.world.features.plants.SkyLeafFeature;
import net.mcreator.monkeania.world.features.plants.CarmineFlowerFeature;
import net.mcreator.monkeania.world.features.ores.TravertineFeature;
import net.mcreator.monkeania.world.features.ores.ScoriaFeature;
import net.mcreator.monkeania.world.features.ores.SapphireOreFeature;
import net.mcreator.monkeania.world.features.ores.RubyOreFeature;
import net.mcreator.monkeania.world.features.ores.PlasticOreFeature;
import net.mcreator.monkeania.world.features.ores.NecroniteOreFeature;
import net.mcreator.monkeania.world.features.ScoriaRockUndergroundFeature;
import net.mcreator.monkeania.world.features.ScoriaRockFeature;
import net.mcreator.monkeania.MonkeaniaMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MonkeaniaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MonkeaniaMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CARMINE_FLOWER = register("carmine_flower", CarmineFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CarmineFlowerFeature.GENERATE_BIOMES, CarmineFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TRAVERTINE = register("travertine", TravertineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TravertineFeature.GENERATE_BIOMES, TravertineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCORIA = register("scoria", ScoriaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ScoriaFeature.GENERATE_BIOMES, ScoriaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLASTIC_ORE = register("plastic_ore", PlasticOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PlasticOreFeature.GENERATE_BIOMES, PlasticOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SKY_LEAF = register("sky_leaf", SkyLeafFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SkyLeafFeature.GENERATE_BIOMES, SkyLeafFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCORIA_ROCK = register("scoria_rock", ScoriaRockFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, ScoriaRockFeature.GENERATE_BIOMES, ScoriaRockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCORIA_ROCK_UNDERGROUND = register("scoria_rock_underground",
			ScoriaRockUndergroundFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					ScoriaRockUndergroundFeature.GENERATE_BIOMES, ScoriaRockUndergroundFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = register("sapphire_ore", SapphireOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NECRONITE_ORE = register("necronite_ore", NecroniteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, NecroniteOreFeature.GENERATE_BIOMES, NecroniteOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
