package Lmbdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Andres",20);
        Persona p2 = new Persona("Ana",30);
        System.out.println(p1.compareTo(p2));//-1 otra persona mayor
        System.out.println(p2.compareTo(p1));//1 persona actual mayor
        System.out.println(p2.compareTo(p2));//edad igual
        ArrayList<Persona> lista = new ArrayList<Persona>();

        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("miguel",80));
        lista.add(new Persona("maria",60));

        Collections.sort(lista);//se apoya en compare to para tener ordenada la lista
        for (Persona p: lista){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }

    }
}
