package main.entidades;

public class Hotel1 extends Hotel {

	protected Double precio;
	protected Double superficie;
	protected boolean bano = true;
	protected boolean ascensor = true;
	protected boolean calefaccion = true;

	public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
		super(cantidadHabitaciones);
		this.precio = precio;
		this.superficie = superficie;
	}

//	public Hotel1(Integer cantidadHabitaciones, Double precio, Double superficie, boolean bano, boolean ascensor,
//			boolean calefaccion) {
//		super(cantidadHabitaciones);
//		this.precio = precio;
//		this.superficie = superficie;
//		this.bano = bano;
//		this.ascensor = ascensor;
//		this.calefaccion = calefaccion;
//	}

}
