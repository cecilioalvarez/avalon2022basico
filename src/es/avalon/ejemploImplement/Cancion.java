package es.avalon.ejemploImplement;

public class Cancion implements Reproducible{
    @Override
    public void play() {
        System.out.println("La canción ha empezado a reproducirce");
    }

    @Override
    public void stop() {
        System.out.println("La canción se ha detenido");
    }

    @Override
    public void siguiente() {
        System.out.println("La siguiente canción ha empezado a reproducirce");
    }

    @Override
    public void atras() {
        System.out.println("La anterior canción ha empezado a reproducirce");

    }
}
