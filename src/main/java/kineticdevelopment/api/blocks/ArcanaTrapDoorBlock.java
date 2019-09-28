/**
 Used for stairs as they don't have a public constructor. Please always use this class when making a stair block.
 **/

package kineticdevelopment.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.TrapDoorBlock;


public class ArcanaTrapDoorBlock extends TrapDoorBlock  {
    public ArcanaTrapDoorBlock (Block.Properties properties) {
        super(properties);

    }
}
