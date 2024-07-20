package bB;

import java.util.Scanner;

public class Num_asterisco {

	public static void main(String[] args) {
		Scanner leer= new Scanner (System.in);
		System.out.println("ingrese 4 numeros del 1 al 20");
		int n1= leer.nextInt();int n2=leer.nextInt();int n3=leer.nextInt();int n4=leer.nextInt();
		if (n1<=20 && n2<=20 && n3<=20 && n4<=20) {
			
			System.out.println();
			System.out.print(n1);
			for (int i=0; i< n1; i++ ) {	
				System.out.print("*");
				}
			
			
			System.out.println();
			System.out.print(n2);
			for (int i=0; i< n2; i++ ) {
				System.out.print("*");
				}
			
			
			System.out.println();
			System.out.print(n3);
			for (int i=0; i< n3; i++ ) {
				System.out.print("*");
				}
			
			
			System.out.println();
			System.out.print(n4);
			for (int i=0; i< n4; i++ ) {
				System.out.print("*");
				}
		
		}else {
			System.out.println("solo permitidos numeros del 1 al 20,pton");
		}
		 leer.close();
		



	}

}
