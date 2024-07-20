package main.clases;

public class Carta {
	public int numero;
	public String palo;

	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return numero + " de " + palo;
	}

}
