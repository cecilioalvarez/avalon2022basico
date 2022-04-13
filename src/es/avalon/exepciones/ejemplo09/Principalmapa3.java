package es.avalon.exepciones.ejemplo09;

import java.util.HashMap;

public class Principalmapa3 {
    public static void main(String[] args) {
        Persona p1 = new Persona("1","pedri","cortes");
        Persona p2 = new Persona("2","cristian","buitrago");
        Persona p3 = new Persona("3","duvan","forero");
        Persona p4 = new Persona("4","jose","lopez");
        Persona p5 = new Persona("5","alirio","alvarez");

        HashMap<String, Persona> mapaComplejo = new HashMap<String, Persona>();
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);
    }

}
