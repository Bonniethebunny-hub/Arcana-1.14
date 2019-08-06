package net.kineticdevelopment.arcana.common.init;

<<<<<<< HEAD
import net.kineticdevelopment.arcana.common.blocks.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.*;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.strippedtainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.strippedtaintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.tainteddairleaves;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.tainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.taintedoakleaves;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.taintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedtrees.taintedoaksapling;
import net.kineticdevelopment.arcana.common.blocks.tainted.*;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.*;
=======
import net.kineticdevelopment.arcana.common.blocks.amberblock;
import net.kineticdevelopment.arcana.common.blocks.amberblockswirl;
import net.kineticdevelopment.arcana.common.blocks.amberbrick;
import net.kineticdevelopment.arcana.common.blocks.arcanestone;
import net.kineticdevelopment.arcana.common.blocks.arcanestonebrick;
import net.kineticdevelopment.arcana.common.blocks.arcaneworktable;
import net.kineticdevelopment.arcana.common.blocks.cinnabarore;
import net.kineticdevelopment.arcana.common.blocks.greatwoodplanks;
import net.kineticdevelopment.arcana.common.blocks.infusionstone;
import net.kineticdevelopment.arcana.common.blocks.silverwoodplanks;
import net.kineticdevelopment.arcana.common.blocks.thaumiumblock;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedcrust;
import net.kineticdevelopment.arcana.common.blocks.tainted.tainteddairplanks;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedoakplanks;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedrock;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintedsoil;
import net.kineticdevelopment.arcana.common.blocks.tainted.taintgoo;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedamberore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedcinnabarore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedcoalore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.tainteddiamondore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedemeraldore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedgoldore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedironore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedlapisore;
import net.kineticdevelopment.arcana.common.blocks.tainted.ores.taintedredstoneore;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.dairsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.greatwoodsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.silverwoodsapling;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippeddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippedtainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.strippedtaintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.tainteddairleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.tainteddairlog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoakleaves;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaklog;
import net.kineticdevelopment.arcana.common.blocks.treeblocks.taintedoaksapling;
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    //normal blocks

    @ObjectHolder("arcana:arcanestone")
    public static arcanestone ARCANESTONE;

    @ObjectHolder("arcana:arcanestonebrick")
    public static arcanestonebrick ARCANESTONEBRICK;

    @ObjectHolder("arcana:infusionstone")
    public static infusionstone INFUSIONSTONE;

    @ObjectHolder("arcana:amberblock")
    public static amberblock AMBERBLOCK;

    @ObjectHolder("arcana:amberblockswirl")
    public static amberblockswirl AMBERBLOCKSWIRL;

    @ObjectHolder("arcana:amberbrick")
    public static amberbrick AMBERBRICK;

<<<<<<< HEAD
=======
    @ObjectHolder("arcana:silverwoodplanks")
    public static silverwoodplanks SILVERWOODPLANKS;
    
    @ObjectHolder("arcana:silverwoodleaves")
    public static silverwoodleaves SILVERWOODLEAVES;

>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
    @ObjectHolder("arcana:greatwoodplanks")
    public static greatwoodplanks GREATWOODPLANKS;

    @ObjectHolder("arcana:thaumiumblock")
    public static thaumiumblock THAUMIUMBLOCK;

    @ObjectHolder("arcana:arcaneworktable")
    public static arcaneworktable ARCANEWORKTABLE;

    @ObjectHolder("arcana:taintscrubber")
    public static TaintScrubber TAINTSCRUBBER;

    @ObjectHolder("arcana:obsidiantotemtop")
    public static obsidiantotemtop OBSIDIANTOTEMTOP;

    @ObjectHolder("arcana:seenoevil")
    public static seenoevil SEENOEVIL;

    @ObjectHolder("arcana:speaknoevil")
    public static speaknoevil SPEAKNOEVIL;

    @ObjectHolder("arcana:hearnoevil")
    public static hearnoevil HEARNOEVIL;


    //tree blocks
    @ObjectHolder("arcana:silverwoodplanks")
    public static silverwoodplanks SILVERWOODPLANKS;

<<<<<<< HEAD
    @ObjectHolder("arcana:silverwoodleaves")
    public static silverwoodleaves SILVERWOODLEAVES;

=======
    @ObjectHolder("arcana:greatwoodsapling")
    public static greatwoodsapling GREATWOODSAPLING;
    
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
    @ObjectHolder("arcana:silverwoodlog")
    public static silverwoodlog SILVERWOODLOG;

    @ObjectHolder("arcana:silverwoodsapling")
    public static silverwoodsapling SILVERWOODSAPLING;
