package mascotAPP1.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import mascotAPP1.entidades.Mascota;
@SuppressWarnings("rawtypes")
public class ServicioMascota {
	// el usedelimiter() se usa para
	// especificar q delimitador se usa
	// al leer datos y el ("\n") indica q se lee
	// hasta q se pulse enter osea haya una nueva linea
	@SuppressWarnings("unused")
	private Scanner leer;
	//importar automaticamente crtl+shift + O

	private ArrayList<Mascota> mascotas;

	public ServicioMascota() {
		this.leer = new Scanner(System.in).useDelimiter("\n");
		this.mascotas = new ArrayList<>();
	}
//
//	public Mascota crearMascota() {
//		System.out.println("introducir nombre");
//		String nombre = leer.next();
//
//		System.out.println("introducir apodo");
//		String apodo = leer.next();
//
//		System.out.println("introducir tipo");
//		String tipo = leer.next();
//		
////		Mascota m = new Mascota(nombre, apodo, tipo);
////		
////		mascotas.add(m);
////
////		return m;

//	}

	public void mostrarMascotas() {

		System.out.println("las mascostas actules de la lista son: ");
		for (Mascota aux : mascotas) {
			System.out.print(aux.toString());
		}
		System.out.println("cantidad: " + mascotas.size());

	}
	
	public void agregarMascota(Mascota m) {
		mascotas.add(m);
	}
	/**
	 * 
	 * @param cantidad 
	 * cantidad de equivale a la cnatidad de mascotas a crear y añadir
	 * a la lista
	 */
	
	public void fabricaChiquitos(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			
//			Mascota aux= new Mascota("Fer","Chiquito","bosta");
			
//			mascotas.add(aux);
			
			//otra forma mas corta
			//mascotas.add(new Mascota("Fer","Chiquito","bosta"));
		}
		
	}
	
	/**
	 * crea mascotas pidiendo por teclado
	 */
//	public void fabricaMascosta(int cantidad) {
//		
//		for (int i = 0; i < cantidad; i++) {
////			Mascota mascostaCreada= crearMascota();
////			
//			//agregarMascota(mascostaCreada);
//			
//			System.out.println(mascostaCreada.toString());
//		}
//		
//	}
//	
	
//	public void actualizarMascotta(int index) {
//		Mascota m= mascotas.get(index);
//		m.setApodo("Roberto");
//	}
	
//	public void actualizarMascosta(int index) {
//		Mascota m = crearMascota();
//		
//		mascotas.set(index, m);
//	}
//	
	public void eliminarMascota(int index) {
		mascotas.remove(index);
	}
	
//	public void eliminarMascotaPorNombre(String nombre) {
//		for (int i = 0; i < mascotas.size(); i++) {
//			Mascota m= mascotas.get(i) ;
//			if (m.getNombre().equals(nombre)) {
//				mascotas.remove(i);
//			}
//		}
//	}
//	
//	public void actualizarMascotaPorNombre(String nombreAnterior, String nombreNuevo) {
//		for (int i = 0; i < mascotas.size(); i++) {
//			Mascota m= mascotas.get(i) ;
//			if (m.getNombre().equals(nombreAnterior)) {
//				m.setNombre(nombreNuevo);
//			}
//		}

//	}
}




