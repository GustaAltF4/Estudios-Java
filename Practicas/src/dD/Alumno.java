package dD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
	public String nombre;
	public List<Integer> notas;


	public Alumno() {
	}

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.notas = new ArrayList<>();
	}
	
	public void agregarNota(int nota) {
		notas.add(nota);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double notaFinal(String nombre) {
		int suma =0;
		for (int nota : notas) {
			suma+=nota;
		}
		return (double) suma/notas.size();
	}

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		List<Alumno> listaAlumnos= new ArrayList<>();
		
		while(true) {
			System.out.println("ingrese el nombres de alumnos o 'salir' para finalizar ");
			String nombreA= leer.next();
			if (nombreA.equalsIgnoreCase("salir")) {
				break;
			}
			Alumno alumno= new Alumno(nombreA);
			
			for (int i = 0; i < 3; i++) {
				System.out.println("ingrese la nota" +(i+1)+ "del alumno: "+ nombreA);
				int nota= leer.nextInt();
				alumno.agregarNota(nota);
			}
			
			leer.nextLine();
			listaAlumnos.add(alumno);
			
			System.out.print("¿Desea crear otro alumno? (sí/no): ");
            String respuesta = leer.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                break;
            }
            
            
				
			}
		
		System.out.println("_______LISTA DE ALUMNOS_______");
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno.getNombre());
			System.out.print("Notas: ");
			for (int nota : alumno.notas) {
				System.out.print(nota+ "| ");
				
			}
			System.out.println("Nota Final: " +alumno.notaFinal(alumno.getNombre()));
			
		}
		leer.close();		
	}
	
		
		
		
		
		
		
}


