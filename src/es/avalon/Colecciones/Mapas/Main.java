package es.avalon.Colecciones.Mapas;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> mapaTextos=new HashMap<>();
        mapaTextos.put("David","Campos");
        mapaTextos.put("Miguel","Campos");
        mapaTextos.put("Adrian","Fernandez");

        System.out.println(mapaTextos.get("Adrian"));
    }
}
