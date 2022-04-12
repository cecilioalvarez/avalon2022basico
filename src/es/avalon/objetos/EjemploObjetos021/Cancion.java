package es.avalon.objetos.EjemploObjetos021;

public class Cancion implements Reproducir{

    @Override
    public void play() {
        System.out.println("Reproduciendo cancion");
    }

    @Override
    public void stop() {
        System.out.println("Cancion en pausa");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente cancion");
    }

    @Override
    public void atras() {
        System.out.println("Cancion anterior");
    }
}
