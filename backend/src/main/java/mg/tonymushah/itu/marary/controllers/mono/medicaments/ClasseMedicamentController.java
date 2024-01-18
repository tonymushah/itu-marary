package mg.tonymushah.itu.marary.controllers.mono.medicaments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.medicaments.ClasseMedicament;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.ClasseMedicamentRepository;

@RestController
@RequestMapping("/medicament/classe")
public class ClasseMedicamentController extends OnlyNameController<ClasseMedicament, ClasseMedicamentRepository> {

    public ClasseMedicamentController(ClasseMedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public ClasseMedicament create(OnlyNomRecord input) {
        ClasseMedicament data = new ClasseMedicament(input.nom());
        return this.getRepository().save(data);
    }

}
