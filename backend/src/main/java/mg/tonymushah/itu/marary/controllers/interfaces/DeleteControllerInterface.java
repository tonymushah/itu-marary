package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface DeleteControllerInterface<I, O> {
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public O delete(@PathVariable("id") I id);
}
