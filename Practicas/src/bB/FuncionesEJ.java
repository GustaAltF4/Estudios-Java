package bB;

import java.util.Scanner;

public class FuncionesEJ {

	public static void main(String[] args) {
		
		
		int resultado =suma(10, 10);
		 System.out.println(resultado);
		saludoPersonalizado("cacona");
		
		Scanner leer= new Scanner(System.in);
		
		String nombre= leer.next();
		saludoPersonalizado(nombre);
		
		// tambien se puede poner la accion q quieres q realize
		// ejemplo aca pongo el leer directamente en la funcion
		
		saludoPersonalizado("1 "+leer.next());
		
		leer.close();
		
	}
	
	
	public static int suma(int a , int b) {
		
		// logica
		int result=  a +  b;
		
		
		return result;
	}
	
	public static void saludoPersonalizado(String nombre) {
		// syso 
		System.out.println("Hola "+ nombre+ " como estas?");
		
		
		
	}

}
