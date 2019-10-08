package kineticdevelopment.arcana.api.aspects;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
}





