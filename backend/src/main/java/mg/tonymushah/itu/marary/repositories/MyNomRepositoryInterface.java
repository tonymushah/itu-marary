package mg.tonymushah.itu.marary.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MyNomRepositoryInterface<T, ID> extends MyRepositoryInterface<T, ID> {
    public Page<T> findByNomLike(String nom, Pageable pageable);
}
