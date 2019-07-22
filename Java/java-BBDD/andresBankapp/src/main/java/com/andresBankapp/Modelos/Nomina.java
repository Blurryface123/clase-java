package com.andresBankapp.Modelos;

public class Nomina {
	public int nid;
	public String nombre;
	public double valor;
	
	public Nomina(int nid, String nombre, double valor) {
		super();
		this.nid = nid;
		this.nombre = nombre;
		this.valor = valor;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
