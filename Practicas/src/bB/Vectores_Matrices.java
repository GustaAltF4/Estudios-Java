package bB;

import java.util.Scanner;

public class Vectores_Matrices {

	public static void main(String[] args) {
		// declaracion y creacion de un vector
		// tipo [] nombreeVEctor = new tipo[tamaño];

		// declarar un arreflo de una dimension
		int[] vector;
		// crear en memoria con el valor por defecto (cero para los enteros)
		vector = new int[2];
		// los dos pasos pero en una sola linea
		int[] producto = new int[3];

		// declaracion y creacion de una matriz
		// tipo [][] nombreMatriz= new tipo [filas][columnas]

		// declaracion e inicializacion con valores predeterminados
		int[][] matriz = { { 4, 8, 6 }, { 2, 1, 7 } };

		// declaracion y creacion de arreglos genericos
		// tipo [][]...[] nombreArreglo = new tipo [cardinadlidad 1][cardinalidad
		// 2]...[cardinalidad N];

		System.out.println("ingrese los valores del vector de tamaño " + vector.length + ":");
		Scanner leer = new Scanner(System.in);
		// int=0, porq los subindices de los arreglos en java inician en cero
		for (int i = 0; i < vector.length; i++) {
			System.out.print("v[" + i + "]=");
			// acceder al valor i del vector
			vector[i] = leer.nextInt();
		}

		// multiplicacion vector por matriz
		int sum;
		// ... para cada columna de la matriz ...
		for (int j = 0; j < matriz[0].length; j++) {
			sum = 0;
			// ... recorro el vector y lo multiplico
			for (int i = 0; i < vector.length; i++) {
				sum += vector[i] * matriz[i][j];
			}
			producto[j] = sum;
		}

		String aux = "";

		// mostrar vector
		System.out.println("* Vector: ");
		// bucle for "mejorado" (enhanced)
		// for (tipo elemento: arreglo)
		for (int elemento : vector) {
			aux = aux + " " + elemento;
		}
		System.out.println(aux);

		// mostrar matriz
		System.out.println("/n* Matriz: ");
		// para cada fila de la matriz
		for (int[] fila : matriz) {
			aux = "";
			// para cada elemento de la fila
			for (int elemento : fila) {
				aux += " " + elemento;
			}
			System.out.println(aux);
		}

		// mostrar resultado
		aux = "";
		System.out.println("/n* Vector x Matriz: ");
		for (int elemento : producto) {
			aux += " " + elemento;
		}
		System.out.println(aux);

		leer.close();

	}

}
