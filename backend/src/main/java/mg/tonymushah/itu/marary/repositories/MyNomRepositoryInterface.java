package mg.tonymushah.itu.marary.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;

@NoRepositoryBean
public interface MyNomRepositoryInterface<T extends EntityWithIDAndNom, ID> extends MyRepositoryInterface<T, ID> {
    public Page<T> findByNomLike(String nom, Pageable pageable);
}
