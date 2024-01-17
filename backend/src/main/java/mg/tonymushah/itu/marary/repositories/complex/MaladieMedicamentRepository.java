package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.MaladieMedicament;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "maladie/medicament")
public interface MaladieMedicamentRepository extends MyRepositoryInterface<MaladieMedicament, Integer> {

}
