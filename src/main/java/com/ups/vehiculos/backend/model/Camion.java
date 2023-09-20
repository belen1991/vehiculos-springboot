package com.ups.vehiculos.backend.model;

public class Camion extends Vehiculo {

    public int capacidadCajon;

    @Override
    public double obtenerCostoMatricular() {
        return (super.getAnio() / super.getCilindraje()) * (this.capacidadCajon );
    }

    public int getCapacidadCajon() {
        return capacidadCajon;
    }

    public void setCapacidadCajon(int capacidadCajon) {
        this.capacidadCajon = capacidadCajon;
    }
    
}
