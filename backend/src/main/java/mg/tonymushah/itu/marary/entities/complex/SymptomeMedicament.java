package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;
import mg.tonymushah.itu.marary.repositories.mono.SymptomeRepository;

@Entity
@Table(name = "symptome_medicament")
public class SymptomeMedicament extends EntityWithID {
    @Column(name = "id_medicament", nullable = false)
    private int idMedicament;
    @Column(name = "id_symptome", nullable = false)
    private int idSymptome;
    @Column(name = "efficacite", nullable = false)
    private int efficacite;

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

    public int getEfficacite() {
        return efficacite;
    }

    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    public SymptomeMedicament() {
    }

    public SymptomeMedicament(int idMedicament, int idSymptome, int efficacite) {
        this.setIdMedicament(idMedicament);
        this.setIdSymptome(idSymptome);
        this.setEfficacite(efficacite);
    }

    public SymptomeMedicament(int id, int idMedicament, int idSymptome, int efficacite) {
        super(id);
        this.setIdMedicament(idMedicament);
        this.setIdSymptome(idSymptome);
        this.setEfficacite(efficacite);
    }

    public Optional<Medicament> getMedicament(MedicamentRepository repository) {
        return repository.findById(this.getIdMedicament());
    }

    public Optional<Symptome> getSymptome(SymptomeRepository repository) {
        return repository.findById(this.getIdSymptome());
    }

}
