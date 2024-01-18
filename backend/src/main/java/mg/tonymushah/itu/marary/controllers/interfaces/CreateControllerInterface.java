package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CreateControllerInterface<I, O> {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public O create(@RequestBody I input);
}
