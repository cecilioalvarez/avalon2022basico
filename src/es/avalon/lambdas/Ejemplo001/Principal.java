package es.avalon.lambdas.Ejemplo001;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        Persona p1=new Persona("Pedro",20);
        Persona p2=new Persona("Ana",30);
        System.out.println(p2.compareTo(p2));
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));

        ArrayList<Persona>lista=new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("Ana",25));
        lista.add(new Persona("miguel",50));

        Collections.sort(lista);//Este metodo se apoya en CompareTo para ordenar la lista segun en criterio elegido

        for (Persona p:lista
             ) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }



    }
}
