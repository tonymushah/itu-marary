package mg.tonymushah.itu.marary.entities.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityWithID {
    @Id
    @Column(name = "id", insertable = false, unique = true, updatable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EntityWithID(int id) {
        this.id = id;
    }

    public EntityWithID() {
    }
}
