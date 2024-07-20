package adopcionPerro.clases;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private Perro perros;
	
	public Persona() {
	}

	public Persona(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Perro getPerros() {
		return perros;
	}

	public void setPerros(Perro perros) {
		this.perros = perros;
	}

	@Override
	public String toString() {
		return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + "edad=" + edad + ", dni=" + dni + ", "
				+ (perros != null ? "\nperros=" + perros : "") + "]";
	}
	
	
	
	
	
	
}
