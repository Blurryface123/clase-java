package com.andres.models;

public class Direccion {
	
	public String calle;
	public int numero;
	public String ciudad;
	
	public String getDatosDireccion() {
		String datosDireccion = this.calle+ " " + this.numero + " " + this.ciudad;
		return datosDireccion;
	}

}
