package bB;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner (System.in)) {
			/*
			 * En Java, la instrucción do-while se utiliza para crear un bucle
			 *  que ejecuta un bloque de código al menos una vez 
			 *  y luego verifica una condición para determinar si debe repetirse.
			 */
			do { 
				
				System.out.println("  MENU");
				System.out.println("1.sumar"  );int suma;
				System.out.println("2.restar");int resta;
				System.out.println("3.multiplicar");int multi;
				System.out.println("4.dividir"); double divi;
				System.out.println("5.salir");
				System.out.println("elija una opcion");
				int eleccion= leer.nextInt();
				
				int num1;int num2;
				
				
				switch (eleccion) {
				case 1: 
					System.out.println("ingrese 2 numeros positivos");
					 num1= leer.nextInt();  num2= leer.nextInt();
					suma= num1+num2 ;
					System.out.println("el resultado de la suma de nos 2 N° seria = " + suma);
					break;
				case 2:
					System.out.println("ingrese 2 numeros positivos");
					 num1= leer.nextInt();  num2= leer.nextInt();
					resta= num1-num2 ;
					System.out.println("el resultado de la resta de nos 2 N° seria = " + resta);
					break;
				case 3:
					System.out.println("ingrese 2 numeros positivos");
					 num1= leer.nextInt();  num2= leer.nextInt();
					multi= num1*num2 ;
					System.out.println("el resultado de la multiplicacion de nos 2 N° seria = " + multi);
					break;
				case 4:
					System.out.println("ingrese 2 numeros positivos");
					 num1= leer.nextInt();  num2= leer.nextInt();
					
					if (num2 != 0) {
						divi= num1/num2;
						System.out.println("el resultado de la division de nos 2 N° seria = " + divi);	
					}else {
						System.out.println("error no se puede divir por 0");
					}
					
					break;
					
				case 5:
					System.out.println("esta seguro q desea salir del programa (s/n)");
					String deci= leer.next();
					if( deci.equals("s")){
						System.out.println("hasta luego");
						return;
				
						
					}
					/*
					 * La sentencia default se utiliza en la estructura de control switch.
					 *  Se coloca al final del bloque de case y maneja los valores que
					 *   no se han manejado explícitamente por ninguna de las sentencias case anteriores.
					 */
					default: 
						System.out.println(" Opcion no valida, gil, vuelva a intentar.");
						
				
					
				}
			}while (true);
			/* La sentencia while(condicion) en Java se utiliza para crear un 
			 * bucle que se ejecuta mientras una condición sea verdadera
			 * En el caso de while (true), la condición es simplemente la constante booleana true.
			 *  Esto significa que el bucle se ejecutará indefinidamente,
			 *   ya que true siempre es verdadero. 
			 */
		}
	}
}
				
		