package net.meshmc.mesh.api.block;

import net.meshmc.mesh.MeshAPI;
import net.meshmc.mesh.util.block.PistonPushReaction;

/**
 * @author Makrennel 04/21/2022
 *
 * All static fields here point to methods in a class which is not present in mesh-core builds
 */
public interface Material {
    Material
            AIR = MeshAPI.getStatics().getMaterials().AIR(),
            AMETHYST = MeshAPI.getStatics().getMaterials().AMETHYST(),
            ANVIL = MeshAPI.getStatics().getMaterials().ANVIL(),
            BAMBOO = MeshAPI.getStatics().getMaterials().BAMBOO(),
            BAMBOO_SAPLING = MeshAPI.getStatics().getMaterials().BAMBOO_SAPLING(),
            BARRIER = MeshAPI.getStatics().getMaterials().BARRIER(),
            BUBBLE_COLUMN = MeshAPI.getStatics().getMaterials().BUBBLE_COLUMN(),
            CACTUS = MeshAPI.getStatics().getMaterials().CACTUS(),
            CAKE = MeshAPI.getStatics().getMaterials().CAKE(),
            CARPET = MeshAPI.getStatics().getMaterials().CARPET(),
            CLAY = MeshAPI.getStatics().getMaterials().CLAY(),
            DECORATION = MeshAPI.getStatics().getMaterials().DECORATION(),
            DRAGON_EGG = MeshAPI.getStatics().getMaterials().DRAGON_EGG(),
            FIRE = MeshAPI.getStatics().getMaterials().FIRE(),
            GLASS = MeshAPI.getStatics().getMaterials().GLASS(),
            GOURD = MeshAPI.getStatics().getMaterials().GOURD(),
            GRASS = MeshAPI.getStatics().getMaterials().GRASS(),
            IRON = MeshAPI.getStatics().getMaterials().IRON(),
            ICE = MeshAPI.getStatics().getMaterials().ICE(),
            ICE_DENSE = MeshAPI.getStatics().getMaterials().ICE_DENSE(),
            LAVA = MeshAPI.getStatics().getMaterials().LAVA(),
            LEAVES = MeshAPI.getStatics().getMaterials().LEAVES(),
            MOSS_BLOCK = MeshAPI.getStatics().getMaterials().MOSS_BLOCK(),
            NETHER_SHOOTS = MeshAPI.getStatics().getMaterials().NETHER_SHOOTS(),
            NETHER_WOOD = MeshAPI.getStatics().getMaterials().NETHER_WOOD(),
            PISTON = MeshAPI.getStatics().getMaterials().PISTON(),
            PLANT = MeshAPI.getStatics().getMaterials().PLANT(),
            PLANT_REPLACEABLE = MeshAPI.getStatics().getMaterials().PLANT_REPLACEABLE(),
            PLANT_UNDERWATER = MeshAPI.getStatics().getMaterials().PLANT_UNDERWATER(),
            PORTAL = MeshAPI.getStatics().getMaterials().PORTAL(),
            REDSTONE_LIGHT = MeshAPI.getStatics().getMaterials().REDSTONE_LIGHT(),
            ROCK = MeshAPI.getStatics().getMaterials().ROCK(),
            SAND = MeshAPI.getStatics().getMaterials().SAND(),
            SCULK = MeshAPI.getStatics().getMaterials().SCULK(),
            SNOW_BLOCK = MeshAPI.getStatics().getMaterials().SNOW_BLOCK(),
            SNOW_LAYER = MeshAPI.getStatics().getMaterials().SNOW_LAYER(),
            SNOW_POWDER = MeshAPI.getStatics().getMaterials().SNOW_POWDER(),
            SOIL = MeshAPI.getStatics().getMaterials().SOIL(),
            SPONGE = MeshAPI.getStatics().getMaterials().SPONGE(),
            STRUCTURE_VOID = MeshAPI.getStatics().getMaterials().STRUCTURE_VOID(),
            TNT = MeshAPI.getStatics().getMaterials().TNT(),
            WATER = MeshAPI.getStatics().getMaterials().WATER(),
            WEB = MeshAPI.getStatics().getMaterials().WEB(),
            WOOD = MeshAPI.getStatics().getMaterials().WOOD(),
            WOOL = MeshAPI.getStatics().getMaterials().WOOL();

    static Material create(MapColor mapColor) {
        return MeshAPI.getStatics().createMaterial(mapColor);
    }

    boolean isLiquid_();
    Material setLiquid(boolean value);

    boolean isSolid_();
    Material setSolid(boolean value);

    boolean doesBlockMovement();
    Material setBlocksMovement(boolean value);

    boolean doesBlockLight();
    Material setBlocksLight(boolean value);

    boolean isBurnable();
    Material setBurnable(boolean value);

    boolean isReplaceable();
    Material setReplaceable(boolean value);

    MapColor getColorOnMap();
    Material setColorOnMap(MapColor color);

    PistonPushReaction getPistonPushReaction();
    Material setPistonPushReaction(PistonPushReaction pistonPushReaction);
}
