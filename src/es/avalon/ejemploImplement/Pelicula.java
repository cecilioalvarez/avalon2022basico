package es.avalon.ejemploImplement;

public class Pelicula implements Reproducible{

    @Override
    public void play() {
        System.out.println("La pelicula ha empezado a reproducirce");
    }

    @Override
    public void stop() {
        System.out.println("La pelicula se ha detenido");
    }

    @Override
    public void siguiente() {
        System.out.println("La siguiente pelicula ha empezado a reproducirce");
    }

    @Override
    public void atras() {
        System.out.println("La anterior pelicula ha empezado a reproducirce");

    }
}
