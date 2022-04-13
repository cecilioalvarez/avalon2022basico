package es.avalon.colecciones.Ejemplo004;

import java.util.HashMap;

public class PrincipalMapas {
    public static void main(String[] args) {
        HashMap<String,String>mapatextos=new HashMap<String,String>();
        mapatextos.put("jose","calatayud");
        mapatextos.put("juan","fernandez");
        mapatextos.put("j","calata");
        mapatextos.put("jos","tayud");
        mapatextos.put("miguel","assal");
        mapatextos.put("fernando","garcia");

        System.out.println(mapatextos.get("miguel"));


    }
}
