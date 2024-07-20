package cC;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    // Constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Métodos get y set para el atributo radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear Circunferencia
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        this.radio = radio;
        scanner.close();
       
    }

    // Método para calcular el área
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Circunferencia circunferencia = new Circunferencia(5); // Crear una circunferencia con radio 5
        System.out.println("Área de la circunferencia: " + circunferencia.area());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.perimetro());

        // Modificar el radio de la circunferencia
        circunferencia.setRadio(7);
        System.out.println("Nuevo radio de la circunferencia: " + circunferencia.getRadio());
        System.out.println("Nueva área de la circunferencia: " + circunferencia.area());
        System.out.println("Nuevo perímetro de la circunferencia: " + circunferencia.perimetro());

        // Crear una circunferencia a partir de la entrada del usuario
        Circunferencia circunferencia2 = new Circunferencia(0);
        
        circunferencia2.crearCircunferencia();
        System.out.println("Área de la circunferencia creada: " + circunferencia2.area());
        System.out.println("Perímetro de la circunferencia creada: " + circunferencia2.perimetro());
        
        
        
    }
}


