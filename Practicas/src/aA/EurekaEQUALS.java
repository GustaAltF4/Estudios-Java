package aA;

import java.util.Scanner;

public class EurekaEQUALS {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			System.out.println("ingresa una frase");
			String contra = leer.next();
			String correc = "eureka";
			if (contra.equals(correc)) {
				System.out.println("CORRECTO");
			}else { 
				System.out.println("incorrecto");
			}
			// otra forma mas facil 
			if (contra.equals("eureka")) {
				System.out.println("CORRECTO");
			}else { 
				System.out.println("incorrecto");
			}
		}
	}

}
