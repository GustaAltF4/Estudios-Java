package cC;

public class EjemploString {

	public static void main(String[] args) {
		//ASIGNACION 
		String nombre1= "LEANDRO";
		String nombre2= "PABLO";
		String nombre3= "LEANDRO";
		String APELLIDO= " SPADARO ";
		
		//METODO EQUALS - RETORNA VERDADERO SI LA CADENA ES IGUAL AL OBJETO DEL PARAMETRO
		if (nombre1.equals("LEANDRO")) {
			System.out.println("NOMBRE ES IGUAL A : "+ nombre1);
		}
		if (nombre1.equals(nombre2)){
			System.out.println("nombre1 es igual a nombre2");
		}else {
			System.out.println("nombre1 no es igual a nombre2");
		}
		
		if (nombre1.equals(nombre3)) {
			System.out.println("nombre1 es igual a nombre3");
		}else {
			System.out.println("nombre1 no es igual a nombre3");
		}
		
		//METODO LENGTH- RETORNA LA LOGITUD DE LA CADENA
		int longitud= nombre1.length();
		System.out.println("Longitud de la cadena : "+ longitud);
		
		// METODO SUBSTRING- RETORNA LA SUB CADENA DESDE EL CARACTER DEL PRIMER PARAMETRO HASTA EL CARACTER DEL SEGUNDO PARAMETRO
		
		String parte= nombre1.substring(0,3);
		System.out.println("nombre completo: "+ nombre1);
		System.out.println("parte del nombre: "+ parte);
		
		// METODO VALUEOF- CONVIERTE EN CADENA EL DATO DEL PARAMETRO
		
		int valorEDAD=10;
		String edad= String.valueOf(valorEDAD);
		System.out.println("la edad es : "+ edad);
		
		// METODO TRIM - SACA LOS ESPACIOS EN BLANCO EN LOS EXTREMOS DE LA CADENA
		
		System.out.println("Apellido con espacio "+APELLIDO);
		APELLIDO= APELLIDO.trim();
		System.out.println("apellido sin espacio "+ APELLIDO);
		
		//METODO TOLOWERCASE- RETORNA LA CADENA EN MINUSCULAS
		
		System.out.println("cadena en mayusculas "+ nombre1);
		String nombreEnMinuscula= nombre1.toLowerCase();
		System.out.println("cadena en minuscula "+ nombreEnMinuscula);
		
		// METODO  TOUPPERCASE- RETORNA LA CADENA EN MAYUSCULAS
		String nombre4= "santiago";
		System.out.println("cadena en minuscula "+ nombre4);
		String nombreEnMayus= nombre4.toUpperCase();
		System.out.println("cadena en mayuscula "+ nombreEnMayus);
		
		//METODO INDEXOF- RETORNA EL INDICE DE LA PRIMERA OCURRENCIA DE LA CADENA DEL PARAMETRO
		
		String nombreYapellido= "LEANDRO SPADARO";
		int posicion= nombreYapellido.indexOf("E");
		System.out.println("posicion de la letra e: "+ posicion);
		posicion= nombreYapellido.indexOf("O");// primera q se encuentra
		System.out.println("posicion de la letra o: "+ posicion);
		posicion= nombreYapellido.indexOf("Z");//devuelve -1 osea no existe
		System.out.println("posicion de la letra z: "+ posicion);
		
	}

}
