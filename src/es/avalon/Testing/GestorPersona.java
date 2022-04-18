package es.avalon.Testing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    private static List<Persona> lista= new ArrayList<>();
    static {
        lista.add(new Persona("1","David", LocalDate.of(1987,8,22)));
        lista.add(new Persona("2","Raul", LocalDate.of(2020,7,19)));
        lista.add(new Persona("3","Miguel", LocalDate.of(1991,12,19)));
        lista.add(new Persona("4","Tere", LocalDate.of(1965,2,9)));

    }

    public Persona buscarPersonaPorDni(String dni) {
        for (Persona persona : lista) {

            if (persona.getDni().equals(dni)) {

                return persona;
            }
        }
        return null;
    }
}
