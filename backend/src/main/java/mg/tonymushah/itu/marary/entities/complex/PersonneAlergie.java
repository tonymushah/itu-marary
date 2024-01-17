package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;
import mg.tonymushah.itu.marary.repositories.complex.PersonneRepository;

@Entity
@Table(name = "personne_alergies")
public class PersonneAlergie extends EntityWithID {
    @Column(name = "id_personne", nullable = false)
    private int idPersonne;
    @Column(name = "id_medicament", nullable = false)
    private int idMedicament;

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public PersonneAlergie() {
    }

    public PersonneAlergie(int idPersonne, int idMedicament) {
        this.setIdMedicament(idMedicament);
        this.setIdPersonne(idPersonne);
    }

    public PersonneAlergie(int id, int idPersonne, int idMedicament) {
        super(id);
        this.setIdMedicament(idMedicament);
        this.setIdPersonne(idPersonne);
    }

    public Optional<Personne> getPersonne(PersonneRepository repository) {
        return repository.findById(this.getIdPersonne());
    }

    public Optional<Medicament> getMedicament(MedicamentRepository repository) {
        return repository.findById(this.getIdPersonne());
    }

}
