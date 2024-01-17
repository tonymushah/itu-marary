package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.entities.mono.Maladie;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;
import mg.tonymushah.itu.marary.repositories.mono.MaladieRepository;

@Entity
@Table(name = "maladie_medicament")
public class MaladieMedicament extends EntityWithID {
    @Column(name = "id_medicament", nullable = false)
    private int idMedicament;
    @Column(name = "id_maladie", nullable = false)
    private int idMaladie;
    @Column(name = "efficacite", nullable = false)
    private int efficacite;

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public int getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(int idMaladie) {
        this.idMaladie = idMaladie;
    }

    public int getEfficacite() {
        return efficacite;
    }

    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    public Optional<Medicament> getMedicament(MedicamentRepository repository) {
        return repository.findById(this.getIdMedicament());
    }

    public Optional<Maladie> getMaladie(MaladieRepository repository) {
        return repository.findById(this.getIdMaladie());
    }

    public MaladieMedicament() {
    }

    public MaladieMedicament(int id, int idMedicament, int idMaladie, int efficacite) {
        super(id);
        this.setIdMedicament(idMedicament);
        this.setIdMaladie(idMaladie);
        this.setEfficacite(efficacite);
    }

    public MaladieMedicament(int idMedicament, int idMaladie, int efficacite) {
        this.setIdMedicament(idMedicament);
        this.setIdMaladie(idMaladie);
        this.setEfficacite(efficacite);
    }

}
