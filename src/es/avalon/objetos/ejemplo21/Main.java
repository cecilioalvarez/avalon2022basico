package es.avalon.objetos.ejemplo21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Accesible> elementos = new ArrayList<Accesible>();
        elementos.add(new Candado());
        elementos.add(new Taquilla(4));

        for (Accesible elemento : elementos) {
            elemento.abrir();
        }
    }
}
