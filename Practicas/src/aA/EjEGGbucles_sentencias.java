package aA;

import java.util.Scanner;

public class EjEGGbucles_sentencias {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			int num;
			do { 
				System.out.println("ingrese un numero entero positivo");
				num= leer.nextInt();
				if (num> 1000) {
					System.out.println("este programa podria tardar, esta seguro? (s/n)");
					String confirma = leer.next();;
					if (confirma.equals("s")) {
						break;                   //break: detiene el bucle y continua con el proximo bloque
					}
				}
			}while (num <= 0 || num > 1000);
			/*
			 * for (<inicializacion>; <expresio_terminacion>; <paso/incremento/decremento){
			 * }
			 * for = para
			 */
			int j, suma;
			for (int i=1 ; i<= num ; i++) { //i++ es incremento es como decir i = i+1
				if (i%2 != 0)
					continue;
				// continue : en este caso se no continua con el bucle  vuelve al for
				//todo esto q sigue no se ejecuto por q no se cumple q sea para para eecutart todo lo q sigue
				suma = 0;
				j=1;
				// while es igual q mientras
				while(j<=i) {
					suma += j;
					j++;
				}
				System.out.println("la suma de los " + i + " los numeros naturales es" + suma);
			}
		}
	

	}

}
