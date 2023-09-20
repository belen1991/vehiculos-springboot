/**
 * 
 */
package com.ups.vehiculos.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ups.vehiculos.backend.model.Auto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

/**
 * jnaulas
 */
@RestController
public class VehiculoRestController {
	@GetMapping("")
	public ResponseEntity<?> getRetornaVehiculos(HttpServletRequest headers, @Valid @RequestBody Auto autoRequest) {
		Auto auto = new Auto();
		auto.setId(1);
		auto.setAnio(2005);
		auto.setCilindraje(1400);
		auto.setMarca("Chevrolet");
	
		
		return ResponseEntity.ok(auto);
	}

}
