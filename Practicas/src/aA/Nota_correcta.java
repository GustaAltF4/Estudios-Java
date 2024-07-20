package aA;

import java.util.Scanner;

public class Nota_correcta {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			System.out.println("ingrese una nota para ser validada");
			int nota= leer.nextInt();
			for (int i=0 ; i<= 10 ;) {
				if (nota>= 0 && nota <= 10) {
					System.out.println("su nota es validada");
					break;
				}else {
					System.out.println("no valido ingrese nuevamente");
				}
				
					
			}
			
		}
	}
}
	

