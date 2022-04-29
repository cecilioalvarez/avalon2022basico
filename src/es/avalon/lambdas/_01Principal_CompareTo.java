package es.avalon.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class _01Principal_CompareTo {

    public static void main(String[] args) {


        Persona p1 = new Persona("Pedro", 20);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Julian", 30);

        //Utilizacion del metodo compareTo
        System.out.println("Uso de metodo compareTo\n");
        System.out.println("Si comparamos a Pedro de 20 años con Ana de 30 nos devuelve " + p1.compareTo(p2));
        System.out.println("Si comparamos a Ana de 30 años con Pedro de 20 nos devuelve " + p2.compareTo(p1));
        System.out.println("Si comparamos a Ana de 30 años con Julian de 30 nos devuelve " + p2.compareTo(p3));


        ArrayList<Persona> lista =new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("Miguel", 50));
        lista.add(new Persona("Maria", 60));


        //Este metodo se apoya en compareTo para ordenar la lista
        Collections.sort(lista);

        System.out.println("\n\nPodemos utilizar la funcion de Collections Collections.sort(lista) para pasarle una lista y nos la ordene");

        for (Persona p: lista) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }


    }
}
