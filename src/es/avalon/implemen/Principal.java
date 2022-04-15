package es.avalon.implemen;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Accesible> elemntos = new ArrayList<Accesible>();

        elemntos.add(new Candado());
        elemntos.add(new Taquilla(1));

        for (int i = 0 ; i< elemntos.size(); i++){

            elemntos.get(i).abrir();

        }
        for (int i = 0 ; i< elemntos.size(); i++){

            elemntos.get(i).cerrar();

        }
    }
}
