package dD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjArray2B {

	public static void main(String[] args) {
		ArrayList<String> razasPerros = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		String raza;
		while (true) {
			System.out.println("Ingrese una raza de perro o escriba 'salir' para finalizar");
			raza = leer.nextLine();

			// La expresión raza.equalsIgnoreCase("salir") se utiliza en Java para comparar
			// dos cadenas
			// de texto sin tener en cuenta las mayúsculas o minúsculas
			if (raza.equalsIgnoreCase("salir")) {
				break;
			}
			razasPerros.add(raza);
		}
		for (String aux : razasPerros) {
			System.out.println(aux);
		}
		
		
		System.out.println("indique una raza a eliminar ");
		String aEliminar= leer.next();
		
		Iterator<String> it= razasPerros.iterator();
		
		while (it.hasNext()) {
			String aux= it.next();
			
			if(aux.equalsIgnoreCase(aEliminar)) {
				it.remove();
			}else {
				System.out.println("el perro no se encuentra en la lista");
			}
		}
		System.out.println("LISTA ACTUALIZADA");
		for (String aux : razasPerros) {
			System.out.println(aux);
		}
		leer.close();
	}

}
