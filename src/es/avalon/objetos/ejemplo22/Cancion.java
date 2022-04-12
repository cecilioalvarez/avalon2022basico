package es.avalon.objetos.ejemplo22;

public class Cancion implements Reproducible{
    @Override
    public void play() {
        System.out.println("Reanuda/inicia la cancion");
    }

    @Override
    public void stop() {
        System.out.println("Para la cancion");
    }

    @Override
    public void next() {
        System.out.println("Pasa a la siguiente cancion");
    }

    @Override
    public void previous() {
        System.out.println("Vuelve a la siguiente cancion");
    }
}
