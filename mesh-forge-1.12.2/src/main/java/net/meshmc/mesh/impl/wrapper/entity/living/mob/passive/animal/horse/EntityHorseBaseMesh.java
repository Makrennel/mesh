package net.meshmc.mesh.impl.wrapper.entity.living.mob.passive.animal.horse;

import net.meshmc.mesh.api.entity.living.mob.passive.animal.horse.EntityHorseBase;
import net.meshmc.mesh.impl.wrapper.entity.living.mob.passive.animal.EntityAnimalMesh;
import net.minecraft.entity.passive.AbstractHorse;

public class EntityHorseBaseMesh<T extends AbstractHorse> extends EntityAnimalMesh<T> implements EntityHorseBase {
    public EntityHorseBaseMesh(T value) {
        super(value);
    }
}
