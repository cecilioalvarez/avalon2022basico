package es.avalon.testing.ejemplo02Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    private static List<Persona> lista = new ArrayList<>();

    static {
        lista.add(new Persona("1", "Pedro",LocalDate.of(2000,10,28)));
        lista.add(new Persona("2", "Juan",LocalDate.of(2020,10,28)));
        lista.add(new Persona("3", "Ana",LocalDate.of(2010,10,28)));
        lista.add(new Persona("4", "Maria",LocalDate.of(1980,10,28)));
        lista.add(new Persona("5", "Gema",LocalDate.of(2005,10,28)));
    }

    public Persona buscarPersonaPorDNI(String dni){

        for (Persona p:lista){
            if(p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }
}
