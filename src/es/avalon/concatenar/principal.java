package es.avalon.concatenar;

import java.util.Locale;

public class principal {

    public static void main(String[] args) {
        String cadena = "hola ";
        String cadena2 =  "hola 2";

        String sumaCadena = cadena.concat(cadena2);
        System.out.println(sumaCadena);

        System.out.println(cadena.length());

    for (int i = 0; i<cadena.length();i++){
        System.out.println(cadena.charAt(i));

    }
        System.out.println(cadena.startsWith("ho"));
        System.out.println(cadena.endsWith("ho"));
        System.out.println(cadena.toUpperCase());


    }
}
