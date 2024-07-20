package main.entidades;

public class Hotel {

	protected Integer cantidadHabitaciones;
	// protected es publico para las partes de la herencia ("familia")
	// y privado para clases externar osea tendrian q acceder por medio de get y set

	public Hotel(Integer cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

	public Integer getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}

	public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

}
