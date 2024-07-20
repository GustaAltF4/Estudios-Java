package cC;


import java.util.Scanner;

public class CadenaEJ_char_String {
	private String frase;
	private int suLongitud;

	public CadenaEJ_char_String() {
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getSuLongitud() {
		return suLongitud;
	}

	public void setSuLongitud(int suLongitud) {

		this.suLongitud = suLongitud;
	}

	public int mostrarVocales() {
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			// CHAR ES UN TIPO DE DARO Q SE UTILIZA PARA ALMACENAR UN UNICO CARACTER
			char letra = Character.toLowerCase(frase.charAt(i));
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				// LAS COMILLAS DOBLES " " SE USAN PARA CADENAS DE TEXTO STRING
				// Y LAS COMILLAS SIMPLES ' ' SE USAN OARA CARACTERES INDIVIDUALES CHAR
				contador++;
			}

		}
		return contador;
	}

	public String invertirFrase() {
		String inversion = "";

		// Se utiliza un bucle for que comienza en el último carácter
		// de la frase original (frase.length() - 1)
		// y se mueve hacia atrás (i--)
		// hasta llegar al primer carácter.
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			inversion += frase.charAt(i);

		}
		return inversion;
	}

	public int vecesRepetido(char letra) {
		int contadorCHAR = 0;
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == letra) {
				contadorCHAR++;

			}

		}
		return contadorCHAR;
	}

	public boolean compararLongitud(String frase2) {
		return suLongitud == frase2.length();
	}

	public void unirFrases(String frase2) {
		frase2 += frase;
		System.out.println(frase2);
	}

	public String unirFrases2(String frase2) {
		return frase + " " + frase2;
	}

	public String reemplazar(char letra) {
		// El método .replace en Java es una función
		// de la clase String que se utiliza
		// para reemplazar todas las ocurrencias de
		// un carácter o una secuencia de caracteres
		// en una cadena por otro carácter o
		// secuencia de caracteres
		return frase.replace('a', letra);

	}

	public boolean contine(String c) {
		// El método .contains en Java es una función
		// de la clase String que se utiliza para verificar
		// si una cadena contiene una secuencia de caracteres
		// específica.
		if (frase.contains(c)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese una frase");
		String frase1 = leer.nextLine();
		CadenaEJ_char_String c1 = new CadenaEJ_char_String();
		c1.setFrase(frase1);
		c1.setSuLongitud(frase1.length());

		c1.unirFrases("cacaas ");
		c1.unirFrases2("cacona");
		System.out.println(c1.unirFrases2("cacona"));
		System.out.println(c1.reemplazar('j'));
		System.out.println("la frase contiene s?" + c1.contine("s"));
		System.out.println("misma longitud?" + c1.compararLongitud("cacona con caca"));
		System.out.println(c1.invertirFrase());
		System.out.println("cantidad de vocales: " + c1.mostrarVocales());
	}
}
