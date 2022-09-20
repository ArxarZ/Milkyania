
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeania.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.monkeania.item.WormItemItem;
import net.mcreator.monkeania.item.WormBladeItem;
import net.mcreator.monkeania.item.SpiderSkinItem;
import net.mcreator.monkeania.item.SpiderLegItem;
import net.mcreator.monkeania.item.SpiderArmorItem;
import net.mcreator.monkeania.item.SapphireSwordItem;
import net.mcreator.monkeania.item.SapphireShovelItem;
import net.mcreator.monkeania.item.SapphirePickaxeItem;
import net.mcreator.monkeania.item.SapphireItem;
import net.mcreator.monkeania.item.SapphireHoeItem;
import net.mcreator.monkeania.item.SapphireAxeItem;
import net.mcreator.monkeania.item.SapphireArmorItem;
import net.mcreator.monkeania.item.RubySwordItem;
import net.mcreator.monkeania.item.RubyShovelItem;
import net.mcreator.monkeania.item.RubyPickaxeItem;
import net.mcreator.monkeania.item.RubyItem;
import net.mcreator.monkeania.item.RubyHoeItem;
import net.mcreator.monkeania.item.RubyAxeItem;
import net.mcreator.monkeania.item.RubyArmorItem;
import net.mcreator.monkeania.item.RawZebrameatItem;
import net.mcreator.monkeania.item.PlasticSwordItem;
import net.mcreator.monkeania.item.PlasticShovelItem;
import net.mcreator.monkeania.item.PlasticPickaxeItem;
import net.mcreator.monkeania.item.PlasticIngotItem;
import net.mcreator.monkeania.item.PlasticHoeItem;
import net.mcreator.monkeania.item.PlasticAxeItem;
import net.mcreator.monkeania.item.PlasticArmorItem;
import net.mcreator.monkeania.item.NugaxeItem;
import net.mcreator.monkeania.item.NecroniteSwordItem;
import net.mcreator.monkeania.item.NecroniteShovelItem;
import net.mcreator.monkeania.item.NecronitePickaxeItem;
import net.mcreator.monkeania.item.NecroniteItem;
import net.mcreator.monkeania.item.NecroniteHoeItem;
import net.mcreator.monkeania.item.NecroniteAxeItem;
import net.mcreator.monkeania.item.NecroniteArmorItem;
import net.mcreator.monkeania.item.GoldenWormItem;
import net.mcreator.monkeania.item.FriesItem;
import net.mcreator.monkeania.item.FlyItemItem;
import net.mcreator.monkeania.item.ExcaliburItem;
import net.mcreator.monkeania.item.EdibleRockItem;
import net.mcreator.monkeania.item.DirtSwordItem;
import net.mcreator.monkeania.item.DirtArmorItem;
import net.mcreator.monkeania.item.CookedZebraMeatItem;
import net.mcreator.monkeania.item.ChickenNuggetItem;
import net.mcreator.monkeania.item.ButterflyitemItem;
import net.mcreator.monkeania.item.BoneSwordItem;
import net.mcreator.monkeania.item.BloodItem;
import net.mcreator.monkeania.item.BlackShovelItem;
import net.mcreator.monkeania.item.BlackHoeItem;
import net.mcreator.monkeania.item.BlackBonePickaxeItem;
import net.mcreator.monkeania.item.BlackBoneItem;
import net.mcreator.monkeania.item.BlackAxeItem;
import net.mcreator.monkeania.item.AshesItem;
import net.mcreator.monkeania.item.AntItemItem;
import net.mcreator.monkeania.MonkeaniaMod;

