package Test.Inicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p1;

    @BeforeEach
    void setUp() {
        p1 = new Persona("123", "gomez", LocalDate.of(1996, 10, 10));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("edad")
    void esMayorDeEdad() {
        assertTrue(p1.esMayorDeEdad());
    }

    @Test
    @DisplayName("Persona null")
    public void testGestor() {
        GestorPersona gp = new GestorPersona();
        Persona p2 = gp.buscarPersonaPorDni("1");
        assertNotNull(p2);
        p2 = gp.buscarPersonaPorDni("5");
        assertNotNull(p2);

    }
    @Test
    @DisplayName("persona con mayor edad")
    public void testEsMayor() {
        GestorPersona gp = new GestorPersona();
        Persona p2 = gp.buscarPersonaPorDni("1");
        Persona p3 = gp.buscarPersonaPorDni("2");
        assertEquals(p2, Persona.esMayor(p2,p3));

    }


}