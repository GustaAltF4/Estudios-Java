package app.clases;

import java.util.Scanner;

public class Electrodomestico {

	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected Integer peso;

	// constructor vacio
	public Electrodomestico() {
		this.precio = 1000; // Precio base según especificación
		this.color = "blanco"; // Color por defecto según especificación
		this.consumoEnergetico = 'F'; // Consumo energético por defecto según especificación
		this.peso = 5; // Peso base para inicializar

	}

	// constructor con todos los atributos
	public Electrodomestico(double precio, String color, char consumoEnergetico, Integer peso) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = comprobarConsumoEnergetico(Character.toUpperCase(consumoEnergetico));
		this.peso = peso;

	}

	// GET y SET
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = comprobarColor(color);
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(Character.toUpperCase(consumoEnergetico));
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	// metodo comprobarConsumoEnergetico
	public char comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			return letra;
		} else {
			return 'F'; // Consumo por defecto según especificación
		}

	}

	// metodo comprobarColor
	public String comprobarColor(String color) {

		String[] coloresDisponibles = { "blanco", "negro", "rojo", "azul", "gris" };

		for (String aux : coloresDisponibles) {
			if (color.equalsIgnoreCase(aux)) {
				return aux;
			}

		}
		return "blanco"; // Por defecto si el color no es válido
	}

	// metodo crearElectrodomestico
	public void crearElectrodomestico() {
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);

		System.out.println("Usted compro uno de nuestros Electrodomesticos");

		System.out.println("ingrese el COLOR del cual eligio el producto");
		String color = leer.next();
		setColor(color);

		System.out.println("ingrese CONSUMO ENERGETICO (letras entre A y F)");

		char consumo = leer.next().toUpperCase().charAt(0);
		setConsumoEnergetico(consumo);

		System.out.println("ingrese el PESO del producto");
		Integer peso = leer.nextInt();
		setPeso(peso);

	}

	// metodo precioFinal
	public double precioFinal() {
		double preciofinal = this.precio;
		// agregar precio por consumo Energetico
		switch (this.consumoEnergetico) {
		case 'A':
			preciofinal += 1000;
			break;
		case 'B':
			preciofinal += 800;
			break;
		case 'C':
			preciofinal += 600;
			break;
		case 'D':
			preciofinal += 500;
			break;
		case 'E':
			preciofinal += 300;
			break;
		case 'F':
			preciofinal += 100;
			break;
		default:
			break;
		}
		// agregar precio por peso

		if (this.peso >= 1 && this.peso <= 19) {
			preciofinal += 100;
		} else if (this.peso >= 20 && this.peso <= 49) {
			preciofinal += 500;
		} else if (this.peso >= 50 && this.peso <= 79) {
			preciofinal += 800;
		} else if (this.peso >= 80) {
			preciofinal += 1000;
		}

		return preciofinal;

	}

}
