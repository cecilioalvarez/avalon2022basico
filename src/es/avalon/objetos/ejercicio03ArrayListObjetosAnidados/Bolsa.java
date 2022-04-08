package es.avalon.objetos.ejercicio03ArrayListObjetosAnidados;

import java.util.ArrayList;

public class Bolsa {

    private String color;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public double getPesoTotal() {
        double total = 0;

        for(int i=0; i<productos.size(); i++){
            total = total + productos.get(i).getPeso();
        }

        return total;
    }

    //Funcion en el que le pasamos una bolsa y nos devuelve los productos que contiene
    public static void productosBolsa(Bolsa bolsa){
        System.out.println("\nLos productos de la bolsa " + bolsa.getColor() + " son los siguientes: \n");
        for (int i = 0; i<bolsa.getProductos().size(); i++){
            System.out.println("Producto nº" + (i+1) + ": " + bolsa.getProductos().get(i).getNombre() + " con un peso de " + bolsa.getProductos().get(i).getPeso() + " kg");
        }
    }



    public Bolsa(String color) {
        this.color = color;
    }

    public Bolsa(String color, ArrayList<Producto> productos) {
        this.color = color;
        this.productos = productos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
