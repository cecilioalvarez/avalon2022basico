package es.avalon.Lambdas.Ejemplo1Introduccion;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro",20);
        Persona p2 = new Persona ("Ana", 30);
        Persona p3 = new Persona("Antonio",50);
        Persona p4 = new Persona("Maria",60);
        // es la clase conjunto que permite tener una coleccion de elementos sin que haya repetidos
        // Set es un interface, TreeSet es una implementacion del interface

        // Clase anonima
        Comparator<Persona> comparadorNombre = (Persona persona, Persona t1) -> {
                return persona.getNombre().compareTo(t1.getNombre());
        };
        Set<Persona> conjunto = new TreeSet<>(new ComparadorPersonaNombre());
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);
    }
}
