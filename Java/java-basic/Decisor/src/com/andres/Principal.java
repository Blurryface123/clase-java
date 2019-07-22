package com.andres;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=23;
		b=45;
		c=100;
		
		if (a > b && b > c) {
			System.out.println("A es mayor");
		} else if (b > a && a > c){
			System.out.println("B es mayor");
		} else {
			System.out.println("C es mayor");
		}
	}

}
