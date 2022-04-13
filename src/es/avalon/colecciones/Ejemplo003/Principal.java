package es.avalon.colecciones.Ejemplo003;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String>lista=new ArrayList<>();
        lista.add("2");
        lista.add("8");
        lista.add("21");
        lista.add("6");
        lista.add("23");
        int total=0;
        int aux=0;

        for(int i=0;i< lista.size();i++){
            aux=Integer.parseInt(lista.get(i));
            total=total+aux;

        }
        System.out.println(total);
        int total2=0;
        for (String cadena:lista){
            aux=Integer.parseInt(cadena);
            total2+=aux;

        }
        System.out.println(total2);
    }
}
