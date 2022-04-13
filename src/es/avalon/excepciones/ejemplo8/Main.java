package es.avalon.excepciones.ejemplo8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String num1 = "56";
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(transformarNumero(num1));
        lista.add(transformarNumero(num1)+45);

        for (Integer numeros : lista){
            int suma = 0;
            suma = suma + numeros;
            System.out.println(suma);
        }

    }
    public static int transformarNumero(String cadena){
        int numero = Integer.parseInt(cadena);
        return numero;
    }



}
