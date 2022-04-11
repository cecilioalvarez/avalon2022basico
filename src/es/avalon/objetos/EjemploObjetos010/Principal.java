package es.avalon.objetos.EjemploObjetos010;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Creo el objeto bolsa
        Bolsa bolsa1 = new Bolsa("verde");

        //Creo dos productos y las añado a bolsa
        bolsa1.addProducto(new Producto("atun", 5));
        bolsa1.addProducto(new Producto("Pasta", 8));

        //Obtengo la lista de producto de la bolsa
        ArrayList<Producto> productos = bolsa1.getProductos();
        //Recorro la lista de productos e imprimo su precio y nombre
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getNombre());
            System.out.println(productos.get(i).getPrecio());
        }
        System.out.println(bolsa1.getPrecioTotal());
    }
}
