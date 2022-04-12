package es.avalon.objetos.EjemploInterfaz2;

public class Pelicula implements Reproducible{

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void play() {
        System.out.println("Comienza la pelicula");
    }

    @Override
    public void stop() {
        System.out.println("Detenida la pelicula");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente frame");
    }

    @Override
    public void atras() {
        System.out.println("Volver al anterior frame");
    }
}
