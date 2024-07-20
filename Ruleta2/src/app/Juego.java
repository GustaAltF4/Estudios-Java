package app;

import java.util.ArrayList;
import java.util.List;
import app.clases.Jugador;
import app.clases.Revolver;

public class Juego {
	
	public List<Jugador> jugadores;
	public Revolver revolver;
	
	public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r) {
		this.jugadores= jugadores;
		this.revolver=r;
		
	}
	public void ronda() {
		boolean alguienMuerto= false;
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.nombre+" se apunta con el revolver y dispara");
			if (jugador.disparo(revolver)) {
				System.out.println(jugador.nombre+ " a muerto");
				alguienMuerto=true;
				break;
			}else {
				System.out.println(jugador.nombre+" sobrevive");
				
			}
			
			
		}
		if (!alguienMuerto) {
			System.out.println("todos los jugadores sobreviven esta ronda");
		}
		
	}
	
	public static void main(String[] args) {
		Revolver revolver= new Revolver();
		ArrayList<Jugador> jugadores= new ArrayList<>();
		
		 // Crear jugadores (número de jugadores entre 1 y 6)
		int numerojugadores= 2;
		if (numerojugadores<1||numerojugadores>6) {
			numerojugadores=6;
			
		}
		
		for (int i = 0; i < numerojugadores; i++) {
			jugadores.add(new Jugador(i+1));
			
		}
		 // Crear y llenar el juego
		Juego juego= new Juego();
		juego.llenarJuego(jugadores, revolver);
		// Ejecutar rondas hasta que alguien muera
		boolean juegoTerminado=false;
		while(!juegoTerminado) {
			juego.ronda();
			for (Jugador jugador : jugadores) {
				
				if (jugador.estaMuerto()) {
					juegoTerminado= true;
					break;
				}
				

			
	                
				
			}
		}
		
	}
}
	                
		
	


