package bB;

import java.util.Scanner;

public class RS232charAT {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int correctCount = 0;
			int incorrectCount = 0;
			String input;

			System.out.println("Ingrese cadenas (FDE para finalizar):");

			while (true) {
				input = scanner.nextLine();

				if (input.equals("&&&&&")) {
					break;
				}

				/*
				 * El método charAt() en Java es un método de la clase String que se utiliza
				 * para obtener el carácter en una posición específica de una cadena. Este
				 * método es muy útil cuando necesitas acceder a caracteres individuales de una
				 * cadena de texto.
				 */
				if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
					correctCount++;
				} else {
					incorrectCount++;
				}
			}

			System.out.println("Informe:");
			System.out.println("Lecturas correctas: " + correctCount);
			System.out.println("Lecturas incorrectas: " + incorrectCount);
		}
	}
}
