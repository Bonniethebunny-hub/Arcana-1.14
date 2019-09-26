package kineticdevelopment.common.utils.aspectpool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import kineticdevelopment.api.aspects.Aspect;
import kineticdevelopment.api.aspects.Aspect.AspectType;
import kineticdevelopment.api.aspects.AspectNotFoundException;
import kineticdevelopment.common.utils.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class AspectPoolHandler {
	//Not been tested yet, don't mess with this or Aspect
	
	@SuppressWarnings("serial")
	static HashMap<Block, AspectType[]> BlockAspects = new HashMap<Block, AspectType[]>() {{
		
		put(Blocks.DIRT, new AspectType[] {AspectType.EARTH});
		
	}};
	
	/**
	
	 * Returns an Item Array with all the Aspects of a block
	 * @param block
	 * @return Item[]
	 */
	public static AspectType[] getBlockAspects(Block block) {
		
		for (Entry<Block, AspectType[]> entry : BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
				AspectType[] aspects = entry.getValue(); 
				return aspects;
			}
		}
		return null;
	 }

	/**
	 * Adds the specified aspect to the player's pool
	 * @param player
	 * @param world
	 * @param aspect
	 * @param amount
	 */
	public static void addAspectToPlayer(PlayerEntity player, World world, AspectType aspect, int amount) {
		try {
			File aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
			aspectDataDir.mkdirs();
			File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			if(!playerAspectData.exists()) {
				playerAspectData.createNewFile();
			}
			
			ArrayList<AspectType> aspectlist = getPlayerAspects(player, world);
			
			try(FileWriter fw = new FileWriter(playerAspectData, true);	
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
				
				if(!aspectlist.contains(aspect)) {
					out.println(aspect.name()+", "+amount);
					
				}
			} 
			
			catch (IOException e) {
				Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".aspectpool");
			}

		} catch (Exception var5) {
			Constants.LOGGER.warn("Error adding aspect "+aspect.name()+" to "+player.getName().getFormattedText());
			var5.printStackTrace();
		}

	}

	@Nullable
	public static ArrayList<AspectType> getPlayerAspects(PlayerEntity player, World world) {
		ArrayList<AspectType> aspectlist = new ArrayList<AspectType>();
		
		int lineCount = 0;
		
		try {
			File aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
			
			aspectDataDir.mkdirs();
			
			File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			FileReader fr = new FileReader(playerAspectData);
			
			LineNumberReader lnr = new LineNumberReader(fr);
			
			while (lnr.readLine() != null) {
				lineCount++;
			}
			
			System.out.println("Total number of lines : " + lineCount);
			
			lnr.close();
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try(BufferedReader br = Files.newBufferedReader(Paths.get(world.getWorldInfo().getWorldName()+"/aspectdata", player.getCachedUniqueIdString()+".aspectpool"))) {
				
				String line;
				
				while ((line = br.readLine()) != null) {
					for(int i=0; i<lineCount; i++) {
						AspectType aspect = Aspect.getAspectByName(line.substring(0, line.indexOf(",")));
						
						aspectlist.add(aspect);
						
						System.out.println(aspect.name());
						
					}
				}
			} 

			catch(IOException | AspectNotFoundException e) {
				e.printStackTrace();
			}

		}

		return aspectlist;

	}
}
