package mg.tonymushah.itu.marary.repositories.mono.medicaments;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.medicaments.ClasseMedicament;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "medicament/classe")
public interface ClasseMedicamentRepository extends MyNomRepositoryInterface<ClasseMedicament, Integer> {

}
