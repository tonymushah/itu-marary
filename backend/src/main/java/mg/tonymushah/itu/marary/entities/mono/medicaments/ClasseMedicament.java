package mg.tonymushah.itu.marary.entities.mono.medicaments;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@Entity
@Table(name = "classe_medicament")
public class ClasseMedicament extends EntityWithIDAndNom {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classe_medicament_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public ClasseMedicament() {
    }

    public ClasseMedicament(int id) {
        super(id);
    }

    public ClasseMedicament(int id, String nom) {
        super(id, nom);
    }

    public ClasseMedicament(String nom) {
        super(nom);
    }

}
