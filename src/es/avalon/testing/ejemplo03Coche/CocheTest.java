package es.avalon.testing.ejemplo03Coche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {

    @Test
    public void CochePotenciaTest() {

        Coche coche = new Coche("Audi", new Motor(150));
        assertEquals(100, coche.getPotencia(),1);
    }
}
