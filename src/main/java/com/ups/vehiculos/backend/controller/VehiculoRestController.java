/**
 * 
 */
package com.ups.vehiculos.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ups.vehiculos.backend.model.Auto;
import com.ups.vehiculos.backend.model.TipoVehiculo;
import com.ups.vehiculos.backend.model.VehiculoFactory;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

/**
 * jnaulas
 */
//@CrossOrigin(origins = {"http://localhost:3000/api/prueba"})
@CrossOrigin(origins = {"*"})
@Controller
@RequestMapping("/api")
public class VehiculoRestController {
	
	@Autowired
	VehiculoFactory vehiculoFactory;
	/*
	
	@PostMapping("api/addVehiculos")
	public ResponseEntity<?> getRetornaVehiculos(HttpServletRequest headers, @Valid @RequestBody Auto autoRequest) {
		Auto auto = new Auto();
		auto.setId(1);
		auto.setAnio(2005);
		auto.setCilindraje(1400);
		auto.setMarca("Chevrolet");
		return ResponseEntity.ok(vehiculoFactory.crearVehiculoFactory(TipoVehiculo.AUTO));
	}
*/

	@GetMapping("/prueba")
    public ResponseEntity<String> function(){
        return  new ResponseEntity<>("Hello from Controller un cambio con build - Build Project", HttpStatus.OK);
    }
	@PostMapping("/addVehiculos")
	public ResponseEntity<?> getRetornaVehiculos(HttpServletRequest headers, @Valid @RequestBody Auto autoRequest) {
		Auto auto = new Auto();
		List<Auto> listAutos = new ArrayList<>();
		auto.setId(1);
		auto.setAnio(2005);
		auto.setCilindraje(1400);
		auto.setMarca("Chevrolet");
		//return ResponseEntity.ok(vehiculoFactory.crearVehiculoFactory(TipoVehiculo.AUTO));
		listAutos.add(auto);
		return ResponseEntity.ok(listAutos);
	}
	
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", vehiculoFactory.crearVehiculoFactory(null));
        return "formulario";
    }
}
