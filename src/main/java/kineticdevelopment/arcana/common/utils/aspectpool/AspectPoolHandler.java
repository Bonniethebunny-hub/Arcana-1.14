package kineticdevelopment.arcana.common.utils.aspectpool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import kineticdevelopment.arcana.api.aspects.AspectNotFoundException;
import kineticdevelopment.arcana.api.aspects.BlockHasNoAspectsException;
import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * Handles anything to do with the aspect pool
 * @author Atlas
 * @see Aspect
 */
public class AspectPoolHandler {
	
	@SuppressWarnings("serial")
	static HashMap<Block, Aspect.AspectType[]> BlockAspects = new HashMap<Block, Aspect.AspectType[]>() {{
		
		put(Blocks.DIRT, new Aspect.AspectType[] {Aspect.AspectType.EARTH});
		put(Blocks.ICE, new Aspect.AspectType[] {Aspect.AspectType.ICE, Aspect.AspectType.WATER});
		
	}};
	
	/**
	
	 * Returns an Item Array with all the Aspects of a block
	 * @param block
	 * @return AspectType[]
	 */
	public static Aspect.AspectType[] getBlockAspects(Block block) throws BlockHasNoAspectsException {
		
		for (Entry<Block, Aspect.AspectType[]> entry : BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
				Aspect.AspectType[] aspects = entry.getValue();
				return aspects;
			}
		}
		throw new BlockHasNoAspectsException("Block "+block.getNameTextComponent().getFormattedText()+" has no assigned aspects!");
	 }
	
	public static void addBlockAspectsToPlayer(Block block, PlayerEntity player, World world) {
		Aspect.AspectType[] aspects;
		try {
			aspects = AspectPoolHandler.getBlockAspects(block);
			
        	for(int i=0; i<aspects.length; i++) {
        		try {
					AspectPoolHandler.addAspectsToPlayer(player, world, aspects);
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
		} catch (BlockHasNoAspectsException e) {
			e.printStackTrace();
		}
		
		AspectPoolHandler.addBlockToPlayerResearchBlackList(block, player, world);
	}

	/**
	 * Adds the specified aspect to the player's pool
	 * @param player
	 * @param world
	 * @param aspect
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void addAspectsToPlayer(PlayerEntity player, World world, AspectType[] aspect) throws FileNotFoundException, IOException {
		File aspectDataDir = null;
		File playerAspectData = null;
		CompoundNBT nbt;
		try {
			aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
			aspectDataDir.mkdirs();
			playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			if(!playerAspectData.exists()) {
				playerAspectData.createNewFile();
				nbt = new CompoundNBT();
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerAspectData));
			}
			
			ArrayList<AspectType> aspects = getPlayerAspects(player, world);
			
			for(int i=0; i < aspect.length; i++) {
				nbt.putInt(aspect[i].name(), 1);
				
				player.sendMessage(new StringTextComponent(TextFormatting.GREEN + "You have just learned the " + TextFormatting.RED + aspect[i].name() + TextFormatting.GREEN + " aspect type!"));
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerAspectData)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".aspectpool");
		}
	}
	
	/**
	 * Fetches an ArrayList of Aspects a player has
	 * @param player
	 * @param world
	 * @return
	 */
	@Nullable
	public static ArrayList<AspectType> getPlayerAspects(PlayerEntity player, World world) {
		ArrayList<AspectType> aspectlist = new ArrayList<Aspect.AspectType>();
		
		try {
			File aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
			
			aspectDataDir.mkdirs();
			
			File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			int lineCount = 0;
			
			CompoundNBT nbt2 = CompressedStreamTools.readCompressed(new FileInputStream(playerAspectData));;
			lineCount = nbt2.size();
			System.out.println(lineCount);
			
			String[] names = nbt2.keySet().toArray(new String[lineCount]);
			
			for(int i=0; i<lineCount; i++) {
				Aspect.AspectType aspect = Aspect.getAspectByName(names[i]);
				
				aspectlist.add(aspect);
				
				//Debug
				System.out.println(aspect.name());
				
			}
		}

		catch(IOException | AspectNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			
		}
		
		return aspectlist;

	}
	
	/**
	 * Fetches the amount of an aspect a player has
	 * @param player
	 * @param type
	 * @param world
	 * @return 
	 * @throws AspectNotFoundException
	 */
	public static int getPlayerAspectAmount(PlayerEntity player, Aspect.AspectType type, World world) throws AspectNotFoundException {
		int lineCount = 0;
		
		int returnint = 2138008;
		
		try {
			File aspectDataDir = new File(world.getWorldInfo().getWorldName(), "aspectdata");
			
			aspectDataDir.mkdirs();
			
			File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			FileReader fr = new FileReader(playerAspectData);
			
			LineNumberReader lnr = new LineNumberReader(fr);
			
			while (lnr.readLine() != null) {
				lineCount++;
			}
			
			//Debug
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
					if(Aspect.getAspectByName(line.substring(0, line.indexOf(","))) == type) {
						returnint = Integer.parseInt(line.substring(line.indexOf(", ") + 2));
					}
				}
			} 

			catch(IOException | AspectNotFoundException e) {
				e.printStackTrace();
			}

		}

		if(!(returnint == 2138008)) {
			return returnint;
		}
		else {
			throw new AspectNotFoundException("Aspect "+type.name()+" not found for player "+player.getName().getFormattedText());
		}
	}
	
	public static void addBlockToPlayerResearchBlackList(Block block, PlayerEntity player, World world) {
		try {
	    	  File researchDataDir = new File(world.getWorldInfo().getWorldName(), "researchData");

	    	  researchDataDir.mkdirs();

	    	  

	    	  File playerResearchBlackList = new File(researchDataDir, player.getCachedUniqueIdString()+".researchBlackList");

	    	  if(!playerResearchBlackList.exists()) {

	    		  playerResearchBlackList.createNewFile();

	    	  }

	    	  try(FileWriter fw = new FileWriter(playerResearchBlackList, true);
	    	      BufferedWriter bw = new BufferedWriter(fw);
	    		  PrintWriter out = new PrintWriter(bw)) {
	    		  
	    		  if(!(isBlockOnPlayerResearchBlackList(block, player, world))) {
	    			  out.println(Item.getIdFromItem(block.asItem()));
	    		  }
	  		  } 

	  		  	catch (IOException e) {

	  		  		Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".researchBlackList");

	  			}

	      } catch (Exception var5) {
	    	  var5.printStackTrace();

	      }
	}
	
	public static boolean isBlockOnPlayerResearchBlackList(Block block, PlayerEntity player, World world) {
		int lineCount = 0;
		
		try {
			File researchDataDir = new File(world.getWorldInfo().getWorldName(), "researchData");
			
			researchDataDir.mkdirs();
			
			File playerResearchBlackList = new File(researchDataDir, player.getCachedUniqueIdString()+".researchBlackList");

			if(!playerResearchBlackList.exists()) {
				return false;
			}
			
			FileReader fr = new FileReader(playerResearchBlackList);
			
			LineNumberReader lnr = new LineNumberReader(fr);
			
			while (lnr.readLine() != null) {
				lineCount++;
			}
			
			//Debug
			System.out.println("Total number of lines : " + lineCount);
			
			lnr.close();
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try(BufferedReader br = Files.newBufferedReader(Paths.get(world.getWorldInfo().getWorldName(), "researchData", player.getCachedUniqueIdString()+".researchBlackList"))) {
				
				String line;
				
				while ((line = br.readLine()) != null) {
					for(int i=0; i<lineCount; i++) {
						if(Item.getItemById(Integer.parseInt(line)) == block.asItem()) {
							return true;
						}
						
					}
				}
			} 

			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
