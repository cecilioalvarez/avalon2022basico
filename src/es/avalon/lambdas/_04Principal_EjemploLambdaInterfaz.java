package es.avalon.lambdas;

import java.util.ArrayList;

public class _04Principal_EjemploLambdaInterfaz {

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


        //Esto utiliza una clase que implementa la interfaz, pero se puede hacer mediante expresion Lambda sin necesidad de crear la
        //clase FiltroProductoCaro, ya que nuestra funcion de la clase principal ya implementa la interfaz
        filtrarProducto(lista, new FiltroProductoCaro());

        //Mediante el uso de una funcion que implemente una interfaz funcional podemos realizar funciones Lambdas como esta
        filtrarProducto(lista, (p)->p.getCategoria().equals("Informatica"));
    }




    //FUNCION DE ORDEN SUPERIOR
    //Estamos ante una funcion de orden superior que recibe un interfaz, pero esto es una funcion
    //Por lo que es una funcion que recibe como parametro otra funcion
    public static void filtrarProducto(ArrayList<Producto> lista, FiltroProducto filtro) {

        for (Producto p : lista){

            if(filtro.filtrar(p)){
                System.out.println(p.getConcepto());
            }
        }
    }
}
