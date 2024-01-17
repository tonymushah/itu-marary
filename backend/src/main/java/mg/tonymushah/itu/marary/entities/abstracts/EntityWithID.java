package mg.tonymushah.itu.marary.entities.abstracts;

import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@Embeddable
public abstract class EntityWithID {

    public abstract int getId();

    public abstract void setId(int id);

    public EntityWithID(int id) {
        this.setId(id);
    }

    public EntityWithID() {
    }
}
