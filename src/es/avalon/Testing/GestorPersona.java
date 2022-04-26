package es.avalon.Testing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {
    private static List<Persona> lista = new ArrayList<>();
    static{
        lista.add(new Persona("123","Luisa", LocalDate.of(2000,5,5)));
        lista.add(new Persona("123","Pedro", LocalDate.of(1993,2,12)));
        lista.add(new Persona("123","Karina", LocalDate.of(1998,9,02)));
        lista.add(new Persona("123","Wilson", LocalDate.of(1991,5,5)));
        lista.add(new Persona("123","Ana", LocalDate.of(1996,11,22)));
    }

    public Persona buscarPersonaPorDni(String dni){
        for (Persona p:lista){
            if (p.getDni().equals(dni)){

            }
            return p;
        }
        return null;
    }
}
