package es.avalon.excepciones.ejemplo7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> lista= new ArrayList<>();
        lista.add("hola");
        lista.add("hola2");
        lista.add("hola3");

        for (int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i));
        }

        for(String cadena:lista) {
            System.out.println(cadena);
        }

        lista.remove("hola3");
        System.out.println("*******************");
        for(String cadena:lista) {
            System.out.println(cadena);
        }

        List<Integer> lista2= new ArrayList<>();

        lista2.add(2);
        lista2.add(7);
        lista2.add(8);
        lista2.add(1);

        for (int elemento: lista2) {

            System.out.println(elemento);
        }

    }
}
