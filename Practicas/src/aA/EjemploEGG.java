package aA;

import java.util.Scanner;

public class EjemploEGG {

	public static void main(String[] args) {
		
		int opinion;
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("CLasifique la peli del 1 al 5 estrellas");
			opinion= leer.nextInt();
		}
		if (opinion>= 1 && opinion <= 5) {
		//if = si |   else = sino
			switch (opinion) {
			// segun= switch
			case 1:
			case 2:
				System.out.println("ah... una poronga");
				break;
				// break es necesario para q no continue las condicionales con swich
				// sino compara uno y luego el otro(funcion de java)
			case 3:
				System.out.println("calificacion : peli pasable");
				break;
			case 4:
				System.out.println("calificacion : peli buena");
				break;
			case 5:
				System.out.println("calificacion : peli GOOOD");
				break;
				//el equivalente al caso |de otro modo| es el |default| osea ningun caso se cumple
				//default:
				//<acciones>
			}
			
		// else if (sino si) concatena otros si
		}else if (opinion < 0) {
			System.out.println("opinion negativa? paraaaaa critico de cine");
		}else if (opinion == 0) {
			System.out.println("el valor " + opinion + "no es valido fantasma");
		}else {
			System.out.println(opinion + " ? fantasmin era hasta 5, tanto te gusto emocion");
		}
		
		System.out.println("no´ re vimo´ gato...");

	

	}

}
