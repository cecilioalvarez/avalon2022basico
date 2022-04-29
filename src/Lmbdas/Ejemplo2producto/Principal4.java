package Lmbdas.Ejemplo2producto;

import java.util.ArrayList;

public class Principal4 {
    public static void main(String[] args) {
        Producto p6 = new Producto(1,"ordenador",100,"informatica");
        Producto p1 = new Producto(1,"mesa",200,"oficina");
        Producto p2 = new Producto(1,"silla",100,"oficina");
        Producto p3 = new Producto(1,"leche",1,"alimentacion");
        Producto p4 = new Producto(1,"monitor",200,"informatica");
        Producto p5 = new Producto(1,"aspirina",2,"farmacia");


        ArrayList<Producto> lista = new ArrayList<Producto>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        filtrarProdcutoPrecio(lista,new FiltroProductoCaro());
        System.out.println("************************");
        filtrarProdcutoPrecio(lista,((p)->p.getCategoria().equals("farmacia")));
    }
    //esto es una high order function
    public static void filtrarProdcutoPrecio(ArrayList<Producto> lista, FiltroProducto filter){
        for(Producto p: lista){
            if(filter.filtar(p)){
                System.out.println(p.getConcepto());
            }
        }
    }

}
