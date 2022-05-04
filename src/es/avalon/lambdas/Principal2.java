package es.avalon.lambdas;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {
    public static void main(String[] args) {
        Persona persona1=new Persona("Maria",25);
        Persona persona2=new Persona("Gabriel",30);
        Persona persona3=new Persona("Ana",50);
        Persona persona4=new Persona("Jose",60);

        // es la clase conjunto que eprmite tener una coleccion de elementos sin que haya repetidos
        // Set es una interface, TreeSet es una implementacion del inteface

        Comparator<Persona> comparadorNombre= new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };
        Set<Persona> conjunto=new TreeSet<>(comparadorNombre);
        conjunto.add(persona1);
        conjunto.add(persona2);
        conjunto.add(persona3);
        conjunto.add(persona4);

        for (Persona p:conjunto){

            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
