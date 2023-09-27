package com.seuapp.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerTypePredicate;


@Configuration
public class SwaggerConfig {

    private final HandlerTypePredicate.Builder RequestHandlerSelectors;

    public SwaggerConfig(HandlerTypePredicate.Builder requestHandlerSelectors) {
        RequestHandlerSelectors = requestHandlerSelectors;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.seuapp.petshop.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
