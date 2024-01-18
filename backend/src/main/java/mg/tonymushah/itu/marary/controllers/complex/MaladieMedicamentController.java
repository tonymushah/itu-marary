package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.MaladieMedicament;
import mg.tonymushah.itu.marary.inputs.records.MaladieMedicamentRecord;
import mg.tonymushah.itu.marary.repositories.complex.MaladieMedicamentRepository;

@RestController
@RequestMapping("/medicament/maladie")
public class MaladieMedicamentController
        extends MyAbstractController<MaladieMedicament, MaladieMedicamentRepository, MaladieMedicamentRecord> {

    public MaladieMedicamentController(MaladieMedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public MaladieMedicament create(MaladieMedicamentRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public MaladieMedicament update(Integer id, MaladieMedicamentRecord body) {
        MaladieMedicament data = this.getUnique(id);
        data.setEfficacite(body.efficacite());
        data.setIdMaladie(body.idMaladie());
        data.setIdMedicament(body.idMedicament());
        this.getRepository().save(data);
        return data;
    }

}
