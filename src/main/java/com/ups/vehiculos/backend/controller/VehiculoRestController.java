/**
 * 
 */
package com.ups.vehiculos.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ups.vehiculos.backend.model.Auto;
import com.ups.vehiculos.backend.model.TipoVehiculo;
import com.ups.vehiculos.backend.model.Vehiculo;
import com.ups.vehiculos.backend.model.VehiculoAbstractFactory;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

/**
 * jnaulas
 */
@RestController
public class VehiculoRestController {
	private final VehiculoAbstractFactory vehiculoFactory;

    public VehiculoRestController(VehiculoAbstractFactory vehiculoFactory) {
        this.vehiculoFactory = vehiculoFactory;
    }

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return vehiculoFactory.crearVehiculoFactory(tipoVehiculo);
    }
}
