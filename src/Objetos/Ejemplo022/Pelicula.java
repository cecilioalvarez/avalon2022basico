package Objetos.Ejemplo022;

public class Pelicula  implements  Reproducible{


    @Override
    public void play() {
        System.out.println("la pelicula reproduce");
    }

    @Override
    public void stop() {
        System.out.println("la pelicula para");
    }

    @Override
    public void next() {
        System.out.println("la pelicula siguiente");
    }

    @Override
    public void back() {
        System.out.println("la pelicula anterior");
    }
}
