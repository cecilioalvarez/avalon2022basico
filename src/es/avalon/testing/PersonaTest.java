package es.avalon.testing;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.AssertJUnit.assertTrue;

public class PersonaTest {
    @DisplayName("la persona es mayor de edad")
    @Test
    public void testMayorEdad(){
        Persona p1= new Persona("123","edwin", LocalDate.of(1998,1,1));
        assertTrue(p1.esMayorDeEdad());

        Persona p2= new Persona("123","edwin", LocalDate.of(1998,1,1));
        assertTrue(p1.esMayorDeEdad());

    }
}
