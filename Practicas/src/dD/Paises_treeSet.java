package dD;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Paises_treeSet {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
//		Set<String> paises = new HashSet<>();
		Set<String> paisesLista = new TreeSet<>();

		while (true) {
			System.out.println("ingrese un pais: ");
			String pais = leer.nextLine();

			paisesLista.add(pais);

			System.out.println("desea guardar otro pais? (si/no)");
			String eleccion = leer.next();
			leer.nextLine();
			if (!eleccion.equalsIgnoreCase("si")) {
				break;
			}
		}

		System.out.println("_______LISTA DE PAISES GUARDADOS (ordenados alfabeticamente)_______");
		for (String aux : paisesLista) {
			System.out.println(aux);
		}
//			TAMBIEN SE PODRIA ORDENAR DE ESTA MANERA SI FUERA UN HASHSET
//			PERO COMO ES UN TREESET VIENE ORDENADO DE BASE
//		 // Convertir el HashSet a una lista
//        List<String> listaPaises = new ArrayList<>(paises);
//
//        // Ordenar la lista alfabéticamente
//        Collections.sort(listaPaises);

		System.out.println("si desea eliminar un pais ingrese el nombre sino escriba 'salir'...");
		String paisEliminar = leer.next();
		if (paisEliminar.equalsIgnoreCase("salir")) {
			System.out.println("Gracias por utilizar...");
		} else {
			Iterator<String> it = paisesLista.iterator();

			while (it.hasNext()) {
				String aux = it.next();
				if (aux.equalsIgnoreCase(paisEliminar)) {
					it.remove();
				}
			}
			System.out.println("_______LISTA DE PAISES GUARDADOS ACTUALIZADA_______");
			for (String aux : paisesLista) {
				System.out.println(aux);
			}
			System.out.println("Gracias por utilizar...");
		}

		leer.close();

	}

}
