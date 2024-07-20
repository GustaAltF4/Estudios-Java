package adopcionPerro;

import adopcionPerro.Enum.Razas;
import adopcionPerro.clases.Perro;
import adopcionPerro.clases.Persona;

public class AppMain {
	
	
	
	public static void main(String[] args) {
		
		Persona h1= new Persona("Mugriento", "Intenso", 33, 41418198);
		Persona h2= new Persona("Basura", "Olorosa", 21 , 42307058 );
		
		Perro p1= new Perro("Peque",Razas.PICHICHO, 4, 12);
		Perro p2= new Perro("Osa", Razas.CANICHE,2,10);
		
		h1.setPerros(p2);
		h2.setPerros(p1);
		
		System.out.println(h1.toString());
		System.out.println(" ");
		System.out.println(h2.toString());
		
		
		
	}

}
