package es.avalon.colecciones.ejemplo4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> mapatextos = new HashMap<String, String>();
        mapatextos.put("Cecilio", "Alvarez");
        mapatextos.put("Pedro", "Gomez");
        mapatextos.put("Alberto", "Puerto");
        mapatextos.put("Ana", "Rodriguez");

        System.out.println(mapatextos.get("Ana"));
    }
}
