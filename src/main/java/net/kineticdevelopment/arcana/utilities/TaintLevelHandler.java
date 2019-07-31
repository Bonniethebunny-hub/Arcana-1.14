package net.kineticdevelopment.arcana.utilities;

import net.minecraft.world.World;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TaintLevelHandler {
    public static void createTaintLevelFile(World world) {
        if (!world.isRemote) {
            final File file = new File("saves/" + world.getWorldInfo().getWorldName(), "taintLevel.txt");
            try (FileWriter fw = new FileWriter("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt", false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                if (!file.exists()) {
                    file.createNewFile();
                    out.print("0");
                    Constants.LOGGER.info("Created Taint Level File");
                }
            } catch (IOException e) {

            }
        }
    }

    public static int getTaintLevel(World world) {
        if (!world.isRemote) {
            int taintLevel;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt"))) {
                if (br.readLine() != null) {
                    taintLevel = Integer.parseInt(br.readLine());
                    return taintLevel;
                }
                if (br.readLine() == null) {
                    taintLevel = 0;
                    return taintLevel;
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
            return 2147483647;
        }
        return 0;
    }

    public static void increaseTaintLevel(World world, int amount) {
        if (!world.isRemote) {
            int taintLevel = 2147483647;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt"))) {
                String s = br.readLine();
                if (s != null) {
                    taintLevel = Integer.parseInt(s);
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

            try (FileWriter fw = new FileWriter("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt", false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                out.print(taintLevel);
            } catch (IOException e) {

            }
        }
    }

    public static void decreaseTaintLevel(World world, int amount) {
        if (!world.isRemote) {
            int taintLevel = 2147483647;
            try (BufferedReader br = Files.newBufferedReader(Paths.get("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt"))) {
                String s = br.readLine();
                if (s != null) {
                    taintLevel = Integer.parseInt(s);
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

            try (FileWriter fw = new FileWriter("saves/" + world.getWorldInfo().getWorldName() + "/taintLevel.txt", false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                out.print(taintLevel);
            } catch (IOException e) {

            }
        }
    }
}
