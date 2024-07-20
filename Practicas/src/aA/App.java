package aA;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			String nombre;
			System.out.println("ingresa tu nombre basura:");
			nombre = leer.next();
			System.out.println("hola mundo, soy " +nombre+ " y estoy bla bla bla");
		}
	}

}
