package com.andres.modelo;

import java.util.ArrayList;

public class Amigo {
	 private int id;
	 private String nombre;
	 private String email;
	 private int edad;
	 private boolean viveCerca;
	 private ArrayList<Amigo> misamigos;
	 
	
	 
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isViveCerca() {
		return viveCerca;
	}

	public void setViveCerca(boolean viveCerca) {
		this.viveCerca = viveCerca;
	}

	public ArrayList<Amigo> getMisamigos() {
		return misamigos;
	}

	public void setMisamigos(ArrayList<Amigo> misamigos) {
		this.misamigos = misamigos;
	}

	public Amigo() { 		 
	 }

	public Amigo(int id, String nombre, String email, int edad, boolean viveCerca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.viveCerca = viveCerca;
		
	}
	public String showinfo() {
		String texto="";
		
		texto+="Id: " +this.id+"\n";
		texto+="Nombre: "+this.nombre+"\n";
		texto+="Email: "+this.email+"\n";
		texto+="Edad: "+this.edad+"\n";
		texto+="Vive cerca_ "+this.viveCerca+"\n";
		
		texto += "AMIGOS:\n";
		
		if (this.misamigos!=null) for (Amigo amigo : this.misamigos) {
			if(amigo!=null)
			texto+="-" + amigo.nombre+" ("+amigo.email+") "+(this.viveCerca? "Vive cerca":"Vive lejos");
			
		}		
		return texto;
	}
	
}
