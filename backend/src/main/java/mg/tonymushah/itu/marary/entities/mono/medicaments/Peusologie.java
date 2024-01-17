package mg.tonymushah.itu.marary.entities.mono.medicaments;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@Entity
@Table(name = "peusologie")
public class Peusologie extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "pseulogie_id_seq", sequenceName = "pseulogie_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pseulogie_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Peusologie() {
    }

    public Peusologie(int id) {
        super(id);
    }

    public Peusologie(int id, String nom) {
        super(id, nom);
    }

    public Peusologie(String nom) {
        super(nom);
    }
}
