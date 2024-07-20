package animales;

import animales.entidades.Gato;
import animales.entidades.Perro;

public class App {
	
	public static void main(String[] args) {
		
		//si instaciara como animal osea Animal g= new gato()
		// los metodos propios de la clase gato darian error
		Gato g= new Gato(4,true,5,1000d,"SiamesGris");
		Perro p= new Perro(4, true, 13, 1000d, "Pichichu");
		
		g.calcularEdad();
		g.hacerRuido();
		//metodo propio de gato
		g.ronronear();
		
		System.out.println("_____________________________________");
		
		p.calcularEdad();
		p.hacerRuido();
		//metodo propio de perro
		p.juegarEnParque(4);
		
	}

}
