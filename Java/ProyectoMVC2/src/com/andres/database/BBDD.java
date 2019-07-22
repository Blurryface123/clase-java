package com.andres.database;

import java.util.ArrayList;

import com.ricardo.modelos.Habitacion;
import com.ricardo.modelos.Usuario;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class BBDD {
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

	public BBDD() {
		this.fillUsuarios();
		this.fillHabitaciones();
		this.relacionarUserHab();
	}

	private boolean fillUsuarios() {
		usuarios.add(new Usuario(1, "Pepe", "p@p", "ppp", null));
		usuarios.add(new Usuario(2, "Luisa", "l@l", "lll", null));
		usuarios.add(new Usuario(3, "Mordor", "m@m", "mmm", null));

		return true;
	}

	private boolean fillHabitaciones() {
		habitaciones.add(new Habitacion(1, "Marques 2", 23));
		habitaciones.add(new Habitacion(2, "Marques 2", 56));
		habitaciones.add(new Habitacion(3, "Marques 2", 250));
		return true;
	}

	private boolean relacionarUserHab() {
		usuarios.get(0).setHabitacion(habitaciones.get(2));
		usuarios.get(1).setHabitacion(habitaciones.get(1));
		usuarios.get(2).setHabitacion(habitaciones.get(0));

		return true;
	}

	/*
	 * Metodo que en funicion de la id me devuelve un objeto usuario concreato si no
	 * existe devuelve null
	 */
	public Usuario getUsuarioById(int id) {
		Usuario usuarioADevolver = null; // variable con nombre usuarioADevolver de TIPO Usuario

		// Iteramos por cada usuario y comparamos su id con el que nos indica
		for (Usuario unUsuario : usuarios) {
			if (unUsuario.getId() == id) {
				usuarioADevolver = unUsuario;
				break;
			}

		}
		return usuarioADevolver;
	}

	// Iteramos por cada usuario y comparamos su id con el que nos indica
	public Habitacion getHabitacionByHid(int hid) {
		Habitacion habitacionADevolver = null;
		for (Habitacion unaHabitacion : habitaciones) {
			if (unaHabitacion.getHid() == hid) {
				habitacionADevolver = unaHabitacion;
				break;
			}

		}
		return habitacionADevolver;
	}
		

	public boolean existeUsuarioPorEmailYPass(String emailrecib, String passwordrecib) {
		// TODO Auto-generated method stub
		boolean existeUsuario = false;

		for (Usuario unUsuario : usuarios) {
			if (unUsuario.getEmail().equals(emailrecib) && unUsuario.getPass().equals(passwordrecib)) {
				existeUsuario = true;
				break;
			}

		}
		return existeUsuario;
	}
}
