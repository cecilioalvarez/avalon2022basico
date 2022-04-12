package es.avalon.objetos.ejemplo22;

public class Pelicula implements Reproducible{
    @Override
    public void play() {
        System.out.println("Reanuda/inicia la Pelicula");
    }

    @Override
    public void stop() {
        System.out.println("Para la Pelicula");

    }

    @Override
    public void next() {
        System.out.println("Pasa a la siguiente la Pelicula");

    }

    @Override
    public void previous() {
        System.out.println("vuelve a la anterior la Pelicula");

    }
}
