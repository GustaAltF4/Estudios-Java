package app.clases;

public class Jugador {
	
	
	public int id;
	public String nombre;
	public boolean muerto;
	
	
	
	public Jugador(int id) {
		this.id = id;
		this.nombre = "Jugador " + id;
		this.muerto = false;
	}
	
	public boolean disparo(Revolver r) {
//		r.llenarRevolver();
		
		
		if (r.disparar()) {
			muerto= true;
			
			return true;
		}else {
			r.siguienteBala();
			
			return false;
			
			
		}
		
		
	}
	public boolean estaMuerto() {
		return muerto;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "muerto=" + muerto
				+ "]";
	}
	
	

}
