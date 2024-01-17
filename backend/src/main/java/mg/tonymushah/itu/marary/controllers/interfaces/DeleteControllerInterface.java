package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteControllerInterface<I, O> {
    @DeleteMapping(value = { "/{id}", "/{id}/" })
    public O delete(@PathVariable("id") I id);
}
