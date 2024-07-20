package bB;

import java.util.Scanner;

public class Cuadrado_printDIFF {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingresa num del tamaño del cuadrado");
		int num = leer.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
					System.out.print("* ");
				} else {

					System.out.print("  ");
					/*
					 * print() no agrega una nueva línea. println() agrega una nueva línea después
					 * de imprimir el texto
					 */
				}
			}
			System.out.println();
		}
		leer.close();
		// otra forma de cerrar el SCanner sin el TRY

	}

}
