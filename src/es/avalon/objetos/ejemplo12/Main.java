package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bolsa bolsa1 = new Bolsa();
        bolsa1.setColor("Bolsa Morada");
        bolsa1.addProducto(new Producto("Tomate",2));
        bolsa1.addProducto(new Producto("Mermelada", 3));
        bolsa1.addProducto(new Producto("Mantequilla",5));

        System.out.println(bolsa1.getColor());

        ArrayList<Producto> nuevosProducto = bolsa1.getProducto();
            System.out.println(bolsa1.getPesoTotal());


        }
    }

