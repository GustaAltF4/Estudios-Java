package aA;

import java.util.Scanner;

public class Sub_stringyEQUALS {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Escriba una Frase");
			String frse= leer.next();
			String letr= frse.substring(0, 1);
			if (letr.equals("a")){
				System.out.println("CORRECTO");
			}else if (letr.equals("A")) {
				System.out.println("CORRECTO");
			}else {
				System.out.println("INCORRECTO");

}
		}
	}
}
