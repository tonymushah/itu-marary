package mg.tonymushah.itu.marary.controllers.abstracts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import mg.tonymushah.itu.marary.controllers.interfaces.CreateControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.DeleteControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.UpdateControllerInterface;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

public abstract class OnlyNameController<T extends EntityWithIDAndNom, R extends MyNomRepositoryInterface<T, Integer>>
        implements
        CreateControllerInterface<OnlyNomRecord, T>, DeleteControllerInterface<Integer, T>,
        UpdateControllerInterface<Integer, OnlyNomRecord, T> {
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

    @GetMapping("/{id}")
    public T getUnique(@PathVariable("id") Integer id) {
        return this.getRepository().findById(id).get();
    }

    @GetMapping("")
    public Page<T> get(@RequestParam(name = "offset", defaultValue = "0", required = false) int offset,
            @RequestParam(name = "limit", defaultValue = "10", required = false) int limit,
            @RequestParam(name = "nom", required = false, defaultValue = "") String nom) {
        if (nom.isEmpty()) {
            return this.getRepository().findAll(PageRequest.of(offset, limit));
        } else {
            return this.getRepository().findByNomLike(nom, PageRequest.of(offset, limit));
        }
    }

    @Override
    public T delete(Integer id) {
        T data = this.getRepository().findById(id).get();
        this.getRepository().delete(data);
        return data;
    }

}
