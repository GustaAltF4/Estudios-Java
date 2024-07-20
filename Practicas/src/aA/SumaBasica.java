package aA;

import java.util.Scanner;

public class SumaBasica {

	public static void main(String[] args) {
		try (
		Scanner leer = new Scanner(System.in)) {
			
			
			
			System.out.println("ingresa 2 cifras");
			int n1 = leer.nextInt();
			int n2 = leer.nextInt();
			int suma= n1 + n2;
			System.out.println("el resultado de la suma de sus 2 cifras es " + suma);
		}

	}

}
