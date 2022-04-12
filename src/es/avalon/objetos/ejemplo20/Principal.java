package es.avalon.objetos.ejemplo20;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Accesible> elementos= new ArrayList<Accesible>();
        elementos.add(new Candado());
        elementos.add(new Taquilla(1));

        for (int i=0 ;i<elementos.size();i++) {

                elementos.get(i).abrir();
        }


    }
}
