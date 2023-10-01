package net.meshmc.mesh.api.block;

import net.meshmc.mesh.MeshAPI;

/**
 * @author Makrennel 04/21/2022
 * 
 * All static fields here point to methods in a class which is not present in mesh-core builds
 */
public interface MapColor {
    MapColor
            CLEAR = MeshAPI.getStatics().getMapColor().CLEAR(),
            PALE_GREEN = MeshAPI.getStatics().getMapColor().PALE_GREEN(),
            PALE_YELLOW = MeshAPI.getStatics().getMapColor().PALE_YELLOW(),
            WHITE_GRAY = MeshAPI.getStatics().getMapColor().WHITE_GRAY(),
            BRIGHT_RED = MeshAPI.getStatics().getMapColor().BRIGHT_RED(),
            PALE_PURPLE = MeshAPI.getStatics().getMapColor().PALE_PURPLE(),
            IRON_GRAY = MeshAPI.getStatics().getMapColor().IRON_GRAY(),
            DARK_GREEN = MeshAPI.getStatics().getMapColor().DARK_GREEN(),
            WHITE = MeshAPI.getStatics().getMapColor().WHITE(),
            LIGHT_BLUE_GRAY = MeshAPI.getStatics().getMapColor().LIGHT_BLUE_GRAY(),
            DIRT_BROWN = MeshAPI.getStatics().getMapColor().DIRT_BROWN(),
            STONE_GRAY = MeshAPI.getStatics().getMapColor().STONE_GRAY(),
            WATER_BLUE = MeshAPI.getStatics().getMapColor().WATER_BLUE(),
            OAK_TAN = MeshAPI.getStatics().getMapColor().OAK_TAN(),
            OFF_WHITE = MeshAPI.getStatics().getMapColor().OFF_WHITE(),
            ORANGE = MeshAPI.getStatics().getMapColor().ORANGE(),
            MAGENTA = MeshAPI.getStatics().getMapColor().MAGENTA(),
            LIGHT_BLUE = MeshAPI.getStatics().getMapColor().LIGHT_BLUE(),
            YELLOW = MeshAPI.getStatics().getMapColor().YELLOW(),
            LIME = MeshAPI.getStatics().getMapColor().LIME(),
            PINK = MeshAPI.getStatics().getMapColor().PINK(),
            GRAY = MeshAPI.getStatics().getMapColor().GRAY(),
            LIGHT_GRAY = MeshAPI.getStatics().getMapColor().LIGHT_GRAY(),
            CYAN = MeshAPI.getStatics().getMapColor().CYAN(),
            PURPLE = MeshAPI.getStatics().getMapColor().PURPLE(),
            BLUE = MeshAPI.getStatics().getMapColor().BLUE(),
            BROWN = MeshAPI.getStatics().getMapColor().BROWN(),
            GREEN = MeshAPI.getStatics().getMapColor().GREEN(),
            RED = MeshAPI.getStatics().getMapColor().RED(),
            BLACK = MeshAPI.getStatics().getMapColor().BLACK(),
            GOLD = MeshAPI.getStatics().getMapColor().GOLD(),
            DIAMOND_BLUE = MeshAPI.getStatics().getMapColor().DIAMOND_BLUE(),
            LAPIS_BLUE = MeshAPI.getStatics().getMapColor().LAPIS_BLUE(),
            EMERALD_GREEN = MeshAPI.getStatics().getMapColor().EMERALD_GREEN(),
            OBSIDIAN = MeshAPI.getStatics().getMapColor().OBSIDIAN(),
            DARK_RED = MeshAPI.getStatics().getMapColor().DARK_RED(),
            TERRACOTTA_WHITE = MeshAPI.getStatics().getMapColor().TERRACOTTA_WHITE(),
            TERRACOTTA_ORANGE = MeshAPI.getStatics().getMapColor().TERRACOTTA_ORANGE(),
            TERRACOTTA_MAGENTA = MeshAPI.getStatics().getMapColor().TERRACOTTA_MAGENTA(),
            TERRACOTTA_LIGHT_BLUE = MeshAPI.getStatics().getMapColor().TERRACOTTA_LIGHT_BLUE(),
            TERRACOTTA_YELLOW = MeshAPI.getStatics().getMapColor().TERRACOTTA_YELLOW(),
            TERRACOTTA_LIME = MeshAPI.getStatics().getMapColor().TERRACOTTA_LIME(),
            TERRACOTTA_PINK = MeshAPI.getStatics().getMapColor().TERRACOTTA_PINK(),
            TERRACOTTA_GRAY = MeshAPI.getStatics().getMapColor().TERRACOTTA_GRAY(),
            TERRACOTTA_LIGHT_GRAY = MeshAPI.getStatics().getMapColor().TERRACOTTA_LIGHT_GRAY(),
            TERRACOTTA_CYAN = MeshAPI.getStatics().getMapColor().TERRACOTTA_CYAN(),
            TERRACOTTA_PURPLE = MeshAPI.getStatics().getMapColor().TERRACOTTA_PURPLE(),
            TERRACOTTA_BLUE = MeshAPI.getStatics().getMapColor().TERRACOTTA_BLUE(),
            TERRACOTTA_BROWN = MeshAPI.getStatics().getMapColor().TERRACOTTA_BROWN(),
            TERRACOTTA_GREEN = MeshAPI.getStatics().getMapColor().TERRACOTTA_GREEN(),
            TERRACOTTA_RED = MeshAPI.getStatics().getMapColor().TERRACOTTA_RED(),
            TERRACOTTA_BLACK = MeshAPI.getStatics().getMapColor().TERRACOTTA_BLACK(),
            DULL_RED = MeshAPI.getStatics().getMapColor().DULL_RED(),
            DULL_PINK = MeshAPI.getStatics().getMapColor().DULL_PINK(),
            DARK_CRIMSON = MeshAPI.getStatics().getMapColor().DARK_CRIMSON(),
            TEAL = MeshAPI.getStatics().getMapColor().TEAL(),
            DARK_AQUA = MeshAPI.getStatics().getMapColor().DARK_AQUA(),
            DARK_DULL_PINK = MeshAPI.getStatics().getMapColor().DARK_DULL_PINK(),
            BRIGHT_TEAL = MeshAPI.getStatics().getMapColor().BRIGHT_TEAL(),
            DEEPSLATE_GRAY = MeshAPI.getStatics().getMapColor().DEEPSLATE_GRAY(),
            RAW_IRON_PINK = MeshAPI.getStatics().getMapColor().RAW_IRON_PINK(),
            LICHEN_GREEN = MeshAPI.getStatics().getMapColor().LICHEN_GREEN();

    int getColor();

    int getId();
}
