package es.avalon.objetos.ejercicio08Interfaces;


import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Reproducible> elementos = new ArrayList<>();
        elementos.add(new Pelicula("El profesional"));
        elementos.add(new Cancion("Como un burro amarrado en la puerta de un baile"));

        for(int i=0; i<elementos.size(); i++){
            elementos.get(i).play();
            elementos.get(i).stop();
            elementos.get(i).siguiente();
            elementos.get(i).atras();
        }
    }
}
