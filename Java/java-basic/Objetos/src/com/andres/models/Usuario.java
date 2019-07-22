package com.andres.models;

public class Usuario {
	public String nombre;
	public String apellido;
	public String email;
	public int edad;
	public Direccion dir;
	
	public String getdatosCompletos() {
		String datos = this.nombre+" "+ this.apellido+", "+this.email+ ", " + this.edad; 
		return datos + "/n Direccion" + this.dir.getDatosDireccion();
		
	}
}
