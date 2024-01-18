package mg.tonymushah.itu.marary.controllers.mono.medicaments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.medicaments.TypeMedicament;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.TypeMedicamentRepository;

@RestController
@RequestMapping("/medicament/type")
public class TypeMedicamentController extends OnlyNameController<TypeMedicament, TypeMedicamentRepository> {

    public TypeMedicamentController(TypeMedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public TypeMedicament create(OnlyNomRecord input) {
        TypeMedicament data = new TypeMedicament(input.nom());
        return this.getRepository().save(data);
    }

}
