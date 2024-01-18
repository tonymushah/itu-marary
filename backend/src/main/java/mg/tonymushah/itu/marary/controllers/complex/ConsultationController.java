package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.Consultation;
import mg.tonymushah.itu.marary.inputs.records.ConsultationRecord;
import mg.tonymushah.itu.marary.repositories.complex.ConsultationRepository;

@RestController
@RequestMapping("/consultation")
public class ConsultationController
        extends MyAbstractController<Consultation, ConsultationRepository, ConsultationRecord> {

    public ConsultationController(ConsultationRepository repository) {
        super(repository);
    }

    @Override
    public Consultation create(ConsultationRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public Consultation update(Integer id, ConsultationRecord body) {
        Consultation consultation = this.getRepository().findById(id).get();
        consultation.setDate(body.date());
        consultation.setIdPersonne(body.idPersonne());
        consultation.setPoids(body.poids());
        return this.getRepository().save(consultation);
    }

}
