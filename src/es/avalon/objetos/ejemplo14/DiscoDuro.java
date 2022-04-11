package es.avalon.objetos.ejemplo14;

public class DiscoDuro {

    private String marca;
    private double capacidad;

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

    public DiscoDuro(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }
}
