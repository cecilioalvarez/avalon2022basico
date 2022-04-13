package es.avalon.excepciones.ejercicio03Colecciones;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();

        lista.add("455");
        lista.add("166");
        lista.add("535");
        lista.add("323");
        lista.add("435");

        int total = 0;

        for(String numero:lista){
            int otronumero = Integer.parseInt(numero);
            total+= otronumero;
        }

        System.out.println(total);
    }
}
