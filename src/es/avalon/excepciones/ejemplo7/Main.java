package es.avalon.excepciones.ejemplo7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Framework de colecciones
        List<String> lista = new ArrayList<>();
        lista.add("hola1");
        lista.add("hola2");
        lista.add("hola3");

        for (String cadena: lista){
            System.out.println(cadena);
        }

        lista.remove("hola1");
        System.out.println("*******");

        for (String cadena2 : lista){
            System.out.println(cadena2);
        }
    }
}
