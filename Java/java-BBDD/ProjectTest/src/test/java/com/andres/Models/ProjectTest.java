package com.andres.Models;




import org.junit.Test;

import com.andres.models.Operador;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {
	
	
	

	@Test
	public void testCeros() {
		int a = 0, b = 0;
		Operador op = new Operador();

		assertTrue(op.suma(a, b) == 0);
	}

	@Test
	public void testBSiempreCero() {
		int[] listaA = new int[5];
		listaA[0] = 2;
		listaA[1] = 32;
		listaA[2] = 2234;
		listaA[3] = 2143;
		listaA[4] = 4354543;

		int b = 0;
		Operador op = new Operador();
		for (int a : listaA) {
			assertTrue(op.suma(a, b) == a);
		}
	}
	
	@Test
	public void test3() {
		int x = -2, y = 3;
		Operador op = new Operador();

		assertTrue(op.suma(x, y) == x+y);
	}
	
	
	

}
