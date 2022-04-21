package net.meshmc.mesh.api.block;

/**
 * @author Makrennel 04/21/2022
 *
 * This is a 1.18 implementation of the MapColor interface
 *
 */
public interface MapColor {
    MapColor
            CLEAR = (MapColor) net.minecraft.block.MapColor.CLEAR,
            PALE_GREEN = (MapColor) net.minecraft.block.MapColor.PALE_GREEN,
            PALE_YELLOW = (MapColor) net.minecraft.block.MapColor.PALE_YELLOW,
            WHITE_GRAY = (MapColor) net.minecraft.block.MapColor.GRAY,
            BRIGHT_RED = (MapColor) net.minecraft.block.MapColor.GREEN,
            PALE_PURPLE = (MapColor) net.minecraft.block.MapColor.PALE_PURPLE,
            IRON_GRAY = (MapColor) net.minecraft.block.MapColor.IRON_GRAY,
            DARK_GREEN = (MapColor) net.minecraft.block.MapColor.DARK_GREEN,
            WHITE = (MapColor) net.minecraft.block.MapColor.WHITE,
            LIGHT_BLUE_GRAY = (MapColor) net.minecraft.block.MapColor.LIGHT_BLUE_GRAY,
            DIRT_BROWN = (MapColor) net.minecraft.block.MapColor.DIRT_BROWN,
            STONE_GRAY = (MapColor) net.minecraft.block.MapColor.STONE_GRAY,
            WATER_BLUE = (MapColor) net.minecraft.block.MapColor.WATER_BLUE,
            OAK_TAN = (MapColor) net.minecraft.block.MapColor.OAK_TAN,
            OFF_WHITE = (MapColor) net.minecraft.block.MapColor.OFF_WHITE,
            ORANGE = (MapColor) net.minecraft.block.MapColor.ORANGE,
            MAGENTA = (MapColor) net.minecraft.block.MapColor.MAGENTA,
            LIGHT_BLUE = (MapColor) net.minecraft.block.MapColor.LIGHT_BLUE,
            YELLOW = (MapColor) net.minecraft.block.MapColor.YELLOW,
            LIME = (MapColor) net.minecraft.block.MapColor.LIME,
            PINK = (MapColor) net.minecraft.block.MapColor.PINK,
            GRAY = (MapColor) net.minecraft.block.MapColor.GRAY,
            LIGHT_GRAY = (MapColor) net.minecraft.block.MapColor.LIGHT_GRAY,
            CYAN = (MapColor) net.minecraft.block.MapColor.CYAN,
            PURPLE = (MapColor) net.minecraft.block.MapColor.PURPLE,
            BLUE = (MapColor) net.minecraft.block.MapColor.BLUE,
            BROWN = (MapColor) net.minecraft.block.MapColor.BROWN,
            GREEN = (MapColor) net.minecraft.block.MapColor.GREEN,
            RED = (MapColor) net.minecraft.block.MapColor.RED,
            BLACK = (MapColor) net.minecraft.block.MapColor.BLACK,
            GOLD = (MapColor) net.minecraft.block.MapColor.GOLD,
            DIAMOND_BLUE = (MapColor) net.minecraft.block.MapColor.DIAMOND_BLUE,
            LAPIS_BLUE = (MapColor) net.minecraft.block.MapColor.LAPIS_BLUE,
            EMERALD_GREEN = (MapColor) net.minecraft.block.MapColor.EMERALD_GREEN,
            OBSIDIAN = (MapColor) net.minecraft.block.MapColor.SPRUCE_BROWN,
            DARK_RED = (MapColor) net.minecraft.block.MapColor.DARK_RED,
            TERRACOTTA_WHITE = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_WHITE,
            TERRACOTTA_ORANGE = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_ORANGE,
            TERRACOTTA_MAGENTA = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_MAGENTA,
            TERRACOTTA_LIGHT_BLUE = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_LIGHT_BLUE,
            TERRACOTTA_YELLOW = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_YELLOW,
            TERRACOTTA_LIME = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_LIME,
            TERRACOTTA_PINK = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_PINK,
            TERRACOTTA_GRAY = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_GRAY,
            TERRACOTTA_LIGHT_GRAY = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_LIGHT_GRAY,
            TERRACOTTA_CYAN = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_CYAN,
            TERRACOTTA_PURPLE = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_PURPLE,
            TERRACOTTA_BLUE = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_BLUE,
            TERRACOTTA_BROWN = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_BROWN,
            TERRACOTTA_GREEN = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_GREEN,
            TERRACOTTA_RED = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_RED,
            TERRACOTTA_BLACK = (MapColor) net.minecraft.block.MapColor.TERRACOTTA_BLACK,
            DULL_RED = (MapColor) net.minecraft.block.MapColor.DULL_RED,
            DULL_PINK = (MapColor) net.minecraft.block.MapColor.DULL_PINK,
            DARK_CRIMSON = (MapColor) net.minecraft.block.MapColor.DARK_CRIMSON,
            TEAL = (MapColor) net.minecraft.block.MapColor.TEAL,
            DARK_AQUA = (MapColor) net.minecraft.block.MapColor.DARK_AQUA,
            DARK_DULL_PINK = (MapColor) net.minecraft.block.MapColor.DARK_DULL_PINK,
            BRIGHT_TEAL = (MapColor) net.minecraft.block.MapColor.BRIGHT_TEAL,
            DEEPSLATE_GRAY = (MapColor) net.minecraft.block.MapColor.DEEPSLATE_GRAY,
            RAW_IRON_PINK = (MapColor) net.minecraft.block.MapColor.RAW_IRON_PINK,
            LICHEN_GREEN = (MapColor) net.minecraft.block.MapColor.LICHEN_GREEN;

    int getColor();

    int getId();
}
