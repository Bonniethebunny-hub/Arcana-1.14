package kineticdevelopment.arcana.api.registry;

import kineticdevelopment.arcana.core.Arcana;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.registry.Registry;

public class ArcanaParticles extends ParticleTypes {

    //Particles used to display the nodes themselves
    public static final BasicParticleType BRIGHT_NODE_PARTICLE = register(Arcana.MOD_ID + ":bright_node_particle", true);
    public static final BasicParticleType ELDRITCH_NODE_PARTICLE = register(Arcana.MOD_ID + ":eldritch_node_particle", true);
    public static final BasicParticleType FADING_NODE_PARTICLE = register(Arcana.MOD_ID + ":fading_node_particle", true);
    public static final BasicParticleType HUNGRY_NODE_PARTICLE = register(Arcana.MOD_ID + ":hungry_node_particle", true);
    public static final BasicParticleType NORMAL_NODE_PARTICLE = register(Arcana.MOD_ID + ":normal_node_particle", true);
    public static final BasicParticleType PURE_NODE_PARTICLE = register(Arcana.MOD_ID + ":pure_node_particle", true);
    public static final BasicParticleType TAINTED_NODE_PARTICLE = register(Arcana.MOD_ID + ":tainted_node_particle", true);

    //Particles to display node aspects
    public static final BasicParticleType ASPECT_AIR_PARTICLE = register(Arcana.MOD_ID + ":aspect_air_particle", true);
    public static final BasicParticleType ASPECT_ARMOUR_PARTICLE = register(Arcana.MOD_ID + ":aspect_armour_particle", true);
    public static final BasicParticleType ASPECT_AURA_PARTICLE = register(Arcana.MOD_ID + ":aspect_aura_particle", true);
    public static final BasicParticleType ASPECT_BEAST_PARTICLE = register(Arcana.MOD_ID + ":aspect_beast_particle", true);
    public static final BasicParticleType ASPECT_CHAOS_PARTICLE = register(Arcana.MOD_ID + ":aspect_chaos_particle", true);
    public static final BasicParticleType ASPECT_CRAFTING_PARTICLE = register(Arcana.MOD_ID + ":aspect_crafting_particle", true);
    public static final BasicParticleType ASPECT_CRYSTAL_PARTICLE = register(Arcana.MOD_ID + ":aspect_crystal_particle", true);
    public static final BasicParticleType ASPECT_DARKNESS_PARTICLE = register(Arcana.MOD_ID + ":aspect_darkness_particle", true);
    public static final BasicParticleType ASPECT_DEATH_PARTICLE = register(Arcana.MOD_ID + ":aspect_death_particle", true);
    public static final BasicParticleType ASPECT_EARTH_PARTICLE = register(Arcana.MOD_ID + ":aspect_earth_particle", true);
    public static final BasicParticleType ASPECT_ELDRITCH_PARTICLE = register(Arcana.MOD_ID + ":aspect_eldritch_particle", true);
    public static final BasicParticleType ASPECT_ENDER_PARTICLE = register(Arcana.MOD_ID + ":aspect_ender_particle", true);
    public static final BasicParticleType ASPECT_ENERGY_PARTICLE = register(Arcana.MOD_ID + ":aspect_energy_particle", true);
    public static final BasicParticleType ASPECT_ENVY_PARTICLE = register(Arcana.MOD_ID + ":aspect_envy_particle", true);
    public static final BasicParticleType ASPECT_EXCHANGE_PARTICLE = register(Arcana.MOD_ID + ":aspect_exchange_particle", true);;
    public static final BasicParticleType ASPECT_FABRIC_PARTICLE = register(Arcana.MOD_ID + ":aspect_fabric_particle", true);
    public static final BasicParticleType ASPECT_FIRE_PARTICLE = register(Arcana.MOD_ID + ":aspect_fire_particle", true);;
    public static final BasicParticleType ASPECT_FLESH_PARTICLE = register(Arcana.MOD_ID + ":aspect_flesh_particle", true);
    public static final BasicParticleType ASPECT_FLIGHT_PARTICLE = register(Arcana.MOD_ID + ":aspect_flight_particle", true);
    public static final BasicParticleType ASPECT_GLUTTONY_PARTICLE = register(Arcana.MOD_ID + ":aspect_gluttony_particle", true);
    public static final BasicParticleType ASPECT_GREED_PARTICLE = register(Arcana.MOD_ID + ":aspect_greed_particle", true);
    public static final BasicParticleType ASPECT_HARVEST_PARTICLE = register(Arcana.MOD_ID + ":aspect_harvest_particle", true);
    public static final BasicParticleType ASPECT_HUMAN_PARTICLE = register(Arcana.MOD_ID + ":aspect_human_particle", true);
    public static final BasicParticleType ASPECT_ICE_PARTICLE = register(Arcana.MOD_ID + ":aspect_ice_particle", true);
    public static final BasicParticleType ASPECT_IMPRISON_PARTICLE = register(Arcana.MOD_ID + ":aspect_imprison_particle", true);
    public static final BasicParticleType ASPECT_JOURNEY_PARTICLE = register(Arcana.MOD_ID + ":aspect_journey_particle", true);
    public static final BasicParticleType ASPECT_LIFE_PARTICLE = register(Arcana.MOD_ID + ":aspect_life_particle", true);
    public static final BasicParticleType ASPECT_LIGHT_PARTICLE = register(Arcana.MOD_ID + ":aspect_light_particle", true);
    public static final BasicParticleType ASPECT_LUST_PARTICLE = register(Arcana.MOD_ID + ":aspect_lust_particle", true);
    public static final BasicParticleType ASPECT_MACHINE_PARTICLE = register(Arcana.MOD_ID + ":aspect_machine_particle", true);
    public static final BasicParticleType ASPECT_MANA_PARTICLE = register(Arcana.MOD_ID + ":aspect_mana_particle", true);
    public static final BasicParticleType ASPECT_METAL_PARTICLE = register(Arcana.MOD_ID + ":aspect_metal_particle", true);
    public static final BasicParticleType ASPECT_MIND_PARTICLE = register(Arcana.MOD_ID + ":aspect_mind_particle", true);
    public static final BasicParticleType ASPECT_MINING_PARTICLE = register(Arcana.MOD_ID + ":aspect_mining_particle", true);
    public static final BasicParticleType ASPECT_MOVEMENT_PARTICLE = register(Arcana.MOD_ID + ":aspect_movement_particle", true);
    public static final BasicParticleType ASPECT_NETHER_PARTICLE = register(Arcana.MOD_ID + ":aspect_nether_particle", true);
    public static final BasicParticleType ASPECT_ORDER_PARTICLE = register(Arcana.MOD_ID + ":aspect_order_particle", true);
    public static final BasicParticleType ASPECT_OVERWORLD_PARTICLE = register(Arcana.MOD_ID + ":aspect_overworld_particle", true);
    public static final BasicParticleType ASPECT_PLANT_PARTICLE = register(Arcana.MOD_ID + ":aspect_plant_particle", true);
    public static final BasicParticleType ASPECT_PRIDE_PARTICLE = register(Arcana.MOD_ID + ":aspect_pride_particle", true);
    public static final BasicParticleType ASPECT_SEEDS_PARTICLE = register(Arcana.MOD_ID + ":aspect_seeds_particle", true);
    public static final BasicParticleType ASPECT_SENSES_PARTICLE = register(Arcana.MOD_ID + ":aspect_senses_particle", true);
    public static final BasicParticleType ASPECT_SLIME_PARTICLE = register(Arcana.MOD_ID + ":aspect_slime_particle", true);
    public static final BasicParticleType ASPECT_SLOTH_PARTICLE = register(Arcana.MOD_ID + ":aspect_sloth_particle", true);
    public static final BasicParticleType ASPECT_SPIRIT_PARTICLE = register(Arcana.MOD_ID + ":aspect_spirit_particle", true);
    public static final BasicParticleType ASPECT_STRENGTH_PARTICLE = register(Arcana.MOD_ID + ":aspect_strength_particle", true);
    public static final BasicParticleType ASPECT_TAINT_PARTICLE = register(Arcana.MOD_ID + ":aspect_taint_particle", true);
    public static final BasicParticleType ASPECT_TOOL_PARTICLE = register(Arcana.MOD_ID + ":aspect_tool_particle", true);
    public static final BasicParticleType ASPECT_TREE_PARTICLE = register(Arcana.MOD_ID + ":aspect_tree_particle", true);
    public static final BasicParticleType ASPECT_UNDEAD_PARTICLE = register(Arcana.MOD_ID + ":aspect_undead_particle", true);
    public static final BasicParticleType ASPECT_VACUUM_PARTICLE = register(Arcana.MOD_ID + ":aspect_vacuum_particle", true);
    public static final BasicParticleType ASPECT_VENOM_PARTICLE = register(Arcana.MOD_ID + ":aspect_venom_particle", true);
    public static final BasicParticleType ASPECT_WATER_PARTICLE = register(Arcana.MOD_ID + ":aspect_water_particle", true);
    public static final BasicParticleType ASPECT_WEAPON_PARTICLE = register(Arcana.MOD_ID + ":aspect_weapon_particle", true);
    public static final BasicParticleType ASPECT_WIND_PARTICLE = register(Arcana.MOD_ID + ":aspect_wind_particle", true);
    public static final BasicParticleType ASPECT_WRATH_PARTICLE = register(Arcana.MOD_ID + ":aspect_wrath_particle", true);

    private static BasicParticleType register(String key, boolean alwaysShow) {
        System.out.println("Registering particle: " + key);
        return (BasicParticleType) Registry.<ParticleType<? extends IParticleData>>register(Registry.PARTICLE_TYPE, key, new BasicParticleType(alwaysShow));
    }

    private static <T extends IParticleData> ParticleType<T> register(String key, IParticleData.IDeserializer<T> deserializer) {
        return Registry.register(Registry.PARTICLE_TYPE, key, new ParticleType<>(false, deserializer));
    }
}
