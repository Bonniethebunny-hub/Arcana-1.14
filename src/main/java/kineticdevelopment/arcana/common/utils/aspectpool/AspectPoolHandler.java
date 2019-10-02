package kineticdevelopment.arcana.common.utils.aspectpool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import kineticdevelopment.arcana.api.aspects.Aspect;
import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import kineticdevelopment.arcana.api.aspects.AspectNotFoundException;
import kineticdevelopment.arcana.api.aspects.BlockHasNoAspectsException;
import kineticdevelopment.arcana.api.misc.IntegerUtils;
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
	
	public static void notifyOfAspectDiscovery(PlayerEntity player, AspectType aspect) {
		player.sendStatusMessage(new StringTextComponent("You've just discovered the aspect of "+aspect.name()), true);
	}
	
	public static void notifyOfKnownAspectGain(PlayerEntity player, AspectType aspect, int amount) {
		player.sendStatusMessage(new StringTextComponent("You've just gained "+amount+" of aspect "+aspect.name()), true);
	}
	
	/**
	
	 * Returns an Item Array with all the Aspects of a block
	 * @param block
	 * @return AspectType[]
	 */
	public static AspectType[] getBlockAspects(Block block) throws BlockHasNoAspectsException {
		
		for (Entry<Block, Aspect.AspectType[]> entry : BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
				Aspect.AspectType[] aspects = entry.getValue();
				return aspects;
			}
		}
		throw new BlockHasNoAspectsException("Block "+block.getNameTextComponent().getFormattedText()+" has no assigned aspects!");
	 }
	
	public static void addBlockAspectsToPlayer(Block block, PlayerEntity player, World world, int amount) {
		try {
			if(!isBlockOnPlayerResearchBlackList(block, player, world)) {
				AspectType[] aspects;
				try {
					aspects = AspectPoolHandler.getBlockAspects(block);
					
		        	for(int i=0; i<aspects.length; i++) {
		        		try {
							AspectPoolHandler.addAspectsToPlayer(player, world, aspects, amount);
						} catch (IOException e) {
							e.printStackTrace();
						}
		        	}
				} catch (BlockHasNoAspectsException e) {
					e.printStackTrace();
				}
				
				AspectPoolHandler.addBlockToPlayerResearchBlackList(block, player, world);
			}
			else {
				//Debug
				System.out.println("This block was already scanned!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adds the specified aspect to the player's pool
	 * @param player
	 * @param world
	 * @param aspect
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void addAspectsToPlayer(PlayerEntity player, World world, AspectType[] aspect, int amount) throws FileNotFoundException, IOException {
		File aspectDataDir = null;
		File playerAspectData = null;
		CompoundNBT nbt;
		try {
			aspectDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "aspectdata");
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
				if(!aspects.contains(aspect[i])) {
					nbt.putInt(aspect[i].name(), 1);
					
					notifyOfAspectDiscovery(player, aspect[i]);
				}
				else {
					nbt.putInt(aspect[i].name(), getPlayerAspectAmount(player, aspect[i], world) + amount);
					
					notifyOfKnownAspectGain(player, aspect[i], amount);
				}
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerAspectData)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException | AspectNotFoundException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".aspectpool");
			e.printStackTrace();
		}
	}
	
	public static void removeAspectsFromPlayer(PlayerEntity player, World world, AspectType[] aspect, int amount) {
		File aspectDataDir = null;
		File playerAspectData = null;
		CompoundNBT nbt;
		try {
			aspectDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "aspectdata");
			aspectDataDir.mkdirs();
			playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			if(!playerAspectData.exists()) {
				playerAspectData.createNewFile();
				nbt = new CompoundNBT();
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerAspectData));
			}
			
			for(int i=0; i < aspect.length; i++) {
				if(getPlayerAspectAmount(player, aspect[i], world) <= 1) {
					nbt.remove(aspect[i].name());
				}
				else {
					nbt.putInt(aspect[i].name(), getPlayerAspectAmount(player, aspect[i], world) - amount);
					
					player.sendMessage(new StringTextComponent(TextFormatting.GREEN + "You lost "+amount+" of aspect "+aspect[i].name()));
				}
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerAspectData)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException | AspectNotFoundException e) {
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
			File aspectDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "aspectdata");
			
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
		int returnint = 2138008;
		
		try {
			File aspectDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "aspectdata");
			
			aspectDataDir.mkdirs();
			
			File playerAspectData = new File(aspectDataDir, player.getCachedUniqueIdString()+".aspectpool");
			
			CompoundNBT nbt2 = CompressedStreamTools.readCompressed(new FileInputStream(playerAspectData));;
			
			returnint = nbt2.getInt(type.name());
			
			System.out.println(returnint);
		}

		catch(IOException e) {
			e.printStackTrace();
		}

		if(!(returnint == 2138008)) {
			return returnint;
		}
		else {
			throw new AspectNotFoundException("Aspect "+type.name()+" not found for player "+player.getName().getFormattedText());
		}
	}
	
	public static void addBlockToPlayerResearchBlackList(Block block, PlayerEntity player, World world) {
		File researchDataDir = null;
		File playerResearchBlackList = null;
		CompoundNBT nbt;
		List<Integer> ids;
		int[] ids1;
		try {
			researchDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "researchData");
			researchDataDir.mkdirs();  	  
			playerResearchBlackList = new File(researchDataDir, player.getCachedUniqueIdString()+".researchblacklist");
			
			if(!playerResearchBlackList.exists()) {
				playerResearchBlackList.createNewFile();
				nbt = new CompoundNBT();
				ids = new ArrayList<Integer>();
				ids.add(Item.getIdFromItem(block.asItem()));
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerResearchBlackList));
				ids1 = nbt.getIntArray("Blocks");
				ids = IntegerUtils.ArrayToList(ids1);
				if(!isBlockOnPlayerResearchBlackList(block, player, world)) {
					ids.add(Item.getIdFromItem(block.asItem()));
				}
			}
			
			nbt.putIntArray("Blocks", ids);
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerResearchBlackList)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".aspectpool");
		}
	}
	
	public static boolean isBlockOnPlayerResearchBlackList(Block block, PlayerEntity player, World world) throws FileNotFoundException {
		try {
			int[] ids;
			File researchDataDir = new File("Arcana/"+world.getWorldInfo().getWorldName(), "researchData");
			researchDataDir.mkdirs();  	  
			File playerResearchBlackList = new File(researchDataDir, player.getCachedUniqueIdString()+".researchBlackList");;
			CompoundNBT nbt2 = null;
			
			if(!playerResearchBlackList.exists()) {
				throw new FileNotFoundException();
			}
			else {
				nbt2 = CompressedStreamTools.readCompressed(new FileInputStream(playerResearchBlackList));
			}
			
			ids = nbt2.getIntArray("Blacklist");
			
			for(int i = 0; i < ids.length; i++) {
				if(Item.getIdFromItem(block.asItem()) == ids[i]) {
					return true;
				}
			}
			
			//Debug
			System.out.println(ids.toString());
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
