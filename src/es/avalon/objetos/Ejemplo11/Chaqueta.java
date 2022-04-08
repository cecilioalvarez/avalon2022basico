package es.avalon.objetos.Ejemplo11;

public class Chaqueta {
    private String color;//Variables de la clase chaqueta (color y precio)
    private double precio;

    public Chaqueta(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

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

}
