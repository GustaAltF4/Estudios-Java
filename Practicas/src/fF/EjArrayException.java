package fF;

public class EjArrayException {
	private int [] numeros;
	
	public EjArrayException(int tamaño) {
		numeros= new int[tamaño];
		// Inicializar el array con algunos valores
		for (int i = 0; i < tamaño; i++) {
			numeros[i]= i*10;
		}
	}
	
	public int obtenerElemnto(int indice) {
		return numeros[indice];
	}

	public static void main(String[] args) {
		/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
		*código para generar y capturar una excepción ArrayIndexOutOfBoundsException 
		*(índice de arreglo fuera de rango).TODO Auto-generated method stub
		*/
		
		// Crear una instancia de MiClase con un array de tamaño 5
		EjArrayException objeto1= new EjArrayException(5);
		
		try {
			 // Intentar acceder a un índice fuera de rango
			int valor = objeto1.obtenerElemnto(10);
			System.out.println("Valor en el indice 10: "+ valor);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error: ArrayIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}
		
	
	}

}
