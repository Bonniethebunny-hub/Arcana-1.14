/**
 Used for stairs as they don't have a public constructor. Please always use this class when making a stair block.
 **/

package kineticdevelopment.arcana.api.blocks;

import net.minecraft.block.DoorBlock;



public class ArcanaDoorBlock extends DoorBlock {
    public ArcanaDoorBlock(Properties properties) {
        super(properties);

    }
}
