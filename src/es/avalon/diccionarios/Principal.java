package es.avalon.diccionarios;

import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
        HashMap<String,String> mapatextos = new HashMap<>();
        mapatextos.put("Cecilio","alvares");
        mapatextos.put("pedro","gomez");
        mapatextos.put("ana","sancehz");
        mapatextos.put("david","hernandez");

        System.out.println(mapatextos.get("Cecilio"));
    }
}
