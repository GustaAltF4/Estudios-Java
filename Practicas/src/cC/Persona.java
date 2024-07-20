package cC;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	private Scanner leer;

	// CONSTRUCTOR POR DEFECTO

	public Persona() {
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS COMO PARAMETRO
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	// GET Y SET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// METODO CREAR PERSONA
	public void crearPersona() {

		leer = new Scanner(System.in);

		System.out.println("ingrese nombre");
		nombre = leer.next();
		System.out.println("ingrese edad");
		edad = leer.nextInt();
		System.out.println("ingrese sexo ('H' hombre, 'M' mujer, 'O' otro)");
		sexo = leer.next().charAt(0);
		while (sexo != 'H' && sexo != 'M' && this.sexo != 'O') {
			System.out.println("Sexo incorrecto, introduce H, M o O:");
			sexo = leer.next().charAt(0);
		}

		System.out.println("ingrese peso kg");
		peso = leer.nextDouble();
		System.out.println("ingrese estatura m");
		altura = leer.nextDouble();

	}

	// METODO CALCULAR MC
	public int calcularMC() {
		int calculo = (int) (peso / Math.pow(altura, 2));
		/*
		 * (int) convierte el resultado de la división a un tipo int, truncando
		 * cualquier parte decimal y dejando solo la parte entera.
		 */

		if (calculo < 20) {
			return -1;

		} else if (calculo >= 20 && calculo <= 25) {
			return 0;
		} else {
			return 1;
		}

	}

	// METODO MAYOR DE EDAD
	public boolean esMayorDeEdad() {
		if (edad <= 18) {
			return true;
		} else {
			return false;
		}

	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona("peton", 45, 'H', 100, 1.8);
		Persona persona4 = new Persona("asdas", 12, 'M', 90, 1.2);
//		persona1.crearPersona();
//		persona2.crearPersona();

		// LLAMADA A LOS METODOS
		Persona[] personas = { persona1, persona2, persona3, persona4 };

		// GUARDAR RESULTADOS EN VECTORES

		int[] resultadoMC = new int[4];
		boolean[] mayores_de_edad = new boolean[4];
		for (int i = 0; i < personas.length; i++) {
			resultadoMC[i] = personas[i].calcularMC();
			mayores_de_edad[i] = personas[i].esMayorDeEdad();
			System.out.println("persona " + (i + 1) + ": ");
			System.out.println("MC: " + resultadoMC[i]);
			System.out.println("mayores de edad: " + mayores_de_edad[i]);

			/*
			 * La expresión "Persona " + (i+1) + ":" es una concatenación de cadenas que se
			 * utiliza para imprimir un mensaje que indica el número de persona que se está
			 * mostrando en ese momento.
			 */

		
		}

		// CALCULO DE PORCENTAJES
		int porcentajeBajoPeso = 0;
		int porcentajePesoIdeal = 0;
		int porcentajeSobrePeso = 0;
		int contadorMayores = 0;
		int contadorMenores = 0;

		for (int i = 0; i < personas.length; i++) {
			if (resultadoMC[i] == -1) {
				porcentajeBajoPeso++;
			} else if (resultadoMC[i] == 0) {
				porcentajePesoIdeal++;
			} else {
				porcentajeSobrePeso++;
			}

			if (mayores_de_edad[i]) {
				contadorMayores++;

			} else {
				contadorMenores++;
			}
		}
		porcentajeBajoPeso = (porcentajeBajoPeso * 100) / personas.length;
		porcentajePesoIdeal = (porcentajePesoIdeal * 100) / personas.length;
		porcentajeSobrePeso = (porcentajeSobrePeso * 100) / personas.length;
		contadorMayores = (contadorMayores * 100) / personas.length;
		contadorMenores = (contadorMenores * 100) / personas.length;
		System.out.println("\nPorcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
		System.out.println("Porcentaje de personas con peso ideal: " + porcentajePesoIdeal + "%");
		System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrePeso + "%");
		System.out.println("Porcentaje de personas mayores de edad: " + contadorMayores + "%");
		System.out.println("Porcentaje de personas menores de edad: " + contadorMenores + "%");
		
		Persona aaa= null;
		try {
			System.out.println(aaa.esMayorDeEdad()); 
//		}catch (NullPointerException e){
//			 System.out.println("se a producido un error");
//			 System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("se a producido un error");
			 System.out.println(e.getMessage());
		}
		
		
	}

}
