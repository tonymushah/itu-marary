package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.PersonneAlergie;
import mg.tonymushah.itu.marary.inputs.records.PersonneAlergieRecord;
import mg.tonymushah.itu.marary.repositories.complex.PersonneAlergieRepository;

@RestController
@RequestMapping("/personne/alergie")
public class PersonneAlergieController
        extends MyAbstractController<PersonneAlergie, PersonneAlergieRepository, PersonneAlergieRecord> {

    public PersonneAlergieController(PersonneAlergieRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public PersonneAlergie create(PersonneAlergieRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public PersonneAlergie update(Integer id, PersonneAlergieRecord body) {
        PersonneAlergie data = this.getUnique(id);
        data.setIdMedicament(body.idMedicament());
        data.setIdPersonne(body.idPersonne());
        this.getRepository().save(data);
        return data;
    }

}
