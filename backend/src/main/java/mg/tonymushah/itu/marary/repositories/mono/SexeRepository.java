package mg.tonymushah.itu.marary.repositories.mono;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.Sexe;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "sexe")
public interface SexeRepository extends MyNomRepositoryInterface<Sexe, Integer> {

}
