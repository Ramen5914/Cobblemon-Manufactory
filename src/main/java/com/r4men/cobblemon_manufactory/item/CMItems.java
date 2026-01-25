package com.r4men.cobblemon_manufactory.item;

import com.r4men.cobblemon_manufactory.CobblemonManufactory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class CMItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonManufactory.ID);

    public static final List<DeferredItem<Item>> OTHER_ITEMS = new ArrayList<>();
    public static final List<DeferredItem<Item>> ALL_LIDS = new ArrayList<>();
    public static final List<DeferredItem<Item>> ALL_BASES = new ArrayList<>();
    public static final List<DeferredItem<Item>> ALL_CORES = new ArrayList<>();

    // Lids
    public static final DeferredItem<Item> ANCIENT_BLACK_BALL_LID = registerSimpleLid("ancient_black_ball_lid");
    public static final DeferredItem<Item> ANCIENT_BLUE_BALL_LID = registerSimpleLid("ancient_blue_ball_lid");
    public static final DeferredItem<Item> ANCIENT_FEATHER_BALL_LID = registerSimpleLid("ancient_feather_ball_lid");
    public static final DeferredItem<Item> ANCIENT_GIGATON_BALL_LID = registerSimpleLid("ancient_gigaton_ball_lid");
    public static final DeferredItem<Item> ANCIENT_GREAT_BALL_LID = registerSimpleLid("ancient_great_ball_lid");
    public static final DeferredItem<Item> ANCIENT_GREEN_BALL_LID = registerSimpleLid("ancient_green_ball_lid");
    public static final DeferredItem<Item> ANCIENT_HEAVY_BALL_LID = registerSimpleLid("ancient_heavy_ball_lid");
    public static final DeferredItem<Item> ANCIENT_JET_BALL_LID = registerSimpleLid("ancient_jet_ball_lid");
    public static final DeferredItem<Item> ANCIENT_LEADEN_BALL_LID = registerSimpleLid("ancient_leaden_ball_lid");
    public static final DeferredItem<Item> ANCIENT_PINK_BALL_LID = registerSimpleLid("ancient_pink_ball_lid");
    public static final DeferredItem<Item> ANCIENT_RED_BALL_LID = registerSimpleLid("ancient_red_ball_lid");
    public static final DeferredItem<Item> ANCIENT_ULTRA_BALL_LID = registerSimpleLid("ancient_ultra_ball_lid");
    public static final DeferredItem<Item> ANCIENT_WHITE_BALL_LID = registerSimpleLid("ancient_white_ball_lid");
    public static final DeferredItem<Item> ANCIENT_WING_BALL_LID = registerSimpleLid("ancient_wing_ball_lid");
    public static final DeferredItem<Item> ANCIENT_YELLOW_BALL_LID = registerSimpleLid("ancient_yellow_ball_lid");
    public static final DeferredItem<Item> BEAST_BALL_LID = registerSimpleLid("beast_ball_lid");
    public static final DeferredItem<Item> BLACK_BALL_LID = registerSimpleLid("black_ball_lid");
    public static final DeferredItem<Item> BLACK_TUMBLESTONE_LID = registerSimpleLid("black_tumblestone_lid");
    public static final DeferredItem<Item> BLUE_BALL_LID = registerSimpleLid("blue_ball_lid");
    public static final DeferredItem<Item> DIVE_BALL_LID = registerSimpleLid("dive_ball_lid");
    public static final DeferredItem<Item> DREAM_BALL_LID = registerSimpleLid("dream_ball_lid");
    public static final DeferredItem<Item> DUSK_BALL_LID = registerSimpleLid("dusk_ball_lid");
    public static final DeferredItem<Item> FAST_BALL_LID = registerSimpleLid("fast_ball_lid");
    public static final DeferredItem<Item> FRIEND_BALL_LID = registerSimpleLid("friend_ball_lid");
    public static final DeferredItem<Item> GREAT_BALL_LID = registerSimpleLid("great_ball_lid");
    public static final DeferredItem<Item> GREEN_BALL_LID = registerSimpleLid("green_ball_lid");
    public static final DeferredItem<Item> HEAL_BALL_LID = registerSimpleLid("heal_ball_lid");
    public static final DeferredItem<Item> HEAVY_BALL_LID = registerSimpleLid("heavy_ball_lid");
    public static final DeferredItem<Item> LEVEL_BALL_LID = registerSimpleLid("level_ball_lid");
    public static final DeferredItem<Item> LOVE_BALL_LID = registerSimpleLid("love_ball_lid");
    public static final DeferredItem<Item> LURE_BALL_LID = registerSimpleLid("lure_ball_lid");
    public static final DeferredItem<Item> LUXURY_BALL_LID = registerSimpleLid("luxury_ball_lid");
    public static final DeferredItem<Item> MASTER_BALL_LID = registerSimpleLid("master_ball_lid");
    public static final DeferredItem<Item> MOON_BALL_LID = registerSimpleLid("moon_ball_lid");
    public static final DeferredItem<Item> NEST_BALL_LID = registerSimpleLid("nest_ball_lid");
    public static final DeferredItem<Item> NET_BALL_LID = registerSimpleLid("net_ball_lid");
    public static final DeferredItem<Item> PARK_BALL_LID = registerSimpleLid("park_ball_lid");
    public static final DeferredItem<Item> PINK_BALL_LID = registerSimpleLid("pink_ball_lid");
    public static final DeferredItem<Item> QUICK_BALL_LID = registerSimpleLid("quick_ball_lid");
    public static final DeferredItem<Item> RED_BALL_LID = registerSimpleLid("red_ball_lid");
    public static final DeferredItem<Item> REPEAT_BALL_LID = registerSimpleLid("repeat_ball_lid");
    public static final DeferredItem<Item> SAFARI_BALL_LID = registerSimpleLid("safari_ball_lid");
    public static final DeferredItem<Item> SKY_TUMBLESTONE_LID = registerSimpleLid("sky_tumblestone_lid");
    public static final DeferredItem<Item> SPORT_BALL_LID = registerSimpleLid("sport_ball_lid");
    public static final DeferredItem<Item> TIMER_BALL_LID = registerSimpleLid("timer_ball_lid");
    public static final DeferredItem<Item> TUMBLESTONE_LID = registerSimpleLid("tumblestone_lid");
    public static final DeferredItem<Item> ULTRA_BALL_LID = registerSimpleLid("ultra_ball_lid");
    public static final DeferredItem<Item> WHITE_BALL_LID = registerSimpleLid("white_ball_lid");
    public static final DeferredItem<Item> YELLOW_BALL_LID = registerSimpleLid("yellow_ball_lid");

    // Bases
    public static final DeferredItem<Item> ANCIENT_BLACK_BALL_BASE = registerSimpleBase("ancient_black_ball_base");
    public static final DeferredItem<Item> ANCIENT_BLUE_BALL_BASE = registerSimpleBase("ancient_blue_ball_base");
    public static final DeferredItem<Item> ANCIENT_FEATHER_BALL_BASE = registerSimpleBase("ancient_feather_ball_base");
    public static final DeferredItem<Item> ANCIENT_GIGATON_BALL_BASE = registerSimpleBase("ancient_gigaton_ball_base");
    public static final DeferredItem<Item> ANCIENT_GREAT_BALL_BASE = registerSimpleBase("ancient_great_ball_base");
    public static final DeferredItem<Item> ANCIENT_GREEN_BALL_BASE = registerSimpleBase("ancient_green_ball_base");
    public static final DeferredItem<Item> ANCIENT_HEAVY_BALL_BASE = registerSimpleBase("ancient_heavy_ball_base");
    public static final DeferredItem<Item> ANCIENT_JET_BALL_BASE = registerSimpleBase("ancient_jet_ball_base");
    public static final DeferredItem<Item> ANCIENT_LEADEN_BALL_BASE = registerSimpleBase("ancient_leaden_ball_base");
    public static final DeferredItem<Item> ANCIENT_PINK_BALL_BASE = registerSimpleBase("ancient_pink_ball_base");
    public static final DeferredItem<Item> ANCIENT_RED_BALL_BASE = registerSimpleBase("ancient_red_ball_base");
    public static final DeferredItem<Item> ANCIENT_ULTRA_BALL_BASE = registerSimpleBase("ancient_ultra_ball_base");
    public static final DeferredItem<Item> ANCIENT_WHITE_BALL_BASE = registerSimpleBase("ancient_white_ball_base");
    public static final DeferredItem<Item> ANCIENT_WING_BALL_BASE = registerSimpleBase("ancient_wing_ball_base");
    public static final DeferredItem<Item> ANCIENT_YELLOW_BALL_BASE = registerSimpleBase("ancient_yellow_ball_base");
    public static final DeferredItem<Item> BEAST_BALL_BASE = registerSimpleBase("beast_ball_base");
    public static final DeferredItem<Item> BLACK_BALL_BASE = registerSimpleBase("black_ball_base");
    public static final DeferredItem<Item> BLACK_TUMBLESTONE_BASE = registerSimpleBase("black_tumblestone_base");
    public static final DeferredItem<Item> BLUE_BALL_BASE = registerSimpleBase("blue_ball_base");
    public static final DeferredItem<Item> DIVE_BALL_BASE = registerSimpleBase("dive_ball_base");
    public static final DeferredItem<Item> DREAM_BALL_BASE = registerSimpleBase("dream_ball_base");
    public static final DeferredItem<Item> DUSK_BALL_BASE = registerSimpleBase("dusk_ball_base");
    public static final DeferredItem<Item> FAST_BALL_BASE = registerSimpleBase("fast_ball_base");
    public static final DeferredItem<Item> FRIEND_BALL_BASE = registerSimpleBase("friend_ball_base");
    public static final DeferredItem<Item> GREAT_BALL_BASE = registerSimpleBase("great_ball_base");
    public static final DeferredItem<Item> GREEN_BALL_BASE = registerSimpleBase("green_ball_base");
    public static final DeferredItem<Item> HEAL_BALL_BASE = registerSimpleBase("heal_ball_base");
    public static final DeferredItem<Item> HEAVY_BALL_BASE = registerSimpleBase("heavy_ball_base");
    public static final DeferredItem<Item> LEVEL_BALL_BASE = registerSimpleBase("level_ball_base");
    public static final DeferredItem<Item> LOVE_BALL_BASE = registerSimpleBase("love_ball_base");
    public static final DeferredItem<Item> LURE_BALL_BASE = registerSimpleBase("lure_ball_base");
    public static final DeferredItem<Item> LUXURY_BALL_BASE = registerSimpleBase("luxury_ball_base");
    public static final DeferredItem<Item> MASTER_BALL_BASE = registerSimpleBase("master_ball_base");
    public static final DeferredItem<Item> MOON_BALL_BASE = registerSimpleBase("moon_ball_base");
    public static final DeferredItem<Item> NEST_BALL_BASE = registerSimpleBase("nest_ball_base");
    public static final DeferredItem<Item> NET_BALL_BASE = registerSimpleBase("net_ball_base");
    public static final DeferredItem<Item> PARK_BALL_BASE = registerSimpleBase("park_ball_base");
    public static final DeferredItem<Item> PINK_BALL_BASE = registerSimpleBase("pink_ball_base");
    public static final DeferredItem<Item> QUICK_BALL_BASE = registerSimpleBase("quick_ball_base");
    public static final DeferredItem<Item> RED_BALL_BASE = registerSimpleBase("red_ball_base");
    public static final DeferredItem<Item> REPEAT_BALL_BASE = registerSimpleBase("repeat_ball_base");
    public static final DeferredItem<Item> SAFARI_BALL_BASE = registerSimpleBase("safari_ball_base");
    public static final DeferredItem<Item> SKY_TUMBLESTONE_BASE = registerSimpleBase("sky_tumblestone_base");
    public static final DeferredItem<Item> SPORT_BALL_BASE = registerSimpleBase("sport_ball_base");
    public static final DeferredItem<Item> TIMER_BALL_BASE = registerSimpleBase("timer_ball_base");
    public static final DeferredItem<Item> TUMBLESTONE_BASE = registerSimpleBase("tumblestone_base");
    public static final DeferredItem<Item> ULTRA_BALL_BASE = registerSimpleBase("ultra_ball_base");
    public static final DeferredItem<Item> WHITE_BALL_BASE = registerSimpleBase("white_ball_base");
    public static final DeferredItem<Item> YELLOW_BALL_BASE = registerSimpleBase("yellow_ball_base");

    // Incomplete Balls
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_AZURE_BALL = registerSimpleIncompleteItem("incomplete_ancient_azure_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_CITRINE_BALL = registerSimpleIncompleteItem("incomplete_ancient_citrine_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_FEATHER_BALL = registerSimpleIncompleteItem("incomplete_ancient_feather_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_GIGATON_BALL = registerSimpleIncompleteItem("incomplete_ancient_gigaton_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_GREAT_BALL = registerSimpleIncompleteItem("incomplete_ancient_great_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_HEAVY_BALL = registerSimpleIncompleteItem("incomplete_ancient_heavy_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_IVORY_BALL = registerSimpleIncompleteItem("incomplete_ancient_ivory_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_JET_BALL = registerSimpleIncompleteItem("incomplete_ancient_jet_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_LEADEN_BALL = registerSimpleIncompleteItem("incomplete_ancient_leaden_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_POKE_BALL = registerSimpleIncompleteItem("incomplete_ancient_poke_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_ROSEATE_BALL = registerSimpleIncompleteItem("incomplete_ancient_roseate_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_SLATE_BALL = registerSimpleIncompleteItem("incomplete_ancient_slate_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_ULTRA_BALL = registerSimpleIncompleteItem("incomplete_ancient_ultra_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_VERDANT_BALL = registerSimpleIncompleteItem("incomplete_ancient_verdant_ball");
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_WING_BALL = registerSimpleIncompleteItem("incomplete_ancient_wing_ball");
    public static final DeferredItem<Item> INCOMPLETE_AZURE_BALL = registerSimpleIncompleteItem("incomplete_azure_ball");
    public static final DeferredItem<Item> INCOMPLETE_BEAST_BALL = registerSimpleIncompleteItem("incomplete_beast_ball");
    public static final DeferredItem<Item> INCOMPLETE_CITRINE_BALL = registerSimpleIncompleteItem("incomplete_citrine_ball");
    public static final DeferredItem<Item> INCOMPLETE_DIVE_BALL = registerSimpleIncompleteItem("incomplete_dive_ball");
    public static final DeferredItem<Item> INCOMPLETE_DREAM_BALL = registerSimpleIncompleteItem("incomplete_dream_ball");
    public static final DeferredItem<Item> INCOMPLETE_DUSK_BALL = registerSimpleIncompleteItem("incomplete_dusk_ball");
    public static final DeferredItem<Item> INCOMPLETE_FAST_BALL = registerSimpleIncompleteItem("incomplete_fast_ball");
    public static final DeferredItem<Item> INCOMPLETE_FRIEND_BALL = registerSimpleIncompleteItem("incomplete_friend_ball");
    public static final DeferredItem<Item> INCOMPLETE_GREAT_BALL = registerSimpleIncompleteItem("incomplete_great_ball");
    public static final DeferredItem<Item> INCOMPLETE_HEAL_BALL = registerSimpleIncompleteItem("incomplete_heal_ball");
    public static final DeferredItem<Item> INCOMPLETE_HEAVY_BALL = registerSimpleIncompleteItem("incomplete_heavy_ball");
    public static final DeferredItem<Item> INCOMPLETE_LEVEL_BALL = registerSimpleIncompleteItem("incomplete_level_ball");
    public static final DeferredItem<Item> INCOMPLETE_LOVE_BALL = registerSimpleIncompleteItem("incomplete_love_ball");
    public static final DeferredItem<Item> INCOMPLETE_LURE_BALL = registerSimpleIncompleteItem("incomplete_lure_ball");
    public static final DeferredItem<Item> INCOMPLETE_LUXURY_BALL = registerSimpleIncompleteItem("incomplete_luxury_ball");
    public static final DeferredItem<Item> INCOMPLETE_MASTER_BALL = registerSimpleIncompleteItem("incomplete_master_ball");
    public static final DeferredItem<Item> INCOMPLETE_MOON_BALL = registerSimpleIncompleteItem("incomplete_moon_ball");
    public static final DeferredItem<Item> INCOMPLETE_NEST_BALL = registerSimpleIncompleteItem("incomplete_nest_ball");
    public static final DeferredItem<Item> INCOMPLETE_NET_BALL = registerSimpleIncompleteItem("incomplete_net_ball");
    public static final DeferredItem<Item> INCOMPLETE_PARK_BALL = registerSimpleIncompleteItem("incomplete_park_ball");
    public static final DeferredItem<Item> INCOMPLETE_POKE_BALL = registerSimpleIncompleteItem("incomplete_poke_ball");
    public static final DeferredItem<Item> INCOMPLETE_PREMIER_BALL = registerSimpleIncompleteItem("incomplete_premier_ball");
    public static final DeferredItem<Item> INCOMPLETE_QUICK_BALL = registerSimpleIncompleteItem("incomplete_quick_ball");
    public static final DeferredItem<Item> INCOMPLETE_REPEAT_BALL = registerSimpleIncompleteItem("incomplete_repeat_ball");
    public static final DeferredItem<Item> INCOMPLETE_ROSEATE_BALL = registerSimpleIncompleteItem("incomplete_roseate_ball");
    public static final DeferredItem<Item> INCOMPLETE_SAFARI_BALL = registerSimpleIncompleteItem("incomplete_safari_ball");
    public static final DeferredItem<Item> INCOMPLETE_SLATE_BALL = registerSimpleIncompleteItem("incomplete_slate_ball");
    public static final DeferredItem<Item> INCOMPLETE_SPORT_BALL = registerSimpleIncompleteItem("incomplete_sport_ball");
    public static final DeferredItem<Item> INCOMPLETE_TIMER_BALL = registerSimpleIncompleteItem("incomplete_timer_ball");
    public static final DeferredItem<Item> INCOMPLETE_ULTRA_BALL = registerSimpleIncompleteItem("incomplete_ultra_ball");
    public static final DeferredItem<Item> INCOMPLETE_VERDANT_BALL = registerSimpleIncompleteItem("incomplete_verdant_ball");

    // Incomplete Lids
    public static final DeferredItem<Item> INCOMPLETE_MASTER_BALL_LID = registerSimpleIncompleteItem("incomplete_master_ball_lid");

    // Misc
    public static final DeferredItem<Item> CRUSHED_EXP_QUARTZ = registerSimpleItem("crushed_exp_quartz");
    public static final DeferredItem<Item> EXP_QUARTZ = registerSimpleItem("exp_quartz");

    public static final DeferredItem<Item> IRON_BALL_CORE = registerSimpleCore("iron_ball_core");
    public static final DeferredItem<Item> COPPER_BALL_CORE = registerSimpleCore("copper_ball_core");
    public static final DeferredItem<Item> GOLD_BALL_CORE = registerSimpleCore("gold_ball_core");
    public static final DeferredItem<Item> DIAMOND_BALL_CORE = registerSimpleCore("diamond_ball_core");
    public static final DeferredItem<Item> NETHERITE_BALL_CORE = registerSimpleCore("netherite_ball_core");

    public static DeferredItem<Item> registerSimpleItem(String name) {
        DeferredItem<Item> item = ITEMS.registerSimpleItem(name);

        OTHER_ITEMS.add(item);
        return item;
    }

    public static DeferredItem<Item> registerSimpleCore(String name) {
        DeferredItem<Item> item = ITEMS.registerSimpleItem(name);

        ALL_CORES.add(item);
        return item;
    }

    public static DeferredItem<Item> registerSimpleLid(String name) {
        DeferredItem<Item> item = ITEMS.registerSimpleItem(name);

        ALL_LIDS.add(item);
        return item;
    }

    public static DeferredItem<Item> registerSimpleBase(String name) {
        DeferredItem<Item> item = ITEMS.registerSimpleItem(name);

        ALL_BASES.add(item);
        return item;
    }

    private static DeferredItem<Item> registerSimpleIncompleteItem(String name) {
        return ITEMS.registerSimpleItem(name, new Item.Properties().stacksTo(1));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
