package mg.tonymushah.itu.marary.repositories.mono;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.Symptome;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "symptome")
public interface SymptomeRepository extends MyNomRepositoryInterface<Symptome, Integer> {

}
