package app.clases;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

	private double carga;

	// contructor vacio
	public Lavadora() {
		super(); // Llama al constructor vacío de la clase padre Electrodomestico
		this.carga = 5; // Carga base para inicializar
	}

	// constructor con propios y heredados
	public Lavadora(double precio, String color, char consumoEnergetico, Integer peso, double carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	// GET y SET
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	// metodo crearLavadora
	public void crearLavadora() {

		crearElectrodomestico();
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la carga de su lavadora en kg");
		double carga = leer.nextDouble();
		setCarga(carga);

	}

	// metodo precioFinal
	@Override
	public double precioFinal() {
		double preciofinal = super.precioFinal();
		if (getCarga() > 30) {
			preciofinal += 500;
		}
		return preciofinal;

	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio=" + precio + ", " + (color != null ? "color=" + color + ", " : "")
				+ "consumoEnergetico=" + consumoEnergetico + ", " + (peso != null ? "peso=" + peso : "") + "]";
	}

}
