package es.avalon.Colecciones.Ejemplo003;

import java.util.HashMap;
import java.util.Map;

public class PrincipalMapas3 {
    public static void main(String[] args) {

        Persona p1= new Persona("1","pedro","gomez");
        Persona p2= new Persona("2","ana","sanchez");
        Persona p3= new Persona("3","gema","lopez");
        Persona p4= new Persona("4","david","blanco");
        Persona p5= new Persona("5","oscar","gutierrez");

        Map<String,Persona> mapaComplejo= new HashMap<>();
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);

        for (String clave: mapaComplejo.keySet()) {

            System.out.println(mapaComplejo.get(clave).getNombre());

        }

    }
}
