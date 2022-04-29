package es.avalon.lambdas;

import java.util.ArrayList;

public class Principal4 {
    public static void main(String[] args) {

        Producto p1 = new Producto(1,"Ordenador", 100, "Informatica");
        Producto p2 = new Producto(2,"Mesa", 200, "Oficina");
        Producto p3 = new Producto(3,"Silla", 80, "Oficina");
        Producto p4 = new Producto(4,"Leche", 10, "Alimentacion");
        Producto p5 = new Producto(5,"Monitor", 300, "Informatica");
        Producto p6 = new Producto(6,"Aspirina", 5, "Farmacia");

        ArrayList<Producto> lista = new ArrayList<Producto>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        filtrarProductoPrecio(lista,(p)->p.getCategoria().equals("Oficina"));

    }

    public static void filtrarProductoPrecio(ArrayList<Producto> lista, FiltroProducto filtro){
        for (Producto p: lista){
            if (filtro.filtrar(p)){
                System.out.println(p.getConcepto());
            }
        }
    }

}
