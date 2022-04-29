package es.avalon.lambdas.Ejemplo001;

import java.util.*;

public class Principal2 {

    public static void main(String[] args) {
        Persona p1=new Persona("Pedro",20);
        Persona p2=new Persona("Ana",15);
        Persona p3=new Persona("Juan",25);
        Persona p4=new Persona("Ana",50);
        ArrayList<Persona>lista=new ArrayList<>();
        //Set es la clase conjunto que permite tener una coleccion de elemnetos sin que haya repetidos
        //Set es un interface, TreeSet es una implementaciondel interface
        //Clase anonima
        /*Comparator<Persona>comparadorNombre=new Comparator<Persona>() {//La linea 16 y 22 son equivalentes
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };*/
        Comparator<Persona>comparadorNombre= (Persona o1, Persona o2)->{ //La linea 16 y 22 son equivalentes
            return o1.getNombre().compareTo(o2.getNombre());

        };
        //Set<Persona>conjunto=new TreeSet<>(new ComparadorPersonaNombre());//Treeset es un conjunto ordenado
        Set<Persona>conjunto=new TreeSet<>(comparadorNombre);//Treeset es un conjunto ordenado

        Set<Persona>conjunto2=new HashSet<>();//HashSet es un conjunto sin ordenar
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        conjunto2.add(p1);
        conjunto2.add(p2);
        conjunto2.add(p3);
        conjunto2.add(p4);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);




        for (Persona p:conjunto
             ) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }
        System.out.println(".................");
        for (Persona p:conjunto2
        ) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }
        System.out.println(".................");
        for (Persona p:lista
        ) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }
        System.out.println(p2.hashCode()==p4.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p4));
    }

}
