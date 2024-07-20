package dD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pelicula {
	private String titulo;
	private String director;
	private Integer duracionEnHS;

	public Pelicula() {
	}

	public Pelicula(String titulo, String director, Integer duracionEnHS) {
		this.titulo = titulo;
		this.director = director;
		this.duracionEnHS = duracionEnHS;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getDuracionEnHS() {
		return duracionEnHS;
	}

	public void setDuracionEnHS(Integer duracionEnHS) {
		this.duracionEnHS = duracionEnHS;
	}

	// COMPARATOR Q ORDENA DE MENOR A MAYOR LA DURACION EN HS
	// NO HICE EL OPUESTO DE MAYOR A MENOR PORQ USO EL METODO collections.reverse()
	public static Comparator<Pelicula> ordenarPorDuracion_menor_aM = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula o1, Pelicula o2) {

			return o1.getDuracionEnHS().compareTo(o2.getDuracionEnHS());
		}
	};
	// COMPARATOR Q ORDENA ALFABETICAMENTE POR TITULO
	public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula o1, Pelicula o2) {

			return o1.getTitulo().compareTo(o2.getTitulo());
		}
	};
	//// COMPARATOR Q ORDENA ALFABETICAMENTE POR DIRECTOR
	public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula o1, Pelicula o2) {

			return o1.getDirector().compareTo(o2.getDirector());
		}
	};

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		List<Pelicula> listaPeliculas = new ArrayList<>();

		while (true) {

			System.out.println("Ingrese el titulo de su pelicula:");
			String titulo = leer.nextLine();

			System.out.println("Ingrese el director de su pelicula:");
			String director = leer.nextLine();

			System.out.println("Ingrese la duracion en Hs de su pelicula:");
			Integer duracion = leer.nextInt();

			leer.nextLine();
			Pelicula peli = new Pelicula(titulo, director, duracion);

			listaPeliculas.add(peli);

			System.out.println("Desea agregar otra pelicula? (si/no): ");
			String respuesta = leer.next();
			leer.nextLine();
			if (!respuesta.equalsIgnoreCase("si")) {
				break;
			}
		}
		System.out.println("_________LISTA DE PELICULAS_________");
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println("||" + pelicula.getTitulo().toUpperCase() + "||");
			System.out.println("Director: " + pelicula.getDirector());
			System.out.println("Duracion: " + pelicula.getDuracionEnHS() + "hs");
		}
		System.out.println("****PELICULAS DE MAS DE 1H****");
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getDuracionEnHS() > 1) {
				System.out.println("||" + pelicula.getTitulo().toUpperCase() + "||");
			}

		}
		System.out.println("_____PELICULAS ORDENADAS DE MENOR A MAYOR POR HS_____");
		// Dependiendo del uso de Collections.sort(), puedes ordenar la lista en
		// orden natural o utilizando un comparador personalizado.
		Collections.sort(listaPeliculas, Pelicula.ordenarPorDuracion_menor_aM);
		for (Pelicula pelicula : listaPeliculas) {
			System.out
					.println("||" + pelicula.getTitulo().toUpperCase() + "|| Duracion: " + pelicula.getDuracionEnHS());
		}
		System.out.println("_____PELICULAS ORDENADAS DE MAYOR A MENOR POR HS_____");
		// El método Collections.reverse() es otra utilidad en la clase Collections de
		// la biblioteca estándar de Java.
		// Este método se utiliza para invertir el orden de los elementos en una lista.
		Collections.reverse(listaPeliculas);
		for (Pelicula pelicula : listaPeliculas) {
			System.out
					.println("||" + pelicula.getTitulo().toUpperCase() + "|| Duracion: " + pelicula.getDuracionEnHS());
		}

		System.out.println("_____PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO_____");
		Collections.sort(listaPeliculas, Pelicula.ordenarPorTitulo);
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println("||" + pelicula.getTitulo().toUpperCase() + "||");
		}

		System.out.println("_____PELICULAS ORDENADAS ALFABETICAMENTE POR DIRECTOR_____");
		Collections.sort(listaPeliculas, Pelicula.ordenarPorDirector);
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println("||" + pelicula.getTitulo().toUpperCase() + "|| Director: " + pelicula.getDirector());
		}
		leer.close();
	}
}