public class MonkeaniaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MonkeaniaMod.MODID);
	public static final RegistryObject<Item> DIRT_SWORD = REGISTRY.register("dirt_sword", () -> new DirtSwordItem());
	public static final RegistryObject<Item> CHICKEN_NUGGET = REGISTRY.register("chicken_nugget", () -> new ChickenNuggetItem());
	public static final RegistryObject<Item> FRIES = REGISTRY.register("fries", () -> new FriesItem());
	public static final RegistryObject<Item> ASHES = REGISTRY.register("ashes", () -> new AshesItem());
	public static final RegistryObject<Item> BURNT_SLIME = REGISTRY.register("burnt_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.BURNT_SLIME, -7798784, -15263977, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BURNT_SLIME_ATTACK = REGISTRY.register("burnt_slime_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.BURNT_SLIME_ATTACK, -7798784, -15263977,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WORM_ITEM = REGISTRY.register("worm_item", () -> new WormItemItem());
	public static final RegistryObject<Item> WORM = REGISTRY.register("worm_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.WORM, -3342119, -14090110, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GOLDEN_WORM = REGISTRY.register("golden_worm", () -> new GoldenWormItem());
	public static final RegistryObject<Item> GOLDEN_WORM_ENTITY = REGISTRY.register("golden_worm_entity_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.GOLDEN_WORM_ENTITY, -2703872, -1024,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ANT = REGISTRY.register("ant_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.ANT, -14940160, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ANT_ITEM = REGISTRY.register("ant_item", () -> new AntItemItem());
	public static final RegistryObject<Item> CARMINE_FLOWER = block(MonkeaniaModBlocks.CARMINE_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TRAVERTINE = block(MonkeaniaModBlocks.TRAVERTINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCORIA = block(MonkeaniaModBlocks.SCORIA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BUTTERFLY = REGISTRY.register("butterfly_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.BUTTERFLY, -16775540, -854272, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PLASTIC_INGOT = REGISTRY.register("plastic_ingot", () -> new PlasticIngotItem());
	public static final RegistryObject<Item> PLASTIC_ORE = block(MonkeaniaModBlocks.PLASTIC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLASTIC_BLOCK = block(MonkeaniaModBlocks.PLASTIC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLASTIC_PICKAXE = REGISTRY.register("plastic_pickaxe", () -> new PlasticPickaxeItem());
	public static final RegistryObject<Item> PLASTIC_AXE = REGISTRY.register("plastic_axe", () -> new PlasticAxeItem());
	public static final RegistryObject<Item> PLASTIC_SWORD = REGISTRY.register("plastic_sword", () -> new PlasticSwordItem());
	public static final RegistryObject<Item> PLASTIC_SHOVEL = REGISTRY.register("plastic_shovel", () -> new PlasticShovelItem());
	public static final RegistryObject<Item> PLASTIC_HOE = REGISTRY.register("plastic_hoe", () -> new PlasticHoeItem());
	public static final RegistryObject<Item> PLASTIC_ARMOR_HELMET = REGISTRY.register("plastic_armor_helmet", () -> new PlasticArmorItem.Helmet());
	public static final RegistryObject<Item> PLASTIC_ARMOR_CHESTPLATE = REGISTRY.register("plastic_armor_chestplate",
			() -> new PlasticArmorItem.Chestplate());
	public static final RegistryObject<Item> PLASTIC_ARMOR_LEGGINGS = REGISTRY.register("plastic_armor_leggings",
			() -> new PlasticArmorItem.Leggings());
	public static final RegistryObject<Item> PLASTIC_ARMOR_BOOTS = REGISTRY.register("plastic_armor_boots", () -> new PlasticArmorItem.Boots());
	public static final RegistryObject<Item> SKY_LEAF = block(MonkeaniaModBlocks.SKY_LEAF, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WORM_BLADE = REGISTRY.register("worm_blade", () -> new WormBladeItem());
	public static final RegistryObject<Item> NUGAXE = REGISTRY.register("nugaxe", () -> new NugaxeItem());
	public static final RegistryObject<Item> UNCLE_JOE = REGISTRY.register("uncle_joe_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.UNCLE_JOE, -16772971, -14215, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> BUTTERFLYITEM = REGISTRY.register("butterflyitem", () -> new ButterflyitemItem());
	public static final RegistryObject<Item> ARACHNA = REGISTRY.register("arachna_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.ARACHNA, -16777216, -10066330, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPIDER_LEG = REGISTRY.register("spider_leg", () -> new SpiderLegItem());
	public static final RegistryObject<Item> ONE_LEG_SPIDER = REGISTRY.register("one_leg_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.ONE_LEG_SPIDER, -15263977, -3932160,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPIDER_SKIN = REGISTRY.register("spider_skin", () -> new SpiderSkinItem());
	public static final RegistryObject<Item> SKYDER = REGISTRY.register("skyder_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.SKYDER, -15066598, -16745832, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLY_ITEM = REGISTRY.register("fly_item", () -> new FlyItemItem());
	public static final RegistryObject<Item> FLY = REGISTRY.register("fly_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.FLY, -8158333, -10724260, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPIDER_ARMOR_HELMET = REGISTRY.register("spider_armor_helmet", () -> new SpiderArmorItem.Helmet());
	public static final RegistryObject<Item> SPIDER_ARMOR_CHESTPLATE = REGISTRY.register("spider_armor_chestplate",
			() -> new SpiderArmorItem.Chestplate());
	public static final RegistryObject<Item> SPIDER_ARMOR_LEGGINGS = REGISTRY.register("spider_armor_leggings", () -> new SpiderArmorItem.Leggings());
	public static final RegistryObject<Item> SPIDER_ARMOR_BOOTS = REGISTRY.register("spider_armor_boots", () -> new SpiderArmorItem.Boots());
	public static final RegistryObject<Item> ABYSSIUS = REGISTRY.register("abyssius_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.ABYSSIUS, -13421773, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLACK_BONE = REGISTRY.register("black_bone", () -> new BlackBoneItem());
	public static final RegistryObject<Item> ZEBRA = REGISTRY.register("zebra_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.ZEBRA, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RAW_ZEBRAMEAT = REGISTRY.register("raw_zebrameat", () -> new RawZebrameatItem());
	public static final RegistryObject<Item> COOKED_ZEBRA_MEAT = REGISTRY.register("cooked_zebra_meat", () -> new CookedZebraMeatItem());
	public static final RegistryObject<Item> BONE_SWORD = REGISTRY.register("bone_sword", () -> new BoneSwordItem());
	public static final RegistryObject<Item> TRICHINA = REGISTRY.register("trichina_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.TRICHINA, -2424832, -9605779, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(MonkeaniaModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(MonkeaniaModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(MonkeaniaModBlocks.SAPPHIRE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(MonkeaniaModBlocks.SAPPHIRE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = REGISTRY.register("sapphire_pickaxe", () -> new SapphirePickaxeItem());
	public static final RegistryObject<Item> SAPPHIRE_AXE = REGISTRY.register("sapphire_axe", () -> new SapphireAxeItem());
	public static final RegistryObject<Item> SAPPHIRE_SWORD = REGISTRY.register("sapphire_sword", () -> new SapphireSwordItem());
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = REGISTRY.register("sapphire_shovel", () -> new SapphireShovelItem());
	public static final RegistryObject<Item> SAPPHIRE_HOE = REGISTRY.register("sapphire_hoe", () -> new SapphireHoeItem());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_HELMET = REGISTRY.register("sapphire_armor_helmet", () -> new SapphireArmorItem.Helmet());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_CHESTPLATE = REGISTRY.register("sapphire_armor_chestplate",
			() -> new SapphireArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_LEGGINGS = REGISTRY.register("sapphire_armor_leggings",
			() -> new SapphireArmorItem.Leggings());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_BOOTS = REGISTRY.register("sapphire_armor_boots", () -> new SapphireArmorItem.Boots());
	public static final RegistryObject<Item> NECRONITE = REGISTRY.register("necronite", () -> new NecroniteItem());
	public static final RegistryObject<Item> NECRONITE_ORE = block(MonkeaniaModBlocks.NECRONITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NECRONITE_BLOCK = block(MonkeaniaModBlocks.NECRONITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NECRONITE_PICKAXE = REGISTRY.register("necronite_pickaxe", () -> new NecronitePickaxeItem());
	public static final RegistryObject<Item> NECRONITE_AXE = REGISTRY.register("necronite_axe", () -> new NecroniteAxeItem());
	public static final RegistryObject<Item> NECRONITE_SWORD = REGISTRY.register("necronite_sword", () -> new NecroniteSwordItem());
	public static final RegistryObject<Item> NECRONITE_SHOVEL = REGISTRY.register("necronite_shovel", () -> new NecroniteShovelItem());
	public static final RegistryObject<Item> NECRONITE_HOE = REGISTRY.register("necronite_hoe", () -> new NecroniteHoeItem());
	public static final RegistryObject<Item> NECRONITE_ARMOR_HELMET = REGISTRY.register("necronite_armor_helmet",
			() -> new NecroniteArmorItem.Helmet());
	public static final RegistryObject<Item> NECRONITE_ARMOR_CHESTPLATE = REGISTRY.register("necronite_armor_chestplate",
			() -> new NecroniteArmorItem.Chestplate());
	public static final RegistryObject<Item> NECRONITE_ARMOR_LEGGINGS = REGISTRY.register("necronite_armor_leggings",
			() -> new NecroniteArmorItem.Leggings());
	public static final RegistryObject<Item> NECRONITE_ARMOR_BOOTS = REGISTRY.register("necronite_armor_boots", () -> new NecroniteArmorItem.Boots());
	public static final RegistryObject<Item> DIRT_ARMOR_HELMET = REGISTRY.register("dirt_armor_helmet", () -> new DirtArmorItem.Helmet());
	public static final RegistryObject<Item> DIRT_ARMOR_CHESTPLATE = REGISTRY.register("dirt_armor_chestplate", () -> new DirtArmorItem.Chestplate());
	public static final RegistryObject<Item> DIRT_ARMOR_LEGGINGS = REGISTRY.register("dirt_armor_leggings", () -> new DirtArmorItem.Leggings());
	public static final RegistryObject<Item> DIRT_ARMOR_BOOTS = REGISTRY.register("dirt_armor_boots", () -> new DirtArmorItem.Boots());
	public static final RegistryObject<Item> EDIBLE_ROCK = REGISTRY.register("edible_rock", () -> new EdibleRockItem());
	public static final RegistryObject<Item> ALIEN_ROSE = block(MonkeaniaModBlocks.ALIEN_ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLACK_BONE_PICKAXE = REGISTRY.register("black_bone_pickaxe", () -> new BlackBonePickaxeItem());
	public static final RegistryObject<Item> BLACK_AXE = REGISTRY.register("black_axe", () -> new BlackAxeItem());
	public static final RegistryObject<Item> BLACK_SHOVEL = REGISTRY.register("black_shovel", () -> new BlackShovelItem());
	public static final RegistryObject<Item> BLACK_HOE = REGISTRY.register("black_hoe", () -> new BlackHoeItem());
	public static final RegistryObject<Item> EXCALIBUR = REGISTRY.register("excalibur", () -> new ExcaliburItem());
	public static final RegistryObject<Item> GHOST = REGISTRY.register("ghost_spawn_egg",
			() -> new ForgeSpawnEggItem(MonkeaniaModEntities.GHOST, -15527920, -11711926, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
