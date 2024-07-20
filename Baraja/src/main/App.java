package main;

import main.clases.Baraja;

public class App {

	public static void main(String[] args) {

		Baraja bar = new Baraja();
		bar.cartasDisponibles();
		bar.barajar();
		bar.darCartas(40);
//		bar.siguienteCarta();
//		bar.cartasDisponibles();
//		bar.siguienteCarta();
		bar.cartasDisponibles();

		bar.cartasMonton();
		bar.mostrarBaraja();
	}
}
