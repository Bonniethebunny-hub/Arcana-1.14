package net.kineticdevelopment.arcana.utilities;

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

import net.kineticdevelopment.arcana.common.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;


public class AspectCollectionHandler {
	
	//No touchy mart
	
	@SuppressWarnings("serial")
	static HashMap<Block, Aspect[]> BlockAspects = new HashMap<Block, Aspect[]>() {{
		put(Blocks.DIRT, new Aspect[] {new Aspect(ItemInit.EARTH)});
		put(Blocks.ICE, new Aspect[] {new Aspect(ItemInit.ICE), new Aspect(ItemInit.WATER)});
	}};
	
	/**
	 * Returns an Item Array with all the Aspects of a block
	 * @param block
	 * @return Item[]
	 */
	public static Aspect[] getBlockAspects(Block block) {
		for (Entry<Block, Aspect[]> entry : BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
            	Aspect[] aspects = entry.getValue(); 
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
	public static void addAspectToPlayer(PlayerEntity player, World world, Aspect aspect, int amount) {
	      try {
	    	  File aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
	    	  aspectDataDir.mkdirs();
	    	  
	    	  File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
	    	  if(!playerAspectData.exists()) {
	    		  playerAspectData.createNewFile();
	    	  }
	    	  ArrayList<Aspect> aspectlist = getPlayerAspects(player, world);
	    	  
	    	  try(FileWriter fw = new FileWriter(playerAspectData, true);
	    	      BufferedWriter bw = new BufferedWriter(fw);
	    		  PrintWriter out = new PrintWriter(bw)) {
	    		  if(!aspectlist.contains(aspect)) {
	    			  out.println(aspect.getName()+", "+amount);
	    		  }
	  		  } 
	  		  	catch (IOException e) {
	  		  		Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".aspectpool");
	  			}
	      } catch (Exception var5) {
	    	  Constants.LOGGER.warn("Error adding aspect "+aspect.getName()+" to "+player.getName().getFormattedText());
	    	  var5.printStackTrace();
	      }

	}

	   
	@Nullable
	public static ArrayList<Aspect> getPlayerAspects(PlayerEntity player, World world) {
		ArrayList<Aspect> aspectlist = new ArrayList<Aspect>();
		
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
	            		Aspect aspect = Aspect.getAspectByName(line.substring(0, line.indexOf(",")));
	            		aspectlist.add(aspect);
	            		System.out.println(aspect.getName());
	            	}
	            }
	        } 
	        catch(IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
		}
		
		return aspectlist;
	}
}
