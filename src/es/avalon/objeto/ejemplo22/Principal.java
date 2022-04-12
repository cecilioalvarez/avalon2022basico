package es.avalon.objeto.ejemplo22;
import es.avalon.objeto.ejemplo21.Accesible;
import es.avalon.objeto.ejemplo21.Candado;
import es.avalon.objeto.ejemplo21.Taquilla;

import java.util.ArrayList;

public class Principal {
    public static void main (String[]  args) {
        ArrayList<Reproducible> elementos= new ArrayList<Reproducible>();
        elementos.add(new Cancion());
        elementos.add(new Pelicula("RED"));

        for (int i=0 ;i<elementos.size();i++) {

            elementos.get(i).play();

        }
    }

    }
