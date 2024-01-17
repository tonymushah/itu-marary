package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CreateControllerInterface<I, O> {
    @PostMapping("/")
    public O create(@RequestBody I input);
}
