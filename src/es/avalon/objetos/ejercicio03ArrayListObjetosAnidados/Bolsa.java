package es.avalon.objetos.ejercicio03ArrayListObjetosAnidados;

import java.util.ArrayList;

public class Bolsa {

    private String color;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public void addProducto(Producto producto){
        productos.add(producto);
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
