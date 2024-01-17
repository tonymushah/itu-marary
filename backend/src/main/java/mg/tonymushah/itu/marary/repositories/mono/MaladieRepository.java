package mg.tonymushah.itu.marary.repositories.mono;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.Maladie;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "maladie")
public interface MaladieRepository extends MyNomRepositoryInterface<Maladie, Integer> {

}
