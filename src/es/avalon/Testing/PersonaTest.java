package es.avalon.Testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @DisplayName("La persona es mayor de edad")
    @Test
    public void testMayorEdad(){
        Persona p1= new Persona("123","Wilson", LocalDate.of(1991,11,10));
        assertTrue(p1.esMayorEdad());

        Persona p2= new Persona("123","Ana", LocalDate.of(1996,11,23));
        assertTrue(p2.esMayorEdad());

    }

    @Test
    public void testPersonaBusqueda(){
        GestorPersona gestor = new GestorPersona();
        Persona p = gestor.buscarPersonaPorDni("1");
        assertNotNull(p);
        Persona p2 = gestor.buscarPersonaPorDni("10");
        assertNotNull(p2);
    }

    @Test
    public void testPersonaMayor(){
        Persona p1 = new Persona("123","Wilson", LocalDate.of(1991,11,10));
        Persona p2 = new Persona("122","Pedro", LocalDate.of(1993,2,12));
        Persona p3 = Persona.esMayor(p1,p2);
        assertSame(p3,p1);
    }

}
