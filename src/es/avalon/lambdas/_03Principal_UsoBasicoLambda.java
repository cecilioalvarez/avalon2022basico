package es.avalon.lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class _03Principal_UsoBasicoLambda {


    public static void main(String[] args) {


        //USO BASICO DE FUNCION LAMBDA
        imprimirOrdenado((p1, p2)-> p1.getNombre().compareTo(p2.getNombre()));

        //USO BASICO DE FUNCION LAMBDA DE COMPARACION CON NUMEROS
        imprimirOrdenado((p1, p2)-> {
            return p1.getEdad() > p2.getEdad() ? 1: -1;
        });



    }

    public static void imprimirOrdenado(Comparator<Persona> comparator){
        Persona p1 = new Persona("Pedro", 40);
        Persona p2 = new Persona("Ana", 70);
        Persona p3 = new Persona("Miguel", 10);
        Persona p4 = new Persona("Maria", 60);

        Set<Persona> conjunto = new TreeSet<>(comparator);

        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for (Persona p : conjunto) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }
    }
}
