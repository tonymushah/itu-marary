package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.MaladieSymptome;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "maladie/symptome")
public interface MaladieSymptomeRepository extends MyRepositoryInterface<MaladieSymptome, Integer> {

}
