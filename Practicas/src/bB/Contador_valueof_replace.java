package bB;



public class Contador_valueof_replace {

	public static void main(String[] args) {
		/*
		 * Tres bucles for anidados para iterar a través de cada 
		 * posición del número (cientos, decenas y unidades).
		 */
		
		
		
		for (int i=0; i <=9 ; i++) {
			/*
			 * En Java, el método String.valueOf() es una forma conveniente
			 *  de convertir diferentes tipos de datos a su representación
			 *   de cadena (String). Este método está sobrecargado para diferentes 
			 *   tipos primitivos y objetos, lo que permite convertir fácilmente 
			 *   valores como enteros, caracteres, booleanos, arrays y objetos a String.
			 */
	
				String e1= String.valueOf(i);
				String mod1= e1.replace("3", "E");
				for (int j=0; j <=9 ; j++) {
		/*
		 * El método .replace() en Java es utilizado para reemplazar caracteres 
		 * o secuencias de caracteres en una cadena. Este método es parte de la clase
		 *  String y está sobrecargado para aceptar dos tipos de 
		 *  parámetros: caracteres (char) y cadenas (String).
		 */
					
					String e2= String.valueOf(j);
					String mod2= e2.replace("3", "E");
					for (int k=0; k <=9 ; k++) {
						
						String e3= String.valueOf(k);
						String mod3= e3.replace("3", "E");
						System.out.println(mod1+"-"+mod2+"-"+ mod3);
					}
				}
		}
	}
}
		

					
				
	
