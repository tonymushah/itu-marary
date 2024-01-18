package mg.tonymushah.itu.marary.controllers.mono;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.SymptomeRepository;

@RestController
@RequestMapping("/symptome")
public class SymptomeController extends OnlyNameController<Symptome, SymptomeRepository> {

    public SymptomeController(SymptomeRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Symptome create(OnlyNomRecord input) {
        Symptome data = new Symptome(input.nom());
        return this.getRepository().save(data);
    }

}
