package es.avalon.objetos.EjemploObjetos021;

public class Pelicula implements Reproducir{
    @Override
    public void play() {
        System.out.println("Reproduciendo pelicula");
    }

    @Override
    public void stop() {
        System.out.println("Pelicula en pausa");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente pelicula");
    }

    @Override
    public void atras() {
        System.out.println("Pelicula anterior");
    }
}
