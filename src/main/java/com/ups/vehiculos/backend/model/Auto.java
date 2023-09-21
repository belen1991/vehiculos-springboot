package com.ups.vehiculos.backend.model;

public class Auto extends Vehiculo {

    public int capacidadMaletero = 500;

    @Override
    public double obtenerCostoMatricular() {
        return (this.getAnio() * this.getCilindraje()) * (this.getCapacidadMaletero() / 50);
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    
    
}
