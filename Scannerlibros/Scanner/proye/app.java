package proye;

import java.util.Scanner;

import proye.ScannerL.Libro;

public class app {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("ingrese el libro q desea cargar");
		System.out.println("en el siguente orden:");
		System.out.println("1-ISBN, 2- Titulo, 3- Autor, 4- numPaginas");
		Libro L1 = new Libro(leer.nextLine(), leer.nextLine(), leer.nextLine(), leer.nextInt());
		System.out.println(L1 + "cargado");
		leer.close();

	}

}
