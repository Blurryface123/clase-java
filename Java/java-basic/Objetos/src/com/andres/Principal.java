package com.andres;

import com.andres.models.Direccion;
import com.andres.models.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario pepito = new Usuario();
		pepito.nombre="Pepe";
		pepito.apellido="Perez";
		pepito.email="perez@pereza.com";
		pepito.edad= 50;
		
		Direccion aDir=new Direccion();
		aDir.calle= "c/Manzanas";
		aDir.numero= 23;
		aDir.ciudad= "Madrid";
		System.out.println(pepito.getdatosCompletos());
	
	}

}
