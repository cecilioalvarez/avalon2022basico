package es.avalon.lambdas.Ejemplo001;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Principal5 {

    public static void main(String[] args) {



        Producto p1=new Producto(1,"ordenador",100,"informatica");
        Producto p2=new Producto(1,"mesa",200,"oficina");
        Producto p3=new Producto(1,"silla",100,"oficina");
        Producto p4=new Producto(1,"leche",1,"alimentacion");
        Producto p5=new Producto(1,"monitor",200,"informatica");
        Producto p6=new Producto(1,"aspirina",2,"farmacia");

        ArrayList<Producto> lista=new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);

        Stream<Producto> s=lista.stream();//Stream es convertir una lista en un flujo de trabajo.

        for (Producto p:lista
             ) {
            System.out.println(p.getConcepto());


        }
        System.out.println("...................");
        //la funcion es una high order function
        //s.forEach((p)-> System.out.println(p.getConcepto()));

        s.filter((p)->p.getImporte()<1000)
                .peek((p)-> System.out.println(p.getConcepto().toUpperCase()))//El peek es un foreach que no finaliza la lista
                .filter(p->p.getCategoria().equals("informatica"))
                .forEach((p)-> System.out.println(p.getConcepto()));




    }

}
