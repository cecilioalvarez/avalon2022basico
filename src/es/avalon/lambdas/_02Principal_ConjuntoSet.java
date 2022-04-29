package es.avalon.lambdas;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _02Principal_ConjuntoSet {

    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", 20);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Miguel", 50);
        Persona p4 = new Persona("Maria", 60);
        Persona p5 = new Persona("Maria", 60);


        //Esta clase llamada "Conjunto" permite tener una coleccion de elementos sin que haya repetidos
        //Set es un interfaz, TreeSet es una implementacion del interfaz
        Set<Persona> conjuntoTreeSet = new TreeSet<>(); //Atencion, esto funciona sin pasar un comparador al TreeSet y HashSet por que lo implementamos en la clase Persona
        Set<Persona> conjuntoHashSet = new HashSet<>();


        System.out.println("\n\nUn conjunto permite tener una coleccion de elementos sin que se repitan\n\n");


        conjuntoTreeSet.add(p2);
        conjuntoTreeSet.add(p3);
        conjuntoTreeSet.add(p1);
        //Metemos 2 iguales pero solo devolvera 1
        conjuntoTreeSet.add(p4);
        conjuntoTreeSet.add(p5);


        conjuntoHashSet.add(p2);
        conjuntoHashSet.add(p3);
        conjuntoHashSet.add(p1);
        conjuntoHashSet.add(p4);
        conjuntoHashSet.add(p5);






        System.out.println("Conjunto TreeSet : Ordenado por la propiedad del interfaz comparable (En este caso edad)");
        //Saldran sin ordenar
        for (Persona p : conjuntoTreeSet) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }

        System.out.println("\nConjunto HashSet : No ordenado");
        for (Persona p : conjuntoHashSet) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }



        //////FUNCIONES LAMBDA



        //Set<Persona> conjuntoTreeSet = new TreeSet<>(new ComparadorPersonaNombre()); Podemos usar otra comparacion si la hemos implementado
        /*Como la linea de arriba nos obligaria crear una clase por cada comparacion que queramos realizar
         * Lo que podemos hacer es una "Clase Anonima" sobre la marcha y asi evitar
         * crear 1 archivo de clase para esta simple comparacion */
        Comparator<Persona> comparadorNombre = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };


        /*Ahora lo podemos usar de la siguiente forma*/
        Set<Persona> conjuntoTreeSetConClaseAnonima = new TreeSet<>(comparadorNombre);

        conjuntoTreeSetConClaseAnonima.add(p2);
        conjuntoTreeSetConClaseAnonima.add(p3);
        conjuntoTreeSetConClaseAnonima.add(p1);
        conjuntoTreeSetConClaseAnonima.add(p4);
        conjuntoTreeSetConClaseAnonima.add(p5);


        System.out.println("\nConjunto TreeSet : Ordenado por la propiedad comparable de la clase anonima, en este caso por nombre");
        for (Persona p : conjuntoTreeSetConClaseAnonima) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }





        //AHORA BIEN, EN JAVA 8 ESTO CAMBIA Y SE REALIZA ASI
        //FUNCION LAMBDA (Apuntador o una variable a una funcion)
        Comparator<Persona> comparadorNombreConLambda = (Persona persona1, Persona persona2) -> {
            return persona1.getNombre().compareTo(persona2.getNombre());
        };

        /*Ahora lo podemos usar de la siguiente forma*/
        Set<Persona> conjuntoTreeSetConLambda = new TreeSet<>(comparadorNombreConLambda);

        conjuntoTreeSetConLambda.add(p2);
        conjuntoTreeSetConLambda.add(p3);
        conjuntoTreeSetConLambda.add(p1);
        conjuntoTreeSetConLambda.add(p4);
        conjuntoTreeSetConLambda.add(p5);


        System.out.println("\n\n FUNCION LAMBDA");
        System.out.println("\nConjunto TreeSet : Ordenado por la propiedad comparable de la funcion Lambda, en este caso por nombre");
        for (Persona p : conjuntoTreeSetConLambda) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }

    }
}
