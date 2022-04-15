package es.avalon.diccionarios;

import java.util.HashMap;
import java.util.Map;

public class Principal2 {

    public static void main(String[] args) {
        Persona p1= new Persona("Andres","Cortes","1");
        Persona p2= new Persona("fede","Cortes","2");
        Persona p3= new Persona("nency","Coro","3");
        Persona p4= new Persona("jis","Coro","4");
        Persona p5= new Persona("mapa","Coro","5");


    Map<String,Persona> mapaComplejo = new HashMap<>();
    mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);

        System.out.println(mapaComplejo.get(3).getNombre());
        System.out.println(mapaComplejo.get(3).getApellidos());
    Persona pb = mapaComplejo.get("3");
        System.out.println(pb.getApellidos());
        System.out.println(pb.getNombre());

        for (String clave: mapaComplejo.keySet()) {

            System.out.println(mapaComplejo.get(clave).getNombre());

        }
    }
}
