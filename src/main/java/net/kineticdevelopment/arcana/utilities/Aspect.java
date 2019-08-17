package net.kineticdevelopment.arcana.utilities;

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
}
