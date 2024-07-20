package main.entidades;

public final class Hotel5 extends Hotel4 {
	/*
	 * final con clases: Evita la herencia.
	 * final con métodos: Evita que el método sea sobrescrito.
	 * final con variables: Convierte la variable en una constante,
	 * impidiendo su reasignación.
	 */

	protected boolean casino = true;
	protected boolean restaurant = true;

	public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
		super(precio, superficie, cantidadHabitaciones);
	}

}
