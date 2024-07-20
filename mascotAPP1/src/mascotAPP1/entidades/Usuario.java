package mascotAPP1.entidades;

import java.util.Date;
import java.util.List;

import mascotAPP1.enumeraciones.SexoHumano;
@SuppressWarnings("rawtypes")
public class Usuario {

	public String nombre;
	public String apellido;
	public Integer dni;
	public Date nacimiento;
	public String pais;
	private SexoHumano sexo;
	

	
	private List<Mascota> mascotas;
	
	
	private Mascota mascotaFavorita;

	public Usuario() {
	}
	
	
	

	public Usuario(String nombre, String apellido, Integer dni, Date nacimiento, String pais, SexoHumano sexo,
			List<Mascota> mascotas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nacimiento = nacimiento;
		this.pais = pais;
		this.sexo = sexo;
		this.mascotas = mascotas;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public SexoHumano getSexo() {
		return sexo;
	}

	public void setSexo(SexoHumano sexo) {
		this.sexo = sexo;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}




	public Mascota getMascotaFavorita() {
		return mascotaFavorita;
	}




	public void setMascotaFavorita(Mascota mascotaFavorita) {
		this.mascotaFavorita = mascotaFavorita;
	}




	@Override
	public String toString() {
		return "Usuario [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (nacimiento != null ? "nacimiento=" + nacimiento + ", " : "")
				+ (pais != null ? "pais=" + pais + ", " : "") + (sexo != null ? "sexo=" + sexo + ", " : "")
				+ (mascotas != null ? "mascotas=" + mascotas + ", " : "")
				+ (mascotaFavorita != null ? "mascotaFavorita=" + mascotaFavorita : "") + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
