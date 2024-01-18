package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.EffetSecondaireMedicament;
import mg.tonymushah.itu.marary.inputs.records.EffetSecondaireMedicamentRecord;
import mg.tonymushah.itu.marary.repositories.complex.EffetSecondaireMedicamentRepository;

@RestController
@RequestMapping("/medicament/effet-secondaire")
public class EffetSecondaireMedicamentController extends
        MyAbstractController<EffetSecondaireMedicament, EffetSecondaireMedicamentRepository, EffetSecondaireMedicamentRecord> {

    public EffetSecondaireMedicamentController(EffetSecondaireMedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public EffetSecondaireMedicament create(EffetSecondaireMedicamentRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public EffetSecondaireMedicament update(Integer id, EffetSecondaireMedicamentRecord body) {
        EffetSecondaireMedicament data = this.getUnique(id);
        data.setDegree(body.degree());
        data.setIdMedicament(body.idMedicament());
        data.setIdSymptome(body.idSymptome());
        this.getRepository().save(data);
        return data;
    }

}
