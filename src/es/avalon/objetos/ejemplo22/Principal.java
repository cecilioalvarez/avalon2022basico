package es.avalon.objetos.ejemplo22;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Reproducible> reproducciones=new ArrayList<Reproducible>();
        reproducciones.add(new Cancion("Ding Dong"));
        reproducciones.add(new Pelicula("Shrek"));

        for (int i = 0; i < reproducciones.size(); i++) {

            reproducciones.get(i).Play();
        }

    }
}
