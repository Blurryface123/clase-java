package com.andresBankapp.Modelos;


public class Cliente {
	public int uid;
	public String nombre;
	public String dni;
	public Cuenta cuentas;
	public Nomina nominas;
	
	
	public Cliente(int uid, String nombre, String dni, Cuenta cuentas, Nomina nominas) {
		super();
		this.uid = uid;
		this.nombre = nombre;
		this.dni = dni;
		this.cuentas = cuentas;
		this.nominas = nominas;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Cuenta getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta cuentas) {
		this.cuentas = cuentas;
	}
	public Nomina getNominas() {
		return nominas;
	}
	public void setNominas(Nomina nominas) {
		this.nominas = nominas;
	}
	
	
}
	
	
