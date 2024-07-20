package main.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
	public List<Carta> cartas;
	public List<Carta> monton;
	public int[] num = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
	public String[] pal = { "Espadas", "Bastos", "Oros", "Copas" };

	public Baraja() {
		prepararBaraja();
		// ESTE METODO NO ERA TAN NECESARIO PODRIA SIMPLEMENTE HABER
		// PUESTO TODA LA LOGICA DENTRO DEL CONSTRUCCTOR Y ASI DIRECTAMENTE
		// LA BARAJA SE PREPARABA CUANDO ERA CREADA PERO ES BASICAMENTE LO MISMO
	}

	public void prepararBaraja() {
		cartas = new ArrayList<>();
		for (String palo : pal) {
			for (int numero : num) {
				cartas.add(new Carta(numero, palo));
			}

		}
		monton = new ArrayList<>();

	}

	public void barajar() {
		Collections.shuffle(cartas);
	}

	public void cartasDisponibles() {
		System.out.println(cartas.size());
	}

	public void darCartas(int cantidadCartas) {

		if (cantidadCartas <= 0) {
			System.out.println("La cantidad de cartas debe ser mayor a 0.");
			return;
		}

		if (cantidadCartas > cartas.size()) {
			System.out.println("No hay suficientes cartas en la baraja.");
			return;
		}

		for (int i = 0; i < cantidadCartas; i++) {
			Carta aMover = cartas.remove(0);
			monton.add(aMover);

		}
	}

	public void siguienteCarta() {
//		Carta aMover= cartas.remove(0);
		Carta aMover = cartas.removeFirst();
		monton.add(aMover);
	}

	public void cartasMonton() {
		if (monton.isEmpty()) {
			System.out.println("No hay cartas en el monton");

		} else {
			System.out.println("CARTAS EN EL MOTON");
			for (Carta sacadas : monton) {
				System.out.println(sacadas);

			}

		}
	}

	public void mostrarBaraja() {
		if (cartas.isEmpty()) {
			System.out.println("No hay mas cartas en la baraja");

		} else {
			System.out.println("CARTAS EN LA BARAJA");
			for (Carta carta : cartas) {
				System.out.println(carta);
			}
		}

	}
}
