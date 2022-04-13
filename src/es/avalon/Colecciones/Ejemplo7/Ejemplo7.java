package es.avalon.Colecciones.Ejemplo7;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {
    public static void main(String[] args) {


        List<String> lista=new ArrayList<String>();
        lista.add("hola1");
        lista.add("Hola2");
        lista.add("Hola3");

        for(int x=0;x<lista.size();x++){
            System.out.println();
        }

        for (String cadena:lista) {
            System.out.println(cadena);

        }

        lista.remove("Hola");
        System.out.println("****************");
        for(String cadena:lista){
            System.out.println(cadena);
        }

        List<Integer> lista2= new ArrayList<>();

        lista2.add(1);
        lista2.add(2);
        lista2.add(3);

        for(int x=0;x<lista2.size();x++) {
            System.out.println(lista2);
        }

    }
}
