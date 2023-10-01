package net.meshmc.mesh.api.network;

import io.netty.buffer.ByteBuf;
import net.meshmc.mesh.MeshAPI;
import net.meshmc.mesh.util.GameVersion;

import java.util.EnumMap;
import java.util.function.Function;

public interface Packet {
    void write(ByteBuf buf);

    interface Client extends Packet {
        C2S getType();
    }

    interface Server extends Packet {
        S2C getType();
    }

    enum C2S {
        ChatMessage(
                MeshAPI.getStatics().getPackets()::createCPacketChatMessage,
                GameVersion.v1_19_1, 0x05,
                GameVersion.v1_19, 0x04,
                GameVersion.v1_18_2, 0x03,
                GameVersion.v1_12_2, 0x02
        ),

        ConfirmTeleport(
                MeshAPI.getStatics().getPackets()::createCPacketConfirmTeleport,
                GameVersion.v1_18_2, 0x00,
                GameVersion.v1_12_2, 0x00
        ),

        HandSwing(
                MeshAPI.getStatics().getPackets()::createCPacketHandSwing,
                GameVersion.v1_18_2, 0x2C,
                GameVersion.v1_12_2, 0x1D
        ),

        Input(
                MeshAPI.getStatics().getPackets()::createCPacketInput,
                GameVersion.v1_18_2, 0x1C,
                GameVersion.v1_12_2, 0x16
        ),

        MovePlayerOnGround(
                MeshAPI.getStatics().getPackets()::createCPacketMovePlayerOnGround,
                GameVersion.v1_18_2, 0x14,
                GameVersion.v1_12_2, 0x0C
        ),
        MovePlayerPosition(
                MeshAPI.getStatics().getPackets()::createCPacketMovePlayerPosition,
                GameVersion.v1_18_2, 0x11,
                GameVersion.v1_12_2, 0x0D
        ),
        MovePlayerPositionRotation(
                MeshAPI.getStatics().getPackets()::createCPacketMovePlayerPositionRotation,
                GameVersion.v1_18_2, 0x12,
                GameVersion.v1_12_2, 0x0E
        ),
        MovePlayerRotation(
                MeshAPI.getStatics().getPackets()::createCPacketMovePlayerRotation,
                GameVersion.v1_18_2, 0x13,
                GameVersion.v1_12_2, 0x0F
        ),

        MoveVehicle(
                MeshAPI.getStatics().getPackets()::createCPacketMoveVehicle,
                GameVersion.v1_18_2, 0x15,
                GameVersion.v1_12_2, 0x10
        ),

        SteerBoat(
                MeshAPI.getStatics().getPackets()::createCPacketSteerBoat,
                GameVersion.v1_18_2, 0x16,
                GameVersion.v1_12_2, 0x11
        ),

        UseBlock(
                MeshAPI.getStatics().getPackets()::createCPacketUseBlock,
                GameVersion.v1_18_2, 0x2E,
                GameVersion.v1_12_2, 0x1F
        ),
        UseEntity(
                MeshAPI.getStatics().getPackets()::createCPacketUseEntity,
                GameVersion.v1_18_2, 0x0D,
                GameVersion.v1_12_2, 0x0A
        ),
        UseItem(
                MeshAPI.getStatics().getPackets()::createCPacketUseItem,
                GameVersion.v1_18_2, 0x2F,
                GameVersion.v1_12_2, 0x20
        ),
        ;

        private final Function<ByteBuf, Packet.Client> packetInstantiator;
        private final EnumMap<GameVersion, Integer> versionIDs;

        C2S(Function<ByteBuf, Packet.Client> packetInstantiator, Object... versions) {
            this.packetInstantiator = packetInstantiator;
            this.versionIDs = new EnumMap<>(GameVersion.class);

            if(versions.length % 2 == 0) throw new RuntimeException("Uneven number of Objects passed in C2S enum instantiator");

            GameVersion v = null;
            for(Object a: versions) {
                if(v == null) {
                    if(!(a instanceof GameVersion))
                        throw new RuntimeException();

                    v = (GameVersion) a;
                }
                else {
                    if(!(a instanceof Integer))
                        throw new RuntimeException();

                    versionIDs.put(v, (Integer) a);
                    v = null;
                }
            }
        }

        public Packet.Client create(ByteBuf buf) {
            return packetInstantiator.apply(buf);
        }

        public int getVersionID(GameVersion version) {
            return versionIDs.get(version);
        }
    }

    enum S2C {
        AdvancementUpdate(
                MeshAPI.getStatics().getPackets()::createSPacketAdvancementUpdate,
                GameVersion.v1_18_2, 0x63,
                GameVersion.v1_12_2, 0x4D
        ),
        BlockAction(
                MeshAPI.getStatics().getPackets()::createSPacketBlockAction,
                GameVersion.v1_18_2, 0x0B,
                GameVersion.v1_12_2, 0x0A
        ),
        BlockUpdate(
                MeshAPI.getStatics().getPackets()::createSPacketBlockUpdate,
                GameVersion.v1_18_2, 0x0C,
                GameVersion.v1_12_2, 0x0B
        ),
        BreakProgress(
                MeshAPI.getStatics().getPackets()::createSPacketBreakProgress,
                GameVersion.v1_18_2, 0x09,
                GameVersion.v1_12_2, 0x08
        ),
        PlayerPositionRotation(
                MeshAPI.getStatics().getPackets()::createSPacketPlayerPositionRotation,
                GameVersion.v1_18_2, 0x38,
                GameVersion.v1_12_2, 0x2F
        ),
        TileEntityUpdate(
                MeshAPI.getStatics().getPackets()::createSPacketTileEntityUpdate,
                GameVersion.v1_18_2, 0x0A,
                GameVersion.v1_12_2, 0x09
        ),
        ;

        private final Function<ByteBuf, Packet.Server> packetInstantiator;
        private final EnumMap<GameVersion, Integer> versionIDs;

        S2C(Function<ByteBuf, Packet.Server> packetInstantiator, Object... versions) {
            this.packetInstantiator = packetInstantiator;
            this.versionIDs = new EnumMap<>(GameVersion.class);

            if(versions.length % 2 == 0) throw new RuntimeException("Uneven number of Objects passed in C2S enum instantiator");

            GameVersion v = null;
            for(Object a: versions) {
                if(v == null) {
                    if(!(a instanceof GameVersion))
                        throw new RuntimeException();

                    v = (GameVersion) a;
                }
                else {
                    if(!(a instanceof Integer))
                        throw new RuntimeException();

                    versionIDs.put(v, (Integer) a);
                    v = null;
                }
            }
        }

        public Packet.Server create(ByteBuf buf) {
            return packetInstantiator.apply(buf);
        }

        public int getVersionID(GameVersion version) {
            return versionIDs.get(version);
        }
    }
}
