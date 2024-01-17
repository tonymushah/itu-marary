package mg.tonymushah.itu.marary.controllers.mono;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.Sexe;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.SexeRepository;

@RestController
@RequestMapping("/sexe")
public class SexeController extends OnlyNameController<Sexe, SexeRepository> {

    public SexeController(SexeRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Sexe create(OnlyNomRecord input) {
        return this.getRepository().save(new Sexe(input.nom()));
    }

    @Override
    public Sexe update(Integer id, OnlyNomRecord body) {
        Sexe data = this.getUnique(id);
        data.setNom(body.nom());
        this.getRepository().save(data);
        return data;
    }

}
