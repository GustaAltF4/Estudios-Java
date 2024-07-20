package dD;

import java.util.ArrayList;
import java.util.Scanner;

public class EjArray2 {

	public static void main(String[] args) {

		ArrayList<String> razasPerros = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		String raza;
		do {
			System.out.println("Ingrese una raza de perro o escriba 'salir' para finalizar");
			raza = leer.nextLine();
			// Esto verifica si la cadena "raza" no es igual a "salir",
			// independientemente de las mayúsculas o minúsculas.
			// Si "raza" no es igual a "salir", la expresión será verdadera.
			if (!raza.equalsIgnoreCase("salir")) {
				razasPerros.add(raza);
			}
		} while (!raza.equalsIgnoreCase("salir"));

		System.out.println("______RAZAS DE PERROS GUARDADAS______");
		for (String perro : razasPerros) {
			System.out.println(perro);

		}
		leer.close();

	}

}
