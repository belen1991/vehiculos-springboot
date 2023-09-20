package com.ups.vehiculos.backend.model;

public class Camion extends Vehiculo {

    public int capacidadCajon = 4500;

    @Override
    public double obtenerCostoMatricular() {
        return (this.getAnio() * this.getCilindraje()) * (this.capacidadCajon );
    }

    public int getCapacidadCajon() {
        return capacidadCajon;
    }

    public void setCapacidadCajon(int capacidadCajon) {
        this.capacidadCajon = capacidadCajon;
    }
    
}
