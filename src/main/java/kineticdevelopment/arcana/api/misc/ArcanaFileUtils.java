package kineticdevelopment.arcana.api.misc;

import java.io.File;

import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ArcanaFileUtils {
	public static File getWorldDirectory(World world) {
		ServerWorld world1 = (ServerWorld) world;
		File dir = world1.getSaveHandler().getWorldDirectory();
		
		return dir;
	}
}