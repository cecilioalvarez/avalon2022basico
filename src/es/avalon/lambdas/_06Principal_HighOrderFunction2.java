package es.avalon.lambdas;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _06Principal_HighOrderFunction2 {

    public static void main(String[] args) {

        Producto p1 = new Producto(1, "Ordenador", 100, "Informatica");
        Producto p2 = new Producto(2, "Mesa", 200, "Oficina");
        Producto p3 = new Producto(3, "Silla", 100, "Oficina");
        Producto p4 = new Producto(4, "Leche", 1, "Alimentacion");
        Producto p5 = new Producto(5, "Monitor", 200, "Informatica");
        Producto p6 = new Producto(6, "Aspirina", 2, "Farmacia");


        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);


        //Una funcion stream es un flujo de trabajo
        //Es convertir una lista en un flujo de trabajo (CONCEPTO DE STREAM)
        Stream<Producto> s = lista.stream();

        //High order function
        //s.forEach((p) ->System.out.println(p.getConcepto()));

        s.filter((p)-> p.getCategoria().equals("Informatica")) //Filtramos los productos que valgan menos de 1000
                .peek((p)->System.out.println("***" + p.getConcepto().toUpperCase() + "***")) //Imprime un mensaje adicional (PARECIDO A UN LOG)
                .filter(p->p.getImporte()<150) //Filtrame ahora los que tengan un importe menor a 150
                .map((p)->p.getConcepto()) // Mapeame el concepto
                .forEach((texto)-> System.out.println(texto)); //Imprimeme el texto del concepto mapeado

    }
}
