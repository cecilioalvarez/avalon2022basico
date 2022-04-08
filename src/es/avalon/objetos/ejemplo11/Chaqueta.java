package es.avalon.objetos.ejemplo11;

public class Chaqueta {

    private String color;
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chaqueta(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }
}
