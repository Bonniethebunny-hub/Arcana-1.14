package kineticdevelopment.arcana.client.gui;

import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NewAspectGUI extends Screen {

	public NewAspectGUI(ITextComponent titleIn, AspectType aspect) {
		super(titleIn);
		this.drawRightAlignedString(Minecraft.getInstance().fontRenderer, "You've discovered the aspect "+aspect.name(), 100, 100, 100);
	}
	
}
