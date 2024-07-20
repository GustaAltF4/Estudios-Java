package edifico.entidades;

public abstract class Estructura {

	protected Double superficieCubierta;
	protected Double superficieTotal;
//	En Java, una clase abstracta es una clase que no se puede instanciar directamente y se utiliza como una plantilla para otras clases. 
//	Las clases abstractas pueden contener métodos abstractos (métodos sin implementación) y métodos concretos (métodos con implementación). 
//	Las clases que heredan de una clase abstracta deben proporcionar implementaciones para todos los métodos abstractos de la clase padre, 
//	a menos que también sean clases abstractas.
	public Estructura(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

//   LOS GET Y SET NO HACEN FALTA EN EL OBJETO "PADRE"
//		SI NO SON INSTANCIADOS USANDO EL MISMO OBJETO PADRE

//	public Double getSuperficieCubierta() {
//		return superficieCubierta;
//	}
//
//	public void setSuperficieCubierta(Double superficieCubierta) {
//		this.superficieCubierta = superficieCubierta;
//	}
//
//	public Double getSuperficieTotal() {
//		return superficieTotal;
//	}
//
//	public void setSuperficieTotal(Double superficieTotal) {
//		this.superficieTotal = superficieTotal;
//	}
//	

	public abstract void calcularSuperficie(double ancho, double largo);

}
