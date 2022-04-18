package es.avalon.testing.test;

import es.avalon.testing.GestorPersona;
import es.avalon.testing.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GestorPersonaTest {

    GestorPersona gestor;



    @BeforeEach
    public void setUp(){
        //arrange inicalizacion inicializo un gestor persona con una lista
        // act  actuar acabo de llamar al constructor y cargar el gestor con una lista de personas por defecto
        gestor=new GestorPersona(generaLista());
    }

    @Test
    @DisplayName("comprueba que la lista no esta vacia y cargada con datos")
    public void listaPersonasNoEstaVaciaTest() {

        assertNotNull(gestor.getLista());
        assertArrayEquals(generaLista().toArray(), gestor.getLista().toArray());


    }



    private List<Persona> generaLista() {

        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("1","pedro", LocalDate.of(2010,10,10)));
        lista.add(new Persona("2","camila", LocalDate.of(2020,10,10)));
        lista.add(new Persona("3","genesis", LocalDate.of(2010,10,10)));
        lista.add(new Persona("4","abel", LocalDate.of(1980,10,10)));
        lista.add(new Persona("5","jose", LocalDate.of(2005,10,10)));
        return lista;


    }
}

