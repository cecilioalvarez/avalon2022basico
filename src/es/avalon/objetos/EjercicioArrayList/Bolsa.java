package es.avalon.objetos.EjercicioArrayList;

import java.util.ArrayList;

public class Bolsa {
    private String color;
    private double peso;

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    }



