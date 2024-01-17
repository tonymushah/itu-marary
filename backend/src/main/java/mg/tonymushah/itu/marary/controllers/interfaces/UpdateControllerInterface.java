package mg.tonymushah.itu.marary.controllers.interfaces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateControllerInterface<I, B, O> {
    @PutMapping("/{id}")
    public O update(@PathVariable("id") I id, @RequestBody B body);
}
