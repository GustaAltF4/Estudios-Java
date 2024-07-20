package animales.entidades;

public final class Perro extends Animal {
	
	private String razaPerruna;

	public Perro(Integer patas, boolean cola, Integer aniosDeVida, Double energia, String razaPerruna) {
		super(patas, cola, aniosDeVida, energia);
		this.razaPerruna = razaPerruna;
	}

	public String getRazaPerruna() {
		return razaPerruna;
	}

	public void setRazaPerruna(String razaPerruna) {
		this.razaPerruna = razaPerruna;
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
	
	public void juegarEnParque(int tiempo) {
		for (int i = 0; i < tiempo; i++) {
			energia-=10;
			
		}
		System.out.println("la cantidad de energia restante es "+ this.energia);
	}
	
	
	
	@Override
	public void calcularEdad() {
		System.out.println("La edad perruna para "+this.aniosDeVida+ " es "+ (aniosDeVida*7));
		
	}
	
	@Override
	public void hacerRuido() {
		super.hacerRuido();
		System.out.println("Guauuuu...");
		
	}
	

}
