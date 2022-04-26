package es.avalon.Objetos.EjemploInterfaz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Interfaz> elementos= new ArrayList<Interfaz>();
        elementos.add(new Candado());
        elementos.add(new Taquilla(1));

        for (int x=0 ;x<elementos.size();x++) {

            elementos.get(x).abrir();
        }


    }

}
