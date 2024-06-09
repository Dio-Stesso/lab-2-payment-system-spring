package com.example.paymentsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakSpringConfigResolver {

    @Bean
    public KeycloakSpringConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringConfigResolver();
    }
}
