package es.avalon.objetos.Ejemplo12;

import java.util.ArrayList;

public class Bolsa {
    private String color;
    private ArrayList<Producto> productos=new ArrayList<Producto>();

    public Bolsa(String color, ArrayList<Producto> productos) {
        this.color = color;
        this.productos = productos;
    }

    public Bolsa(String color) {
        this.color = color;
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

    public void addProducto (Producto producto){
        productos.add(producto);
    }


    public int pesoProductos(ArrayList <Producto> productos){
        int pesoTotal=0;
        for (int i=0;i<productos.size();i++) {
            pesoTotal += productos.get(i).getPeso();
        }
        return pesoTotal;
    }
}
