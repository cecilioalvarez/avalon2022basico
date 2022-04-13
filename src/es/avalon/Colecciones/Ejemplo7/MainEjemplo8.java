package es.avalon.Colecciones.Ejemplo7;

import java.util.ArrayList;
import java.util.List;

public class MainEjemplo8 {

    public static void main(String[] args) {
        List<String> cadenas=new ArrayList<>();

        cadenas.add("1");
        cadenas.add("3");


        int total=0;
        for(String numeros:cadenas){
            total+=Integer.parseInt(numeros);
        }
        System.out.println(total);



    }
}
