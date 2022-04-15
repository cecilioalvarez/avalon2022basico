package es.avalon.ejemploImplement;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Reproducible> reproducibles = new ArrayList<>();

        reproducibles.add(new Cancion());
        reproducibles.add(new Pelicula());

        for (int i=0; i<reproducibles.size();i++ ){

            reproducibles.get(i).play();
            reproducibles.get(i).stop();
            reproducibles.get(i).atras();
            reproducibles.get(i).siguiente();
        }
    }
}
