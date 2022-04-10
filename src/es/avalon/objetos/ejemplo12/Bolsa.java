package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;

public class Bolsa {
    private String color;

    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public double getPesoTotal() {

        double total = 0;

        for (int i = 0; i < productos.size(); i++) {
            total= total+productos.get(i).getPeso();
        }
        return total;
    }

    public ArrayList<Producto> getProducto() {
        return productos;
    }

    public void addProducto(Producto producto) {

        productos.add(producto);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
