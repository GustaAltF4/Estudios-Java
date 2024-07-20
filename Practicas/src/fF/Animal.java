package fF;
// --->CLASE PADRE<---
public class Animal {

	protected String nombre;
	protected String alimento;
	protected String razaDelAnimal;
	protected int edad;

	public Animal(String nombre, String alimento, String razaDelAnimal, int edad) {
		this.nombre = nombre;
		this.alimento = alimento;
		this.razaDelAnimal = razaDelAnimal;
		this.edad = edad;
	}

	public void alimentarse() {
		System.out.println("Este animal se alimenta de " + alimento);
	}
// --->MAIN<---
	public static void main(String[] args) {

		Animal perro = new Perro("Stich", "Carne", "Doberman", 15);
		System.out.println(perro.nombre);
		perro.alimentarse();
		Animal perro1 = new Perro("Teddy", "Caca", "Pichichu", 10);
		System.out.println(perro1.nombre);
		perro1.alimentarse();

		Animal gato = new Gato("Lulu", "Alimento", "Siames", 2);
		System.out.println(gato.nombre);
		gato.alimentarse();
		Animal caballo = new Caballo("Spark", "Pasto", "Fino", 25);
		System.out.println(caballo.nombre);
		caballo.alimentarse();

	}
}

// TAMBIEN SE PUEDEN CREAR MAS CLASES DENTRO DEL MISMO ARCHIVO DE CLASE clase

// --->CLASES HIJAS<---
class Perro extends Animal {

	public Perro(String nombre, String alimento, String razaDelAnimal, int edad) {
		super(nombre, alimento, razaDelAnimal, edad);

	}
}

class Gato extends Animal {

	public Gato(String nombre, String alimento, String razaDelAnimal, int edad) {
		super(nombre, alimento, razaDelAnimal, edad);

	}
}

class Caballo extends Animal {

	public Caballo(String nombre, String alimento, String razaDelAnimal, int edad) {
		super(nombre, alimento, razaDelAnimal, edad);

	}
}
