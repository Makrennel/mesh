package net.meshmc.mesh.statics;

import io.netty.buffer.ByteBuf;
import net.meshmc.mesh.api.advancement.Advancement;
import net.meshmc.mesh.api.advancement.AdvancementProgress;
import net.meshmc.mesh.api.block.Block;
import net.meshmc.mesh.api.block.BlockState;
import net.meshmc.mesh.api.entity.Entity;
import net.meshmc.mesh.api.math.BlockPos;
import net.meshmc.mesh.api.math.Vec3d;
import net.meshmc.mesh.api.network.client.*;
import net.meshmc.mesh.api.network.server.*;
import net.meshmc.mesh.api.util.LocationIdentifier;
import net.meshmc.mesh.util.math.Facing;
import net.meshmc.mesh.util.math.Hand;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface IStaticPackets {

    // C2S
    // Chat Message
    // TODO: 1.19 Chat Message
//    CPacketChatMessage createCPacketChatMessage(String message);

    CPacketChatMessage createCPacketChatMessage(ByteBuf buf);

    // Confirm Teleport
    CPacketConfirmTeleport createCPacketConfirmTeleport(int id);

    CPacketConfirmTeleport createCPacketConfirmTeleport(ByteBuf buf);

    // Hand Swing
    CPacketHandSwing createCPacketHandSwing(Hand hand);

    CPacketHandSwing createCPacketHandSwing(ByteBuf buf);

    // Input
    CPacketInput createCPacketInput(float sideways, float forward, boolean jumping, boolean sneaking);

    CPacketInput createCPacketInput(ByteBuf buf);

    // Movement
    CPacketMovePlayer.OnGround createCPacketMovePlayerOnGround(boolean onGround);

    CPacketMovePlayer.OnGround createCPacketMovePlayerOnGround(ByteBuf buf);

    CPacketMovePlayer.Position createCPacketMovePlayerPosition(double x, double y, double z, boolean onGround);

    CPacketMovePlayer.Position createCPacketMovePlayerPosition(ByteBuf buf);

    CPacketMovePlayer.Rotation createCPacketMovePlayerRotation(float yaw, float pitch, boolean onGround);

    CPacketMovePlayer.Rotation createCPacketMovePlayerRotation(ByteBuf buf);

    CPacketMovePlayer.PositionRotation createCPacketMovePlayerPositionRotation(double x, double y, double z, float yaw, float pitch, boolean onGround);

    CPacketMovePlayer.PositionRotation createCPacketMovePlayerPositionRotation(ByteBuf buf);

    // Move Vehicle
    CPacketMoveVehicle createCPacketMoveVehicle(Entity entity);

    CPacketMoveVehicle createCPacketMoveVehicle(double x, double y, double z, float yaw, float pitch);

    CPacketMoveVehicle createCPacketMoveVehicle(ByteBuf buf);

    // Steer Boat
    CPacketSteerBoat createCPacketSteerBoat(boolean left, boolean right);

    CPacketSteerBoat createCPacketSteerBoat(ByteBuf buf);

    // Use Block
    CPacketUseBlock createCPacketUseBlock(Hand hand, BlockPos blockPos, Facing facing, Vec3d vector, boolean insideBlock, int sequence);

    CPacketUseBlock createCPacketUseBlock(ByteBuf buf);

    // Use Entity
    CPacketUseEntity createCPacketUseEntityAttack(Entity entity, boolean sneaking);

    CPacketUseEntity createCPacketUseEntityInteract(Entity entity, Hand hand, boolean sneaking);

    CPacketUseEntity createCPacketUseEntityInteractAt(Entity entity, Hand hand, Vec3d pos, boolean sneaking);

    CPacketUseEntity createCPacketUseEntity(ByteBuf buf);

    // Use Item
    CPacketUseItem createCPacketUseItem(Hand hand, int sequence);

    CPacketUseItem createCPacketUseItem(ByteBuf buf);

    // S2C
    // Advancement Update
    SPacketAdvancementUpdate createSPacketAdvancementUpdate(boolean isFirstSync, Collection<Advancement> toAdd, Set<LocationIdentifier> toRemove, Map<LocationIdentifier, AdvancementProgress> progressUpdates);

    SPacketAdvancementUpdate createSPacketAdvancementUpdate(ByteBuf buf);

    // Block Action
    SPacketBlockAction createSPacketBlockAction(BlockPos blockPos, Block block, @Nullable Enum<?> blockVariant, int instrument, int pitch);

    SPacketBlockAction createSPacketBlockAction(ByteBuf buf);

    // Block Update
    SPacketBlockUpdate createSPacketBlockUpdate(BlockPos blockPos, BlockState<?> blockState);

    SPacketBlockUpdate createSPacketBlockUpdate(ByteBuf buf);

    // Break Progress
    SPacketBreakProgress createSPacketBreakProgress(int entityId, BlockPos blockPos, int progress);

    SPacketBreakProgress createSPacketBreakProgress(ByteBuf buf);

    // Player Position Rotation
    SPacketPlayerPositionRotation createSPacketPlayerPositionRotation(double x, double y, double z, float yaw, float pitch, Set<SPacketPlayerPositionRotation.Flag> flags, int teleportId, boolean shouldDismount);

    SPacketPlayerPositionRotation createSPacketPlayerPositionRotation(ByteBuf buf);

    // Tile Entity Update
    // TODO: BlockEntityType & NBT
//    SPacketTileEntityUpdate createSPacketTileEntityUpdate(BlockPos blockPos);

    SPacketTileEntityUpdate createSPacketTileEntityUpdate(ByteBuf buf);
}
