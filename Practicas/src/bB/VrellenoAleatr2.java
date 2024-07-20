package bB;

import java.util.Scanner;

public class VrellenoAleatr2 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        // Tamaño del vector (puedes cambiarlo según tus necesidades)
	        int N = 100;
	        int[] vector = new int[N];

	        // Llenar el vector con valores aleatorios entre 1 y 100
	        for (int i = 0; i < N; i++) {
	            vector[i] = (int) (Math.random() * 100) + 1;
	        }

	        // Pedir al usuario el número a buscar
	        System.out.print("Ingresa un número para buscar en el vector: ");
	        int numeroBuscado = scanner.nextInt();

	        boolean encontrado = false;
	        int primeraPosicion = -1;

	        // Buscar el número en el vector
	        for (int i = 0; i < N; i++) {
	            if (vector[i] == numeroBuscado) {
	                if (!encontrado) {
	                    primeraPosicion = i;
	                    encontrado = true;
	                } else {
	                    System.out.println("El número está repetido en la posición " + i);
	                }
	            }
	        }

	        if (encontrado) {
	            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + primeraPosicion);
	        } else {
	            System.out.println("El número no se encuentra en el vector.");
	        }
	        scanner.close();
	    }
	
		
	}


