package es.avalon;

public class Ejemplo017Funciones {

    public static void main(String[] args) {
        System.out.println(sumar(2,3));
        System.out.println(resta(2,3));
        System.out.println(multiplicacion(2,3));
        System.out.println(division(2,3));
    }
    //Su funcionalidad es la reutilizacion
    static double sumar (double a, double b){
        return a+b;
    }
    static double resta (double a, double b){
        return a-b;
    }
    static double multiplicacion (double a, double b){
        return a*b;
    }
    static double division (double a, double b){
        return a/b;
    }
}
