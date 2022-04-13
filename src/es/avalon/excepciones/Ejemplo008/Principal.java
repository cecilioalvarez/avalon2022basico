package es.avalon.excepciones.Ejemplo008;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("Hola");
        lista.add("Hola1");
        lista.add("Hola2");
        lista.add("Hola3");
        for(int i=0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        for(String cadena:lista){
            System.out.println(cadena);
        }
        lista.remove("Hola3");
        System.out.println("..........");
        for(String cadena:lista){
            System.out.println(cadena);
        }
    }
}
