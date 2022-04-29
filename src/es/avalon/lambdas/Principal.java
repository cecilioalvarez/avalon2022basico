package es.avalon.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        Persona  p1 = new Persona("nombre", 28);
        Persona  p2 = new Persona("anderson", 30);
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(p2));
        ArrayList<Persona> lista = new ArrayList<Persona>();

        lista.add(p1);
        lista.add(p1);
        lista.add(new Persona("miguel",20));
        lista.add(new Persona("Andres",25));

        //Se apoya en comparar para tener la lista
        Collections.sort(lista);

        for (Persona p:lista){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }

    }


}
