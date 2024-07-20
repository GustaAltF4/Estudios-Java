package animales.entidades;

public final class Gato extends Animal {

	private String razaGatuna;

	public Gato(Integer patas, boolean cola, Integer aniosDeVida, Double energia, String razaGatuna) {
		super(patas, cola, aniosDeVida, energia);
		this.razaGatuna = razaGatuna;
	}

	public String getRazaGatuna() {
		return razaGatuna;
	}

	public void setRazaGatuna(String razaGatuna) {
		this.razaGatuna = razaGatuna;
	}
	
	public Integer getPatas() {
		return patas;
	}

	public void setPatas(Integer patas) {
		this.patas = patas;
	}

	public boolean isCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

	public Integer getAniosDeVida() {
		return aniosDeVida;
	}

	public void setAniosDeVida(Integer aniosDeVida) {
		this.aniosDeVida = aniosDeVida;
	}

	public Double getEnergia() {
		return energia;
	}

	public void setEnergia(Double energia) {
		this.energia = energia;
	}

	//___________________________________________
	
	public void ronronear() {
		System.out.println("Prrrrrrrrrrrr...");
	}
	
	
	
	@Override
	public void calcularEdad() {
		System.out.println("La edad gatuna para "+this.aniosDeVida+ " es "+ (aniosDeVida*5));
		
	}
	
	@Override
	public void hacerRuido() {
		super.hacerRuido();
		System.out.println("Miaaauuuu...");
		
	}
	
}
