package fF;

import java.util.ArrayList;
import java.util.List;

public class EjemploTRY {

	public static void main(String[] args) {

		// ejemplo try
		try {
			// Se intenta hacer la división

			@SuppressWarnings("unused")
			int division = 10 / 0;
		} catch (ArithmeticException a) {
			// Si la división falla el programa va al bloque catch y se ejecuta el
			// System.out.println
			System.out.println("Error: división por cero");
		} finally {
			// Si el programa hizo la división o no, este System.out.print se va a ejecutar
			// igual
			System.out.println("Saliendo del try");
		}
		// ____________________________________________________________
		// ejemplo try usando la funcion division() throws ArithmeticException
		try {
			// Llamamos a la función, si tira una excepción va al bloque catch y ejecuta el
			// mensaje de error, sino imprime el resultado de la división.
			System.out.println(division());
		} catch (ArithmeticException a) {
			System.out.println("Error: división por cero");
		}
		// ____________________________________________________________
		// ejemplo try usando la funcion agregarNumeroLista() throws Exception
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Integer> lista = new ArrayList();
		try {
			// Llamamos al método dentro de un try/catch para manejar la posible excepción
			agregarNumeroLista(lista, 1);
			agregarNumeroLista(lista, 1);
		} catch (Exception e) {
			// Usamos el metodo getMessage, para obtener el mensaje que pusimos en el throw
			System.out.println(e.getMessage());
		}

	}

	// Tenemos un método que devuelve un resultado y que tira una
	// ArithmeticException
	public static int division() throws ArithmeticException {
		int division = 20 / 0;
		// Hacemos la división, si la división tira una excepción la manejará el
		// try/catch del llamado a la función
		division = 20 / 0;
		// Si tira una excepción el método no va a devolver ningún resultado
		return division;
	}

	// En este método recibimos una lista y un numero para agregar a dicha lista.
	// El método contiene la palabra throws para avisar que este método puede tirar
	// una excepción
	public static void agregarNumeroLista(List<Integer> lista, int numero) throws Exception {
		// Validamos si la lista ya tiene el numero a agregar
		if (lista.contains(numero)) {
			// Si lo tiene tiramos un excepción de tipo Exception, poniéndole un mensaje
			// entre los paréntesis
			throw new Exception("El numero ya está en la lista");
		}
		// Si no contiene el numero, lo agregamos a la lista
		lista.add(numero);
	}
}
