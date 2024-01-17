package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.tonymushah.itu.marary.entities.complex.ConsultationSymptome;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

@RepositoryRestController(path = "consultation/symptome")
public interface ConsultationSymptomeRepository extends MyRepositoryInterface<ConsultationSymptome, Integer> {

}
