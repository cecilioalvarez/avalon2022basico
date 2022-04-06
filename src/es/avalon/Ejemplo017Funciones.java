package es.avalon;

public class Ejemplo017Funciones {

    public static void main(String[] args) {


        //Uso de la funcion
        double suma = sumar(2,3);

        System.out.println(suma);

    }


    //Funcion
    //Bloque de codigo que facilita la reutilizacion
    static double sumar(double a, double b){
        return a+b;
    }

}
