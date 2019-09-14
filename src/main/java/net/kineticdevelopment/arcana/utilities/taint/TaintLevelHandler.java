package net.kineticdevelopment.arcana.utilities.taint;

import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

import java.io.*;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class TaintLevelHandler {
    public static void createTaintLevelFile(World world) {
        if(!world.isRemote) {
        	if(Minecraft.getInstance().isSingleplayer()) {
        		final File file = new File("saves", world.getWorldInfo().getWorldName()+".txt");
            	if(!file.exists()) {
            		try {
            			file.createNewFile();
            		} 
                	catch (IOException e) {
            			e.printStackTrace();
            		}
            		try(FileWriter fw = new FileWriter("saves"+world.getWorldInfo().getWorldName()+".txt", false);
            			BufferedWriter bw = new BufferedWriter(fw);
            			PrintWriter out = new PrintWriter(bw)) {
            			out.println("0");
            		} 
            		catch (IOException e) {
            			
            	    }
            		Constants.LOGGER.info("Created Taint Level file for singleplayer world '"+world.getWorldInfo().getWorldName()+"'");
            	}
        	}


        }

        if(world.isRemote) {
        	final File file = new File(world.getWorldInfo().getWorldName()+".txt");
        	if(!file.exists()) {
        		try {
        			file.createNewFile();
        		}
            	catch (IOException e) {
        			e.printStackTrace();
        		}
        		try(FileWriter fw = new FileWriter(world.getWorldInfo().getWorldName()+".txt", false);
        			BufferedWriter bw = new BufferedWriter(fw);
        			PrintWriter out = new PrintWriter(bw)) {
        			out.println("0");
        		}
        		catch (IOException e) {

        	    }
        		Constants.LOGGER.info("Created Taint Level file for server world '"+world.getWorldInfo().getWorldName()+"'");
        	}
        }
    }

    public static double getTaintLevel(World world) {
        if (!world.isRemote) {
            double taintLevel;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves" + world.getWorldInfo().getWorldName() + ".txt"))) {
            	String s1 = br.readLine();
                DecimalFormat df = new DecimalFormat("#.##");
    			df.setRoundingMode(RoundingMode.DOWN);
    			double d1 = Double.parseDouble(s1);
    			String s = df.format(d1);
                if (s != null) {
                    taintLevel = Double.parseDouble(s);
                    return taintLevel;
                }
                if (s == null) {
                    taintLevel = 0;
                    return taintLevel;
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
            return 2147483647;
        }
        else {
        	return 80082;
        }
    }

    public static void increaseTaintLevel(World world, double amount) {
        if (!world.isRemote) {
            double taintLevel = 2147483647;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves" + world.getWorldInfo().getWorldName() + ".txt"))) {
            	String s1 = br.readLine();
                DecimalFormat df = new DecimalFormat("#.##");
    			df.setRoundingMode(RoundingMode.DOWN);
    			double d1 = Double.parseDouble(s1);
    			String s = df.format(d1);
                System.out.println(s);
                if (s != null) {
                    taintLevel = Double.parseDouble(s);
                    taintLevel = taintLevel + amount;
                }

                if (s == null) {
                    taintLevel = 0;
                    taintLevel = taintLevel + amount;
                }
                System.out.println("Taint Level is now " + taintLevel);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            try (FileWriter fw = new FileWriter("saves" + world.getWorldInfo().getWorldName() + ".txt", false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                out.print(taintLevel);
                out.close();
            } catch (IOException e) {

            }
        }
    }
    
    public static void decreaseTaintLevel(World world, double amount) {
    	if (!world.isRemote) {
            double taintLevel = 2147483647;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves" + world.getWorldInfo().getWorldName() + ".txt"))) {
            	String s1 = br.readLine();
                DecimalFormat df = new DecimalFormat("#.##");
    			df.setRoundingMode(RoundingMode.DOWN);
    			double d1 = Double.parseDouble(s1);
    			String s = df.format(d1);
                System.out.println(s);
                if (s != null) {
                    taintLevel = Double.parseDouble(s);
                    taintLevel = taintLevel - amount;
                }

                if (s == null) {
                    taintLevel = 0;
                    taintLevel = taintLevel - amount;
                }
                System.out.println("Taint Level is now " + taintLevel);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            try (FileWriter fw = new FileWriter("saves" + world.getWorldInfo().getWorldName() + ".txt", false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                out.print(taintLevel);
                out.close();
            } catch (IOException e) {

            }
        }
    }
}
