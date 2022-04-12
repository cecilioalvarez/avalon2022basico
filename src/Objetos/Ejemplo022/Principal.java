package Objetos.Ejemplo022;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Reproducible> ls = new ArrayList<Reproducible>();
        ls.add(new Cancion());
        ls.add(new Pelicula());

        for (int i = 0; i < ls.size(); i++) {
            ls.get(i).play();
            ls.get(i).stop();
            ls.get(i).next();
            ls.get(i).back();
        }

    }
}
