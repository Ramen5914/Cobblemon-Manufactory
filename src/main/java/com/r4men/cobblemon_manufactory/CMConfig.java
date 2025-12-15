package com.r4men.cobblemon_manufactory;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CMConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue REMOVE_MECHANICAL_CRAFTER_RECIPES = BUILDER
            .comment("Whether to remove pokeball crafting recipes from Create mod's Mechanical Crafter.")
            .define("removeMechanicalCrafterRecipes", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}
