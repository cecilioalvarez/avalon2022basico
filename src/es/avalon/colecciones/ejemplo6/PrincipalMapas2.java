package es.avalon.colecciones.ejemplo6;

import java.util.HashMap;

public class PrincipalMapas2 {
    public static void main(String[] args){
        Persona p1=new Persona("1", "Mercedes", "alfonzo");
        Persona p2=new Persona("2", "ana", "alfonzo");
        Persona p3=new Persona("3", "pedro", "lopez");
        Persona p4=new Persona("4", "jose", "gonzalez");
        Persona p5=new Persona("5", "oscar", "blanco");

        HashMap<String,Persona> mapaComplejo= new HashMap<>();
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);

        System.out.println(mapaComplejo.get("3").getNombre());
        System.out.println(mapaComplejo.get("3").getApellido());
        /******/
        Persona pb= mapaComplejo.get("3");
        System.out.println(pb.getNombre());
        System.out.println(pb.getApellido());

    }

}
