package aA;

import java.util.Scanner;

public class EjemploSWITCH_DEFAULT {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("ingrese el tipo de motor del 1 al 4");
			int tipoM = leer.nextInt();
			switch (tipoM) {
			case 1:
				System.out.println("la bomba es una bomba de agua");
				break;
			case 2: 
				System.out.println("la bomba es una bomba de gasolina");
				break;
			case 3:
				System.out.println("la bomba es una bomba de hormigon");
				break;
			case 4: 
				System.out.println("la bomba es una bomba de pasta alimenticia");
				break;
			default:
				System.out.println("No existe un valor valido para tipo de bomba");
				break;
			}
		}
	}

}
