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
@Table(name = "type_medicament")
public class TypeMedicament extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "type_medicament_id_seq", sequenceName = "type_medicament_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_medicament_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public TypeMedicament() {
    }

    public TypeMedicament(int id) {
        super(id);
    }

    public TypeMedicament(int id, String nom) {
        super(id, nom);
    }

    public TypeMedicament(String nom) {
        super(nom);
    }
}
