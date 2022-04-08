package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Bolsa bolsa= new Bolsa("azul");
        Producto p1= new Producto("fruta",20);
        Producto p2= new Producto("leche",1);
        Producto p3= new Producto("chocolate",2);
        Producto p4= new Producto("yogur",1);
        ArrayList<Producto> lista= new ArrayList<Producto>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        bolsa.getPrecioTotal(lista);




        //System.out.println(bolsa.getPrecioTotal());
        System.out.println(bolsa.getPrecioTotal());

    }
}
