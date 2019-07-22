package com.andresbank.dao;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.andresbank.models.Cliente;

public class ClienteDAOTest extends Testador {

	@BeforeClass // cargar el contexto antes de ejecutar el texto
	public static void setUpClass() {
		setUpContext();
	}

	@Test
	public void getUserByDNIAndPassVoid() {
		String dni = "";
		String pass = "";

		try {
			Cliente clienteEncontrado = ClienteDAO.getInstance().getUserByDNIAndPass(dni, pass);

			assertNull(clienteEncontrado);

		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	public void getUserByDNIAndPassExist() {
		String dni = "12345678P";
		String pass = "ppp";

		Cliente clienteEncontrado;
		try {
			clienteEncontrado = ClienteDAO.getInstance().getUserByDNIAndPass(dni, pass);

			boolean dniOk = clienteEncontrado.getDni().equals(dni);
			boolean passOk = clienteEncontrado.getPin().equals(pass);

			assertTrue(dniOk && passOk);

		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}
}
