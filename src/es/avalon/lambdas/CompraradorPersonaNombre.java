package es.avalon.lambdas;

import java.util.Comparator;

public class CompraradorPersonaNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
