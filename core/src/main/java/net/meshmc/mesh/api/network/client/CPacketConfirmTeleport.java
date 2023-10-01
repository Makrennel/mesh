package net.meshmc.mesh.api.network.client;

import net.meshmc.mesh.MeshAPI;
import net.meshmc.mesh.api.network.Packet;

public interface CPacketConfirmTeleport extends Packet.Client {
    static CPacketConfirmTeleport create(int id) {
        return MeshAPI.getStatics().getPackets().createCPacketConfirmTeleport(id);
    }

    int getTeleportId();
    void setTeleportId(int id);
}
