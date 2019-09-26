package kineticdevelopment.api.aspects;

import javax.annotation.Nullable;

public class Aspect {
	
	public enum AspectType {
		AIR,
		ARMOR,
		AURA,
		BEAST,
		CHAOS,
		CRAFTING,
		CRYSTAL,
		DARKNESS,
		DEATH,
		EARTH,
		ELDRITCH,
		ENDER,
		ENVY,
		EXCHANGE,
		FABRIC,
		FIRE,
		FLESH,
		FLIGHT,
		GLUTTONY,
		GREED,
		HARVEST,
		HUMAN,
		ICE,
		IMPRISON,
		JOURNEY,
		LIFE,
		LIGHT,
		LUST,
		MACHINE,
		MANA,
		METAL,
		MINING,
		MOVEMENT,
		NETHER,
		ORDER,
		PLANT,
		PRIDE,
		SEEDS,
		SENSES,
		SLIME,
		SLOTH,
		SPIRIT,
		STRENGTH,
		TAINT,
		TOOL,
		TREE,
		UNDEAD,
		VACUUM,
		VENOM,
		WATER,
		WEAPON,
		WIND,
		WRATH
	}
	
	@Nullable
	public static AspectType getAspectByName(@Nullable String name) throws AspectNotFoundException {
		switch (name) {
			default: throw new AspectNotFoundException("Aspect "+name+" does not exist!");
			case "Air": return AspectType.AIR;
			case "Armor": return AspectType.ARMOR;
			case "Aura": return AspectType.AURA;
			case "Beast": return AspectType.BEAST;
			case "Chaos": return AspectType.CHAOS;
			case "Crafting": return AspectType.CRAFTING;
			case "Crystal": return AspectType.CRYSTAL;
			case "Darkness": return AspectType.DARKNESS;
			case "Death": return AspectType.DEATH;
			case "Earth": return AspectType.EARTH;
			case "Eldritch": return AspectType.ELDRITCH;
			case "Ender": return AspectType.ENDER;
			case "Envy": return AspectType.ENVY;
			case "Exchange": return AspectType.EXCHANGE;
			case "Fabric": return AspectType.FABRIC;
			case "Fire": return AspectType.FIRE;
			case "Flesh": return AspectType.FLESH;
			case "Flight": return AspectType.FLIGHT;
			case "Gluttony": return AspectType.GLUTTONY;
			case "Greed": return AspectType.GREED;
			case "Harvest": return AspectType.HARVEST;
			case "Human": return AspectType.HUMAN;
			case "Ice": return AspectType.ICE;
			case "Imprison": return AspectType.IMPRISON;
			case "Journey": return AspectType.JOURNEY;
			case "Life": return AspectType.LIFE;
			case "Light": return AspectType.LIGHT;
			case "Lust": return AspectType.LUST;
			case "Machine": return AspectType.MACHINE;
			case "Mana": return AspectType.MANA;
			case "Metal": return AspectType.METAL;
			case "Mining": return AspectType.MINING;
			case "Movement": return AspectType.MOVEMENT;
			case "Nether": return AspectType.NETHER;
			case "Order": return AspectType.ORDER;
			case "Plant": return AspectType.PLANT;
			case "Pride": return AspectType.PRIDE;
			case "Seeds": return AspectType.SEEDS;
			case "Senses": return AspectType.SENSES;
			case "Slime": return AspectType.SLIME;
			case "Sloth": return AspectType.SLOTH;
			case "Spririt": return AspectType.SPIRIT;
			case "Strength": return AspectType.STRENGTH;
			case "Taint": return AspectType.TAINT;
			case "Tool": return AspectType.TOOL;
			case "Tree": return AspectType.TREE;
			case "Undead": return AspectType.UNDEAD;
			case "Vacuum": return AspectType.VACUUM;
			case "Venom": return AspectType.VENOM;
			case "Water": return AspectType.WATER;
			case "Weapon": return AspectType.WEAPON;
			case "Wind": return AspectType.WIND;
			case "Wrath": return AspectType.WRATH;
		}
	}
}
