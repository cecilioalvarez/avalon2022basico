package es.avalon.excepciones.ejemplo7;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCorazas2 {
    public static void main(String[] args) {

        List<String> lista= new ArrayList<>();
        lista.add("3");
        lista.add("3");
        lista.add("3");
        lista.add("3");
        int total=0;
        for (String texto:lista) {

                total+= Integer.parseInt(texto);
        }
        System.out.println(total);
    }
}
