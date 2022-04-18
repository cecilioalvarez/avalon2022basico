package es.avalon.testing.Ejemplo001;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    private static List<Persona> lista = new ArrayList<>();

    static {//Bloque estatico

        lista.add(new Persona("1", "Jose", LocalDate.of(1980, 3, 14)));
        lista.add(new Persona("2", "Juan", LocalDate.of(1996, 1, 20)));
        lista.add(new Persona("3", "Ana", LocalDate.of(1952, 11, 21)));
        lista.add(new Persona("4", "Pedro", LocalDate.of(1963, 9, 15)));
        lista.add(new Persona("5", "Fernando", LocalDate.of(1975, 5, 3)));
        lista.add(new Persona("6", "Belen", LocalDate.of(1997, 12, 31)));
    }

    public Persona buscarPersonaPorDni(String dni) {
        for (Persona p : lista) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

}
