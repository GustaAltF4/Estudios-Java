package aA;

import java.util.Scanner;

public class FraseMm {

	public static void main(String[] args) {
		try (
		Scanner leer = new Scanner(System.in)) {
			String frse;
			System.out.println("ingresa una frase");
			frse= leer.nextLine();
			System.out.println(frse.toLowerCase());
			System.out.println(frse.toUpperCase());
		}
	}

}
