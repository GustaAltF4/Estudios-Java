package cC;

import java.util.Random;

public class Matemática {
	private double num1;
	private double num2;

	public Matemática() {
	}

	public Matemática(double num1, double num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double delvolverMayor() {
		double mayor= Math.max(num2, num1);
		return mayor;
	}

	public double calcularPotencia() {
		double mayor = Math.max(num2, num1);
		double menor = Math.min(num1, num2);

		mayor = Math.round(mayor);
		menor = Math.round(menor);

		return Math.pow(mayor, menor);
	}

	public double calcularRaiz() {
		double menor = Math.min(num2, num1);
		menor = Math.abs(menor);

		return Math.sqrt(menor);

	}

	@Override
	public String toString() {
		return "Matemática [num1=" + num1 + ", num2=" + num2 + "]";
	}

	public static void main(String[] args) {
		Random ran = new Random();
		Matemática m1 = new Matemática();

		m1.setNum1(ran.nextDouble() * 100);
		m1.setNum2(ran.nextDouble() * 100);
		
		Matemática m2 = new Matemática(Math.random(), Math.random());
		
		

//		m1.setNum1(Math.random());
//		m1.setNum2(Math.random());

		System.out.println(m1);
		System.out.println("devolver Mayor: " + m1.delvolverMayor());
		System.out.println("calculo Potencia: " + m1.calcularPotencia());
		System.out.println("calculo Raiz cuadrada: " + m1.calcularRaiz());
		
		
		System.out.println(m2);
		System.out.println("devolver Mayor: " + m2.delvolverMayor());
		System.out.println("calculo Potencia: " + m2.calcularPotencia());
		System.out.println("calculo Raiz cuadrada: " + m2.calcularRaiz());

	}

}
