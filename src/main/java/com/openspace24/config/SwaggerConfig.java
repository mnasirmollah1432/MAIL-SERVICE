package com.openspace24.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.openspace24"))
                .build();
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Eduman API",
                "A restfull api for eduman client",
                "1.0",
                "Terms of service",
                new Contact("OpenSpace24", "http://www.openspace24.com/", "mnasirmollah@gmail.com"),
                "OpenSpace24",
                "http://www.openspace24.com/", null);
        return apiInfo;
    }
}
