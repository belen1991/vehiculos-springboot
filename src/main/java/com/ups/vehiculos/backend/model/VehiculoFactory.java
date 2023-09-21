package com.ups.vehiculos.backend.model;

import org.hibernate.annotations.Comment;

@Comment(value = "")
public class VehiculoFactory extends VehiculoAbstractFactory {

    @Override
    public Vehiculo crearVehiculoFactory(TipoVehiculo tipoVehiculo) {
        switch (tipoVehiculo) {
            case AUTO:
            	return new Auto();
            case CAMIONETA:
            	return new Camioneta();
            case CAMION:
            	return new Camion();                
            default:
                throw new IllegalArgumentException("Parámetro inválido");
        }
    }
    
}
