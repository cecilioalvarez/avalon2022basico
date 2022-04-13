package es.avalon.colecciones.ejemplo01Colecciones;

public class PrincipalCorazas {

    public static void main(String[] args) {

        /*
        * Articulo de Cecilio
        *
        * https://www.arquitecturajava.com/java-integer-wrapper-y-certificacion/
        * */

        //Dato simple
        int numero = 7;

        //Clase Coraza
        //Un inboxing es una conversion automatica de tipo basico a objeto completo
        Integer i = numero;

        //De manera que podemos acceder a los metodos de su clase
        System.out.println(i.toString());

        //Ejemplo sencillo de Coraza
        int otronumero = Integer.parseInt("27");

    }
}
