package app.clases;

import java.util.Random;

public class Revolver {
	public Integer posicionTamborActual;
	public Integer posicionBala;

	public Revolver() {
		llenarRevolver();
	}


	
	public void llenarRevolver() {
		Random random= new Random();
		posicionTamborActual= random.nextInt(6)+1;
		//random.nextInt(6) genera un numero aleatorio entre 0 y 5 contando el 0
		// al agregar el +1 simpre suma 1 entonces genera entre 1 y 6 
		posicionBala= random.nextInt(6)+1;
		
	}
	
	public boolean disparar() {
		return posicionBala==posicionTamborActual;
	}
	
	public void siguienteBala() {
		posicionTamborActual= (posicionTamborActual%6)+1;
	}



	@Override
	public String toString() {
		return "Revolver ["
				+ (posicionTamborActual != null ? "posicionTamborActual=" + posicionTamborActual + ", " : "")
				+ (posicionBala != null ? "posicionBala=" + posicionBala : "") + "]";
	}
	
	
	

}
