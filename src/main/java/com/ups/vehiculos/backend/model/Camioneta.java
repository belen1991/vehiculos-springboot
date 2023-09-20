package com.ups.vehiculos.backend.model;

public class Camioneta extends Vehiculo {

    public int capacidadBalde = 1050;

    @Override
    public double obtenerCostoMatricular() {
        return (this.getAnio() * this.getCilindraje()) * (this.capacidadBalde * 4 );
    }

    public int getCapacidadBalde() {
        return capacidadBalde;
    }

    public void setCapacidadBalde(int capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }
    
}
