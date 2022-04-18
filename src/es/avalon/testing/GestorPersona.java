package es.avalon.testing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {
    private static List<Persona> lista=new ArrayList<>();

    public GestorPersona(List<Persona> lista) {
        this.lista=lista;
    }

    public static List<Persona> getLista() {
        return lista;
    }

    public static void setLista(List<Persona> lista) {
        GestorPersona.lista = lista;
    }

    public Persona buscarPersonaPorDni(String dni){
        for (Persona p:lista){
            if (p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }
}
