package aA;

public class OperadorTernario {
    public static void main(String[] args) {
        //El operador ternario en Java es una forma concisa de hacer una declaración condicional
        // que puede reemplazar ciertas estructuras if-else. Su sintaxis es:
        //resultado = (condición) ? valor_si_verdadero : valor_si_falso;

        int num1= 2;
        int num2= 3;
        int max = (num1>num2) ? num1 : num2;
        System.out.println("El valor maximo es: "+max);

        int edad= 18;

        String mensaje= (edad>=18)? "Es mayor de edad" : "Es menor de edad";

        System.out.println(mensaje);
    }
}
