package es.avalon.ejemploCollec;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> cadena = new ArrayList<>();
        cadena.add("2");
        cadena.add("3");
        cadena.add("4");
        cadena.add("5");

        int total = 0;
        for (String num: cadena) {
            System.out.println("la suma de " +total + " y "+ num + " Es igual a: ");
            total =  Integer.parseInt(num) + total;
            System.out.println(total);

        }

    }
}
