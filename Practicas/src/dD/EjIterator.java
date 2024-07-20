package dD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjIterator {

	public static void main(String[] args) {
		List<String> nombres= new ArrayList<>();
		nombres.add("lola");
		nombres.add("lula");
		nombres.add("lila");
		
//		for (String aux : nombres) {
//			System.out.println(aux);
//		}
		
//		for (int i = 0; i < nombres.size(); i++) {
//			System.out.println(nombres.get(i));
//		}
		
//		nombres.forEach((e)->System.out.println(e));
		
//		for (String aux : nombres) {
//			if (aux.equals("lola")){
//				nombres.remove(aux);
//			}
//		}
//		NO SE PUEDE ELIMINAR CON EL FOR EACH
//		
		
//		SE PUDE ELIMINAR CON UN FOR CONVENCIONAL
//		for (int i = 0; i < nombres.size(); i++) {
//			String m = nombres.get(i);
//			if (m.equals("lola")) {
//				nombres.remove(m);
//			}
//		}
//		
//		nombres.forEach((e)->System.out.println(e));
//		
//	}
	
		Iterator<String> it= nombres.iterator();
		
//		
//		while(it.hasNext()) {
//			String aux = it.next();
//			
//			System.out.println(aux);
//		}
		
		while(it.hasNext()) {
			String aux = it.next();
			
			if(aux.equals("lola")) {
				it.remove();
			}
		}
		
		nombres.forEach((e)->System.out.println(e));

	}

}
