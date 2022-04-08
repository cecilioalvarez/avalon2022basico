package es.avalon.objetos.ejemplo12;

import java.util.ArrayList;

public class Bolsa {
    private String color;
    private ArrayList<Producto> productos= new ArrayList<Producto>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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

    public Bolsa(String color) {
        this.color = color;
    }

    //una forma de dividir la responsabildiad entre objetos
    public double getPrecioTotal() {
        double total=0;

        for (int i=0;i<productos.size();i++) {

           total=total+ productos.get(i).getPrecio();
        }
        return total;
    }

    // una funcion recibe un parametro y opera sobre el
    public   double getPrecioTotal( ArrayList<Producto> productos) {
        double total=0;

        for (int i=0;i<productos.size();i++) {

            total=total+ productos.get(i).getPrecio();
        }
        return total;
    }
}
