package com.andres;
import java.util.Random;


public class Pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] mascotas = new String[1000]; 
		
		
		for (int i = 0; i < mascotas.length; i++) {
			mascotas[i] = generarNombre();
			System.out.println("Mi mascota es " + mascotas[i]);
		} 
	} // Fin del main
	public static String generarNombre() {
		String[] nombresSueltos = new String[20];
		nombresSueltos[0]="Orni";
		nombresSueltos[1]="Torry";
		nombresSueltos[2]="Inco";
		nombresSueltos[3]="Bicho";
		nombresSueltos[4]="Moco";
		nombresSueltos[5]="Cosa";
		nombresSueltos[6]="Guachiflus";
		nombresSueltos[7]="Eduviges";
		nombresSueltos[8]="Hermenegildo";
		nombresSueltos[9]="Lucho";
		nombresSueltos[10]="Mico";
		nombresSueltos[11]="Flyffo";
		nombresSueltos[12]="Germano";
		nombresSueltos[13]="Charmander";
		nombresSueltos[14]="Charizard";
		nombresSueltos[15]="Lutherking";
		nombresSueltos[16]="Gandhi";
		nombresSueltos[17]="Trotsky";
		nombresSueltos[18]="Gandhi";
		nombresSueltos[19]="Klara";
		
		Random rand = new Random();
		int  n1 = rand.nextInt(20);
		int  n2 = rand.nextInt(20);
		
		String nombreADevolver= nombresSueltos[n1] + " " + nombresSueltos[n2];
		
		return nombreADevolver;
	}

}
