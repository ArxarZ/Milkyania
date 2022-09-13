
package net.mcreator.monkeania.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.monkeania.init.MonkeaniaModBlocks;

import java.util.Set;
import java.util.List;

public class AlienRoseFeature extends RandomPatchFeature {
	public static AlienRoseFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AlienRoseFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("monkeania:alien_rose", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(MonkeaniaModBlocks.ALIEN_ROSE.get().defaultBlockState())), List.of(), 20));
		PLACED_FEATURE = PlacementUtils.register("monkeania:alien_rose", CONFIGURED_FEATURE, List.of(CountPlacement.of(10),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("monkeania:outer_plants"), new ResourceLocation("forest"),
			new ResourceLocation("plains"), new ResourceLocation("monkeania:spooky_forest"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public AlienRoseFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
