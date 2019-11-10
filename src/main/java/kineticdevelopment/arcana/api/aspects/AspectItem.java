package kineticdevelopment.arcana.api.aspects;

import java.util.List;

import javax.annotation.Nullable;

import kineticdevelopment.arcana.api.registry.ArcanaItems;
import kineticdevelopment.arcana.api.registry.ArcanaParticles;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * All aspect's items should use this class
 * @author Atlas
 * @author SleepingTea
 * @see Aspect
 */
public class AspectItem extends Item {

	public AspectItem(Properties properties) {
		super(properties);
	}


	@OnlyIn(Dist.CLIENT)
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

		switch (stack.getDisplayName().getFormattedText().toUpperCase()) {
			case "AIR":  tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Aer")); break;
			case "ARMOUR": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Tutamen")); break;
			case "AURA": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Auram")); break;
			case "BEAST": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Bestia")); break;
			case "CHAOS": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Perditio")); break;
			case "CRAFTING": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Innectis")); break;
			case "CRYSTAL": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Vitreus")); break;
			case "DARKNESS": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Tenebrae")); break;
			case "DEATH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Vitreus")); break;
			case "EARTH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Terra")); break;
			case "ELDRITCH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Eldritch")); break;
			case "ENDER": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Ender")); break;
			case "ENVY": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Invidia")); break;
			case "EXCHANGE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Permutatio")); break;
			case "FABRIC": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Textum")); break;
			case "FIRE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Ignis")); break;
			case "FLESH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Corpus")); break;
			case "FLIGHT": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Volatus")); break;
			case "GLUTTONY": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Guttur")); break;
			case "GREED": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Cupiditas")); break;
			case "HARVEST":tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Meto")); break;
			case "HUMAN": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Humanus")); break;
			case "ICE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Gelum")); break;
			case "IMPRISON": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Claudo")); break;
			case "JOURNEY": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Iter")); break;
			case "LIFE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Victus")); break;
			case "LIGHT":tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Lux")); break;
			case "LUST": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Libidine")); break;
			case "MACHINE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Machina")); break;
			case "MANA": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Mana")); break;
			case "METAL": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Metallum")); break;
			case "MINING": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Perfodio")); break;
			case "MOVEMENT": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Motus")); break;
			case "NETHER": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Nether")); break;
			case "ORDER": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Ordo")); break;
			case "PLANT": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Herba")); break;
			case "PRIDE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Iacto")); break;
			case "SEEDS": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Semina")); break;
			case "SENSES": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Sensus")); break;
			case "SLIME": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Limus")); break;
			case "SLOTH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Ignavia")); break;
			case "SPIRIT": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Spiritus")); break;
			case "STRENGTH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Lacertus")); break;
			case "TAINT": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Taint")); break;
			case "TOOL": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Instrumentum")); break;
			case "TREE": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Arbor")); break;
			case "UNDEAD": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Exanimis")); break;
			case "VACUUM": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Vacuos")); break;
			case "VENOM": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Venenum")); break;
			case "WATER": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Aqua")); break;
			case "WEAPON": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Telum")); break;
			case "WIND": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Ventus")); break;
			case "WRATH": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Concussus")); break;
			case "OVERWORLD": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Overworld")); break;
			case "ENERGY": tooltip.add(new StringTextComponent(TextFormatting.DARK_AQUA +"Potentia")); break;

		}
	}

	public static BasicParticleType getParticle(AspectItem item) {
		switch (item.getName().getFormattedText().toUpperCase()) {
			case "AIR":
				return ArcanaParticles.ASPECT_AIR_PARTICLE;
			case "ARMOUR":
				return ArcanaParticles.ASPECT_ARMOUR_PARTICLE;
			case "AURA":
				return ArcanaParticles.ASPECT_AURA_PARTICLE;
			case "BEAST":
				return ArcanaParticles.ASPECT_BEAST_PARTICLE;
			case "CHAOS":
				return ArcanaParticles.ASPECT_CHAOS_PARTICLE;
			case "CRAFTING":
				return ArcanaParticles.ASPECT_CRAFTING_PARTICLE;
			case "CRYSTAL":
				return ArcanaParticles.ASPECT_CRYSTAL_PARTICLE;
			case "DARKNESS":
				return ArcanaParticles.ASPECT_DARKNESS_PARTICLE;
			case "DEATH":
				return ArcanaParticles.ASPECT_DEATH_PARTICLE;
			case "EARTH":
				return ArcanaParticles.ASPECT_EARTH_PARTICLE;
			case "ELDRITCH":
				return ArcanaParticles.ELDRITCH_NODE_PARTICLE;
			case "ENDER":
				return ArcanaParticles.ASPECT_ENDER_PARTICLE;
			case "ENERGY":
				return ArcanaParticles.ASPECT_ENERGY_PARTICLE;
			case "ENVY":
				return ArcanaParticles.ASPECT_ENVY_PARTICLE;
			case "EXCHANGE":
				return ArcanaParticles.ASPECT_EXCHANGE_PARTICLE;
			case "FABRIC":
				return ArcanaParticles.ASPECT_FABRIC_PARTICLE;
			case "FIRE":
				return ArcanaParticles.ASPECT_FIRE_PARTICLE;
			case "FLESH":
				return ArcanaParticles.ASPECT_FLESH_PARTICLE;
			case "FLIGHT":
				return ArcanaParticles.ASPECT_FLIGHT_PARTICLE;
			case "GLUTTONY":
				return ArcanaParticles.ASPECT_GLUTTONY_PARTICLE;
			case "GREED":
				return ArcanaParticles.ASPECT_GREED_PARTICLE;
			case "HARVEST":
				return ArcanaParticles.ASPECT_HARVEST_PARTICLE;
			case "HUMAN":
				return ArcanaParticles.ASPECT_HUMAN_PARTICLE;
			case "ICE":
				return ArcanaParticles.ASPECT_ICE_PARTICLE;
			case "IMPRISON":
				return ArcanaParticles.ASPECT_IMPRISON_PARTICLE;
			case "JOURNEY":
				return ArcanaParticles.ASPECT_JOURNEY_PARTICLE;
			case "LIFE":
				return ArcanaParticles.ASPECT_LIFE_PARTICLE;
			case "LIGHT":
				return ArcanaParticles.ASPECT_LIGHT_PARTICLE;
			case "LUST":
				return ArcanaParticles.ASPECT_LUST_PARTICLE;
			case "MACHINE":
				return ArcanaParticles.ASPECT_MACHINE_PARTICLE;
			case "MANA":
				return ArcanaParticles.ASPECT_MANA_PARTICLE;
			case "METAL":
				return ArcanaParticles.ASPECT_METAL_PARTICLE;
			case "MINING":
				return ArcanaParticles.ASPECT_MINING_PARTICLE;
			case "MOVEMENT":
				return ArcanaParticles.ASPECT_MOVEMENT_PARTICLE;
			case "NETHER":
				return ArcanaParticles.ASPECT_NETHER_PARTICLE;
			case "ORDER":
				return ArcanaParticles.ASPECT_ORDER_PARTICLE;
			case "OVERWORLD":
				return ArcanaParticles.ASPECT_OVERWORLD_PARTICLE;
			case "PLANT":
				return ArcanaParticles.ASPECT_PLANT_PARTICLE;
			case "PRIDE":
				return ArcanaParticles.ASPECT_PRIDE_PARTICLE;
			case "SEEDS":
				return ArcanaParticles.ASPECT_SEEDS_PARTICLE;
			case "SENSES":
				return ArcanaParticles.ASPECT_SENSES_PARTICLE;
			case "SLIME":
				return ArcanaParticles.ASPECT_SLIME_PARTICLE;
			case "SLOTH":
				return ArcanaParticles.ASPECT_SLOTH_PARTICLE;
			case "SPIRIT":
				return ArcanaParticles.ASPECT_SPIRIT_PARTICLE;
			case "STRENGTH":
				return ArcanaParticles.ASPECT_STRENGTH_PARTICLE;
			case "TAINT":
				return ArcanaParticles.ASPECT_TAINT_PARTICLE;
			case "TOOL":
				return ArcanaParticles.ASPECT_TOOL_PARTICLE;
			case "TREE":
				return ArcanaParticles.ASPECT_TREE_PARTICLE;
			case "UNDEAD":
				return ArcanaParticles.ASPECT_UNDEAD_PARTICLE;
			case "VACUUM":
				return ArcanaParticles.ASPECT_VACUUM_PARTICLE;
			case "VENOM":
				return ArcanaParticles.ASPECT_VENOM_PARTICLE;
			case "WATER":
				return ArcanaParticles.ASPECT_WATER_PARTICLE;
			case "WEAPON":
				return ArcanaParticles.ASPECT_WEAPON_PARTICLE;
			case "WIND":
				return ArcanaParticles.ASPECT_WIND_PARTICLE;
			case "WRATH":
				return ArcanaParticles.ASPECT_WRATH_PARTICLE;
			default:
				break;
		}
		return ParticleTypes.BARRIER;
	}
}





