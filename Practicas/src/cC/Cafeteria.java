package cC;

import java.util.Scanner;

public class Cafeteria {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafeteria() {
	}

	public Cafeteria(int capadicadadMaxima, int cantidadActual) {
		this.capacidadMaxima = capadicadadMaxima;
		this.cantidadActual = cantidadActual;
	}

	// GET SET
	public int getCapadicadadMaxima() {
		return capacidadMaxima;
	}

	public void setCapadicadadMaxima(int capadicadadMaxima) {
		this.capacidadMaxima = capadicadadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	// METODO LLENAR CAFETERIA

	public void llenarCafeteria() {
		cantidadActual += capacidadMaxima;

	}

	// METODO SERVIR TAZA

	public void servirTaza() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el tamaño de su taza vacia");
		int tazaVacia = leer.nextInt();
		System.out.println("sirviendo...");
		if (cantidadActual >= tazaVacia) {
			cantidadActual -= tazaVacia;
			System.out.println("se lleno la taza.");

		} else {

			System.out.println("no se lleno la taza completamente, quedo con " + cantidadActual);
		}
		leer.close();
	}

// METODO VACIAR CAFETERA
	public void vaciarCafetera() {
		cantidadActual = 0;
	}

// METODO AGREGAR CAFE
	public void agregarCafe(int cantidadC) {
		cantidadActual += cantidadC;
	}

	public static void main(String[] args) {
		Cafeteria cafe1 = new Cafeteria(800, 200);

		cafe1.agregarCafe(300);
		cafe1.vaciarCafetera();
		cafe1.llenarCafeteria();
		cafe1.servirTaza();
	}

}
