package bB;

import java.util.Scanner;

public class Num20FOR {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			int suma=0;
			
			for (int i=0 ; i<20; i++) {
				System.out.println("ingrese 20 numeros");
				int numeros = leer.nextInt();
				if (numeros ==0 ) {
					System.out.println("Se capturo el numero 0");
					break;
				}else if (numeros >0) {
					suma += numeros;
				}
				
			
			
			
			}
			System.out.println("la suma de todos los numeros ingresados es: " +suma);
		}
		
				

	}

}
