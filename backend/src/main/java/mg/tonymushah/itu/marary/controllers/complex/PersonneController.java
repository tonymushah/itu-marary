package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.Personne;
import mg.tonymushah.itu.marary.inputs.records.PersonneRecord;
import mg.tonymushah.itu.marary.repositories.complex.PersonneRepository;

@RestController
@RequestMapping("/personne")
public class PersonneController extends MyAbstractController<Personne, PersonneRepository, PersonneRecord> {

    public PersonneController(PersonneRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Personne create(PersonneRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public Personne update(Integer id, PersonneRecord body) {
        Personne data = this.getUnique(id);
        data.setAddress(body.address());
        data.setDate_naissance(body.date_naissance());
        data.setId_sexe(body.id_sexe());
        data.setNom(body.nom());
        data.setPrenom(body.prenom());
        this.getRepository().save(data);
        return data;
    }

}
