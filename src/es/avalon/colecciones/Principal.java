package es.avalon.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Hola2");
        lista.add("Hola3");

        for (int i =0; i<lista.size();i++){

            System.out.println(lista.get(i));
        }

        for (String cadena:lista) {
            System.out.println(cadena);
        }
        lista.remove("Hola3");
        System.out.println("****************");
        for (String cadena:lista) {
            System.out.println(cadena);
        }

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        System.out.println("***************");
        for (int cadena: lista2) {
            System.out.println(cadena);
        }
        Integer prueba = 20;
        int prueba2 = 30;

        System.out.println("prueba 1 " + prueba);
        System.out.println("prueba 2 " + prueba2);

    }
}
