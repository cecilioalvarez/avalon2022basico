
package es.avalon.Basico;

public class Ejemplo017Funciones {
    public static void main(String[] args) {


        System.out.println(sumar(2,3));
        System.out.println(restar(4,6));
        System.out.println(multiplicar(7,8));
        System.out.println(dividir(7,8));

    }
    //la reutilizacion
    static double  sumar(double a , double b) {

        return a+b;
    }

    static double  restar(double a , double b) {

        return a-b;
    }
    static double  multiplicar(double a , double b) {

        return a*b;
    }
    static double  dividir(double a , double b) {

        return a/b;
    }

}


