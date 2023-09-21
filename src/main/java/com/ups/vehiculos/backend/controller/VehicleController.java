package com.ups.vehiculos.backend.controller;

import com.ups.vehiculos.backend.dto.VehicleDTO;
import com.ups.vehiculos.backend.model.TipoVehiculo;
import com.ups.vehiculos.backend.model.Vehiculo;
import com.ups.vehiculos.backend.model.VehiculoAbstractFactory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VehicleController {

    private final VehiculoAbstractFactory vehiculoFactory;
    private static List<Vehiculo> vehicles = new ArrayList<Vehiculo>();

    public VehicleController(VehiculoAbstractFactory vehiculoFactory) {
        this.vehiculoFactory = vehiculoFactory;
    }

    @GetMapping("/vehicleList")
    public String showVehicleList(Model model) {
        model.addAttribute("vehicles", vehicles); // Add the list of vehicles to the model
        return "vehicleList"; // Return the name of your Thymeleaf template
    }

    @GetMapping("/calculateMatricula")
    @ResponseBody
    public double calculateMatricula(@RequestParam int vehicleId, Model model) {
        
        Vehiculo vehicle = vehicles.get(vehicleId);
        if (vehicle != null) {
            // Calculate the matricula using the obtenerCostoMatricular method
            return vehicle.obtenerCostoMatricular();
        } else {
            // Handle the case where the vehicle is not found
            throw new RuntimeException("Vehicle not found");
        }
    }

    @GetMapping("/createVehicleForm")
    public String createVehicleForm(Model model) {
        model.addAttribute("vehicleDTO", new VehicleDTO()); // Initialize a new VehicleDTO object
        model.addAttribute("tiposVehiculo", TipoVehiculo.values());
        return "createVehicle";
    }

    @PostMapping("/createVehicle")
    public String createVehicle(@ModelAttribute VehicleDTO vehicleDTO) {
        Vehiculo newVehicle = vehiculoFactory.crearVehiculoFactory(vehicleDTO.getTipo());
        newVehicle.setId(vehicles.size());
        newVehicle.setPlaca(vehicleDTO.getPlaca());
        newVehicle.setModelo(vehicleDTO.getModelo());
        newVehicle.setMarca(vehicleDTO.getMarca());
        newVehicle.setAnio(vehicleDTO.getAnio());
        newVehicle.setCilindraje(vehicleDTO.getCilindraje());
        newVehicle.setValor(vehicleDTO.getValor());
        newVehicle.setTipo(vehicleDTO.getTipo());
        vehicles.add(vehicles.size(), newVehicle);

        return "redirect:/vehicleList"; // Redirect to the form after creating the vehicle.
    }
}
