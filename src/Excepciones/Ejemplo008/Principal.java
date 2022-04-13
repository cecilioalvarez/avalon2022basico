package Excepciones.Ejemplo008;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("hola1");
        lista.add("hola2");
        lista.add("hola3");
        lista.add("hola4");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        for(String cadena: lista){
            System.out.println(cadena);
        }
        lista.remove("hola3");
        System.out.println("*************");
        for(String cadena: lista){
            System.out.println(cadena);
        }


    }
}
