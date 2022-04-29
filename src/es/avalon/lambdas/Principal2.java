package es.avalon.lambdas;

import java.util.*;

public class Principal2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("pedro", 20);
        Persona p2 = new Persona("ana", 30);
        Persona p3 = new Persona("miguel", 50);
        Persona p4 = new Persona("maria", 60);

        // es la clase conjunto que permite tener una coleccion de elementos sin que haya repetidos
        //Set es un interface ,TreeSet es una implementación del interface

        //apuntador o una variable a una funcion
        Comparator<Persona> comparadorNombre= (Persona o1, Persona o2)-> {
                return o1.getNombre().compareTo(o2.getNombre());
        };

        Set<Persona> conjunto= new TreeSet<>(comparadorNombre);
        conjunto.add(p4);

        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);


        for (Persona p: conjunto) {

            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
