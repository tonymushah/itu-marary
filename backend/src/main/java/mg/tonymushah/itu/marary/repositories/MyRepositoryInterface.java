package mg.tonymushah.itu.marary.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyRepositoryInterface<T, ID> extends CrudRepository<T, ID>, PagingAndSortingRepository<T, ID> {

}
