package mg.tonymushah.itu.marary.controllers.complex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.marary.controllers.abstracts.MyAbstractController;
import mg.tonymushah.itu.marary.entities.complex.ContreIndication;
import mg.tonymushah.itu.marary.inputs.records.ContreIndicationRecord;
import mg.tonymushah.itu.marary.repositories.complex.ContreIndicationRepository;

@RestController
@RequestMapping("/medicament/contre-indication")
public class ContreIndicationController
        extends MyAbstractController<ContreIndication, ContreIndicationRepository, ContreIndicationRecord> {

    public ContreIndicationController(ContreIndicationRepository repository) {
        super(repository);
        // TODO Auto-generated constructor stub
    }

    @Override
    public ContreIndication create(ContreIndicationRecord input) {
        return this.getRepository().save(input.into());
    }

    @Override
    public ContreIndication update(Integer id, ContreIndicationRecord body) {
        ContreIndication data = this.getUnique(id);
        data.setIdMedicament1(body.idMedicament1());
        data.setIdMedicament2(body.idMedicament2());
        this.getRepository().save(data);
        return data;
    }

}
