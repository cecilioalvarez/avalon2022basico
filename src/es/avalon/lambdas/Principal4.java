package es.avalon.lambdas;


import java.util.ArrayList;

public class Principal4 {

    public static void main(String[] args) {

        Producto p1= new Producto(1,"ordenador",100,"informatica");
        Producto p2= new Producto(2,"mesa",200,"oficina");
        Producto p3= new Producto(3,"silla",100,"oficina");
        Producto p4= new Producto(4,"leche",1,"alimentacion");
        Producto p5= new Producto(5,"monitor",200,"informatica");
        Producto p6= new Producto(6,"aspirina",2,"farmacia");

        ArrayList<Producto> lista= new ArrayList<Producto>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        //filtrarProductoPrecio(lista,new FiltroProductoCaro());
        filtrarProducto(lista,(p)->p.getCategoria().equals("farmacia"));

    }


    // esto es un high order function
    public static void filtrarProducto(ArrayList<Producto> lista, FiltroProducto filtro) {

        for (Producto p: lista) {

            if (filtro.filtrar(p)) {

                System.out.println(p.getConcepto());
            }
        }

    }

}
