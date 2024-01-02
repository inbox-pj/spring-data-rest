package com.clover.springdatarest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("pankaj.jaiswal@clover.com");
        contact.setName("Pankaj");
        contact.setUrl("http://www.clover.com");

        Info info = new Info()
                .title("Spring Data Rest API")
                .version("1.0")
                .contact(contact)
                .description("Spring Data Rest API");

        return new OpenAPI().info(info);
    }
}