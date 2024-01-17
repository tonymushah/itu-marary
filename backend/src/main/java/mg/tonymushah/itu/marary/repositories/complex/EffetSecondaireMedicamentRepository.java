package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.EffetSecondaireMedicament;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "medicament/effet-secondaire")
public interface EffetSecondaireMedicamentRepository extends MyRepositoryInterface<EffetSecondaireMedicament, Integer> {

}
