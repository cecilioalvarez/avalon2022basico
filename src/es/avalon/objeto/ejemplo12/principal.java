package es.avalon.objeto.ejemplo12;

import java.util.ArrayList;

public class principal {

    public static void main(String[] args) {

        Bolsa B= new Bolsa("ROJO");
        B.addProducto(new Producto("carne" , 60));

        ArrayList<Producto> ProductoBolsa= B.getProducto();
        for (int i=0;i< ProductoBolsa.size();i++) {

            System.out.println(ProductoBolsa.get(i).getNombre());
            System.out.println(ProductoBolsa.get(i).getPeso());

        }
    }

}
