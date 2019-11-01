package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.particles.aspects.*;
import kineticdevelopment.arcana.client.particles.nodes.*;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModParticles {

    @SubscribeEvent
    public static void registerParticles(final ParticleFactoryRegisterEvent event)
    {
        //System.out.println("Registering node particle factories...");
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.BRIGHT_NODE_PARTICLE, new BrightNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ELDRITCH_NODE_PARTICLE, new EldritchNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.FADING_NODE_PARTICLE, new FadingNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.HUNGRY_NODE_PARTICLE, new HungryNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NORMAL_NODE_PARTICLE, new NormalNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.PURE_NODE_PARTICLE, new PureNodeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.TAINTED_NODE_PARTICLE, new TaintedNodeParticle.Factory());

        //System.out.println("Registering aspect particle factories...");
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_AIR_PARTICLE, new AspectAirParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ARMOUR_PARTICLE, new AspectArmourParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_AURA_PARTICLE, new AspectAuraParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_BEAST_PARTICLE, new AspectBeastParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_CHAOS_PARTICLE, new AspectChaosParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_CRAFTING_PARTICLE, new AspectCraftingParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_CRYSTAL_PARTICLE, new AspectCrystalParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_DARKNESS_PARTICLE, new AspectDarknessParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_DEATH_PARTICLE, new AspectDeathParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_EARTH_PARTICLE, new AspectEarthParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ELDRITCH_PARTICLE, new AspectEldritchParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ENDER_PARTICLE, new AspectEnderParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ENERGY_PARTICLE, new AspectEnergyParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ENVY_PARTICLE, new AspectEnvyParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_EXCHANGE_PARTICLE, new AspectExchangeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_FABRIC_PARTICLE, new AspectFabricParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_FIRE_PARTICLE, new AspectFireParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_FLESH_PARTICLE, new AspectFleshParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_FLIGHT_PARTICLE, new AspectFlightParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_GLUTTONY_PARTICLE, new AspectGluttonyParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_GREED_PARTICLE, new AspectGreedParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_HARVEST_PARTICLE, new AspectHarvestParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_HUMAN_PARTICLE, new AspectHumanParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ICE_PARTICLE, new AspectIceParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_IMPRISON_PARTICLE, new AspectImprisonParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_JOURNEY_PARTICLE, new AspectJourneyParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_LIFE_PARTICLE, new AspectLifeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_LIGHT_PARTICLE, new AspectLightParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_LUST_PARTICLE, new AspectLustParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_MACHINE_PARTICLE, new AspectMachineParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_MANA_PARTICLE, new AspectManaParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_METAL_PARTICLE, new AspectMetalParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_MIND_PARTICLE, new AspectMindParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_MINING_PARTICLE, new AspectMiningParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_MOVEMENT_PARTICLE, new AspectMovementParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_NETHER_PARTICLE, new AspectNetherParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_ORDER_PARTICLE, new AspectOrderParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_OVERWORLD_PARTICLE, new AspectOverworldParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_PLANT_PARTICLE, new AspectPlantParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_PRIDE_PARTICLE, new AspectPrideParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_SEEDS_PARTICLE, new AspectSeedsParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_SENSES_PARTICLE, new AspectSensesParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_SLIME_PARTICLE, new AspectSlimeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_SLOTH_PARTICLE, new AspectSlothParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_SPIRIT_PARTICLE, new AspectSpiritParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_STRENGTH_PARTICLE, new AspectStrengthParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_TAINT_PARTICLE, new AspectTaintParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_TOOL_PARTICLE, new AspectToolParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_TREE_PARTICLE, new AspectTreeParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_UNDEAD_PARTICLE, new AspectUndeadParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_VACUUM_PARTICLE, new AspectVacuumParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_VENOM_PARTICLE, new AspectVenomParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_WATER_PARTICLE, new AspectWaterParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_WEAPON_PARTICLE, new AspectWeaponParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_WIND_PARTICLE, new AspectWindParticle.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.ASPECT_WRATH_PARTICLE, new AspectWrathParticle.Factory());
    }

    @SubscribeEvent
    public static void registerParticles(final RegistryEvent.Register<ParticleType<?>> event)
    {
        //System.out.println("Registering particles...");
        BasicParticleType type = ArcanaParticles.BRIGHT_NODE_PARTICLE;
    }
}
