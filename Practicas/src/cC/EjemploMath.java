package cC;

public class EjemploMath {

	public static void main(String[] args) {

		// metodo: abs - Retorna el numero absoluto del parametro double
		double valorAbsoluto = Math.abs(-2.3);
		System.out.println("Valor absoluto: " + valorAbsoluto);

		// metodo: sin - Retorna el seno del angulo del parametro
		double seno = Math.sin(0.5);
		System.out.println("Seno: " + seno);

		// metodo cos - Retona el coseno del angulo del parametro
		double coseno = Math.cos(0.5);
		System.out.println("Coseno: " + coseno);

		// metodo tan - retorna la tangente del angulo del parametro
		double tangente = Math.tan(0.5);
		System.out.println("Tangente: " + tangente);

		// metodo log - retorna el logaritmo natural del valor del parametro
		double logaritmo = Math.log(2.7172);
		System.out.println("Logaritmo: " + logaritmo);

		// metodo pow - retorna la potencia del primer parametro elevado al segundo
		// parametro
		double potencia = Math.pow(2.3, 1.0);
		System.out.println("Potencia: " + potencia);

		// metodo round - retorna el numero long mas cercano del parametro double
		double redondeo = Math.round(2.5);
		System.out.println("Redondeo: " + redondeo);

		// metodo random - retorna un numero double aleatorio entre 0.0 y 1.0
		double aleatorio = Math.random();
		System.out.println("Aleatorio: " + aleatorio);

		// -max retona el maximo entre 2 valores
		// -min retnona el minimo entrre 2 valores
		double num1 = 100;
		double num2 = 88;
		double max = Math.max(num2, num1);
		double min = Math.min(num2, num1);
		System.out.println("numero mas grende: " + max);
		System.out.println("numero mas pequeño: " + min);

	}
}
