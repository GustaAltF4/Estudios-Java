package dD;

import java.util.HashMap;
import java.util.Map;

public class EjHashMap {

	public static void main(String[] args) {
		// la key y el value HashMap<key,value>
		// puede ser cualquier cosa 2 string por ejemplo
		HashMap<Integer, String> nombres = new HashMap<>();

		nombres.put(1, "Basura");
		nombres.put(1232, "Mugre");
		nombres.put(1, "qweqwe");

		for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
			Integer key = aux.getKey();
			String val = aux.getValue();

			System.out.println("key: " + key + " value: " + val);

		}

	}

}
