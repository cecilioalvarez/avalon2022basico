package es.avalon.Lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {

        Persona p1= new Persona("David",34);
        Persona p2= new Persona("Raul",2);
        Persona p3= new Persona("Miguel",30);
        Persona p4= new Persona("Raquel",33);

        Comparator<Persona> comparadorNombre= (Persona o1, Persona o2) -> {
                return o1.getNombre().compareTo(o2.getNombre());
        };

        Set<Persona> conjunto= new TreeSet<>();

        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for(Persona p: conjunto){

            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
