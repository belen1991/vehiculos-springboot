/**
 * 
 */
package com.ups.vehiculos.backend.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */
@Configuration
public class AppConfig {
    @Bean
    public VehiculoFactory vehiculoFactory() {
        return new VehiculoFactory();
    }

}
