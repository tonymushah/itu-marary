package mg.tonymushah.itu.marary.repositories.mono.medicaments;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.medicaments.TypeMedicament;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "medicament/type")
public interface TypeMedicamentRepository extends MyNomRepositoryInterface<TypeMedicament, Integer> {

}
