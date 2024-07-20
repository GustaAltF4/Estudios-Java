package bB;

public class Vrelleno {

	public static void main(String[] args) {
		// int[] vector= new int[101];
		// for (int i=0; i< vector.length; i++) {
		// System.out.println("v[" +i+ "]");
		// } mi forma Mal

		// Sin LENGTH
		// int[] numeros = new int[100];

		// Rellenar el vector con los 100 primeros números enteros
		// for (int i = 0; i < 100; i++) {
		// numeros[i] = i + 1;
		// }

		// Mostrar los números en orden descendente
		// for (int i = 99; i >= 0; i--) {
		// System.out.println(numeros[i]);
		// }
		// Con LENGTH

		int[] numeros = new int[100];

		// Rellenar el vector con los 100 primeros números enteros
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		// Mostrar los números en orden descendente
		for (int i = 99; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

}
