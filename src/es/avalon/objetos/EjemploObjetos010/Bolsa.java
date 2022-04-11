package es.avalon.objetos.EjemploObjetos010;

import java.util.ArrayList;

public class Bolsa {
    private String color;

    private ArrayList<Producto> productos = new ArrayList<>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //Metodos
    public void addProducto(Producto producto){
        productos.add(producto);
    }

    //Una forma de dividir la responsabilidad entre objetos
    public double getPrecioTotal(){
        double total=0;
        for (int i = 0; i < productos.size(); i++) {
            total=total + productos.get(i).getPrecio();
        }
        return total;
    }



    public Bolsa(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
