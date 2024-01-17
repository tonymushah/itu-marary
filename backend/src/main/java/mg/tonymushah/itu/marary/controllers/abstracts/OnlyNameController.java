package mg.tonymushah.itu.marary.controllers.abstracts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import mg.tonymushah.itu.marary.controllers.interfaces.CreateControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.DeleteControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.UpdateControllerInterface;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

public abstract class OnlyNameController<T, I, R extends MyNomRepositoryInterface<T, I>, B> implements
        CreateControllerInterface<B, T>, DeleteControllerInterface<I, T>, UpdateControllerInterface<I, B, T> {
    private R repository;

    public R getRepository() {
        return repository;
    }

    public void setRepository(R repository) {
        this.repository = repository;
    }

    public OnlyNameController(R repository) {
        this.repository = repository;
    }

    @GetMapping(value = { "/{id}", "/{id}/" })
    public T getUnique(@PathVariable("id") I id) {
        return this.getRepository().findById(id).get();
    }

    @GetMapping(value = { "/", "" })
    public Page<T> get(@RequestParam(name = "offset", defaultValue = "0") int offset,
            @RequestParam(name = "limit", defaultValue = "10") int limit, @RequestParam(name = "nom") String nom) {
        return this.getRepository().findByNomLike(nom, PageRequest.of(offset, limit));
    }

    @Override
    public T delete(I id) {
        T data = this.getRepository().findById(id).get();
        this.getRepository().delete(data);
        return data;
    }

}
