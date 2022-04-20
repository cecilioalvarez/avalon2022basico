package es.avalon.testing.ejemplo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    private static List<Persona> lista = new ArrayList<>();
    static {

        lista.add(new Persona("1", "pedro", LocalDate.of(2010,10,10)));
        lista.add(new Persona("2", "maria", LocalDate.of(2010,10,10)));
        lista.add(new Persona("3", "Juan", LocalDate.of(1980,10,10)));
        lista.add(new Persona("4", "raul", LocalDate.of(2000,10,10)));
        lista.add(new Persona("5", "ana", LocalDate.of(2009,10,10)));
    }

    public Persona buscarPersonaPorDni(String dni) {
        for (Persona p: lista) {
            if (p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }
}
