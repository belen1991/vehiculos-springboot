package com.ups.vehiculos.backend;

import com.ups.vehiculos.backend.model.TipoVehiculo;
import com.ups.vehiculos.backend.model.Vehiculo;
import com.ups.vehiculos.backend.model.VehiculoFactory;


public class Principal {

	public static void main(String[] args) {

		var vehiculoFactory = new VehiculoFactory();
		Vehiculo vehiculo = vehiculoFactory.crearVehiculoFactory(TipoVehiculo.AUTO);
		vehiculo.setAnio(2015);
		vehiculo.setCilindraje(3500);
		vehiculo.setId(0);
		vehiculo.setMarca("KIA");
		vehiculo.setModelo("SORENTO");
		vehiculo.setPlaca("ABA-1234");
		vehiculo.setValor(new Float(25000));
		System.out.print("Valor Matricula es:"+ vehiculo.obtenerCostoMatricular() + " , de:" + vehiculo.getMarca()+", "+vehiculo.getModelo());
	}

}
