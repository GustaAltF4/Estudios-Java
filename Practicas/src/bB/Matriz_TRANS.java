package bB;

import java.util.Random;

public class Matriz_TRANS {

	public static void main(String[] args) {
		int filas = 4;
		int columnas = 4;
		int[][] matriz = new int[filas][columnas];

		// rellenar matriz

		Random ran = new Random();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = ran.nextInt(100);// valore aleatorias del 0 al 99
			}

		}
		// mostar matriz original

		System.out.println("Matriz original");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			// metodo
			// imprimirMatriz(matriz);

			// calcular la transpuesta

		}
		int[][] matrizTRANS = new int[columnas][filas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizTRANS[j][i] = matriz[i][j];
			}

			// mostrar la transpuesta

		}
		// imprimirMatriz(matrizTRANS);
		System.out.println("matriz TRANSPUESTA");
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				System.out.print(matrizTRANS[i][j] + " ");
			}
			System.out.println();
		}
	}

	// metodo mostrar matriz
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
