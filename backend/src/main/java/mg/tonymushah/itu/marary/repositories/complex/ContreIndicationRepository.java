package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.ContreIndication;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "medicament/contre-indication")
public interface ContreIndicationRepository extends MyRepositoryInterface<ContreIndication, Integer> {

}
