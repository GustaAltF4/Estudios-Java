package cC;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateE_IA {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("INGRESA TU FECHA DE NACIMIENTO");
			System.out.print("Ingrese el año: ");
			int anio = leer.nextInt();
			System.out.print("Ingrese el mes (1-12): ");
			int mes = leer.nextInt();
			System.out.print("Ingrese el día: ");
			int dia = leer.nextInt();

			// Importamos las clases necesarias: LocalDate y Period.
			// LocalDate representa una fecha (año, mes y día) sin la hora.
			// Period representa una cantidad de tiempo entre dos fechas.

			LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
			LocalDate fechaActual = LocalDate.now();

			// Utilizamos Period.between(fechaNacimiento, fechaActual) para calcular la
			// diferencia entre ambas fechas.

			// El resultado es un período que contiene la cantidad de años, meses y días
			// entre las dos fechas.
			Period diferencia = Period.between(fechaNacimiento, fechaActual);

			System.out.println("Años de diferencia entre tu nacimiento y la fecha actual: " + diferencia.getYears());
		}

	}

}
