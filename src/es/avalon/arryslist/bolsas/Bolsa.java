package es.avalon.arryslist.bolsas;

import java.util.ArrayList;

public class Bolsa {
    private String color;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addProductos(Producto productos){

        productos.add(productos);

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Bolsa(String color, ArrayList<Producto> productos) {
        this.color = color;

    }
}
