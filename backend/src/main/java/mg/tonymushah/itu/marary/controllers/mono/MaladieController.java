package mg.tonymushah.itu.marary.controllers.mono;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.OnlyNameController;
import mg.tonymushah.itu.marary.entities.mono.Maladie;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.mono.MaladieRepository;

@RestController
@RequestMapping("/maladie")
public class MaladieController extends OnlyNameController<Maladie, MaladieRepository> {

    public MaladieController(MaladieRepository repository) {
        super(repository);
    }

    @Override
    public Maladie create(OnlyNomRecord input) {
        Maladie maladie = new Maladie();
        maladie.setNom(input.nom());
        return this.getRepository().save(maladie);
    }

    @Override
    public Maladie update(Integer id, OnlyNomRecord body) {
        Maladie maladie = this.getRepository().findById(id).get();
        maladie.setNom(body.nom());
        return maladie;
    }

}
