package kineticdevelopment.arcana.api.aspects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import kineticdevelopment.arcana.api.aspects.Aspect.AspectType;
import kineticdevelopment.arcana.api.exceptions.AspectNotFoundException;
import kineticdevelopment.arcana.api.exceptions.BlockHasNoAspectsException;
import kineticdevelopment.arcana.api.exceptions.ItemHasNoAspectsException;
import kineticdevelopment.arcana.api.exceptions.MobHasNoAspectsException;
import kineticdevelopment.arcana.api.misc.ArcanaFileUtils;
import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
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
 * @see DOLHandler
 */
public class AspectPoolHandler {
	
	/**
	 * Alerts the player of an aspect discovery
	 * @param player
	 * @param aspect
	 */
	public static void notifyOfAspectDiscovery(PlayerEntity player, AspectType aspect) {
		player.sendStatusMessage(new StringTextComponent("You've just discovered the aspect of "+aspect.name()), true);
	}
	
	/**
	 * Alerts the player of aspect gain
	 * @param player
	 * @param aspect
	 * @param amount
	 */
	public static void notifyOfKnownAspectGain(PlayerEntity player, AspectType aspect, int amount) {
		player.sendStatusMessage(new StringTextComponent("You've just gained "+amount+" of aspect "+aspect.name()), true);
	}
	
	/**
	 * Returns an AspectType Array with all the Aspects of a block
	 * @param block
	 * @return AspectType[]
	 * @throws BlockHasNoAspectsException
	 */
	public static AspectType[] getBlockAspects(Block block) throws BlockHasNoAspectsException {
		for (Entry<Block, AspectType[]> entry : AspectAssignments.BlockAspects.entrySet()) {
			if (block.equals(entry.getKey().getBlock())) {
				AspectType[] aspects = entry.getValue();
				return aspects;
			}
		}
		throw new BlockHasNoAspectsException("Block "+block.getNameTextComponent().getFormattedText()+" has no assigned aspects!");
	}
	
	/**
	 * Returns an AspectType Array with all the aspects of an item
	 * @param item
	 * @return AspectType[]
	 * @throws ItemHasNoAspectsException
	 */
	public static AspectType[] getItemAspects(Item item) throws ItemHasNoAspectsException {
		for (Entry<Item, AspectType[]> entry : AspectAssignments.ItemAspects.entrySet()) {
			if (item.equals(entry.getKey().getItem())) {
				AspectType[] aspects = entry.getValue();
				return aspects;
			}
		}
		throw new ItemHasNoAspectsException("Item "+item.getName().getFormattedText()+" has no assigned aspects!");
	}
	
	/**
	 * Returns an AspectType Array with all the aspects of an entity
	 * @param entity
	 * @return AspectType[]
	 * @throws MobHasNoAspectsException
	 */
	public static AspectType[] getMobAspects(LivingEntity entity) throws MobHasNoAspectsException {
		for (Entry<Class<? extends LivingEntity>, AspectType[]> entry : AspectAssignments.MobAspects.entrySet()) {
			if(entity.getClass() == entry.getKey()) {
				AspectType[] aspects = entry.getValue();
				return aspects;
			}
		}
		throw new MobHasNoAspectsException("Entity "+entity.getName().getFormattedText()+" has no assigned aspects!");
	}
	
	/**
	 * Adds all the aspects a block has to a player
	 * @param block
	 * @param player
	 * @param world
	 * @param amount
	 */
	public static void addBlockAspectsToPlayer(Block block, PlayerEntity player, World world, int amount) {
		try {
			if(!DOLHandler.isBlockOnPlayerDOL(block, player, world)) {
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
				
				DOLHandler.addBlockToPlayerDOL(block, player, world);
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
	 * Adds all the aspects an item has to a player
	 * @param item
	 * @param player
	 * @param world
	 * @param amount
	 */
	public static void addItemAspectsToPlayer(Item item, PlayerEntity player, World world, int amount) {
		AspectType[] aspects;
		try {
			if(DOLHandler.isItemOnPlayerDOL(item, player, world)) {
				aspects = AspectPoolHandler.getItemAspects(item);
				
				for(int i=0; i<aspects.length; i++) {
					try {
						AspectPoolHandler.addAspectsToPlayer(player, world, aspects, amount);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				DOLHandler.addItemToPlayerDOL(item, player, world);
			}
			else {
				//Debug
				System.out.println("This item was already scanned!");
			}
		} catch (ItemHasNoAspectsException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds all the aspects an entity has to a player
	 * @param entity
	 * @param player
	 * @param world
	 * @param amount
	 */
	public static void addMobAspectsToPlayer(LivingEntity entity, PlayerEntity player, World world, int amount) {
		AspectType[] aspects;
		try {
			if(!DOLHandler.isEntityOnPlayerDOL(entity, player, world)) {
				aspects = AspectPoolHandler.getMobAspects(entity);
				
	        	for(int i=0; i<aspects.length; i++) {
	        		try {
						AspectPoolHandler.addAspectsToPlayer(player, world, aspects, amount);
						System.out.println("Added aspects for mob "+entity.getName().getFormattedText());
					} catch (IOException e) {
						e.printStackTrace();
					}
	        	}
	        	
	        	DOLHandler.addEntityToPlayerDOL(entity, player, world);
			}
			else {
				//Debug
				System.out.println("This entity was already scanned!");
			}
		} catch (MobHasNoAspectsException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adds the specified aspect to a player's aspect pool
	 * @param player
	 * @param world
	 * @param aspect
	 * @param amount
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void addAspectsToPlayer(PlayerEntity player, World world, AspectType[] aspect, int amount) throws FileNotFoundException, IOException {
		File aspectDataDir = null;
		File playerAspectData = null;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		CompoundNBT nbt;
		try {
			aspectDataDir = new File(dir, "Arcana/aspectdata");
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
					nbt.putInt(aspect[i].name(), amount);
					
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
	
	/**
	 * Removes the specified amount of an aspect from a player's aspect pool
	 * @param player
	 * @param world
	 * @param aspect
	 * @param amount
	 */
	public static void removeAspectsFromPlayer(PlayerEntity player, World world, AspectType[] aspect, int amount) {
		File aspectDataDir = null;
		File playerAspectData = null;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		CompoundNBT nbt;
		try {
			aspectDataDir = new File(dir, "Arcana/aspectdata");
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
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		try {
			File aspectDataDir = new File(dir, "Arcana/aspectdata");
			
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
	 * @return Integer
	 * @throws AspectNotFoundException
	 */
	public static int getPlayerAspectAmount(PlayerEntity player, Aspect.AspectType type, World world) throws AspectNotFoundException {
		int returnint = 2138008;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		try {
			File aspectDataDir = new File(dir, "Arcana/aspectdata");
			
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
}
