package main;

import java.util.ArrayList;
import java.util.List;

import main.entidades.Hotel;
import main.entidades.Hotel1;
import main.entidades.Hotel2;
import main.entidades.Hotel3;
import main.entidades.Hotel4;
import main.entidades.Hotel5;

public class MainHerencia {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Hotel> hoteles = new ArrayList<>();

		Hotel1 h1 = new Hotel1(1500d, 9d, 10);
		Hotel2 h2 = new Hotel2(2500d, 12d, 15);
		Hotel3 h3 = new Hotel3(3500d, 15d, 20);
		Hotel4 h4 = new Hotel4(5000d, 20d, 30);
		Hotel5 h5 = new Hotel5(10000d, 30d, 50);

		hoteles.add(h1);
		hoteles.add(h2);
		hoteles.add(h3);
		hoteles.add(h4);
		hoteles.add(h5);
	
		for (Hotel aux : hoteles) {
//			*aux instanceof Hotel5 comprueba si aux
//			es una instancia de Hotel5 antes de realizar la conversión
//			*instanceof se usa para verificar si un objeto 
//			es una instancia de una clase o interfaz específica.
			if (aux instanceof Hotel5) {
				
				Hotel5 object = (Hotel5) aux;
				System.out.println("Soy el Hotel 5");
				continue;
				/*
				 * al ser hotel 5 el ultimo de los heredados de la clase java lo toma como q es
				 * de la del tipo hotel12345 entonces se le agrega continue para q continue
				 * directamente a la siguiente iteracion
				 */
			}

			if (aux instanceof Hotel4) {
				Hotel4 object = (Hotel4) aux;
				System.out.println("Soy el Hotel 4");
				continue;
			}

			if (aux instanceof Hotel3) {
				Hotel3 object = (Hotel3) aux;
				System.out.println("Soy el Hotel 3");
				continue;
			}

			if (aux instanceof Hotel2) {
				Hotel2 object = (Hotel2) aux;
				System.out.println("Soy el Hotel 2");
				continue;
			}

			if (aux instanceof Hotel1) {
				Hotel1 object = (Hotel1) aux;
				System.out.println("Soy el Hotel 1");
				continue;
			}

		}

	}

}
