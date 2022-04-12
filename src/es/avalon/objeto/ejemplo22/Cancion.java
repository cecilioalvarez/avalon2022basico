package es.avalon.objeto.ejemplo22;

public class Cancion implements Reproducible {

    public Cancion() {
        super();
    }

    @Override
    public void play() {
        System.out.println(" la Cancion se esta Reproduciendo");

    }

    @Override
    public void stop() {
        System.out.println("La Cancion esta Pausada");

    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente Cancion");

    }

    @Override
    public void atras() {
        System.out.println("Devolver");

    }
}
