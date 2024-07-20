package fF;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {

	public static void main(String[] args) {
		/*
		 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
		 * para leer dos números en forma de cadena. A continuación, utilice el método
		 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y
		 * guardarlas en dos variables de tipo int. Por ultimo realizar una división con
		 * los dos numeros y mostrar el resultado. Todas estas operaciones puede tirar
		 * excepciones a manejar, el ingreso por teclado puede causar una excepción de
		 * tipo InputMismatchException, el método Integer.parseInt() si la cadena no
		 * puede convertirse a entero, arroja una NumberFormatException y además, al
		 * dividir un número por cero surge una ArithmeticException. Manipule todas las
		 * posibles excepciones utilizando bloques try/catch para las distintas
		 * excepciones
		 */
		Scanner leer = new Scanner(System.in);

		// Leer dos números en forma de cadena
		System.out.print("ingrese un numero: ");
		String numA = leer.nextLine();
		System.out.print("ingrese otro numero: ");
		String numB = leer.nextLine();

		try {
			// Convertir las cadenas a enteros
			int num1 = Integer.parseInt(numA);
			int num2 = Integer.parseInt(numB);

			// Realizar la división
			int division = num1 / num2;

			// Mostrar el resultado
			System.out.println("resultado: " + division);
		} catch (InputMismatchException e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		} finally {
			leer.close();
		}

	}

}
