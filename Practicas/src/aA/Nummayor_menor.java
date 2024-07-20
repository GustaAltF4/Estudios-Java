package aA;

import java.util.Scanner;

public class Nummayor_menor {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("ingrese 2 cifras para comparar cual es mayor ");
			int n1 = leer.nextInt();
			int n2 = leer.nextInt();
			if (n1 < n2) {
				System.out.println("el numero mas de mayor valor es " +n2);
				
			}else if (n2 < n1){
				System.out.println("el numero mas de mayor valor es " +n1);
				
			}else {
				System.out.println("esa operacion no es valida gil");
			}
		}
		
		

	}

}
