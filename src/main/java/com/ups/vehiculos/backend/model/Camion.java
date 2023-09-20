package com.ups.vehiculos.backend.model;

public class Camion extends Vehiculo {

    public int capacidadCajon;

    @Override
    public double obtenerCostoMatricular() {
        return (super.getAnio() / super.getCilindraje()) * (this.capacidadCajon * 4 );
    }

    public int getCapacidadCajon() {
        return capacidadCajon;
    }

    public void setCapacidadCajon(int capacidadCajon) {
        this.capacidadCajon = capacidadCajon;
    }
    
}
