package bB;

import java.util.Scanner;

public class VrellenoAleatr {

	public static void main(String[] args) {
		int[] num=  new int [100];
		for (int i =0 ; i< 100; i++) {
			// generar un numero aleatoria entre 1 y 100
			num[i] = (int) (Math.random()*100+ 1) ;
		}
		
		Scanner leer = new Scanner (System.in);
		System.out.println("ingrese un numero a buscar en el vector");
		int busqueda=  leer.nextInt();
		 // mostrar numeros generados 
		for (int i=0 ; i < 100 ; i++) {
			System.out.println(num[i]+" ");
			if (busqueda == num[i]) {
				System.out.println("se encontro el numero");
				
			}
				
			
			
		}
		leer.close();

	}

}
