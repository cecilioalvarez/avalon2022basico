package es.avalon.colecciones.ejemplo6;

import java.util.HashMap;

public class PrincipalMapas {
    public static void main(String[] args){
        HashMap<String,String> mapatextos=new HashMap<String,String>();
        mapatextos.put("Cecilio","Alvarez");
        mapatextos.put("Mercedes","Alfonzo");
        mapatextos.put("Nerys","Cona");
        mapatextos.put("Michelle","Fericelli");
        mapatextos.put("Cecilio","Perez");

        System.out.println(mapatextos.get("Cecilio"));
    }
}
