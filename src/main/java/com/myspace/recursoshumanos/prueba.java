package com.myspace.recursoshumanos;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class prueba implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.Integer id;
	@org.kie.api.definition.type.Label(value = "nombre")
	private java.lang.String nombre;

	public prueba() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public prueba(java.lang.Integer id, java.lang.String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

}