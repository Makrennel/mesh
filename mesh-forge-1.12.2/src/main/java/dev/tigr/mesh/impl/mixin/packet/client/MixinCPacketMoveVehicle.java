package dev.tigr.mesh.impl.mixin.packet.client;

import dev.tigr.mesh.impl.mixininterface.packet.Packet;
import dev.tigr.mesh.impl.mixininterface.packet.client.CPacketMoveVehicle;
import net.minecraft.network.play.client.CPacketVehicleMove;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CPacketVehicleMove.class)
public class MixinCPacketMoveVehicle implements Packet, CPacketMoveVehicle {
    @Shadow private double x;
    @Shadow private double y;
    @Shadow private double z;
    @Shadow private float yaw;
    @Shadow private float pitch;

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public void setX(double value) {
        x = value;
    }

    @Override
    public void setY(double value) {
        y = value;
    }

    @Override
    public void setZ(double value) {
        z = value;
    }

    @Override
    public float getYaw() {
        return yaw;
    }

    @Override
    public float getPitch() {
        return pitch;
    }

    @Override
    public void setYaw(float value) {
        yaw = value;
    }

    @Override
    public void setPitch(float value) {
        pitch = value;
    }
}
