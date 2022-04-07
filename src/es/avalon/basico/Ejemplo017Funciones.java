package es.avalon.basico;

public class Ejemplo017Funciones {

    public static void main(String[] args) {
        double suma = sumar(2, 3);
        System.out.println(suma);
        suma = sumar(85, 65);
        System.out.println(suma);

        System.out.println("...........");
        System.out.println(sumar(2, 3));
        System.out.println(sumar(4, 6));
        System.out.println(sumar(7, 8));
        System.out.println("...........");
        System.out.println(resta(2, 3));
        System.out.println(resta(4, 6));
        System.out.println(resta(7, 8));
        System.out.println("...........");
        System.out.println(producto(2, 3));
        System.out.println(producto(4, 6));
        System.out.println(producto(7, 8));
        System.out.println("...........");
        System.out.println(division(2, 3));
        System.out.println(division(4, 6));
        System.out.println(division(7, 8));

    }

    static double sumar(double a, double b) {
        return a + b;

    }

    static double resta(double a, double b) {
        return a - b;
    }

    static double producto(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }
}
