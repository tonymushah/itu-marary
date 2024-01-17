package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;

@Entity
@Table(name = "contre_indication")
public class ContreIndication extends EntityWithID {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "contre_indication_id_seq", sequenceName = "contre_indication_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contre_indication_id_seq")
    private Integer id;
    @Column(name = "medicament_1", nullable = false)
    private int idMedicament1;
    @Column(name = "medicament_2", nullable = false)
    private int idMedicament2;

    public int getIdMedicament1() {
        return idMedicament1;
    }

    public void setIdMedicament1(int idMedicament1) {
        this.idMedicament1 = idMedicament1;
    }

    public int getIdMedicament2() {
        return idMedicament2;
    }

    public void setIdMedicament2(int idMedicament2) {
        this.idMedicament2 = idMedicament2;
    }

    public ContreIndication() {
    }

    public ContreIndication(int idMedicament1, int idMedicament2) {
        this.setIdMedicament1(idMedicament1);
        this.setIdMedicament2(idMedicament2);
    }

    public ContreIndication(int id, int idMedicament1, int idMedicament2) {
        super(id);
        this.setIdMedicament1(idMedicament1);
        this.setIdMedicament2(idMedicament2);
    }

    public Optional<Medicament> getMedicament1(MedicamentRepository repository) {
        return repository.findById(this.getIdMedicament1());
    }

    public Optional<Medicament> getMedicament2(MedicamentRepository repository) {
        return repository.findById(this.getIdMedicament2());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
