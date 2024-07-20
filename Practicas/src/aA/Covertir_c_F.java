package aA;

import java.util.Scanner;

public class Covertir_c_F {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Escriba la cantidad de °C q quiere transformar a Fahrenheit");
			int grad = leer.nextInt();
			int trnf = 32 + (9*grad /5);
			System.out.println("los "+grad+"°C que ingreso equivaldrian a "+ trnf +" Fahrenheint");
		}
	}

}
