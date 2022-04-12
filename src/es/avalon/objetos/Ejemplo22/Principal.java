package es.avalon.objetos.Ejemplo22;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList <Controles> elementos=new ArrayList<Controles>();

        elementos.add(new Cancion("El tiburon"));
        elementos.add(new Pelicula("Titanic"));

        for (int i=0;i< elementos.size();i++){
            elementos.get(i).play();
            elementos.get(i).stop();
            elementos.get(i).next();
            elementos.get(i).back();
        }
    }
}
