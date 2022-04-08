package es.avalon.objetos.EjercicioArrayList;

public class Producto {
    private String nombre;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Producto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }


    }

