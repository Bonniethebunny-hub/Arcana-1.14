package kineticdevelopment.arcana.common.utils.taint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.world.World;

public class TaintLevelHandler {
    public static void createTaintLevelFile(World world) {
        if(!world.isRemote) {
            if(Minecraft.getInstance().isSingleplayer()) {
                final File file = new File("saves/", world.getWorldInfo().getWorldName()+".taint");
                CompoundNBT nbt;
        		try {
        			if(!file.exists()) {
        				file.createNewFile();
        				nbt = new CompoundNBT();
        			}
        			else {
        				nbt = CompressedStreamTools.readCompressed(new FileInputStream(file));
        			}
        			
        			nbt.putFloat("TaintLevel", 0);
        			
        			try (FileOutputStream fileoutputstream = new FileOutputStream(file)) {
        	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
        	         } catch (IOException e) {
        	        	 e.printStackTrace();
        	         }
        		} 
        		
        		catch (IOException e) {
        			e.printStackTrace();
        		}
            }
        }

        if(world.isRemote) {
            final File file = new File(world.getWorldInfo().getWorldName()+".taint");
            CompoundNBT nbt;
    		try {
    			if(!file.exists()) {
    				file.createNewFile();
    				nbt = new CompoundNBT();
    			}
    			else {
    				nbt = CompressedStreamTools.readCompressed(new FileInputStream(file));
    			}
    			
    			nbt.putFloat("TaintLevel", 0);
    			
    			try (FileOutputStream fileoutputstream = new FileOutputStream(file)) {
    	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
    	         } catch (IOException e) {
    	        	 e.printStackTrace();
    	         }
    		} 
    		
    		catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }

    public static float getTaintLevel(World world) {
        if (!world.isRemote) {
        	CompoundNBT nbt;
        	final File file = new File("saves/", world.getWorldInfo().getWorldName()+".taint");
        	try {
        		nbt = CompressedStreamTools.readCompressed(new FileInputStream(file));
        		float returnvalue = nbt.getFloat("TaintLevel");
        		return returnvalue;
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
            return 2147483647;
        }
        else {
            return 80082;
        }
    }

    public static void increaseTaintLevel(World world, float amount) {
        if (!world.isRemote) {
        	final File file = new File("saves/", world.getWorldInfo().getWorldName()+".taint");
            CompoundNBT nbt;
    		try {
    			if(!file.exists()) {
    				file.createNewFile();
    				nbt = new CompoundNBT();
    			}
    			else {
    				nbt = CompressedStreamTools.readCompressed(new FileInputStream(file));
    			}
    			
    			nbt.putFloat("TaintLevel", getTaintLevel(world) + amount);
    			
    			System.out.println((getTaintLevel(world) + amount));
    			
    			try (FileOutputStream fileoutputstream = new FileOutputStream(file)) {
    	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
    	         } catch (IOException e) {
    	        	 e.printStackTrace();
    	         }
    		} 
    		
    		catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }

    public static void decreaseTaintLevel(World world, float amount) {
        if (!world.isRemote) {
        	final File file = new File("saves/", world.getWorldInfo().getWorldName()+".taint");
            CompoundNBT nbt;
    		try {
    			if(!file.exists()) {
    				file.createNewFile();
    				nbt = new CompoundNBT();
    			}
    			else {
    				nbt = CompressedStreamTools.readCompressed(new FileInputStream(file));
    			}
    			
    			nbt.putFloat("TaintLevel", getTaintLevel(world) - amount);
    			
    			try (FileOutputStream fileoutputstream = new FileOutputStream(file)) {
    	            CompressedStreamTools.writeCompressed(nbt, fileoutputstream);
    	         } catch (IOException e) {
    	        	 e.printStackTrace();
    	         }
    		} 
    		
    		catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }
}