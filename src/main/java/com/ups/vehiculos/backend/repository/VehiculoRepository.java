package com.ups.vehiculos.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ups.vehiculos.backend.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    
}
