package es.avalon.objetos.Ejemplo22;

public class Pelicula implements Controles{
    private String titulo;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("La pelicula avanza");

    }

    @Override
    public void stop() {
        System.out.println("La pelicula para");

    }

    @Override
    public void next() {
        System.out.println("Siguiente palicula");

    }

    @Override
    public void back() {
        System.out.println("Pelicula anterior");

    }
}
