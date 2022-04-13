package es.avalon.colecciones.ejemplo5;

import java.util.HashMap;

public class PrincipalMapas {
    public static void main(String[] args) {

        HashMap<String,String> mapatextos= new HashMap<String,String>();
        mapatextos.put("cecilio","alvarez");
        mapatextos.put("pedro","gomez");
        mapatextos.put("ana","sanchez");
        mapatextos.put("david","hernandez");
        mapatextos.put("cecilio","perez");

        System.out.println(mapatextos.get("cecilio"));

    }
}
