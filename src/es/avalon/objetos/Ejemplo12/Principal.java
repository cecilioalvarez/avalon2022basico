package es.avalon.objetos.Ejemplo12;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Bolsa b1=new Bolsa("Roja");
        b1.addProducto(new Producto("cajaMadera", 605));
        b1.addProducto(new Producto("botella",400));
        b1.addProducto(new Producto("bolligrafo",40));

        ArrayList<Producto>productos=b1.getProductos();

        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).getPeso()+" "+productos.get(i).getNombre());


        }
        System.out.println(b1.pesoProductos(b1.getProductos()));
    }
}
