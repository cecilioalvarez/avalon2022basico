package es.avalon.Lambdas.Ejemplo1Introduccion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro",20);
        Persona p2 = new Persona ("Ana", 30);
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(p2));
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("Antonio",50));
        lista.add(new Persona("Maria",60));

        //Se apoya en compareTo() para tener la lista ordenada
        Collections.sort(lista);

        for (Persona p: lista){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
