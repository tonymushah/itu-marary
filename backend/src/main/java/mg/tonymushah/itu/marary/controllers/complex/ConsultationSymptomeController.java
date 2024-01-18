package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.ConsultationSymptome;
import mg.tonymushah.itu.marary.inputs.records.ConsultationSymptomeRecord;
import mg.tonymushah.itu.marary.repositories.complex.ConsultationSymptomeRepository;

@RestController
@RequestMapping("/consultation/symptome")
public class ConsultationSymptomeController
        extends MyAbstractController<ConsultationSymptome, ConsultationSymptomeRepository, ConsultationSymptomeRecord> {

    public ConsultationSymptomeController(ConsultationSymptomeRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public ConsultationSymptome create(ConsultationSymptomeRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public ConsultationSymptome update(Integer id, ConsultationSymptomeRecord body) {
        ConsultationSymptome data = this.getUnique(id);
        data.setDegree(body.degree());
        data.setIdConsultation(body.idConsultation());
        data.setIdSymptome(body.idSymptome());
        this.getRepository().save(data);
        return data;
    }

}
