package Lmbdas.Ejemplo1personaComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Andres",20);
        Persona p2 = new Persona("Ana",30);
        Persona p3 =new Persona("miguel",80);
        Persona p4 = new Persona("maria",60);
        //Es la clase conjunto que permite tener una coleccion de elelemtnos sin que hayas repetidos
        //Set es una interfaz, TreeSet es una implementacion de interfaz
        //Set<Persona> conjunto = new HashSet<>();//(new ComparadorPersonaNombre());//similar a lista pero sin elementos repetidos


        //aputador a una variable a una funcion
        Comparator<Persona> comparador = new Comparator<Persona>() {// clase anonima evita crear una clase
                                                                    // aparte para implementar el metodo compareto
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
            Comparator<Persona> comparador1 = (Persona o1, Persona o2)->  {
                return o1.getNombre().compareTo(o2.getNombre());
            };

        };
        Set<Persona> conjunto = new TreeSet<Persona>(comparador);
        conjunto.add(p4);
        conjunto.add(p1);
        conjunto.add(p3);
        conjunto.add(p2);

        for (Persona p: conjunto){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }


    }
}
