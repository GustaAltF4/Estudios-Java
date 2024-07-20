package appRADIO;

import java.util.Scanner;

import appRADIO.Circunferencia.Circunfe;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el radio");
		Circunfe crearC = new Circunfe(0);
		crearC.setRadio(leer.nextInt());
		System.out.println("El area es= " + crearC.area());
		System.out.println("El perimetro es= " + crearC.perimetro());
		System.out.println(crearC);
		leer.close();

	}

}
