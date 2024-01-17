package mg.tonymushah.itu.marary.entities.mono;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@Entity
@Table(name = "sexe")
public class Sexe extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "sexe_id_seq", sequenceName = "sexe_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sexe_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Sexe() {
    }

    public Sexe(int id) {
        super(id);
    }

    public Sexe(int id, String nom) {
        super(id, nom);
    }

    public Sexe(String nom) {
        super(nom);
    }
}
