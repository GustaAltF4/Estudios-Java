package dD;

import java.util.ArrayList;

public class EjemploArray {

	public static void main(String[] args) {
		
		//Arrays
		String[] nombresArray = new String[5];
		
		for (int i = 0; i < nombresArray.length; i++) {
			nombresArray[i]="Basura "+(i +1);
		}
		
	
		for (String var : nombresArray) {
			System.out.println(var);
		}
		
		//Collections
		ArrayList<String> nombresArrayList= new ArrayList<>();
		
		nombresArrayList.add("Basura");
		nombresArrayList.add("Basura");
		nombresArrayList.add("Basura");
		
		System.out.println(nombresArrayList.size());
		//size muestra la dimension
		
		nombresArrayList.remove("Basura");
		
		System.out.println(nombresArrayList.size());

	}

}
