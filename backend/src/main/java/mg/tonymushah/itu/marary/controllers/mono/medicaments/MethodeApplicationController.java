package mg.tonymushah.itu.marary.controllers.mono.medicaments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.medicaments.MethodeApplication;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.MethodeApplicationRepository;

@RestController
@RequestMapping("/medicament/methode-application")
public class MethodeApplicationController extends OnlyNameController<MethodeApplication, MethodeApplicationRepository> {

    public MethodeApplicationController(MethodeApplicationRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public MethodeApplication create(OnlyNomRecord input) {
        MethodeApplication data = new MethodeApplication(input.nom());
        return this.getRepository().save(data);
    }

}
