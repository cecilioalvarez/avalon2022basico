package es.avalon.Objetos.EjercicioArrayList;

import java.util.ArrayList;

public class Compra {
        public static void main(String[] args) {
            Bolsa bolsa = new Bolsa();
            bolsa.setColor("Blanca");
            bolsa.addProducto(new Producto("Carne",2.1));
            bolsa.addProducto(new Producto("Pescado", 1.5));
            bolsa.addProducto(new Producto("Fruta y Verdura",3.0));
            bolsa.addProducto(new Producto("Varios",10.589));

            System.out.println(bolsa.getColor());

            ArrayList<Producto> nuevosProducto = bolsa.getProducto();
            for (int x=0; x<nuevosProducto.size();x++){
                System.out.println(nuevosProducto.get(x).getNombre()+ " " + nuevosProducto.get(x).getPeso());

            }
        
    }
}
