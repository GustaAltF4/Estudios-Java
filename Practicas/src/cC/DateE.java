package cC;

import java.util.Date;
import java.util.Scanner;

public class DateE {
	
	
	
	
	
	public static void main(String[] args) {
		int dia;
		int mes;//Enero es el mes 0 en java.util.Date
		int anio; // Resta 1900 para obtener el año correcto
		//En la clase java.util.Date, los años se cuentan desde 1900
		
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("INGRESA TU FECHA DE NACIMENTO");
			System.out.println("ingrese el año");
			anio= leer.nextInt();
			System.out.println("ingrese el mes");
			mes= leer.nextInt();
			while(mes>=13) {
				System.out.println("el numero ingresado no es correcto...");
				System.out.println("ingrese nuevamente...");
				mes= leer.nextInt();
				
			}
			System.out.println("ingrese el dia");
			dia= leer.nextInt();
			while(dia>=32) {
				System.out.println("el numero ingresado no es correcto...");
				System.out.println("ingrese nuevamente...");
				dia= leer.nextInt();
			}
		}
		@SuppressWarnings("deprecation")
		Date fecha = new Date(anio-1900, mes-1, dia);
		//resto 1900 al año asi da el año correcto
		//y resto en 1 el mes para q de el mes correcto
		Date fechaActual= new Date();
		System.out.println(fecha.toString() );
		System.out.println( fechaActual.toString());
		//calculo la diferencia en milisegundos de la fecha actual y el año ingresado
		long miliSfecha= fecha.getTime();
		long miliSActual= fechaActual.getTime();
		
		long diff= miliSActual-miliSfecha;
		
		// cuenta para saber cuantos mili seg hay en un año
		long miliSeg_porAnio= 365L*24l*60l*60l*1000l;
		
		long diferencia= diff/ miliSeg_porAnio;
		double diferencia2= (double)diff/ miliSeg_porAnio;
		System.out.println("Años de diferencia entre tu nacimiento y la fecha actual:  "+diferencia);
		System.out.println("Años de diferencia entre tu nacimiento y la fecha actual:  "+diferencia2);
	}

}

