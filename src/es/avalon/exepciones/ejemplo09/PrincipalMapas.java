package es.avalon.exepciones.ejemplo09;

import java.util.HashMap;

public class PrincipalMapas {
    public static void main(String[] args) {
        HashMap<String, String> mapatextos =new HashMap<String, String>();
        mapatextos.put("edwin", "buitrago");
        mapatextos.put("stiven", "forero");
        mapatextos.put("andres", "salinas");
        mapatextos.put("david", "rico");
        mapatextos.put("jsdjhd", "farfan");
        System.out.println(mapatextos.get("edwin"));
    }
}
