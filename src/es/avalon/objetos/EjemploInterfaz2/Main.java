package es.avalon.objetos.EjemploInterfaz2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Reproducible> elementos= new ArrayList<Reproducible>();
        elementos.add(new Musica(1));
        elementos.add(new Pelicula("Karate a muerte en torremolinos"));

        for (int x=0 ;x<elementos.size();x++) {

            elementos.get(x).play();
            elementos.get(x).stop();
            elementos.get(x).siguiente();
            elementos.get(x).atras();

        }


    }

}
