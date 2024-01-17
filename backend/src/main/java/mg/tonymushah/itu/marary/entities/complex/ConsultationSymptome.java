package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithID;
import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.repositories.complex.ConsultationRepository;
import mg.tonymushah.itu.marary.repositories.mono.SymptomeRepository;

@Entity
@Table(name = "consultation_symptome")
public class ConsultationSymptome extends EntityWithID {
    @Column(name = "id_symptome", nullable = false)
    private int idSymptome;
    @Column(name = "id_consultation", nullable = false)
    private int idConsultation;
    @Column(name = "degree", nullable = false)
    private int degree;

    public int getIdSymptome() {
        return idSymptome;
    }

    public void setIdSymptome(int idSymptome) {
        this.idSymptome = idSymptome;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Optional<Consultation> getConsultation(ConsultationRepository repository) {
        return repository.findById(this.getIdConsultation());
    }

    public Optional<Symptome> getSymptome(SymptomeRepository repository) {
        return repository.findById(this.getIdSymptome());
    }

    public ConsultationSymptome(int id, int idSymptome, int idConsultation, int degree) {
        super(id);
        this.setIdConsultation(idConsultation);
        this.setIdSymptome(idSymptome);
        this.setDegree(degree);
    }

    public ConsultationSymptome() {
    }

    public ConsultationSymptome(int idSymptome, int idConsultation, int degree) {
        this.setIdConsultation(idConsultation);
        this.setIdSymptome(idSymptome);
        this.setDegree(degree);
    }

}
