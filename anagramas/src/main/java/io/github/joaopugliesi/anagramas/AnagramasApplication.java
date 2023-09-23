package io.github.joaopugliesi.anagramas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger OpenAPI", version = "1",
		description = "API desenvolvida para testar Anagramas"))
public class AnagramasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnagramasApplication.class, args);
	}

}
