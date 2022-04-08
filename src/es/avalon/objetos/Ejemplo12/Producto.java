package es.avalon.objetos.Ejemplo12;

public class Producto {
    String nombre;
    int peso;

    public Producto(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Producto(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
