package net.kineticdevelopment.arcana.utilities;

import net.kineticdevelopment.arcana.common.init.ItemInit;
import net.minecraft.item.Item;

public class Aspect {
	private final String name;
	private final Item aspectItem;
	
	public Aspect(Item aspectItem) {
		this.name = aspectItem.getName().getFormattedText();
		this.aspectItem = aspectItem;
	}
	
	public String getName() {
		return name;
	}
	
	public Item getAspectItem() {
		return aspectItem;
	}
	
	/**
	 * Returns an aspect by name
	 * @Specifics First letter of name must be capital
	 * @param name
	 * @return Aspect
	 */
	public static Aspect getAspectByName(String name) {
		//Needs all aspects added
		switch(name) {
			default : return null;
			
			case "Earth": return new Aspect(ItemInit.EARTH);
			case "Ice": return new Aspect(ItemInit.ICE);
		}
	}
}
