package mg.tonymushah.itu.marary

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(info = Info(title = "Marary API", description = "This is the api that should be used for the frontend"))
class MararyApplication

fun main(args: Array<String>) {
	runApplication<MararyApplication>(*args)
}
