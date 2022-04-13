package Excepciones.Ejemplo009;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("1", "Andres","Diaz");
        Persona p2 = new Persona("2", "Yesid","Diaz");
        Persona p3 = new Persona("3", "Tania","Diaz");

        Map<String,Persona> mapa = new HashMap<>();
        mapa.put(p1.getDni(),p1);
        mapa.put(p2.getDni(),p2);
        mapa.put(p3.getDni(),p3);
        System.out.println(mapa.get("1").getApellido());
        System.out.println(mapa.get("2").getApellido());

        Persona pb = mapa.get("1");
        System.out.println(pb.getNombre());
        System.out.println(pb.getApellido());


    }
}
