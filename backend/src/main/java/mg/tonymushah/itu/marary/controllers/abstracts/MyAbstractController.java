package mg.tonymushah.itu.marary.controllers.abstracts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mg.tonymushah.itu.marary.controllers.interfaces.CreateControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.DeleteControllerInterface;
import mg.tonymushah.itu.marary.controllers.interfaces.UpdateControllerInterface;
import mg.tonymushah.itu.marary.repositories.MyRepositoryInterface;

public abstract class MyAbstractController<T, R extends MyRepositoryInterface<T, Integer>, B>
        implements
        CreateControllerInterface<B, T>, DeleteControllerInterface<Integer, T>,
        UpdateControllerInterface<Integer, B, T> {
    private R repository;

    public R getRepository() {
        return repository;
    }

    public void setRepository(R repository) {
        this.repository = repository;
    }

    public MyAbstractController(R repository) {
        this.setRepository(repository);
    }

    @Override
    public T delete(Integer id) {
        T data = this.getRepository().findById(id).get();
        this.getRepository().delete(data);
        return data;
    }

    @GetMapping("/{id}")
    public T getUnique(@PathVariable("id") Integer id) {
        return this.getRepository().findById(id).get();
    }
}
