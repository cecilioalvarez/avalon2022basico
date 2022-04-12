package es.avalon.objetos.ejemplo22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Reproducible> dispositivos = new ArrayList<Reproducible>();
        dispositivos.add(new Cancion());
        dispositivos.add(new Pelicula());

        for (Reproducible elemento : dispositivos){
            elemento.play();
            elemento.stop();
            elemento.next();
            elemento.previous();
        }
    }
}
