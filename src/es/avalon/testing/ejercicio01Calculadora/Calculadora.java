package es.avalon.testing.ejercicio01Calculadora;

public class Calculadora {

    public static double sumar(double n1, double n2){
        return n1+n2;
    }

    public static double restar(double n1, double n2){
        return n1-n2;
    }

    public static double producto(double n1, double n2){
        return n1*n2;
    }

    public static double division(double n1, double n2){

        if(n1 == 0 || n2 == 0){
            //Esta excepcion RunTimeException() no es obligatorio capturar
            throw new RuntimeException("No se puede dividir por 0");
        }
        return n1/n2;
    }
}
