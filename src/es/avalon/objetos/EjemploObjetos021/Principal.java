package es.avalon.objetos.EjemploObjetos021;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Reproducir> elementos = new ArrayList<>();
        elementos.add(new Cancion());
        elementos.add(new Reproductor(1));

        for (int i = 0; i < elementos.size(); i++) {
            elementos.get(i).play();
        }
    }
}
