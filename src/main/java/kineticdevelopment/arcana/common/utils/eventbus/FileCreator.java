package kineticdevelopment.arcana.common.utils.eventbus;

import java.io.File;
import java.io.IOException;

import kineticdevelopment.arcana.api.misc.ArcanaFileUtils;
import kineticdevelopment.arcana.common.utils.Constants;
import kineticdevelopment.arcana.common.utils.taint.TaintLevelHandler;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FileCreator {
	
	@SubscribeEvent
	public static void onWorldLoad(PlayerLoggedInEvent event) {
		File dir = ArcanaFileUtils.getWorldDirectory(event.getPlayer().world);
		
		File aspectDataDir = new File(dir, "Arcana/aspectdata");
		aspectDataDir.mkdirs();
		File playerAspectData = new File(aspectDataDir, event.getPlayer().getCachedUniqueIdString()+".aspectpool");
		TaintLevelHandler.createTaintLevelFile(event.getPlayer().world);
		
		if(!playerAspectData.exists()) {
			try {
				playerAspectData.createNewFile();
				Constants.LOGGER.info("Created aspectpool file for user "+event.getPlayer().getName().getFormattedText()+" at "+playerAspectData.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File researchDataDir = new File(dir, "Arcana/researchdata");
		researchDataDir.mkdirs();  	  
		File playerResearchBlackList = new File(researchDataDir, event.getPlayer().getCachedUniqueIdString()+".researchblacklist");
		
		if(!playerResearchBlackList.exists()) {
			try {
				playerResearchBlackList.createNewFile();
				Constants.LOGGER.info("Created researchdata file for user "+event.getPlayer().getName().getFormattedText()+" at "+playerResearchBlackList.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
