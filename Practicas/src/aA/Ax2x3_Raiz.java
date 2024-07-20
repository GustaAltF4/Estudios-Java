package aA;

import java.util.Scanner;

public class Ax2x3_Raiz {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("escriba una cifra");
			int n1 = leer.nextInt();
			// de aca (Basicamente innecesario?)
			int doble= n1*2;
			int triple= n1*3;
			double raiz= Math.sqrt(n1);
			System.out.println("el doble de su cifra es " +doble);
			System.out.println("el triple de su cifra es " +triple);
			System.out.println("la raiz cuadrada de su cifra es "+ raiz);
			//hasta aca , no hace falta , pero es otra forma de hacerlo...
			System.out.println("el doble de su cifra es " + n1*2);
			System.out.println("el triple de su cifra es " + n1*3);
			System.out.println("la raiz cuadrada de su cifra es "+Math.sqrt(n1));
		}

	}

}
