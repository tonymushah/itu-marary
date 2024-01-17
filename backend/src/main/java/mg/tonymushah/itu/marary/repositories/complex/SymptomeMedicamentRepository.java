package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.SymptomeMedicament;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "symptome/medicament")
public interface SymptomeMedicamentRepository extends MyRepositoryInterface<SymptomeMedicament, Integer> {

}
