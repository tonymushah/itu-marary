package mg.tonymushah.itu.marary.entities.complex;

import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.entities.mono.Maladie;
import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.repositories.mono.MaladieRepository;
import mg.tonymushah.itu.marary.repositories.mono.SymptomeRepository;

@Entity
@Table(name = "maladie_symptome")
public class MaladieSymptome extends EntityWithID {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "maladie_symptome_id_seq")
    private int id;
    @Column(name = "id_symptome", nullable = false)
    private int idSymptome;
    @Column(name = "id_maladie", nullable = false)
    private int idMaladie;
    @Column(name = "degree", nullable = false)
    private int degree;

    public int getIdSymptome() {
        return idSymptome;
    }

    public void setIdSymptome(int idSymptome) {
        this.idSymptome = idSymptome;
    }

    public int getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(int idMaladie) {
        this.idMaladie = idMaladie;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Optional<Maladie> getMaladie(MaladieRepository repository) {
        return repository.findById(this.getIdMaladie());
    }

    public Optional<Symptome> getSymptome(SymptomeRepository repository) {
        return repository.findById(this.getIdSymptome());
    }

    public MaladieSymptome() {
    }

    public MaladieSymptome(int id, int idSymptome, int idMaladie, int degree) {
        super(id);
        this.setDegree(degree);
        this.setIdMaladie(idMaladie);
        this.setIdSymptome(idSymptome);
    }

    public MaladieSymptome(int idSymptome, int idMaladie, int degree) {
        this.setDegree(degree);
        this.setIdMaladie(idMaladie);
        this.setIdSymptome(idSymptome);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
