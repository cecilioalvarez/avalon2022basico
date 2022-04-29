package es.avalon.lambdas.Ejemplo001;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal3 {

    public static void main(String[] args) {

        //imprimirOrdenado(new ComparadorPersonaNombre());
        imprimirOrdenado((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("...........");
        imprimirOrdenado(new ComparadorPersonaNombre());

        imprimirOrdenado((p1,p2)->{
            return p1.getEdad()>p2.getEdad()? 1:-1;
        });

    }
    public static void imprimirOrdenado(Comparator<Persona> comparador){
        Persona p1=new Persona("Pedro",20);
        Persona p2=new Persona("Ana",15);
        Persona p3=new Persona("Juan",25);
        Persona p4=new Persona("Luis",50);
        Set<Persona> conjunto=new TreeSet<>(comparador);
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for (Persona p: conjunto
             ) {
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }
    }

}
