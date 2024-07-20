package appRADIO.Circunferencia;

public class Circunfe {
	private double Radio;
	private double area;
	private double perimetro;

	public Circunfe(int radio) {
		Radio = radio;
	}

	public double getRadio() {
		return Radio;
	}

	public void setRadio(int radio) {
		Radio = radio;
	}

	public double area() {
		// math.PI es literalmente el num PI
		// Math.pow(Base, Exponente)
		return this.area = Math.PI * Math.pow(this.Radio, 2);

	}

	public double perimetro() {
		return this.perimetro = 2 * Math.PI * this.Radio;

	}

	@Override
	public String toString() {
		return "Circunfe [Radio=" + Radio + ", area=" + area + ", perimetro=" + perimetro + "]";
	}

}
