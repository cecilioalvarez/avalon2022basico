package es.avalon.lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {
    public static void main(String[] args) {

        Persona  p1 = new Persona("Ana", 28);
        Persona  p2 = new Persona("Pedro", 30);
        Persona p3 = new Persona("maria",20);
        Persona p4= new Persona("anderson",25);

        //Es la clase conjunto que permite tener una coleccion de elementos sin que haya repetidos
        //set es una interface, treeset es una implementaion de interface
        Comparator<Persona> comparadorNombre= new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };

        Set<Persona> conjunto= new TreeSet<>(comparadorNombre);
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for (Persona p:conjunto){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
