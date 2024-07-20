package aA;

import java.util.Scanner;

public class Length_longitud {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("ingrese una frase");
			String frse= leer.next();
			int lon= frse.length();
			if (lon==8) {
				System.out.println("CORRECTO");
			}else {
				System.out.println("INCORRECTO");
			}
			
			
		}
	}

}
