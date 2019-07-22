package com.andres;

import java.util.ArrayList;

import com.andres.modelo.Amigo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amigo pepe= new Amigo(100, "pepe","pepe.pep@es.es", 25,true );
	     
		Amigo juan= new Amigo(101, "juan","jj.pep@es.es",25,true);
		
		Amigo petra=new Amigo(102,"petra","petr.pep@es.es",26,false);

		Amigo luisa= new Amigo(103,"lui","lui.pep@es.es",25,true);
		
		ArrayList<Amigo> amigosPepe = new ArrayList<Amigo>();
		
		amigosPepe.add(juan);
		amigosPepe.add(petra);
		
		
		pepe.setMisamigos(amigosPepe);
		
		System.out.println(pepe.showinfo());
	
	}

}
