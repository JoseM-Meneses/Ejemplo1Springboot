package itm.edu.ejemploSpringboot1.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new io.swagger.v3.oas.models.info.Info()
                                .title("API de ejemplo para el curso de programacion en Spring Boot")
                                .version("1.0")
                                .description("Esta es una API para probar.")
                                .contact(new Contact().name("El profe").email("Elprofe@elprofe.com")));
    }
}
