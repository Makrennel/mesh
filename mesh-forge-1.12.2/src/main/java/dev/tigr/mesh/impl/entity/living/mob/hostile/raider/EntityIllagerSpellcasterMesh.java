package dev.tigr.mesh.impl.entity.living.mob.hostile.raider;

import dev.tigr.mesh.api.entity.living.mob.hostile.raider.EntityIllagerSpellcaster;
import net.minecraft.entity.monster.EntitySpellcasterIllager;

public class EntityIllagerSpellcasterMesh<T extends EntitySpellcasterIllager> extends EntityRaiderAbstractMesh<T> implements EntityIllagerSpellcaster<T> {
    public EntityIllagerSpellcasterMesh(T value) {
        super(value);
    }
}
