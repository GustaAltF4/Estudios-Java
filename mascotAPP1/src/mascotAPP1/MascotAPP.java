package mascotAPP1;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mascotAPP1.entidades.Mascota;
import mascotAPP1.entidades.Usuario;
import mascotAPP1.enumeraciones.SexoHumano;

public class MascotAPP {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) {
		
		Mascota m1= new Mascota<Object>("fer","chiquito", "perro");
		Mascota m2= new Mascota("caca","ca", "perro");
		
		List<Mascota> mascotas= new ArrayList<>();
		
		mascotas.add(m1);
		mascotas.add(m2);

		Usuario u = new Usuario();
		
		u.setApellido("basura");
		u.setSexo(SexoHumano.HOMBRE);
		u.setNacimiento(new Date("01/11/1991"));
		
		u.setMascotaFavorita(m1);
		u.setMascotas(mascotas);
		
		System.out.println(u.toString());
		
		
		
		
		
//		String razaInput = "BEAGLE";
//		
//		for (RazaPerruna aux : RazaPerruna.values()) {
//			System.out.println(aux.ordinal()+" "+ aux.name());
//		}
//		
//		for (RazaPerruna aux : RazaPerruna.values()) {
//			if (aux.toString().equals(razaInput)) {
//				System.out.println("Raza input es igual al enum: "+ aux  );
//			}
//		}
		
		}

	}

