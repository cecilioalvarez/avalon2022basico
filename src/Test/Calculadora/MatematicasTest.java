package Test.Calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematicasTest {
    Matematicas m;
    @BeforeEach
    void setUp() {
        m = new Matematicas(2,2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Operación suma")
    void sumar() {
        assertEquals(4,m.sumar());
    }

    @Test
    @DisplayName("Operación resta")
    void restar() {
        assertEquals(0,m.restar());
    }

    @Test
    @DisplayName("Operación producto")
    void producto() {
        assertEquals(4,m.producto());
    }
    @DisplayName("Operación division")
    @Test
    void division() {
        assertEquals(1,m.division());
    }
}