package adopcionPerro.clases;

import adopcionPerro.Enum.Razas;

public class Perro {
	private String nombre;
	private Razas raza;
	private int edad;
	private int tamaño;
	
	
	public Perro() {
	}


	public Perro(String nombre, Razas raza, int edad, int tamaño) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamaño = tamaño;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Razas getRaza() {
		return raza;
	}


	public void setRaza(Razas raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Perro [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (raza != null ? "raza=" + raza + ", " : "") + "edad=" + edad + ", tamaño=" + tamaño + "]";
	}
	
	
	
}
