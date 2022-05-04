package es.avalon.lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal3 {

    public static void main(String[] args) {


        imprimirOrdenado(new ComparadorpersonaEdad());
        //paso parametro de una funcion
        imprimirOrdenado((persona1,persona2)->persona1.getNombre().compareTo(persona2.getNombre()));

        imprimirOrdenado((persona1,persona2)->{
            return persona1.getEdad()>persona2.getEdad()? 1:-1;
        });
    }
    public static void imprimirOrdenado(Comparator<Persona> comparador){


        Persona persona1=new Persona("Maria",25);
        Persona persona2=new Persona("Gabriel",30);
        Persona persona3=new Persona("Ana",50);
        Persona persona4=new Persona("Jose",60);
        Set<Persona> conjunto=new TreeSet<>(comparador);
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
