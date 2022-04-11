package es.avalon.objeto.ejemplo12;

import java.util.ArrayList;


public class Bolsa {

    private String color;
    private ArrayList<Producto> Producto= new ArrayList<Producto>();

    public ArrayList<Producto> getProducto() {
        return Producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        Producto = producto;
    }
    public void addProducto(Producto producto){
        Producto.add(producto);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bolsa(String color) {
        this.color = color;
    }
}
