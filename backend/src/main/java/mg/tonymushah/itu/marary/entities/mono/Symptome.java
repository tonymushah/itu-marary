package mg.tonymushah.itu.marary.entities.mono;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@Entity
@Table(name = "symptomes")
public class Symptome extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "symptomes_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Symptome() {
    }

    public Symptome(int id) {
        super(id);
    }

    public Symptome(int id, String nom) {
        super(id, nom);
    }

    public Symptome(String nom) {
        super(nom);
    }
}
