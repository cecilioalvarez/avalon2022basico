package es.avalon.colecciones.ejemplo5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<String> cadena=new ArrayList<>();
        cadena.add("8");
        cadena.add("5");
        cadena.add("6");
        cadena.add("3");
        int total=0;
        for (String texto:cadena){
            total+=Integer.parseInt(texto);
        }
        System.out.println(total);

    }
}
