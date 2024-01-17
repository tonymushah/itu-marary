package mg.tonymushah.itu.marary.repositories.complex;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.marary.entities.complex.Consultation;

public interface ConsultationRepository extends CrudRepository<Consultation, Integer> {
    @Query(value = "SELECT * FROM consultation where id_personne = ?1", nativeQuery = true)
    public Iterable<Consultation> findByPersonneId(int personneId);

    @Query(value = "SELECT * FROM consultation where id_personne = ?1", countQuery = "SELECT count(*) FROM consultation where id_personne = ?1", nativeQuery = true)
    public Page<Consultation> findByPersonneId(int personneId, Pageable pageable);
}
