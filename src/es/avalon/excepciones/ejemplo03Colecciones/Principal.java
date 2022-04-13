package es.avalon.excepciones.ejemplo03Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {


        /*Articulo de Cecilio
        *
        * https://www.arquitecturajava.com/java-collections-framework-y-su-estructura/*/


        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("hola2");
        lista.add("hola3");

        //For clasico
        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //For mas moderno
        for(String cadena:lista){
            System.out.println(cadena);
        }

    }
}
