package es.avalon.lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal3 {

    public static void main(String[] args) {


        //imprimirOrdenado(new ComparadorPersonaEdad());
        // paso como parametro una funcion
        imprimirOrdenado(( p1, p2)->p1.getNombre().compareTo(p2.getNombre()));

        imprimirOrdenado(( p1, p2)-> {
            return p1.getEdad()>p2.getEdad()? 1:-1;
        });
    }

    public static void imprimirOrdenado(Comparator<Persona> comparador) {

        Persona p1 = new Persona("pedro", 20);
        Persona p2 = new Persona("ana", 30);
        Persona p3 = new Persona("miguel", 50);
        Persona p4 = new Persona("maria", 60);
        Set<Persona> conjunto= new TreeSet<>(comparador);
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for(Persona p: conjunto) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }

}
