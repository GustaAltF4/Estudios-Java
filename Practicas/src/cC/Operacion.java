package cC;

import java.util.Scanner;

public class Operacion {
	private double numero1;
	private double numero2;

	public Operacion(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Operacion() {
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void crearOperacion() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese 2 numeros");
		int numero1 = leer.nextInt();
		int numero2 = leer.nextInt();
		this.numero1 = numero1;
		this.numero2 = numero2;
		leer.close();
	}

	public double sumar() {
		return numero1 + numero2;

	}

	public double restar() {
		return numero1 - numero2;

	}

	public double multiplicar() {
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("ERROR");
			return 0;
		} else {
			return numero1 * numero2;
		}

	}

	public double dividir() {
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("ERROR");
			return 0;
		} else {
			return numero1 / numero2;
		}

	}

	public static void main(String[] args) {
		Operacion OP1 = new Operacion();
		OP1.crearOperacion();
		System.out.println("resultado de la suma:  " + OP1.sumar());
		System.out.println("resultado de la resta:  " + OP1.restar());
		System.out.println("resultado de la multiplicacion:  " + OP1.multiplicar());
		System.out.println("resultado de la division:  " + OP1.dividir());

	}

}
