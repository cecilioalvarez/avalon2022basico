package es.avalon.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    @DisplayName("la persona es mayor de edad")
    @Test
    public void testMayorEdad() {

        Persona p1=
                new Persona("123","gomez", LocalDate.of(1970,10,10));
        assertTrue(p1.esMayorDeEdad());

        Persona p2=
                new Persona("123","gomez", LocalDate.of(2020,10,10));
        assertFalse(p2.esMayorDeEdad());

    }
}
