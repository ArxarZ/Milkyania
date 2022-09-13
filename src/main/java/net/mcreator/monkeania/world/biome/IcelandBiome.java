
package net.mcreator.monkeania.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.mcreator.monkeania.init.MonkeaniaModEntities;

public class IcelandBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.142857142857f, 0.142857142857f),
			Climate.Parameter.span(-0.142857142857f, 0.142857142857f), Climate.Parameter.span(0.367142857143f, 0.652857142857f),
			Climate.Parameter.span(0.757142857143f, 1.042857142857f), Climate.Parameter.point(0),
			Climate.Parameter.span(0.348418718331f, 0.634133004045f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addIcebergs(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 20, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 16, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 20, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SNOW_GOLEM, 18, 1, 6));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(MonkeaniaModEntities.ONE_LEG_SPIDER.get(), 18, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 18, 1, 1));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.ICY).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
	}
}
