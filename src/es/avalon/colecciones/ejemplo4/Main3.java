package es.avalon.colecciones.ejemplo4;

import java.util.HashMap;

public class Main3 {
        public static void main(String[] args) {

            Persona p1 = new Persona ("1", "pepe", "rodriguez");
            Persona p2 = new Persona ("2", "maria", "Fernandez");
            Persona p3 = new Persona ("3", "Juan", "Somoano");
            Persona p4 = new Persona ("4", "Raul", "Puerto");
            Persona p5 = new Persona ("5", "Luis", "Lucas");

            HashMap<String,Persona> mapaComplejo = new HashMap<String,Persona>();
            mapaComplejo.put(p1.getDni(),p1);
            mapaComplejo.put(p2.getDni(),p2);
            mapaComplejo.put(p3.getDni(),p3);
            mapaComplejo.put(p4.getDni(),p4);
            mapaComplejo.put(p5.getDni(),p5);

            System.out.println(mapaComplejo.get("3").getNombre());
            System.out.println(mapaComplejo.get("3").getApellidos());

            /*******/
           // Persona pb = mapaComplejo.get("3");
            //System.out.println(pb.getNombre());
            //System.out.println(pb.getApellidos());

            for (String clave : mapaComplejo.keySet()){

                System.out.println(mapaComplejo.get(clave).getNombre());
            }
        }
    }

