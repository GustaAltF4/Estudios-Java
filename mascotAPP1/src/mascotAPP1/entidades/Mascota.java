package mascotAPP1.entidades;

import mascotAPP1.enumeraciones.SexoAnimal;
import mascotAPP1.interfaces.AccionMascota;

public final class Mascota <T> implements AccionMascota{

	private String nombre;
	private String apodo;
	private String tipo;
	private String color;
	private Integer edad;
	private boolean cola;
	private T raza;
	private SexoAnimal sexo;
	
	private int energia;
	



	public Mascota() {
		this.energia = 1000;

	}




	public Mascota(String nombre, String apodo, String tipo) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.tipo = tipo;
	}

	
	
	


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApodo() {
		return apodo;
	}




	public void setApodo(String apodo) {
		this.apodo = apodo;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public Integer getEdad() {
		return edad;
	}




	public void setEdad(Integer edad) {
		this.edad = edad;
	}




	public boolean isCola() {
		return cola;
	}




	public void setCola(boolean cola) {
		this.cola = cola;
	}




	public T getRaza() {
		return raza;
	}




	public void setRaza(T raza) {
		this.raza = raza;
	}




	public SexoAnimal getSexo() {
		return sexo;
	}




	public void setSexo(SexoAnimal sexo) {
		this.sexo = sexo;
	}




	public int getEnergia() {
		return energia;
	}




	public void setEnergia(int energia) {
		this.energia = energia;
	}




	@Override
	public String toString() {
		return "Mascota [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apodo != null ? "apodo=" + apodo + ", " : "") + (tipo != null ? "tipo=" + tipo + ", " : "")
				+ (color != null ? "color=" + color + ", " : "") + (edad != null ? "edad=" + edad + ", " : "") + "cola="
				+ cola + ", " + (raza != null ? "raza=" + raza + ", " : "")
				+ (sexo != null ? "sexo=" + sexo + ", " : "") + "energia=" + energia + "]";
	}




	@Override
	public void pasear(int cantidadVueltas) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public int molestarDueño() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public void comerAlimento(int cantidad) {
		// TODO Auto-generated method stub
		
	}





	
	
}
