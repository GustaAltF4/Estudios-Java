package aA;

import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			System.out.println("infrese un numero que quiera saber si es par o no");
			int num= leer.nextInt();
			int cuen = num%2;
			
			if (cuen <=0)  {
				System.out.println("el numero es PAR");
			}else {
				System.out.println("el numero es Impar");
			}
			//otra forma
			
			if (num % 2 ==0) {
				System.out.println("par");
			}else {
				System.out.println("impar");
			}
		}
		

	}
	

}
