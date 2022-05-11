package es.avalon.Practica.ejemplo1;

import org.junit.jupiter.api.parallel.Resources;

public class Principal {
    public static void main(String[] args) {
        //Declara dos variables numéricas (con el valor que desees),
        // muestra por consola la suma, resta, multiplicación, división
        // y módulo (resto de la división).

        int numero1= 4;
        int numero2= 8;
//        System.out.println(numero1+numero2);
//        System.out.println(numero1-numero2);
//        System.out.println(numero1*numero2);
//        System.out.println(numero1/numero2);

       // Declara 2 variables numéricas (con el valor que desees),
        // he indica cual es mayor de los dos. Si son iguales indicarlo también.
        // Ves cambiando los valores para comprobar que funciona.

        if (numero1>=numero2){
            if( numero1==numero2) {
                System.out.println("el numero " + numero1 + " es igual a " + numero2);
            }else{
            System.out.println("El numero " + numero1 + " es mayor que "+ numero2);

            }
        }else{
            System.out.println("El numero " + numero2 + " es mayor que "+ numero1);
        }
    }
}






