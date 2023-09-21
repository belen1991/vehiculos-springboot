/**
 * 
 */
package com.ups.vehiculos.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ups.vehiculos.backend.model.VehiculoFactory;

/**
 * jnaulas
 */
@CrossOrigin(origins = {"http://localhost:3006/api/prueba"})
@Controller
@RequestMapping("/api")
public class VehiculoRestController {
	
	@Autowired
	VehiculoFactory vehiculoFactory;
	/*
	@GetMapping("/prueba")
	@ResponseBody
    public ResponseEntity<String> function(){
        return  new ResponseEntity<>("Hello from Controller un cambio con build - Build Project", HttpStatus.OK);
    }
	
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

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", vehiculoFactory.crearVehiculoFactory(null));
        return "formulario";
    }
}
