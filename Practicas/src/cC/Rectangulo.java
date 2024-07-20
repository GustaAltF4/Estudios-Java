package cC;

import java.util.Scanner;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {

	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void datrosRectangulo() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la base del ractangulo");
		int base = leer.nextInt();
		this.base = base;
		System.out.println("ingrese la altura del rectangulo");
		int altura = leer.nextInt();
		this.altura = altura;
		leer.close();
	}

	public int superficie() {
		return base * altura;

	}

	public int perimetro() {
		return (base + altura) * 2;
	}

	public void dibujarREC() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

	public void dubujarRECvacio() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
					System.out.print("* ");
				} else {

					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", superficie()=" + superficie() + ", perimetro()="
				+ perimetro() + "]";
	}

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();

		r1.datrosRectangulo();
		System.out.println(r1);
		r1.dibujarREC();
		System.out.println("Otro Dibujo");
		System.out.println("___________________________________________");
		r1.dubujarRECvacio();

	}

}
