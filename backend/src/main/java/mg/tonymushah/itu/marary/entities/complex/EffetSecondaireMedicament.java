package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;
import mg.tonymushah.itu.marary.repositories.mono.SymptomeRepository;

@Entity
@Table(name = "effet_secondaire_medicament")
public class EffetSecondaireMedicament extends EntityWithID {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "effet_secondaire_medicament_id_seq")
    private Integer id;
    @Column(name = "id_medicament", nullable = false)
    private int idMedicament;
    @Column(name = "id_symptome", nullable = false)
    private int idSymptome;
    @Column(name = "degree", nullable = false)
    private int degree;

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public int getIdSymptome() {
        return idSymptome;
    }

    public void setIdSymptome(int idSymptome) {
        this.idSymptome = idSymptome;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public EffetSecondaireMedicament() {
    }

    public EffetSecondaireMedicament(int idMedicament, int idSymptome, int degree) {
        this.setIdMedicament(idMedicament);
        this.setIdSymptome(idSymptome);
        this.setDegree(degree);
    }

    public EffetSecondaireMedicament(int id, int idMedicament, int idSymptome, int degree) {
        super(id);
        this.setIdMedicament(idMedicament);
        this.setIdSymptome(idSymptome);
        this.setDegree(degree);
    }

    public Optional<Medicament> getMedicament(MedicamentRepository repository) {
        return repository.findById(this.getIdMedicament());
    }

    public Optional<Symptome> getSymptome(SymptomeRepository repository) {
        return repository.findById(this.getIdSymptome());
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
