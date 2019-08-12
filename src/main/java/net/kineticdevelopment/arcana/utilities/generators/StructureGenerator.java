package net.kineticdevelopment.arcana.utilities.generators;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class StructureGenerator implements IWorldGenerator {




    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, ChunkGenerator chunkGenerator, AbstractChunkProvider chunkProvider) {
        ServerWorld worldserver = (ServerWorld) world;
        TemplateManager templatemanager = worldserver.getStructureTemplateManager();
        Template greatwoodTree = templatemanager.getTemplate(new ResourceLocation("arcana", "trees/greatwoodtree"));
        //Generate trees



    }
}
