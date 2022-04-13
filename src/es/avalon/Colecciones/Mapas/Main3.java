package es.avalon.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Persona p1= new Persona("1","Pedro","Gomez");
        Persona p2= new Persona("2","Ana","Sanchez");
        Persona p3= new Persona("3","Gema","Lopez");
        Persona p4= new Persona("4","David","Blanco");
        Persona p5= new Persona("5","Oscar","Gutierrez");

        Map<String,Persona> mapaComplejo= new HashMap<String,Persona>();
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);


        for(String clave:mapaComplejo.keySet()){
            System.out.println(mapaComplejo.get(clave).getNombre());

        }
    }
}
