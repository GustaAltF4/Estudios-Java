package edifico;

import edifico.entidades.CasaCampo;
import edifico.entidades.Edificio;

public class Appmain {

	public static void main(String[] args) {

		CasaCampo e1 = new CasaCampo(1000d, true);
		e1.calcularSuperficie(10, 30);
		System.out.println(e1.getSuperficieCubierta() + " mt2");

		Edificio e2 = new Edificio(300d, 4);
		e2.calcularSuperficie(10, 30);
		System.out.println(e2.getSuperficieCubierta() + " mt2");

	}
}
