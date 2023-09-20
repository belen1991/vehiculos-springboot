package com.ups.vehiculos.backend.model;

public class Camioneta extends Vehiculo {

    public int capacidadBalde;

    @Override
    public double obtenerCostoMatricular() {
        return (super.getAnio() / super.getCilindraje()) * (this.capacidadBalde * 4 );
    }

    public int getCapacidadBalde() {
        return capacidadBalde;
    }

    public void setCapacidadBalde(int capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }
    
}
