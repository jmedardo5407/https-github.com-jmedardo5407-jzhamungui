package ec.edu.ups.practi.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@Profile("dev")
@EnableSwagger2
public class SwaggerConfig {

    public Docket api() {
         return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("ec.edu.ups.practi"))
        .paths(PathSelectors.any()).build();
    }
    
}
