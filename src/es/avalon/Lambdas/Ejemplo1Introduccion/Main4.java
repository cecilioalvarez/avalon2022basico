package es.avalon.Lambdas.Ejemplo1Introduccion;

import java.util.ArrayList;

public class Main4 {
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

        filtrarProducto(lista,(p)->p.getCategoria().equals("farmacia"));

    }
//Funcion de orden superior o "High Order Function" es una funcion que en sus parametros es otra funcion

    public void imprimir(FiltroProducto filtro){

    }
    public static void filtrarProducto(ArrayList<Producto> lista, FiltroProducto filtro) {

        for (Producto p : lista) {
            if (filtro.filtrar(p)){

                System.out.println(p.getConcepto());
            }
        }
    }
}
