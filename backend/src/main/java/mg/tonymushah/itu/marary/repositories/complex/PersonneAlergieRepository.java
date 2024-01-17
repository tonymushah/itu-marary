package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.PersonneAlergie;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "personne/alergie")
public interface PersonneAlergieRepository extends MyRepositoryInterface<PersonneAlergie, Integer> {

}
