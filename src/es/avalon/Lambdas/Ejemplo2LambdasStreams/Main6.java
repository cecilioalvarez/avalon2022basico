package es.avalon.Lambdas.Ejemplo2LambdasStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        Producto p6 = new Producto(1, "ordenador", 100, "Informatica");
        Producto p1 = new Producto(2, "mesa", 200, "oficina");
        Producto p2 = new Producto(3, "silla", 100, "oficina");
        Producto p3 = new Producto(4, "leche", 1, "Informatica");
        Producto p4 = new Producto(5, "monitor", 200, "Informatica");
        Producto p5 = new Producto(6, "Aspirina", 2, "Farmacia");

        ArrayList<Producto> lista = new ArrayList<Producto>();
        lista.add(p6);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        //Convierte una lista en un flujo de trabajo.
        Stream<Producto> s = lista.stream();

        //s.forEach((p) -> System.out.println(p.getConcepto()));


        s.filter((p) -> p.getCategoria().equals("Informatica"))
                .peek( (p) -> System.out.println(p.getConcepto().toUpperCase()))
                .filter(p -> p.getImporte()<150)
                .map((p) -> p.getConcepto())
                //Dentro de parentesis (texto) se le da el nombre que se quiera a la variable a utilizar
                .forEach( (texto) -> System.out.println(texto));
    }
}