<<<<<<< HEAD

    @ObjectHolder("arcana:greatwoodleaves")
    public static greatwoodleaves GREATWOODLEAVES;

    @ObjectHolder("arcana:greatwoodlog")
    public static greatwoodlog GREATWOODLOG;

    @ObjectHolder("arcana:greatwoodsapling")
    public static greatwoodsapling GREATWOODSAPLING;
=======
    
    @ObjectHolder("arcana:arcaneworktable")
    public static arcaneworktable ARCANEWORKTABLE;
    
    @ObjectHolder("arcana:silverwoodstairs")
    public static arcaneworktable SILVERWOODSTAIRS;
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion

    @ObjectHolder("arcana:dairlog")
    public static dairlog DAIRLOG;

    @ObjectHolder("arcana:dairleaves")
    public static dairleaves DAIRLEAVES;

    @ObjectHolder("arcana:dairsapling")
    public static dairsapling DAIRSAPLING;

    @ObjectHolder("arcana:strippeddairlog")
    public static strippeddairlog STRIPPEDDAIRLOG;

    //tainted blocks

    @ObjectHolder("arcana:taintedrock")
    public static taintedrock TAINTEDROCK;

    @ObjectHolder("arcana:taintedsoil")
    public static taintedsoil TAINTEDSOIL;

    @ObjectHolder("arcana:taintedcrust")
    public static taintedcrust TAINTEDCRUST;

    @ObjectHolder("arcana:taintedoakplanks")
    public static taintedoakplanks TAINTEDOAKPLANKS;

    @ObjectHolder("arcana:taintgoo")
    public static taintgoo TAINTGOO;

    @ObjectHolder("arcana:taintedstonebrick")
    public static taintedstonebrick TAINTEDSTONEBRICK;

    @ObjectHolder("arcana:taintedsand")
    public static taintedsand TAINTEDSAND;

    @ObjectHolder("arcana:taintedgravel")
    public static taintedgravel TAINTEDGRAVEL;

    @ObjectHolder("arcana:taintedobsidian")
    public static taintedobsidian TAINTEDOBSIDIAN;


    //tainted tree blocks

    @ObjectHolder("arcana:taintedoakleaves")
    public static taintedoakleaves TAINTEDOAKLEAVES;

    @ObjectHolder("arcana:taintedoaksapling")
    public static taintedoaksapling TAINTEDOAKSAPLING;

    @ObjectHolder("arcana:taintedoaklog")
    public static taintedoaklog TAINTEDOAKLOG;

    @ObjectHolder("arcana:strippedtaintedoaklog")
    public static strippedtaintedoaklog STRIPPEDTAINTEDOAKLOG;

    @ObjectHolder("arcana:tainteddairlog")
    public static tainteddairlog TAINTEDDAIRLOG;

    @ObjectHolder("arcana:tainteddairplanks")
    public static tainteddairplanks TAINTEDDAIRPLANKS;

    @ObjectHolder("arcana:strippedtainteddairlog")
    public static strippedtainteddairlog STRIPPEDTAINTEDDAIRLOG;

    @ObjectHolder("arcana:tainteddairleaves")
    public static tainteddairleaves TAINTEDDAIRLEAVES;
<<<<<<< HEAD

    //ores

    @ObjectHolder("arcana:cinnabarore")
    public static cinnabarore CINNABARORE;


    //tainted ores

=======
    
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
    @ObjectHolder("arcana:taintedamberore")
    public static taintedamberore TAINTEDAMBERORE;
    
    @ObjectHolder("arcana:tainteddiamondore")
    public static tainteddiamondore TAINTEDDIAMONDORE;
    
    @ObjectHolder("arcana:taintedemeraldore")
    public static taintedemeraldore TAINTEDEMERALDORE;
    
    @ObjectHolder("arcana:taintedgoldore")
    public static taintedgoldore TAINTEDGOLDORE;
    
    @ObjectHolder("arcana:taintedcoalore")
    public static taintedcoalore TAINTEDCOALORE;
    
    @ObjectHolder("arcana:taintedironore")
    public static taintedironore TAINTEDIRONORE;
    
    @ObjectHolder("arcana:taintedredstoneore")
    public static taintedredstoneore TAINTEDREDSTONEORE;
    
    @ObjectHolder("arcana:taintedcinnabarore")
    public static taintedcinnabarore TAINTEDCINNABARORE;

    @ObjectHolder("arcana:taintedlapisore")
    public static taintedlapisore TAINTEDLAPISORE;
<<<<<<< HEAD

    @ObjectHolder("arcana:taintedplanksslab")
    public static tainted_planks_slab TAINTEDPLANKSSLAB;

=======
    
    @ObjectHolder("arcana:taintgoo")
    public static taintgoo TAINTGOO;
>>>>>>> parent of 316aa72... Reformat code to be consistent, remove debugging taint conversion
}


