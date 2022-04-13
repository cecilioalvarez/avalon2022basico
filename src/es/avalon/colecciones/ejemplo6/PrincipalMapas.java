package es.avalon.colecciones.ejemplo6;

import java.util.HashMap;

public class PrincipalMapas {
    public static void main(String[] args){

    HashMap<String,String> mapatexto= new HashMap<String,String>();
    mapatexto.put("mercedes","alfonzo");
    mapatexto.put("cecilio","alvarez");
    mapatexto.put("ana","hernandez");
    mapatexto.put("david","hernandez");
    mapatexto.put("cecilio","perez");
    System.out.println(mapatexto.get("cecilio"));
    }
}
