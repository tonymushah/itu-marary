package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.repositories.complex.PersonneRepository;

@Entity
@Table(name = "consultation")
public class Consultation extends EntityWithID {
    @Column(name = "date_consul", nullable = false)
    private Date date = new Date();
    @Column(name = "poids", nullable = false)
    private float poids;
    @Column(name = "id_personne", nullable = false)
    private int idPersonne;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Optional<Personne> getPersonne(PersonneRepository repository) {
        return repository.findById(this.getIdPersonne());
    }

    public Consultation() {
    }

    public Consultation(Date date, float poids, int idPersonne) {
        this.setDate(date);
        this.setPoids(poids);
        this.setIdPersonne(idPersonne);
    }

    public Consultation(int id, Date date, float poids, int idPersonne) {
        super(id);
        this.setDate(date);
        this.setPoids(poids);
        this.setIdPersonne(idPersonne);
    }

}
