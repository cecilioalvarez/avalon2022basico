package es.avalon.objetos.EjemploObjetos009;

public class Chaqueta {
    private String color;
    private double precio;

    //Getters and Setters
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

    //Constructor
    public Chaqueta(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }
}

