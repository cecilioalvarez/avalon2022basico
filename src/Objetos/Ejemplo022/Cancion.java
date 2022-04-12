package Objetos.Ejemplo022;

public class Cancion implements Reproducible{



    @Override
    public void play() {
        System.out.println("la canción reproduce");
    }

    @Override
    public void stop() {
        System.out.println("la canción para");
    }

    @Override
    public void next() {
        System.out.println("la canción siguiente");
    }

    @Override
    public void back() {
        System.out.println("la canción anterior");
    }
}
