
package net.mcreator.monkeania.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.mcreator.monkeania.init.MonkeaniaModEntities;

import java.util.List;

public class OuterPlantsBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.142857142857f, 0.142857142857f),
			Climate.Parameter.span(-0.142857142857f, 0.142857142857f), Climate.Parameter.span(0.367142857143f, 0.652857142857f),
			Climate.Parameter.span(0.657142857143f, 0.942857142857f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.807163170595f, -0.521448884881f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-10555393).waterColor(4159204).waterFogColor(329011)
				.skyColor(-10555393).foliageColorOverride(10387789).grassColorOverride(-11731122).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("monkeania:tree_outer_plants",
				FeatureUtils.register("monkeania:tree_outer_plants", Feature.TREE,
						new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),
								new StraightTrunkPlacer(4, 2, 0), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()),
								new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines()
								.build()),
				List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
						PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("monkeania:grass_outer_plants", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("monkeania:flower_outer_plants", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(15),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.ANT.get(), 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.FLY.get(), 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.BUTTERFLY.get(), 20, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.GOLDEN_WORM_ENTITY.get(), 16, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.WORM.get(), 20, 1, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
	}
}
