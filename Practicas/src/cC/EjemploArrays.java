package cC;

import java.util.Arrays;
import java.util.Random;

public class EjemploArrays {

	public static void main(String[] args) {

		// Creamos un arreglo
		int arreglo1[] = { 4, 2, 8, 6, 10 };
		imprimirArreglo(arreglo1);

		// metodo fill- metodo para inicializar arreglos con un valor determindo
		int arreglo2[] = new int[5];
		Arrays.fill(arreglo2, 7);
		imprimirArreglo(arreglo2);

		// metodo copyOr- metodo que permite copiar el contenido del arreglo en otro
		// arreglo
		int arreglo3[] = Arrays.copyOf(arreglo1, 5);
		imprimirArreglo(arreglo3);

		// metodo equals- determina si dos arreglos son iguales
		if (Arrays.equals(arreglo1, arreglo2)) {
			System.out.println("Los arreglos son iguales");
		} else {
			System.out.println("Los arreglos son distintos");
		}

		if (Arrays.equals(arreglo1, arreglo3)) {
			System.out.println("Los arreglos son iguales");
		} else {
			System.out.println("Los arreglos son distintos");
		}

		// metodo sort- metodo para ordenar arreglos
		Arrays.sort(arreglo1);
		imprimirArreglo(arreglo1);

		// metodo binarySearch- sirve para buscar un elemento determinado en un arreglo
		// El metodo devuelve la posicion en la cual se encuentra el elemento
		int posicion = Arrays.binarySearch(arreglo1, 8);
		System.out.println("El elemto 8 se encuentra en la posicion " + posicion);

		double a[] = new double[50];

		Random r1 = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = r1.nextInt(0, 100);
		}
		System.out.println("A desodenado");
		imprimirArreglo2(a);

//		for (int j = 0; j < b.length; j++) {
//			b[j]= r1.nextInt(0,100);
//			
//		}
//		
		Arrays.sort(a);
		double b[] = new double[20];
		System.arraycopy(a, 0, b, 0, 10);
		Arrays.fill(b, 10, b.length, 0.5);
		System.out.println("A ordenado");
		imprimirArreglo2(a);
		System.out.println("arrglo B");
		imprimirArreglo2(b);
	}

	private static void imprimirArreglo(int arreglo[]) {
		System.out.println("_____ARREGLO______");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);

		}
	}

	private static void imprimirArreglo2(double[] arreglo) {
		System.out.println("_____ARREGLO______");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);

		}
	}

}
