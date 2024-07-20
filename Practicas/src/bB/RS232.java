package bB;

import java.util.Scanner;

public class RS232 {

	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
			int Correctas = 0 ;
			int inCorrectas = 0 ;
			System.out.println("Formato fijo: pimer caracter (X) , ultimo (O), maximo 5 caracteres de largo");
			System.out.println("Finalizar secuencia FDE (&&&&&)");
			while(true) {
				
				String cadenas= leer.nextLine();
				
				String Lx= cadenas.substring(0,1);
				String Lo= cadenas.substring(4,5);
				
					
				if (cadenas.length()==5 && Lx.equals("X") && Lo.equals("O")) {	
					
					Correctas++;
					
				}else if (cadenas.equals("&&&&&")) {
					
					break;//break corta con el while(true)
					//sino no se puede seguir porq la expresion se hace infinita
					
				}
				else {
					
					inCorrectas++;
					
				}
			}
			System.out.println("INFORME ");	
			System.out.println("Cantidad de secuencias correctas; "+ Correctas);
			System.out.println("Cantidad de secuencias incorrectas; "+ inCorrectas);
		}
		
	}

}
