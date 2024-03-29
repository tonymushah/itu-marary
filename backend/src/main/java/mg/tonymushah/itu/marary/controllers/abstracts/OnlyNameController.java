package mg.tonymushah.itu.marary.controllers.abstracts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;
import mg.tonymushah.itu.marary.inputs.records.OnlyNomRecord;
import mg.tonymushah.itu.marary.repositories.MyNomRepositoryInterface;

public abstract class OnlyNameController<T extends EntityWithIDAndNom, R extends MyNomRepositoryInterface<T, Integer>>
        extends MyAbstractController<T, R, OnlyNomRecord> {

    public OnlyNameController(R repository) {
        super(repository);
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
    public T update(Integer id, OnlyNomRecord body) {
        T data = this.getUnique(id);
        data.setNom(body.nom());
        this.getRepository().save(data);
        return data;
    }

}
