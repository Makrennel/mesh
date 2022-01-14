package dev.tigr.mesh.impl.client;

import dev.tigr.mesh.api.util.Profiler;
import dev.tigr.mesh.api.util.Session;
import dev.tigr.mesh.impl.client.util.ProfilerMesh;
import dev.tigr.mesh.impl.client.util.SessionMesh;
import dev.tigr.mesh.impl.mixin.accessors.MinecraftAccessor;
import net.minecraft.client.Minecraft;

/**
 * @author Tigermouthbear 1/10/22
 */
public class MinecraftMesh extends dev.tigr.mesh.api.Minecraft<Minecraft> {
    private final Profiler<?> profiler = new ProfilerMesh(getMeshValue().profiler);
    private Session<?> session = new SessionMesh(getMeshValue().getSession());

    public MinecraftMesh(net.minecraft.client.Minecraft value) {
        super(value);
    }

    @Override
    public Profiler<?> getProfiler() {
        return profiler;
    }

    @Override
    public Session<?> getSession() {
        return session;
    }

    @Override
    public void setSession(Session<?> session) {
        this.session = session;
        ((MinecraftAccessor) getMeshValue()).setSession((net.minecraft.util.Session) session.getMeshValue());
    }
}
