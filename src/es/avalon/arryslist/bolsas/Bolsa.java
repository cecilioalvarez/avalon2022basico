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

    public void addProductos(Producto producto){

        productos.add(producto);

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Bolsa(String color) {
        this.color = color;

    }

    public double getPrecioTotal(){
        double total=0;

        for (int i=0; i<productos.size();i++){
            total = total + productos.get(i).getPrecio();
        }
        return total;
    }
}
