package animales.entidades;

public abstract class Animal {
 
	protected Integer patas;
	protected boolean cola;
	protected Integer aniosDeVida;
	protected Double energia;
	public Animal(Integer patas, boolean cola, Integer aniosDeVida, Double energia) {
		this.patas = patas;
		this.cola = cola;
		this.aniosDeVida = aniosDeVida;
		this.energia = energia;
	}
	
	public abstract void calcularEdad();
	
	public void hacerRuido() {
		System.out.println("*** ruido animal");
	}


	
}
