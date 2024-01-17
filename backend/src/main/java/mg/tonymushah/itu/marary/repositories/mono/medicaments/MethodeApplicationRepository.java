package mg.tonymushah.itu.marary.repositories.mono.medicaments;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.medicaments.MethodeApplication;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "medicament/methode")
public interface MethodeApplicationRepository extends MyNomRepositoryInterface<MethodeApplication, Integer> {

}
