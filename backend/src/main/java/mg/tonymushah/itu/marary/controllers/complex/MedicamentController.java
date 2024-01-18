package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.Medicament;
import mg.tonymushah.itu.marary.inputs.records.MedicamentRecord;
import mg.tonymushah.itu.marary.repositories.complex.MedicamentRepository;

@RestController
@RequestMapping("/medicament")
public class MedicamentController extends MyAbstractController<Medicament, MedicamentRepository, MedicamentRecord> {

    public MedicamentController(MedicamentRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Medicament create(MedicamentRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public Medicament update(Integer id, MedicamentRecord body) {
        Medicament data = this.getUnique(id);
        data.setIdClasse(body.idClasse());
        data.setIdMethode(body.idMethode());
        data.setIdPeusologie(body.idPeusologie());
        data.setIdType(body.idType());
        data.setNom(body.nom());
        data.setPrixUnitaire(body.prixUnitaire());
        this.getRepository().save(data);
        return data;
    }

}
