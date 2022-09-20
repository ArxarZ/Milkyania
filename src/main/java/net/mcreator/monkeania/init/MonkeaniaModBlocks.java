
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.monkeania.block.TravertineBlock;
import net.mcreator.monkeania.block.SkyLeafBlock;
import net.mcreator.monkeania.block.ScoriaBlock;
import net.mcreator.monkeania.block.SapphireOreBlock;
import net.mcreator.monkeania.block.SapphireBlockBlock;
import net.mcreator.monkeania.block.RubyOreBlock;
import net.mcreator.monkeania.block.RubyBlockBlock;
import net.mcreator.monkeania.block.PlasticOreBlock;
import net.mcreator.monkeania.block.PlasticBlockBlock;
import net.mcreator.monkeania.block.NecroniteOreBlock;
import net.mcreator.monkeania.block.NecroniteBlockBlock;
import net.mcreator.monkeania.block.GrassyWheatBlock;
import net.mcreator.monkeania.block.CarmineFlowerBlock;
import net.mcreator.monkeania.block.AlienRoseBlock;
import net.mcreator.monkeania.MonkeaniaMod;

public class MonkeaniaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MonkeaniaMod.MODID);
	public static final RegistryObject<Block> CARMINE_FLOWER = REGISTRY.register("carmine_flower", () -> new CarmineFlowerBlock());
	public static final RegistryObject<Block> TRAVERTINE = REGISTRY.register("travertine", () -> new TravertineBlock());
	public static final RegistryObject<Block> SCORIA = REGISTRY.register("scoria", () -> new ScoriaBlock());
	public static final RegistryObject<Block> PLASTIC_ORE = REGISTRY.register("plastic_ore", () -> new PlasticOreBlock());
	public static final RegistryObject<Block> PLASTIC_BLOCK = REGISTRY.register("plastic_block", () -> new PlasticBlockBlock());
	public static final RegistryObject<Block> SKY_LEAF = REGISTRY.register("sky_leaf", () -> new SkyLeafBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> NECRONITE_ORE = REGISTRY.register("necronite_ore", () -> new NecroniteOreBlock());
	public static final RegistryObject<Block> NECRONITE_BLOCK = REGISTRY.register("necronite_block", () -> new NecroniteBlockBlock());
	public static final RegistryObject<Block> ALIEN_ROSE = REGISTRY.register("alien_rose", () -> new AlienRoseBlock());
	public static final RegistryObject<Block> GRASSY_WHEAT = REGISTRY.register("grassy_wheat", () -> new GrassyWheatBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CarmineFlowerBlock.registerRenderLayer();
			SkyLeafBlock.registerRenderLayer();
			AlienRoseBlock.registerRenderLayer();
			GrassyWheatBlock.registerRenderLayer();
		}
	}
}
