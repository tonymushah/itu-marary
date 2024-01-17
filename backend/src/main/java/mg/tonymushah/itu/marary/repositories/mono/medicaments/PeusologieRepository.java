package mg.tonymushah.itu.marary.repositories.mono.medicaments;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.mono.medicaments.Peusologie;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

@RepositoryRestController(path = "medicament/peusologie")
public interface PeusologieRepository extends MyNomRepositoryInterface<Peusologie, Integer> {

}
