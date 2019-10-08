package kineticdevelopment.arcana.api.aspects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import kineticdevelopment.arcana.api.misc.ArcanaFileUtils;
import kineticdevelopment.arcana.common.utils.Constants;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.world.World;

/**
 * Handles anything to do with the DOL file
 * @author Atlas
 * @see AspectPoolHandler
 */
public class DOLHandler {
	public static void addBlockToPlayerDOL(Block block, PlayerEntity player, World world) {
		File researchDataDir = null;
		File playerDOL = null;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		CompoundNBT nbt;
		CompoundNBT nbt2;
		CompoundNBT nbt3;
		try {
			researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");
			
			if(!playerDOL.exists()) {
				playerDOL.createNewFile();
				nbt = new CompoundNBT();
				nbt2 = new CompoundNBT();
				nbt3 = new CompoundNBT();
				nbt2.putInt(String.valueOf(Item.getIdFromItem(block.asItem())), Item.getIdFromItem(block.asItem()));
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Blocks And Items");
				nbt3 = (CompoundNBT) nbt.get("Discovered Entities");
				
				if(!isBlockOnPlayerDOL(block, player, world)) {
					nbt2.putInt(String.valueOf(Item.getIdFromItem(block.asItem())), Item.getIdFromItem(block.asItem()));
				}
				else {
					System.out.println("Player has discovered block "+block.getNameTextComponent().getFormattedText());
				}
				
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerDOL)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".discoveredobjects");
		}
	}
	
	public static boolean isBlockOnPlayerDOL(Block block, PlayerEntity player, World world) throws FileNotFoundException {
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		try {
			File researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			File playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");;
			CompoundNBT nbt = null;
			CompoundNBT nbt2 = null;
			
			if(!playerDOL.exists()) {
				throw new FileNotFoundException(playerDOL.getAbsolutePath());
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Blocks And Items");
			}
			
			if(nbt2.contains(String.valueOf(Item.getIdFromItem(block.asItem())))) {
				return true;
			}
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static void addItemToPlayerDOL(Item item, PlayerEntity player, World world) {
		File researchDataDir = null;
		File playerDOL = null;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		CompoundNBT nbt;
		CompoundNBT nbt2;
		CompoundNBT nbt3;
		try {
			researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");
			
			if(!playerDOL.exists()) {
				playerDOL.createNewFile();
				nbt = new CompoundNBT();
				nbt2 = new CompoundNBT();
				nbt3 = new CompoundNBT();
				nbt2.putInt(String.valueOf(Item.getIdFromItem(item)), Item.getIdFromItem(item));
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Blocks And Items");
				nbt3 = (CompoundNBT) nbt.get("Discovered Entities");
				
				if(!isItemOnPlayerDOL(item, player, world)) {
					nbt2.putInt(String.valueOf(Item.getIdFromItem(item)), Item.getIdFromItem(item));
				}
				//debug
				else {
					System.out.println("Player has discovered item "+item.getName().getFormattedText());
				}
				
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerDOL)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".DOL");
		}
	}
	
	public static boolean isItemOnPlayerDOL(Item item, PlayerEntity player, World world) throws FileNotFoundException {
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		try {
			File researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			File playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");;
			CompoundNBT nbt = null;
			CompoundNBT nbt2 = null;
			
			if(!playerDOL.exists()) {
				throw new FileNotFoundException(playerDOL.getAbsolutePath());
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Blocks And Items");
			}
			
			if(nbt2.contains(String.valueOf(Item.getIdFromItem(item)))) {
				return true;
			}
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static void addEntityToPlayerDOL(LivingEntity entity, PlayerEntity player, World world) {
		File researchDataDir = null;
		File playerDOL = null;
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		CompoundNBT nbt;
		CompoundNBT nbt2;
		CompoundNBT nbt3;
		try {
			researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");
			
			if(!playerDOL.exists()) {
				playerDOL.createNewFile();
				nbt = new CompoundNBT();
				nbt2 = new CompoundNBT();
				nbt3 = new CompoundNBT();
				nbt3.putString(entity.getName().getFormattedText(), entity.getName().getFormattedText());
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Blocks And Items");
				nbt3 = (CompoundNBT) nbt.get("Discovered Entities");
				
				if(!isEntityOnPlayerDOL(entity, player, world)) {
					nbt3.putString(entity.getName().getFormattedText(), entity.getName().getFormattedText());
				}
				//debug
				else {
					System.out.println("Player has discovered entity "+entity.getName().getFormattedText());
				}
				
				nbt.put("Discovered Blocks And Items", nbt2);
				nbt.put("Discovered Entities", nbt3);
			}
			
			try (FileOutputStream fileoutputstream = new FileOutputStream(playerDOL)) {
	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
	         } catch (IOException e) {
	        	 e.printStackTrace();
	         }
		} 
		
		catch (IOException e) {
			Constants.LOGGER.warn("Failed to write to "+player.getCachedUniqueIdString()+".DOL");
		}
	}
	
	public static boolean isEntityOnPlayerDOL(LivingEntity entity, PlayerEntity player, World world) throws FileNotFoundException {
		File dir = ArcanaFileUtils.getWorldDirectory(world);
		
		try {
			File researchDataDir = new File(dir, "Arcana/researchdata");
			researchDataDir.mkdirs();  	  
			File playerDOL = new File(researchDataDir, player.getCachedUniqueIdString()+".DOL");;
			CompoundNBT nbt = null;
			CompoundNBT nbt2 = null;
			
			if(!playerDOL.exists()) {
				throw new FileNotFoundException(playerDOL.getAbsolutePath());
			}
			else {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(playerDOL));
				nbt2 = (CompoundNBT) nbt.get("Discovered Entities");
			}
			
			if(nbt2.contains(entity.getName().getFormattedText())) {
				return true;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
