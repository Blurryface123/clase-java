package com.andres;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] meses = new String[12]; 
		meses[0]= "Ene";
		meses[1]= "Feb";
		meses[2]= "Mar";
		meses[3]= "Abri";
		meses[4]= "May";
		meses[5]= "Jun";
		meses[6]= "Jul";
		meses[7]= "Ago";
		meses[8]= "Sept";
		meses[9]= "Oct";
		meses[10]= "Nov";
		meses[11]= "Dic";
		
		meses,
		
	for (int i = 0; i < meses.length; i++) {
		System.out.println("El mes " + (i+1) + " es " + meses[i]);
	}
	for (String unMes : meses) {
		System.out.println("Un mes: " + unMes);
	}
		}
		
	};


