package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;

public class Bolsa {
    private String color;
    private double pesoBolsa;

    private ArrayList<Producto> productos = new ArrayList<Producto>();

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

    public double getPesoBolsa() {
        return pesoBolsa;
    }

    public void setPesoBolsa(double pesoBolsa) {
        this.pesoBolsa = pesoBolsa;
    }
}
