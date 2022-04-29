package Lmbdas.Ejemplo3productoLambdaEnFor;

import Lmbdas.Ejemplo2producto.Producto;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        Lmbdas.Ejemplo2producto.Producto p6 = new Lmbdas.Ejemplo2producto.Producto(1,"ordenador",100,"informatica");
        Lmbdas.Ejemplo2producto.Producto p1 = new Lmbdas.Ejemplo2producto.Producto(1,"mesa",200,"oficina");
        Lmbdas.Ejemplo2producto.Producto p2 = new Lmbdas.Ejemplo2producto.Producto(1,"silla",100,"oficina");
        Lmbdas.Ejemplo2producto.Producto p3 = new Lmbdas.Ejemplo2producto.Producto(1,"leche",1,"alimentacion");
        Lmbdas.Ejemplo2producto.Producto p4 = new Lmbdas.Ejemplo2producto.Producto(1,"monitor",200,"informatica");
        Lmbdas.Ejemplo2producto.Producto p5 = new Lmbdas.Ejemplo2producto.Producto(1,"aspirina",2,"farmacia");


        ArrayList<Lmbdas.Ejemplo2producto.Producto> lista = new ArrayList<Producto>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        Stream<Producto> S = lista.stream();
        S.forEach((p)-> System.out.println(p.getConcepto()));
    }
}
