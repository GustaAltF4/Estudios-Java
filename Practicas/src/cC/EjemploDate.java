package cC;

import java.util.Date;

public class EjemploDate {

	public static void main(String[] args) {

		// metoodos de constructores
		Date fecha1 = new Date();// representa el momento exacto en el q es creado osea cuando se ejecuta el
									// programa
		Date fecha2 = new Date(999990005555L); // 8 de septiempre de 2001 20:02hs

		// metodo toString - retorna la fecha en una cadena de caracteres
		String descripcionFecha1 = fecha1.toString();
		System.out.println(descripcionFecha1);

		String descripcionFecha2 = fecha2.toString();
		System.out.println(descripcionFecha2);

		// metodo after - retorna verdadero si la fecha esta despues de la fecha de
		// parametro
		if (fecha1.after(fecha2)) {
			System.out.println("La fecha 1 es posterior a la fecha 2");

		} else {
			System.out.println("La fecha 1 es anterior a la fecha 2");
		}

		// metodo before - reotna verdadero si la fecha esta aantes de la fecha del
		// parametro

		if (fecha2.before(fecha1)) {
			System.out.println("la fecha 2 es anterior a la fecha 1");
		} else {
			System.out.println("la fecha 2 es posterior a la fecha 1");
		}

		// metodo getTime - reotna la fecha en milisegundos
		long milisegFecha1 = fecha1.getTime();
		System.out.println("la cantidad de miliseg de la fecha 1 es: " + milisegFecha1);
		long milisegFecha2 = fecha2.getTime();
		System.out.println("la cantidad de miliseg de la decha 2 es: " + milisegFecha2);

		// metodo equals - retorna verdadero si la fecha es igual a la del objeto del
		// parametro
		if (fecha1.equals(fecha2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son diferentes");
		}

		// metodo setTime - asigna la fecha en milisegundos
		fecha2.setTime(milisegFecha1);
		if (fecha1.equals(fecha2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son diferentes");
		}

	}

}
