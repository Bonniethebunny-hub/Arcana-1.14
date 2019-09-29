/**
 Used for stairs as they don't have a public constructor. Please always use this class when making a stair block.
 **/

package kineticdevelopment.arcana.api.blocks;

import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.DoorBlock;


public class ArcanaRotatableBlock extends CarvedPumpkinBlock {
    public ArcanaRotatableBlock(Properties properties) {
        super(properties);

    }
}
