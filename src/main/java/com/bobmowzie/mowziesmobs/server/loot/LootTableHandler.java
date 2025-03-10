package com.bobmowzie.mowziesmobs.server.loot;

import com.bobmowzie.mowziesmobs.MowziesMobs;
import net.minecraft.loot.ILootSerializer;
import net.minecraft.loot.LootFunctionType;
import net.minecraft.loot.functions.ILootFunction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class LootTableHandler {
    // Mob drops
    public static final ResourceLocation FERROUS_WROUGHTNAUT = register("entities/ferrous_wroughtnaut");
    public static final ResourceLocation LANTERN = register("entities/lantern");
    public static final ResourceLocation NAGA = register("entities/naga");
    public static final ResourceLocation FOLIAATH = register("entities/foliaath");
    public static final ResourceLocation GROTTOL = register("entities/grottol");
    public static final ResourceLocation FROSTMAW = register("entities/frostmaw");
    public static final ResourceLocation BARAKOA_FURY = register("entities/barakoa_fury");
    public static final ResourceLocation BARAKOA_MISERY = register("entities/barakoa_misery");
    public static final ResourceLocation BARAKOA_BLISS = register("entities/barakoa_bliss");
    public static final ResourceLocation BARAKOA_RAGE = register("entities/barakoa_rage");
    public static final ResourceLocation BARAKOA_FEAR = register("entities/barakoa_fear");
    public static final ResourceLocation BARAKO = register("entities/barako");
    public static final ResourceLocation BARAKOA_VILLAGE_HOUSE = register("chests/barakoa_village_house");

    public static LootFunctionType CHECK_FROSTMAW_CRYSTAL;
    public static LootFunctionType GROTTOL_DEATH_TYPE;

    public static void init() {
        CHECK_FROSTMAW_CRYSTAL = registerFunction("mowziesmobs:has_crystal", new LootFunctionCheckFrostmawCrystal.Serializer());
        GROTTOL_DEATH_TYPE = registerFunction("mowziesmobs:grottol_death_type", new LootFunctionGrottolDeathType.Serializer());
    }

    private static ResourceLocation register(String id) {
        return new ResourceLocation(MowziesMobs.MODID, id);
    }

    private static LootFunctionType registerFunction(String name, ILootSerializer<? extends ILootFunction> serializer) {
        return Registry.register(Registry.LOOT_FUNCTION_TYPE, new ResourceLocation(name), new LootFunctionType(serializer));
    }
}
