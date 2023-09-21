package com.ups.vehiculos.backend.model;

import javax.ejb.Remote;

@Remote
public abstract class VehiculoAbstractFactory {
    
    public abstract Vehiculo crearVehiculoFactory(TipoVehiculo tipoVehiculo);

}
