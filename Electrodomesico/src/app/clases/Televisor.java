package app.clases;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {

	private Integer resolucionEnPulg;
	private boolean sintonizadorTDT;

	// constructor vacio
	public Televisor() {
		super(); // Llama al constructor vacío de la clase padre Electrodomestico
		this.resolucionEnPulg = 20; // Resolución base para inicializar
		this.sintonizadorTDT = false; // Sin sintonizador TDT por defecto
	}

	// constructor con propios y heredados
	public Televisor(double precio, String color, char consumoEnergetico, Integer peso, Integer resolucionEnPulg,
			boolean sintonizadorTDT) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucionEnPulg = resolucionEnPulg;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// GET y SET
	public Integer getResolucionEnPulg() {
		return resolucionEnPulg;
	}

	public void setResolucionEnPulg(Integer resolucionEnPulg) {
		this.resolucionEnPulg = resolucionEnPulg;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// metodo crearTelevision
	public void crearTelevision() {

		crearElectrodomestico();
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);

		System.out.println("ingrese RESOLUCION (en pulgadas)");
		int resoluciion = leer.nextInt();
		setResolucionEnPulg(resoluciion);

		System.out.println("ingrese si tiene sintonizador TDT (si/no)");
		String respuesta = leer.next();

		setSintonizadorTDT(respuesta.equalsIgnoreCase("si"));

	}

	// metodo precioFinal
	@Override
	public double precioFinal() {
		double preciofinal = super.precioFinal();

		// suma del 30% si es mayor a 40 pulgadas
		if (getResolucionEnPulg() > 40) {

			preciofinal *= 1.3;

		}

		// suma si tiene TDT
		if (isSintonizadorTDT()) {
			preciofinal += 500;
		}
		return preciofinal;
	}

	@Override
	public String toString() {
		return "Televisor [" + (resolucionEnPulg != null ? "resolucionEnPulg=" + resolucionEnPulg + ", " : "")
				+ "sintonizadorTDT=" + sintonizadorTDT + ", precio=" + precio + ", "
				+ (color != null ? "color=" + color + ", " : "") + "consumoEnergetico=" + consumoEnergetico + ", "
				+ (peso != null ? "peso=" + peso : "") + "]";
	}

}
