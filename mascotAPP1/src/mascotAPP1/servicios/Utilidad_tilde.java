package mascotAPP1.servicios;

public class Utilidad_tilde {

	public static String borrartilde(String cadena) {

		cadena = cadena.replaceAll("Á", "A");
		cadena = cadena.replaceAll("É", "E");
		cadena = cadena.replaceAll("Í", "I");
		cadena = cadena.replaceAll("Ó", "O");
		cadena = cadena.replaceAll("Ú", "U");
		cadena = cadena.replaceAll("á", "a");
		cadena = cadena.replaceAll("é", "e");
		cadena = cadena.replaceAll("í", "i");
		cadena = cadena.replaceAll("ó", "o");
		cadena = cadena.replaceAll("ú", "u");

		return cadena;

	}

}
