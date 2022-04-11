package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){

        Bolsa bolsa=new Bolsa("verde");
        bolsa.addProducto(new Producto("manzanas",10));
        bolsa.addProducto(new Producto("peras",20));



        ArrayList<Producto> productos= bolsa.getProductos();
        //for (int i=0;i<productos.size();i++) {

           // System.out.println(productos.get(i).getNombre());
            //System.out.println(productos.get(i).getPeso());

        System.out.println(bolsa.getPesoTotal());



        }


    }

