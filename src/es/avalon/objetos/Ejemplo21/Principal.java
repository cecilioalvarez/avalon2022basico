package es.avalon.objetos.Ejemplo21;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Taquilla t=new Taquilla(1);
        t.abrir();
        t.cerrar();

        ArrayList<Accesible>elementos=new ArrayList<Accesible>();
        elementos.add(new Candado(1));
        elementos.add(new Taquilla(1));

        for (int i=0;i< elementos.size();i++){
            elementos.get(i).abrir();
        }
    }
}
