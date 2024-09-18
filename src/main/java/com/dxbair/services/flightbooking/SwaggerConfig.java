package com.dxbair.services.flightbooking;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;



@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi bookingApi() {
        String paths[] = {"/**"};
        return GroupedOpenApi.builder()
                .group("flight-booking")
                .pathsToMatch(paths)
                .build();
    }

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("Flight Booking REST API")
                        .description("Flight Booking REST API Documentation")
                        .version("v0.0.1")
                        .license(new License().name("API License").url("https://www.example.com/license"))
                        .contact(new Contact().name("Shameer Kunjumohamed").email("sameerean@gmail.com").url("https://www.sameerean.com")));
    }

}
