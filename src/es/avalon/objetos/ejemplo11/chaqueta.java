package es.avalon.objetos.ejemplo11;

public class chaqueta {
    private String color;
    private double precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public chaqueta(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }
}
