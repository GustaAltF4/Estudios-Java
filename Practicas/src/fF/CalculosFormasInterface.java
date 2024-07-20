package fF;

public interface CalculosFormasInterface {
	
	public static final double pi= Math.PI;

	public double calcularArea();
	public double calcularPerimetro();
	
	public static void main(String[] args) {
		Circulo c1= new Circulo(10,5 );
		
		System.out.println("CIRCULO: "+c1.toString());
		System.out.println("Area: "+c1.calcularArea());
		System.out.println("Perimetro: "+c1.calcularPerimetro());
		
		Rectangulo r1= new Rectangulo(10,5 );
		
		System.out.println("RECTANGULO"+ r1.toString());
		System.out.println("Area: "+ r1.calcularArea());
		System.out.println("Pertimetro: "+ r1.calcularPerimetro());
	}

}
class Circulo implements CalculosFormasInterface{
	
	public double diametroCirculo;
	public double radioCirculo;
	
	
	public Circulo(double diametroCirculo, double radioCirculo) {
		this.diametroCirculo = diametroCirculo;
		this.radioCirculo = radioCirculo;
	}

	@Override
	public double  calcularArea() {
		return pi*(Math.pow(radioCirculo, 2));
		
	}
	
	@Override
	public double calcularPerimetro() {
		return pi*diametroCirculo;
	}

	@Override
	public String toString() {
		return "calculosCirculo [diametroCirculo=" + diametroCirculo + ", radioCirculo=" + radioCirculo + "]";
	}
	
	
}

class Rectangulo implements CalculosFormasInterface{
	
	public double baseRectangulo;
	public double alturaRectangulo;
	
	
	public Rectangulo(double baseRectangulo, double alturaRectangulo) {
		this.baseRectangulo = baseRectangulo;
		this.alturaRectangulo = alturaRectangulo;
	}

	@Override
	public double calcularArea() {
		return baseRectangulo*alturaRectangulo;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2*(baseRectangulo+alturaRectangulo);
	}

	@Override
	public String toString() {
		return "calculosRectangulo [baseRectangulo=" + baseRectangulo + ", alturaRectangulo=" + alturaRectangulo + "]";
	}
	
}
