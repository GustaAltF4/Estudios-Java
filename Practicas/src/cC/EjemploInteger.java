package cC;

public class EjemploInteger {

	public static void main(String[] args) {
		//construcctores
		@SuppressWarnings("removal")
		Integer entero1= new Integer("25");
		@SuppressWarnings("removal")
		Integer entero2= new Integer(50);
		//Integer entero3= 10;
		
		//OPERACIONES CON OBJETOS DE CLASE INTEGER
		Integer resultado= entero1+ entero2;
		System.out.println("la suma de entero1 y entero2 es: "+ resultado);
		
		//METODO COMPARETO- COMPARA 2 OBJETOS INTEGER NUMERICAMENTE
		if (entero1.compareTo(entero2)> 0) {
			System.out.println("los valores enteros son iguales");
			
		}else {
			System.out.println("los valores enteros son distintos");
			
		}
		
		//METODO INTVALUE()-RETORNA EL VALOR DEL INTEGER EN UN TIPO PRIMITIVO INT
		int enteroPrimitivo1= entero1.intValue();
		System.out.println("el valor enterlo primitivo1 es: "+ enteroPrimitivo1);
		int enteroPrimitivo2= entero2.intValue();
		System.out.println("el valor enterlo primitivo2 es: "+ enteroPrimitivo2);
		
		//METODO TOSTRING-  RETORNA EL VALOR DEL INTEGER EN UNA CADENA DE CARACTERES
		
		String cadena= entero1.toString();
		System.out.println("el valor de entero primitivo 1 es: "+ cadena);
		
		//METODO VALUEOF()- REOTORNA LA CADENA DEL PARAMETRO EN UN  OBJETO INTEGER
		int entero= Integer.valueOf("3");
		System.out.println("el valor del entero es: "+ entero);
	

	}

}
