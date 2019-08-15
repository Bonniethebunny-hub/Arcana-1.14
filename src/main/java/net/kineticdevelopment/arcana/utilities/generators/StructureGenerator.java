package net.kineticdevelopment.arcana.utilities.generators;

import net.kineticdevelopment.arcana.utilities.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StructureGenerator implements IWorldGenerator {


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, ChunkGenerator chunkGenerator, AbstractChunkProvider chunkProvider) {
        int x = (chunkX * 16) + random.nextInt(15);
        int z = (chunkZ * 16) + random.nextInt(15);
        int y = calculateGenerationHeight(world, x, z, Blocks.GRASS_BLOCK);
        BlockPos spawnPos = new BlockPos(x,y,z);
        ServerWorld worldserver = (ServerWorld) world;
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwoodtree"));
        int h = ThreadLocalRandom.current().nextInt(2, 7);
        switch(h) {
            default: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood1")); break;
            case 2: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood2")); break;
            case 3: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood3")); break;
            case 4: greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwood/greatwood4")); break;
        }

        if(random.nextInt(1) != 0 || world.getBiome(spawnPos) != Biomes.PLAINS) {
            return;
        }

        if(greatwoodTree == null) {
            Constants.LOGGER.error("Could not find structure at " + new ResourceLocation("arcana:structures/trees/greatwood"));
            return;
        }
        PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
                .setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk(null);

        greatwoodTree.addBlocksToWorld(world, spawnPos.add(-4, 0, -4), placementsettings);


    }


    private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
    {
        int y = world.getHeight();
        boolean foundGround = false;

        while(!foundGround && y-- >= 0)
        {
            Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
            foundGround = block == topBlock;
        }

        return y;
    }
}
