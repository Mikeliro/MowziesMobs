package com.bobmowzie.mowziesmobs.common.gen;

import com.bobmowzie.mowziesmobs.common.gen.structure.StructureWroughtnautRoom;
import net.ilexiconn.llibrary.common.structure.util.Structure;
import net.ilexiconn.llibrary.common.structure.util.StructureGeneratorBase;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import java.util.LinkedList;
import java.util.List;

public class MMStructureGenerator extends StructureGeneratorBase
{
    /** List storing all structures currently available */
    public static final List<Structure> structures = new LinkedList();

    public MMStructureGenerator() {
        // TODO Auto-generated constructor stub
    }

    public MMStructureGenerator(Entity entity, int[][][][] blocks) {
        super(entity, blocks);
        // TODO Auto-generated constructor stub
    }

    public MMStructureGenerator(Entity entity, int[][][][] blocks, int structureFacing) {
        super(entity, blocks, structureFacing);
        // TODO Auto-generated constructor stub
    }

    public MMStructureGenerator(Entity entity, int[][][][] blocks, int structureFacing, int offX, int offY, int offZ) {
        super(entity, blocks, structureFacing, offX, offY, offZ);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getRealBlockID(int fakeID, int customData1) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void onCustomBlockAdded(World world, int x, int y, int z, int fakeID, int customData1, int customData2) {
        // TODO Auto-generated method stub
    }

    static {
        Structure structure = new Structure("Wroughtnaut Room");
        structure.addBlockArray(StructureWroughtnautRoom.blockArray);
        structures.add(structure);
    }
}