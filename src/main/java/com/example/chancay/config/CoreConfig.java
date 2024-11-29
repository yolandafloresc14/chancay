package com.example.chancay.config;

import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class CoreConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**") // Permite todas las rutas
                .allowedOrigins("http://localhost:8080", "http://10.0.2.2:8080", "http://http://localhost:5173") // Orígenes permitidos
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                .allowedHeaders("*"); // Encabezados permitidos
    }
}
