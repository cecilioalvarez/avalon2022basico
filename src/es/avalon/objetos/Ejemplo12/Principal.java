package es.avalon.objetos.Ejemplo12;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Bolsa b1=new Bolsa("Roja");
        b1.addProducto(new Producto("Caja de Madera", 605));
        b1.addProducto(new Producto("Botella",400));
        b1.addProducto(new Producto("Bolligrafo",40));

        ArrayList<Producto>productos=b1.getProductos();

        for (int i=0;i<productos.size();i++){
            System.out.println(productos.get(i).getPeso()+" "+productos.get(i).getNombre());


        }
        System.out.println(b1.pesoProductos(b1.getProductos()));
        int peso=0;
        for (int i=0;i<b1.getProductos().size();i++){
            peso+=b1.getProductos().get(i).getPeso();

        }
        System.out.println(peso);
    }
}
