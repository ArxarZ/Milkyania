
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.monkeania.entity.ZebraEntity;
import net.mcreator.monkeania.entity.WormEntity;
import net.mcreator.monkeania.entity.UncleJoeEntity;
import net.mcreator.monkeania.entity.TrichinaEntity;
import net.mcreator.monkeania.entity.SkyderEntity;
import net.mcreator.monkeania.entity.OneLegSpiderEntity;
import net.mcreator.monkeania.entity.GoldenWormEntityEntity;
import net.mcreator.monkeania.entity.GhostEntity;
import net.mcreator.monkeania.entity.FlyEntity;
import net.mcreator.monkeania.entity.ButterflyEntity;
import net.mcreator.monkeania.entity.BurntSlimeEntity;
import net.mcreator.monkeania.entity.BurntSlimeAttackEntity;
import net.mcreator.monkeania.entity.ArachnaEntity;
import net.mcreator.monkeania.entity.AntEntity;
import net.mcreator.monkeania.entity.AbyssiusEntity;
import net.mcreator.monkeania.MonkeaniaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonkeaniaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MonkeaniaMod.MODID);
	public static final RegistryObject<EntityType<BurntSlimeEntity>> BURNT_SLIME = register("burnt_slime",
			EntityType.Builder.<BurntSlimeEntity>of(BurntSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BurntSlimeEntity::new)

					.sized(0.4f, 1f));
	public static final RegistryObject<EntityType<BurntSlimeAttackEntity>> BURNT_SLIME_ATTACK = register("burnt_slime_attack",
			EntityType.Builder.<BurntSlimeAttackEntity>of(BurntSlimeAttackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BurntSlimeAttackEntity::new)

					.sized(0.4f, 1f));
	public static final RegistryObject<EntityType<WormEntity>> WORM = register("worm",
			EntityType.Builder.<WormEntity>of(WormEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WormEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<GoldenWormEntityEntity>> GOLDEN_WORM_ENTITY = register("golden_worm_entity",
			EntityType.Builder.<GoldenWormEntityEntity>of(GoldenWormEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldenWormEntityEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<AntEntity>> ANT = register("ant",
			EntityType.Builder.<AntEntity>of(AntEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AntEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<ButterflyEntity>> BUTTERFLY = register("butterfly",
			EntityType.Builder.<ButterflyEntity>of(ButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ButterflyEntity::new)

					.sized(0.2f, 0.1f));
	public static final RegistryObject<EntityType<UncleJoeEntity>> UNCLE_JOE = register("uncle_joe",
			EntityType.Builder.<UncleJoeEntity>of(UncleJoeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80)
					.setUpdateInterval(3).setCustomClientFactory(UncleJoeEntity::new)

					.sized(0.5f, 2f));
	public static final RegistryObject<EntityType<ArachnaEntity>> ARACHNA = register("arachna",
			EntityType.Builder.<ArachnaEntity>of(ArachnaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ArachnaEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<OneLegSpiderEntity>> ONE_LEG_SPIDER = register("one_leg_spider",
			EntityType.Builder.<OneLegSpiderEntity>of(OneLegSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OneLegSpiderEntity::new)

					.sized(0.5f, 2f));
	public static final RegistryObject<EntityType<SkyderEntity>> SKYDER = register("skyder",
			EntityType.Builder.<SkyderEntity>of(SkyderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SkyderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlyEntity>> FLY = register("fly",
			EntityType.Builder.<FlyEntity>of(FlyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FlyEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<AbyssiusEntity>> ABYSSIUS = register("abyssius",
			EntityType.Builder.<AbyssiusEntity>of(AbyssiusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AbyssiusEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<ZebraEntity>> ZEBRA = register("zebra",
			EntityType.Builder.<ZebraEntity>of(ZebraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZebraEntity::new)

					.sized(1.5f, 1.6f));
	public static final RegistryObject<EntityType<TrichinaEntity>> TRICHINA = register("trichina",
			EntityType.Builder.<TrichinaEntity>of(TrichinaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TrichinaEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<GhostEntity>> GHOST = register("ghost",
			EntityType.Builder.<GhostEntity>of(GhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GhostEntity::new)

					.sized(0.4f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BurntSlimeEntity.init();
			BurntSlimeAttackEntity.init();
			WormEntity.init();
			GoldenWormEntityEntity.init();
			AntEntity.init();
			ButterflyEntity.init();
			UncleJoeEntity.init();
			ArachnaEntity.init();
			OneLegSpiderEntity.init();
			SkyderEntity.init();
			FlyEntity.init();
			AbyssiusEntity.init();
			ZebraEntity.init();
			TrichinaEntity.init();
			GhostEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BURNT_SLIME.get(), BurntSlimeEntity.createAttributes().build());
		event.put(BURNT_SLIME_ATTACK.get(), BurntSlimeAttackEntity.createAttributes().build());
		event.put(WORM.get(), WormEntity.createAttributes().build());
		event.put(GOLDEN_WORM_ENTITY.get(), GoldenWormEntityEntity.createAttributes().build());
		event.put(ANT.get(), AntEntity.createAttributes().build());
		event.put(BUTTERFLY.get(), ButterflyEntity.createAttributes().build());
		event.put(UNCLE_JOE.get(), UncleJoeEntity.createAttributes().build());
		event.put(ARACHNA.get(), ArachnaEntity.createAttributes().build());
		event.put(ONE_LEG_SPIDER.get(), OneLegSpiderEntity.createAttributes().build());
		event.put(SKYDER.get(), SkyderEntity.createAttributes().build());
		event.put(FLY.get(), FlyEntity.createAttributes().build());
		event.put(ABYSSIUS.get(), AbyssiusEntity.createAttributes().build());
		event.put(ZEBRA.get(), ZebraEntity.createAttributes().build());
		event.put(TRICHINA.get(), TrichinaEntity.createAttributes().build());
		event.put(GHOST.get(), GhostEntity.createAttributes().build());
	}
}
