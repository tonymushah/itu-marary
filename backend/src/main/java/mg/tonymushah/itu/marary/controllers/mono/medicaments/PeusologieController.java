package mg.tonymushah.itu.marary.controllers.mono.medicaments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.medicaments.Peusologie;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.PeusologieRepository;

@RestController
@RequestMapping("/medicament/peusologie")
public class PeusologieController extends OnlyNameController<Peusologie, PeusologieRepository> {

    public PeusologieController(PeusologieRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Peusologie create(OnlyNomRecord input) {
        Peusologie data = new Peusologie(input.nom());
        return this.getRepository().save(data);
    }

}
