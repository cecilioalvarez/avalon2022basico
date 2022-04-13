package es.avalon.colecciones.ejemplo5;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        List<String> cadena= new ArrayList();
        cadena.add("4");
        cadena.add("8");
        cadena.add("6");
        cadena.add("7");
        int total=0;
        for (String texto:cadena) {
            total+=Integer.parseInt(texto);
        }
        System.out.println(total);
    }

}
