package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface UpdateControllerInterface<I, B, O> {
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public O update(@PathVariable("id") I id, @RequestBody B body);
}
