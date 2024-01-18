package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.SymptomeMedicament;
import mg.tonymushah.itu.marary.inputs.records.SymptomeMedicamentRecord;
import mg.tonymushah.itu.marary.repositories.complex.SymptomeMedicamentRepository;

@RestController
@RequestMapping("/symptome/medicament")
public class SymptomeMedicamentController
        extends MyAbstractController<SymptomeMedicament, SymptomeMedicamentRepository, SymptomeMedicamentRecord> {

    public SymptomeMedicamentController(SymptomeMedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public SymptomeMedicament create(SymptomeMedicamentRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public SymptomeMedicament update(Integer id, SymptomeMedicamentRecord body) {
        SymptomeMedicament data = this.getUnique(id);
        data.setEfficacite(body.efficacite());
        data.setIdMedicament(body.idMedicament());
        data.setIdSymptome(body.idSymptome());
        this.getRepository().save(data);
        return data;
    }

}
