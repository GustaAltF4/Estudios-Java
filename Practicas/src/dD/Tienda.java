package dD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Tienda {

	// ATAJO DE TECLADO PARA CREAR METODO MAIN
	// 'MAIN' CTRL+ ESPACIO
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		HashMap<String, Double> listaProductos = new HashMap<>();
		// Como, introducir un elemento, modificar su
		// precio, eliminar un producto y mostrar los productos que tenemos con su
		// precio
		int eleccion;
		do {
			mostrarMenu();
			eleccion = leer.nextInt();
			leer.nextLine();
			switch (eleccion) {
			case 1:

				agregarProducto(leer, listaProductos);
				break;
			case 2:
				modificarPrecio(leer, listaProductos);
				break;
			case 3:
				eliminarProd(leer, listaProductos);
				break;
			case 4:
				mostrarProd( listaProductos);
				break;

			case 5:
				System.out.println("gracias por utilizar");
				break;
			default:
				System.out.println("Caracter no valido...");
				break;

			}

		} while (eleccion != 5);
		leer.close();
	}
	
	 private static void mostrarMenu() {
	        System.out.println("_____MENU_____");
	        System.out.println("1- Introducir producto");
	        System.out.println("2- Modificar precio de un producto");
	        System.out.println("3- Eliminar un producto");
	        System.out.println("4- Mostrar productos en stock");
	        System.out.println("5- Salir");
	        
	    }
	 private static void agregarProducto(Scanner leer, HashMap<String, Double> listaProductos) {
		 while (true) {
				System.out.println("____AGREGAR PRODUCTOS____");
				System.out.println("ingrese nombre del producto");
				String nombreProd = leer.next().toUpperCase();
				System.out.println("ingrese precio del producto");
				double precioProd = leer.nextDouble();
				
				if (nombreProd.isEmpty()) {
					System.out.println("Nombre de producto no válido. Inténtelo de nuevo.");
	                continue;
				}
				
				listaProductos.put(nombreProd, precioProd);
				System.out.println("Producto agregado correctamente...");
				System.out.println("desea agregar otro porducto? (si/no)");
				String siono = leer.next();
				if (!siono.equalsIgnoreCase("si")) {
					break;
				}
				

			}
	 }
	 
	 private static void modificarPrecio(Scanner leer, HashMap<String, Double> listaProductos) {
		 System.out.println("____MODIFICAR PRECIO____");
			System.out.println("ingrese nombre del producto");
			String nombreProd = leer.next().toUpperCase();
			
			 if (!listaProductos.containsKey(nombreProd)) {
		            System.out.println("El producto no existe en la lista.");
		            return;
		        }
			 
			System.out.println("ingrese el nuevo precio del producto");
			double precioReplace = leer.nextDouble();

//				listaProductos.computeIfPresent(nombreProd,(key, value) -> precioReplace );
			listaProductos.replace(nombreProd, precioReplace);

			System.out.println("Precio actualizado...");
		 
	 }
	 
	 private static void eliminarProd (Scanner leer, HashMap<String, Double> listaProductos) {
		 System.out.println("____ELIMINAR PRODUCTO____");
			System.out.println("ingrese nombre del producto");
			String ProdEliminar = leer.next().toUpperCase();
			
			if (!listaProductos.containsKey(ProdEliminar)) {
		            System.out.println("El producto no existe en la lista.");
		            return;
		        }
			
			listaProductos.remove(ProdEliminar);

			System.out.println("Producto eliminado...");
	 }

	 private static void mostrarProd ( HashMap<String, Double> listaProductos) {
		 System.out.println("mostrando lista de productos...");
		
		 if(listaProductos.isEmpty()) {
			 System.out.println("No hay productos en la lista...");
			 return;
		 }
		 
		 System.out.println("____LISTA DE PRODUCTOS____");

			
		 for (Map.Entry<String, Double> aux : listaProductos.entrySet()) {
				String key = aux.getKey();
				Double val = aux.getValue();

				System.out.println("Proucto: ||" + key + "|| Precio: " + val);

			}
	 }
}

