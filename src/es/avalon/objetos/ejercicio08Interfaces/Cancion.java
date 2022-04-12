package es.avalon.objetos.ejercicio08Interfaces;

public class Cancion implements Reproducible{

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cancion(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public void play() {
        System.out.println("La cancion " + getTitulo() + " se reproduce");
    }

    @Override
    public void stop() {
        System.out.println("La cancion " + getTitulo() + " se para");
    }

    @Override
    public void siguiente() {
        System.out.println("Pasamos a la siguiente cancion");
    }

    @Override
    public void atras() {
        System.out.println("Pasamos a la anterior cancion");
    }
}
