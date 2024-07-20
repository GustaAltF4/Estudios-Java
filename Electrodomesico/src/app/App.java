package app;

import java.util.ArrayList;
import java.util.List;

import app.clases.Electrodomestico;
import app.clases.Lavadora;
import app.clases.Televisor;

public class App {

	public static void main(String[] args) {

////		  Crear una Lavadora y un Televisor
//        Lavadora lavadora = new Lavadora();
//        Televisor televisor = new Televisor();
////        Lavadora lavadora = new Lavadora(1000,"negro",'a',30,30);
////        Televisor televisor = new Televisor(1000,"negro",'a',20,40,true);
//
//        // Llenar la información de cada electrodoméstico desde el usuario
//        System.out.println("Llenando información de la Lavadora:");
//        lavadora.crearLavadora();
//
//        System.out.println("\nLlenando información del Televisor:");
//        televisor.crearTelevision();
//
//        // Mostrar el precio final de cada electrodoméstico
//        System.out.println("\nPrecio final de la Lavadora: $" + lavadora.precioFinal());
//        System.out.println(lavadora.toString());
//        System.out.println("Precio final del Televisor: $" + televisor.precioFinal());
//        System.out.println(televisor.toString());
//        
		Lavadora lava1 = new Lavadora(2000, "asdasd", 'a', 30, 30);
		Televisor tv1 = new Televisor(2000, "negro", 'd', 20, 40, true);
		Lavadora lava2 = new Lavadora(2000, "gris", 'a', 40, 50);
		Televisor tv2 = new Televisor(2000, "rojo", 'b', 40, 80, true);

		List<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		listaElectrodomesticos.add(tv1);
		listaElectrodomesticos.add(tv2);
		listaElectrodomesticos.add(lava1);
		listaElectrodomesticos.add(lava2);

		for (Electrodomestico elect : listaElectrodomesticos) {
			System.out.println(elect);
			System.out.println("precio Final: " + elect.precioFinal());

		}
		System.out.println("PRECIO TOTAL DE TODOS LOS ELECTRODOMESTICOS DE LA LISTA");
		System.out.println(lava1.precioFinal() + lava2.precioFinal() + tv1.precioFinal() + tv2.precioFinal());

		double totalLavadoras = 0;
		double totalTelevisores = 0;
		double totalElectrodomesticos = 0;

		// FOROMA DE HACERLO DE LA IA
		// Recorrer el ArrayList y ejecutar el método precioFinal() en cada
		// electrodoméstico
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			double precioFinal = electrodomestico.precioFinal();
			totalElectrodomesticos += precioFinal;

			if (electrodomestico instanceof Lavadora) {
				totalLavadoras += precioFinal;
			} else if (electrodomestico instanceof Televisor) {
				totalTelevisores += precioFinal;
			}
		}

		// Mostrar los precios finales
		System.out.println("Precio total de Lavadoras: $" + totalLavadoras);
		System.out.println("Precio total de Televisores: $" + totalTelevisores);
		System.out.println("Precio total de todos los Electrodomésticos: $" + totalElectrodomesticos);

	}

}
