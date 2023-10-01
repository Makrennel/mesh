package net.meshmc.mesh.api.network.client;

import net.meshmc.mesh.MeshAPI;
import net.meshmc.mesh.api.math.Vec2f;
import net.meshmc.mesh.api.math.Vec3d;
import net.meshmc.mesh.api.network.Packet;

/**
 * Provides an interface for player position and rotation packets
 * @author Makrennel 2022/02/09
 */
public interface CPacketMovePlayer extends Packet.Client {
    interface OnGround extends CPacketMovePlayer {
        static OnGround create(boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerOnGround(onGround);
        }

        boolean isOnGround();
        void setOnGround(boolean value);
    }

    interface Position extends CPacketMovePlayer.OnGround {
        static Position create(double x, double y, double z, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerPosition(x, y, z, onGround);
        }

        static Position create(Vec3d position, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerPosition(position.getX(), position.getY(), position.getZ(), onGround);
        }

        double getX();
        double getY();
        double getZ();
        void setX(double value);
        void setY(double value);
        void setZ(double value);

        default Vec3d getPos() {
            return Vec3d.create(getX(), getY(), getZ());
        }

        default void setPos(Vec3d pos) {
            setX(pos.getX());
            setY(pos.getY());
            setZ(pos.getZ());
        }

        default void setPos(double x, double y, double z) {
            setX(x);
            setY(y);
            setZ(z);
        }
    }

    interface Rotation extends CPacketMovePlayer.OnGround {
        static Rotation create(float yaw, float pitch, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerRotation(yaw, pitch, onGround);
        }

        static Rotation create(Vec2f rotation, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerRotation(rotation.getX(), rotation.getY(), onGround);
        }

        float getYaw();
        float getPitch();
        void setYaw(float value);
        void setPitch(float value);

        default Vec2f getRotation() {
            return Vec2f.create(getYaw(), getPitch());
        }

        default void setRotation(Vec2f rotation) {
            setYaw(rotation.getX());
            setPitch(rotation.getY());
        }

        default void setRotation(float yaw, float pitch) {
            setYaw(yaw);
            setPitch(pitch);
        }
    }

    interface PositionRotation extends CPacketMovePlayer.Rotation, CPacketMovePlayer.Position {
        static PositionRotation create(double x, double y, double z, float yaw, float pitch, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerPositionRotation(x, y, z, yaw, pitch, onGround);
        }

        static PositionRotation create(Vec3d position, Vec2f rotation, boolean onGround) {
            return MeshAPI.getStatics().getPackets().createCPacketMovePlayerPositionRotation(position.getX(), position.getY(), position.getZ(), rotation.getX(), rotation.getY(), onGround);
        }
    }
}
