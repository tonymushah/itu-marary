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
@Table(name = "method_appl_medicament")
public class MethodeApplication extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "method_appl_medicament_id_seq", sequenceName = "method_appl_medicament_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "method_appl_medicament_id_seq")
    private int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public MethodeApplication() {
    }

    public MethodeApplication(int id) {
        super(id);
    }

    public MethodeApplication(int id, String nom) {
        super(id, nom);
    }

    public MethodeApplication(String nom) {
        super(nom);
    }
}
