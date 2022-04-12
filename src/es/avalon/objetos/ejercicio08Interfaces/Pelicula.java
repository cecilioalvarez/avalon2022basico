package es.avalon.objetos.ejercicio08Interfaces;

public class Pelicula implements  Reproducible{

    private String titulo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("La pelicula " + getTitulo() + " se reproduce");
    }

    @Override
    public void stop() {
        System.out.println("La pelicula " + getTitulo() + " se para");
    }

    @Override
    public void siguiente() {
        System.out.println("Pasamos a la siguiente pelicula");
    }

    @Override
    public void atras() {
        System.out.println("Pasamos a la anterior pelicula");
    }
}
