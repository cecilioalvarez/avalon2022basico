package es.avalon.objetos.Ejemplo22;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList <Controles> elementos= new ArrayList<>();

        elementos.add(new Cancion("El tiburon"));
        elementos.add(new Pelicula("Titanic"));

        for (Controles elemento : elementos) {
            elemento.play();
            elemento.stop();
            elemento.next();
            elemento.back();
        }
    }
}
