package Objetos.Ejemplo014;

public class Disco {
    private String marca;
    private double capacidad;

    public Disco() {
    }

    public Disco(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
