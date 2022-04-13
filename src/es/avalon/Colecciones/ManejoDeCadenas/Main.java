package es.avalon.Colecciones.ManejoDeCadenas;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String cadena = new String("hola");
        String cadena2="hola2";

        String sumaCadena=cadena.concat(cadena2);
        System.out.println(sumaCadena);

        System.out.println(cadena.length());

        for (int x=0;x<cadena.length();x++){
            System.out.println(cadena.charAt(x));
        }

        System.out.println("/*****************************/");

        System.out.println(cadena.startsWith("ho"));
        System.out.println(cadena.endsWith("ho"));
        System.out.println(cadena.toUpperCase());

        String texto="Me Llamo David Campos";
        String[] lista= texto.split(texto);
        System.out.println(texto);
    }
}
