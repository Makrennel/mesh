package net.meshmc.mesh;

import net.meshmc.mesh.api.block.MapColor;
import net.meshmc.mesh.api.block.Material;
import net.meshmc.mesh.api.client.Session;
import net.meshmc.mesh.api.math.*;
import net.meshmc.mesh.api.render.buffer.BufferBuilder;
import net.meshmc.mesh.api.util.LocationIdentifier;
import net.meshmc.mesh.statics.IStaticMapColors;
import net.meshmc.mesh.statics.IStaticMaterials;
import net.meshmc.mesh.statics.IStaticPackets;

public interface IStatics {
    IStaticMapColors getMapColor();

    IStaticMaterials getMaterials();

    IStaticPackets getPackets();

    // types: legacy, mojang, msa (only on newer versions);
    Session createSession(String username, String uuid, String accessToken, String type);

    Box createBox(double x1, double y1, double z1, double x2, double y2, double z2);

    Vec2f createVec2f(float x, float y);

    Vec3d createVec3d(double x, double y, double z);

    Vec3f createVec3f(float x, float y, float z);

    Vec3i createVec3i(int x, int y, int z);

    BlockPos createBlockPos(int x, int y, int z);

    BufferBuilder<?> createBufferBuilder(int initialCapacity);

    LocationIdentifier createLocationIdentifier(String namespace, String path);

    LocationIdentifier createLocationIdentifier(String path);

    Material createMaterial(MapColor mapColor);

    // TODO: CHANGE THE WAY SCREENS ARE HANDLED!!
    void openChatScreen(String input);

    void openDemoScreen();

    void openMultiplayerScreen();

    void openOptionsScreen();

    void openSelectWorldScreen();

    void openRealmsMainScreen();

    void openTitleScreen();

    LocationIdentifier EntityAbstractClientPlayer_getSkinId(String playerName);
}
