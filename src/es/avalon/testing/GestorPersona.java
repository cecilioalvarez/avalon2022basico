package es.avalon.testing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {

    // variable privada
    private List<Persona> lista = new ArrayList<>();

    public GestorPersona(List<Persona> lista) {

        this.lista = lista;
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
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
