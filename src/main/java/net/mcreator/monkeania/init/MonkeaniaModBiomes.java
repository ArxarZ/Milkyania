
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.monkeania.world.biome.SpookyForestBiome;
import net.mcreator.monkeania.world.biome.OuterPlantsBiome;
import net.mcreator.monkeania.world.biome.IcelandBiome;
import net.mcreator.monkeania.MonkeaniaMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonkeaniaModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MonkeaniaMod.MODID);
	public static final RegistryObject<Biome> ICELAND = REGISTRY.register("iceland", () -> IcelandBiome.createBiome());
	public static final RegistryObject<Biome> SPOOKY_FOREST = REGISTRY.register("spooky_forest", () -> SpookyForestBiome.createBiome());
	public static final RegistryObject<Biome> OUTER_PLANTS = REGISTRY.register("outer_plants", () -> OuterPlantsBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IcelandBiome.init();
			SpookyForestBiome.init();
			OuterPlantsBiome.init();
		});
	}

	@Mod.EventBusSubscriber
	public static class BiomeInjector {
		@SubscribeEvent
		public static void onServerAboutToStart(ServerAboutToStartEvent event) {
			MinecraftServer server = event.getServer();
			Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
			Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
			WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
			for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
				DimensionType dimensionType = entry.getValue().typeHolder().value();
				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(IcelandBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, ICELAND.getId()))));
						parameters.add(new Pair<>(SpookyForestBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SPOOKY_FOREST.getId()))));
						parameters.add(new Pair<>(OuterPlantsBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, OUTER_PLANTS.getId()))));

						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, ICELAND.getId()),
									Blocks.ICE.defaultBlockState(), Blocks.PACKED_ICE.defaultBlockState(), Blocks.FROSTED_ICE.defaultBlockState()));
							surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SPOOKY_FOREST.getId()),
									Blocks.PODZOL.defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState(), Blocks.PODZOL.defaultBlockState()));
							surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, OUTER_PLANTS.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}

			}
		}

		private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock,
				BlockState undergroundBlock, BlockState underwaterBlock) {
			return SurfaceRules
					.ifTrue(SurfaceRules.isBiome(biomeKey),
							SurfaceRules
									.ifTrue(SurfaceRules.abovePreliminarySurface(),
											SurfaceRules.sequence(
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
															SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																	SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
															SurfaceRules.state(undergroundBlock)))));
		}
	}
}
