package net.meshmc.mesh.api.block;

import net.meshmc.mesh.impl.mixin.accessors.MapColorAccessor;

/**
 * @author Makrennel 04/21/2022
 *
 * This is a 1.12 implementation of the MapColor interface
 * MapColors which do not exist in 1.12 normally but do in 1.18 have been created.
 */
public interface MapColor {
    MapColor
            CLEAR = (MapColor) net.minecraft.block.material.MapColor.AIR,
            PALE_GREEN = (MapColor) net.minecraft.block.material.MapColor.GRASS,
            PALE_YELLOW = (MapColor) net.minecraft.block.material.MapColor.SAND,
            WHITE_GRAY = (MapColor) net.minecraft.block.material.MapColor.CLOTH,
            BRIGHT_RED = (MapColor) net.minecraft.block.material.MapColor.TNT,
            PALE_PURPLE = (MapColor) net.minecraft.block.material.MapColor.ICE,
            IRON_GRAY = (MapColor) net.minecraft.block.material.MapColor.IRON,
            DARK_GREEN = (MapColor) net.minecraft.block.material.MapColor.FOLIAGE,
            WHITE = (MapColor) net.minecraft.block.material.MapColor.SNOW,
            LIGHT_BLUE_GRAY = (MapColor) net.minecraft.block.material.MapColor.CLAY,
            DIRT_BROWN = (MapColor) net.minecraft.block.material.MapColor.DIRT,
            STONE_GRAY = (MapColor) net.minecraft.block.material.MapColor.STONE,
            WATER_BLUE = (MapColor) net.minecraft.block.material.MapColor.WATER,
            OAK_TAN = (MapColor) net.minecraft.block.material.MapColor.WOOD,
            OFF_WHITE = (MapColor) net.minecraft.block.material.MapColor.QUARTZ,
            ORANGE = (MapColor) net.minecraft.block.material.MapColor.ADOBE,
            MAGENTA = (MapColor) net.minecraft.block.material.MapColor.MAGENTA,
            LIGHT_BLUE = (MapColor) net.minecraft.block.material.MapColor.LIGHT_BLUE,
            YELLOW = (MapColor) net.minecraft.block.material.MapColor.YELLOW,
            LIME = (MapColor) net.minecraft.block.material.MapColor.LIME,
            PINK = (MapColor) net.minecraft.block.material.MapColor.PINK,
            GRAY = (MapColor) net.minecraft.block.material.MapColor.GRAY,
            LIGHT_GRAY = (MapColor) net.minecraft.block.material.MapColor.SILVER,
            CYAN = (MapColor) net.minecraft.block.material.MapColor.CYAN,
            PURPLE = (MapColor) net.minecraft.block.material.MapColor.PURPLE,
            BLUE = (MapColor) net.minecraft.block.material.MapColor.BLUE,
            BROWN = (MapColor) net.minecraft.block.material.MapColor.BROWN,
            GREEN = (MapColor) net.minecraft.block.material.MapColor.GREEN,
            RED = (MapColor) net.minecraft.block.material.MapColor.RED,
            BLACK = (MapColor) net.minecraft.block.material.MapColor.BLACK,
            GOLD = (MapColor) net.minecraft.block.material.MapColor.GOLD,
            DIAMOND_BLUE = (MapColor) net.minecraft.block.material.MapColor.DIAMOND,
            LAPIS_BLUE = (MapColor) net.minecraft.block.material.MapColor.LAPIS,
            EMERALD_GREEN = (MapColor) net.minecraft.block.material.MapColor.EMERALD,
            OBSIDIAN = (MapColor) net.minecraft.block.material.MapColor.OBSIDIAN,
            DARK_RED = (MapColor) net.minecraft.block.material.MapColor.NETHERRACK,
            TERRACOTTA_WHITE = (MapColor) net.minecraft.block.material.MapColor.WHITE_STAINED_HARDENED_CLAY,
            TERRACOTTA_ORANGE = (MapColor) net.minecraft.block.material.MapColor.ORANGE_STAINED_HARDENED_CLAY,
            TERRACOTTA_MAGENTA = (MapColor) net.minecraft.block.material.MapColor.MAGENTA_STAINED_HARDENED_CLAY,
            TERRACOTTA_LIGHT_BLUE = (MapColor) net.minecraft.block.material.MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY,
            TERRACOTTA_YELLOW = (MapColor) net.minecraft.block.material.MapColor.YELLOW_STAINED_HARDENED_CLAY,
            TERRACOTTA_LIME = (MapColor) net.minecraft.block.material.MapColor.LIME_STAINED_HARDENED_CLAY,
            TERRACOTTA_PINK = (MapColor) net.minecraft.block.material.MapColor.PINK_STAINED_HARDENED_CLAY,
            TERRACOTTA_GRAY = (MapColor) net.minecraft.block.material.MapColor.GRAY_STAINED_HARDENED_CLAY,
            TERRACOTTA_LIGHT_GRAY = (MapColor) net.minecraft.block.material.MapColor.SILVER_STAINED_HARDENED_CLAY,
            TERRACOTTA_CYAN = (MapColor) net.minecraft.block.material.MapColor.CYAN_STAINED_HARDENED_CLAY,
            TERRACOTTA_PURPLE = (MapColor) net.minecraft.block.material.MapColor.PURPLE_STAINED_HARDENED_CLAY,
            TERRACOTTA_BLUE = (MapColor) net.minecraft.block.material.MapColor.BLUE_STAINED_HARDENED_CLAY,
            TERRACOTTA_BROWN = (MapColor) net.minecraft.block.material.MapColor.BROWN_STAINED_HARDENED_CLAY,
            TERRACOTTA_GREEN = (MapColor) net.minecraft.block.material.MapColor.GREEN_STAINED_HARDENED_CLAY,
            TERRACOTTA_RED = (MapColor) net.minecraft.block.material.MapColor.RED_STAINED_HARDENED_CLAY,
            TERRACOTTA_BLACK = (MapColor) net.minecraft.block.material.MapColor.BLACK_STAINED_HARDENED_CLAY,
            DULL_RED = (MapColor) MapColorAccessor.create(52, 12398641),
            DULL_PINK = (MapColor) MapColorAccessor.create(53, 9715553),
            DARK_CRIMSON = (MapColor) MapColorAccessor.create(54, 6035741),
            TEAL = (MapColor) MapColorAccessor.create(55, 1474182),
            DARK_AQUA = (MapColor) MapColorAccessor.create(56, 3837580),
            DARK_DULL_PINK = (MapColor) MapColorAccessor.create(57, 5647422),
            BRIGHT_TEAL = (MapColor) MapColorAccessor.create(58, 1356933),
            DEEPSLATE_GRAY = (MapColor) MapColorAccessor.create(59, 6579300),
            RAW_IRON_PINK = (MapColor) MapColorAccessor.create(60, 14200723),
            LICHEN_GREEN = (MapColor) MapColorAccessor.create(61, 8365974);

    int getColor();

    int getId();
}
