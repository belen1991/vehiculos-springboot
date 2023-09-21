/**
 * 
 */
package com.ups.vehiculos.generic;

import javax.enterprise.inject.Any;
import javax.inject.Inject;

import jakarta.persistence.EntityManager;

/**
 * 
 */
@Any
public class CommonDAO {
	/**
	 * Insertar/obtener el contexto de la persistencia
	 */
	@Inject
	protected EntityManager em;

	/**
	 * 
	 * @return
	 */
	public EntityManager getEntityManager() {
		return em;
	}
}
