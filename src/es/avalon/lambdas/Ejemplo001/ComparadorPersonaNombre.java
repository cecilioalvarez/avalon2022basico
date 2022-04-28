package es.avalon.lambdas.Ejemplo001;

import java.util.Comparator;

public class ComparadorPersonaNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
