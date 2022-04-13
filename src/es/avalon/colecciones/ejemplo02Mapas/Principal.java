package es.avalon.colecciones.ejemplo02Mapas;

import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {


        //Creamos un mapa con clave valor, en este caso ambos son de tipo String
        HashMap<String, String> mapaTextos = new HashMap<>();

        mapaTextos.put("Cecilio", "Alvarez");
        mapaTextos.put("Pedro", "Gomez");
        mapaTextos.put("Ana", "Sanchez");
        mapaTextos.put("David", "Hernandez");
        mapaTextos.put("Agustin", "Perez");

        System.out.println(mapaTextos.get("Cecilio"));

    }
}
