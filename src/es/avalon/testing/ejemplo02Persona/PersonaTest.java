package es.avalon.testing.ejemplo02Persona;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    @DisplayName("La persona es mayor de edad")
    @Test
    public void testMayorEdad(){
        Persona p1 = new Persona("123456789N", "Juan Gomez", LocalDate.of(1992, 4,30));
        Persona p2 = new Persona("789456123N", "Jose Garcia", LocalDate.of(2014, 5,30));

        assertTrue(p1.esMayorEdad());
        assertFalse(p2.esMayorEdad());
    }
}
