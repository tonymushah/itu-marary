package mg.tonymushah.itu.marary.entities.mono;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@Entity
@Table(name = "maladie")
public class Maladie extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "maladie_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Maladie() {
    }

    public Maladie(int id) {
        super(id);
    }

    public Maladie(int id, String nom) {
        super(id, nom);
    }

    public Maladie(String nom) {
        super(nom);
    }
}
