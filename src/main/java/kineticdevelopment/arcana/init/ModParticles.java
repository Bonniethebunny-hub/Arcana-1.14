package kineticdevelopment.arcana.init;

import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import kineticdevelopment.arcana.client.particles.aspects.AspectAirParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectArmourParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectAuraParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectBeastParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectChaosParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectCraftingParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectCrystalParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectDarknessParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectDeathParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectEarthParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectEldritchParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectEnderParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectEnergyParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectEnvyParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectExchangeParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectFabricParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectFireParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectFleshParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectFlightParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectGluttonyParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectGreedParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectHarvestParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectHumanParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectIceParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectImprisonParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectJourneyParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectLifeParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectLightParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectLustParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectMachineParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectManaParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectMetalParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectMindParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectMiningParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectMovementParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectNetherParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectOrderParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectOverworldParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectPlantParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectPrideParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectSeedsParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectSensesParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectSlimeParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectSlothParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectSpiritParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectStrengthParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectTaintParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectToolParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectTreeParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectUndeadParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectVacuumParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectVenomParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectWaterParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectWeaponParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectWindParticle;
import kineticdevelopment.arcana.client.particles.aspects.AspectWrathParticle;
import kineticdevelopment.arcana.client.particles.nodes.BrightNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.EldritchNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.FadingNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.HungryNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.NormalNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.PureNodeParticle;
import kineticdevelopment.arcana.client.particles.nodes.TaintedNodeParticle;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount0;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount1;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount2;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount3;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount4;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount5;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount6;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount7;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount8;
import kineticdevelopment.arcana.client.particles.numbers.AspectCount9;
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

        //System.out.println("Registering aspect number particle factories...");
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_0, new AspectCount0.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_1, new AspectCount1.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_2, new AspectCount2.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_3, new AspectCount3.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_4, new AspectCount4.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_5, new AspectCount5.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_6, new AspectCount6.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_7, new AspectCount7.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_8, new AspectCount8.Factory());
        Minecraft.getInstance().particles.registerFactory(ArcanaParticles.NUMBER_PARTICLE_9, new AspectCount9.Factory());
    }

    @SubscribeEvent
    public static void registerParticles(final RegistryEvent.Register<ParticleType<?>> event)
    {
        //System.out.println("Registering particles...");
        BasicParticleType type = ArcanaParticles.BRIGHT_NODE_PARTICLE;
    }
}
