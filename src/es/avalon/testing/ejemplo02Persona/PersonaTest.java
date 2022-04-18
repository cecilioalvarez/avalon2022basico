package es.avalon.testing.ejemplo02Persona;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @DisplayName("La persona es mayor de edad")
    @Test
    public void testMayorEdad(){
        Persona p1 = new Persona("123456789N", "Juan Gomez", LocalDate.of(1992, 4,30));
        Persona p2 = new Persona("789456123N", "Jose Garcia", LocalDate.of(2014, 5,30));

        assertTrue(p1.esMayorEdad());
        assertFalse(p2.esMayorEdad());
    }


    @DisplayName("Que persona es mayor")
    @Test
    public void esMayor(){
        Persona p1 = new Persona("1", "Juan", LocalDate.of(2002,3,12));
        Persona p2 = new Persona("1", "Jose", LocalDate.of(2010,3,12));

        //Compara la igualdad entre dos objetos
        assertEquals(p1, Persona.esMayor(p1,p2));

        //Compara sio el objeto es el mismo en memoria
        assertSame(p1, Persona.esMayor(p1,p2));

    }

    @DisplayName("Busqueda por dni")
    @Test
    public void testGestorPersonaBusqueda(){
        GestorPersona gestor = new GestorPersona();
        //Buscamos si no nos devuelve nulo
        Persona p = gestor.buscarPersonaPorDNI("1");
        assertNotNull(p);

        //Buscamos que nos devuelva nulo
        Persona p2 = gestor.buscarPersonaPorDNI("10");
        assertNull(p2);
    }
}
