package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.MaladieSymptome;
import mg.tonymushah.itu.marary.inputs.records.MaladieSymptomeRecord;
import mg.tonymushah.itu.marary.repositories.complex.MaladieSymptomeRepository;

@RestController
@RequestMapping("/maladie/symptome")
public class MaladieSymptomeController
        extends MyAbstractController<MaladieSymptome, MaladieSymptomeRepository, MaladieSymptomeRecord> {

    public MaladieSymptomeController(MaladieSymptomeRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public MaladieSymptome create(MaladieSymptomeRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public MaladieSymptome update(Integer id, MaladieSymptomeRecord body) {
        MaladieSymptome data = this.getUnique(id);
        data.setDegree(body.degree());
        data.setIdMaladie(body.idMaladie());
        data.setIdSymptome(body.idSymptome());
        this.getRepository().save(data);
        return data;
    }

}
