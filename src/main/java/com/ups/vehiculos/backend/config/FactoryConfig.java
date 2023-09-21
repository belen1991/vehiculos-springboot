package com.ups.vehiculos.backend.config;

import com.ups.vehiculos.backend.model.VehiculoAbstractFactory;
import com.ups.vehiculos.backend.model.VehiculoFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {

    @Bean
    public VehiculoAbstractFactory vehiculoAbstractFactory() {
        // Initialize and return your concrete factory implementation.
        return new VehiculoFactory();
    }
}
